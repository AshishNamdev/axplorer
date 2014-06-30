/**
 * Containor class contains all common Methods to be used with UiAutomator
 * this will provide support for below Task as Methods
 *
 * public UiObject getUIObject(String selectValue,String className,String methodOfAccess,boolean isClick)
 * public void launchApp(String name,String className)
 * public void clicktemInScrollableView(String text,boolean isVertical)
 * public void pressKey(int count,String key, UiDevice device)
 * protected boolean isUIObjectExists(String selectValue,String className,String methodOfAccess)
 *
 * UiContainor can be instantiated in any class to use these common methods
 * for accessing UiAutomoator to reduce  duplicacy  of same code in each class 
 *
 * Below is the syntax to create instance of Containor
 *
 * Containor Con = new UiContainor();
 *
 * You need to press create UiDevice instance and have to set it in UiContainor
 *
 * private UiDevice uiScreen = UiDevice.getInstance();
 *
 * uiCon.setUiScreen(uiScreen);
 *
 *  you can either instantiate  UiContainor and use these Methods or you can directly  extend UiContainor in 
 *  your class to make these methods visible into your code in that case no need extend UiAutomatorTestCase in your code
 *  it's already extended here, so it will give support of Multilevel inheritance to your code.
 */

/**
 * @author ashnamde
 *
 */


package axplore.comm;

/**
 * axplore.comm contains the common code to be shared in axplorer libraries 
 *
 * */
import android.os.SystemClock;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;


public class Containor extends UiAutomatorTestCase
{

	private UiDevice uiScreen ;
	private String logMsg = null;
	protected static final String LOG_TAG = "axplorer";

	protected String getLogMsg()
	{
		return logMsg;
	}

	protected void setLogMsg(String logMsg)
	{
		this.logMsg = logMsg;
	}

	protected UiDevice getUiScreen()
	{
		return uiScreen;
	}

	protected void setUiScreen(UiDevice uiScreen)
	{
		this.uiScreen = uiScreen;
	}

	protected UiObject getUIObject(String selectValue,String className,String methodOfAccess,boolean isClick)
	{
		UiObject mUIObj = null;
		if(methodOfAccess.equals("text"))
			mUIObj = new UiObject(new UiSelector().text(selectValue).className(className));
		else if(methodOfAccess.equals("id"))
			mUIObj = new UiObject(new UiSelector().resourceId(selectValue).className(className));
		else if(methodOfAccess.equals("description"))
			mUIObj = new UiObject(new UiSelector().description(selectValue).className(className));
		else
			throw new IllegalArgumentException("Argument list is not specified with proper option ot get Object");

		if(mUIObj.exists())
		{
			if(isClick)
			try
			{
					SystemClock.sleep(2000);
					mUIObj.click();
			}
			catch (UiObjectNotFoundException e)
			{
					e.printStackTrace();
			}
		}
		return mUIObj;
	}

	protected void launchApp(String app_name,String className)
	{
		try
		{
			uiScreen.pressHome();
			new UiObject(new UiSelector().description("Apps")).clickAndWaitForNewWindow();
			this.getUIObject("OK", "android.widget.Button" , "text",true);
			new UiObject(new UiSelector().text("Apps")).click();

			UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
			appViews.setAsHorizontalList();
			appViews.getChildByText(new UiSelector().className(android.widget.TextView.class.getName()),app_name).clickAndWaitForNewWindow();
			new UiObject(new UiSelector().packageName(className));
		}
		catch (UiObjectNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	protected void clicktemInScrollableView(String text ,boolean isVertical)
	{
		UiObject mAdditionalSettings = null;
		UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
		if(isVertical)
			appViews.setAsVerticalList();
		else
			appViews.setAsHorizontalList();
		try
		{
			mAdditionalSettings = appViews.getChildByText(new UiSelector().className(android.widget.TextView.class.getName()),text);
			mAdditionalSettings.clickAndWaitForNewWindow();
		}
		catch (UiObjectNotFoundException e)
		{
			e.printStackTrace();
		}
	}

	protected void pressKey(int count,String key)
	{
		for(int i=0;i<count;i++)
		{
			if(key.equals("Back"))
				uiScreen.pressBack();
			else if(key.equals("Right"))
				uiScreen.pressDPadRight();
			else if(key.equals("Left"))
				uiScreen.pressDPadLeft();
			else if(key.equals("Down"))
				uiScreen.pressDPadDown();
			else if(key.equals("Up"))
				uiScreen.pressDPadUp();
			else if(key.equals("Center"))
				uiScreen.pressDPadCenter();

			SystemClock.sleep(1000);
		}
	}

	protected boolean isUIObjectExists(String selectValue,String className,String methodOfAccess)
	{
		UiObject mUIObj = null;
		boolean ret  = false ;
		if(methodOfAccess.equals("text"))
		{
			mUIObj = new UiObject(new UiSelector().text(selectValue).className(className));
		}
		else if(methodOfAccess.equals("id"))
		{
			mUIObj = new UiObject(new UiSelector().resourceId(selectValue).className(className));
		}
		else if(methodOfAccess.equals("description"))
		{
			mUIObj = new UiObject(new UiSelector().description(selectValue).className(className));
		}
		if(mUIObj.exists())
		{
			ret = true ;
		}
		return ret;
	}
}

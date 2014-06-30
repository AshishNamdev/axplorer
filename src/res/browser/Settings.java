package res.browser;

/**
 * @author ashnamde
 *
 */
public final class Settings
{
	public static final class Text
	{
		public static String GENERAL = "General";
		public static String PRIVACY_SECURITY = "Privacy & security";
		public static String ACCESSIBILITY = "Accessibility";
		public static String ADVANCED = "Advanced";
		public static String BANDWIDTH_MANAGE = "Bandwidth management";
		public static String LABS = "Labs";
		public static String SETTINGS = "Settings";

		/**
		 * General Browser Settings
		 * */

		public static String SET_HOME = "Set homepage";
		public static String AUTO_FILL = "Auto-fill";
		public static String FORM_AUTO_FILL = "Form auto-fill";
		public static String AF_SINGLE_TOUCH = "Fill out web forms with a single touch";

		/**
		 * Privacy & Security  Browser Settings
		 * */

		public static String CLEAR_CACHE = "Clear cache";
		public static String CLEAR_CACHE_LOCAL = "Clear locally cached content and databases";
		public static String CLEAR_HISTORY = "Clear history";
		public static String CLEAR_HISTORY_NAVIGATION = "Clear the browser navigation history";
		public static String SEC_WARN = "Show security warnings";
		public static String SEC_WARN_PROBLEM = "Show warning if there's a problem with a site's security";
		public static String COOKIES = "Cookies";
		public static String COOKIES_ACCEPT = "Accept cookies";
		public static String COOKIES_CLEAR_DATA = "Clear all cookie data";
		public static String COOKIES_CLEAR_ALL = "Clear all browser cookies";
		public static String COOKIES_SITE_SAVE_READ = "Allow sites to save and read cookie data";
		public static String FORM_DATA = "Form data";
		public static String FORM_DATA_REMEMBER = "Remember form data";
		public static String FORM_DATA_REMEMBER_TYPED = "Remember data I type in forms for later use";

		/**
		 * Accessibility Browser Settings
		 * */

		public static String FORCE_ENABLE_ZOOM = "Force enable zoom";
		public static String REQUEST_OVERRIDE = "Override a website's request to control zoom behavior";
		public static String TEXT_SIZE = "Text size";
		public static String TEXT_SCALING = "Text scaling";
		public static String ZOMM_DOUBLE_TAP = "Zoom on double-tap";

		/**
		 * Advanced Browser Settings
		 * */
		public static String SET_SEARCH_ENGINE = "Set search engine";
	}

	public static final class ResourceId
	{
		public static String ACTION_BAR = "android:id/action_bar";
		public static String AB_OVER_LAYOUT = "android:id/action_bar_overlay_layout";
		public static String AB_CONTAINOR = "android:id/action_bar_container"; 
		public static String NAVIGATION_UP = "android:id/up";
		public static String NAVIGATION_HOME = "android:id/home";
		public static String AB_TITLE = "android:id/action_bar_title";
		public static String CONTENT = "android:id/content";
		public static String HEADER = "android:id/headers";

		/**
		 * General Browser Settings
		 * */

		public static String LIST = "android:id/list";
		public static String PREFS_FRAME = "android:id/prefs_frame";
		public static String PREFS = "android:id/prefs";
		public static String WIDGET_FRAME = "android:id/widget_frame";
		public static String SUMMARY = "android:id/summary";

		/**
		 * Accessibility Browser Settings
		 * */

		public static String SEEK_BAR = "android:id/seekbar";

		/**
		 * Advanced Browser Settings 
		 * */

	}

	public static final class AppClass
	{
	}

	public static final class AppPackage
	{
	}

	public static final class ConntetnDescpription
	{
		public static String NAVIGATION = "Settings, Navigate up";
		public static String NAVIGATION_PR_SEC = "Privacy & security, Navigate up";
		public static String NAVIGATION_GENERAL = "General, Navigate up";
		public static String NAVIGATION_ADVANCED = "Advanced, Navigate up";
	}

}

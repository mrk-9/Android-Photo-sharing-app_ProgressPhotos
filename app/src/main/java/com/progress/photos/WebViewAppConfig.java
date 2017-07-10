package com.progress.photos;


public class WebViewAppConfig
{
	// true for enabling debug logs, should be false in production release
	public static final boolean LOGS = false;

	// true for enabling Google Analytics, should be true in production release
	public static final boolean ANALYTICS = true;

	// true for enabling Google AdMob, should be true in production release
	public static final boolean ADMOB = false;

	// app id and client key for Parse push notifications,
	// keep these constants empty if you do not want to use push notifications,
	// if you want to use push notifications, setup these constants and
	// uncomment necessary permissions, service and receivers in AndroidManifest.xml file
	public static final String PARSE_APPLICATION_ID = "";
	public static final String PARSE_CLIENT_KEY = "";

	// true for opening webview links in external web browser rather than directly in the webview
	public static final boolean OPEN_LINKS_IN_EXTERNAL_BROWSER = false;

	// rules for opening links in external browser,
	// if URL link contains the string, it will be opened in external browser,
	// these rules have higher priority than OPEN_LINKS_IN_EXTERNAL_BROWSER option
	public static final String[] LINKS_OPENED_IN_EXTERNAL_BROWSER = {
			"target=blank",
			"target=external",
			"play.google.com/store",
			"plus.google.com",
			"youtube.com",
			"instagram.com",
			"twitter.com",
			"pinterest.com",
	};

	// rules for opening links in internal webview,
	// if URL link contains the string, it will be loaded in internal webview,
	// these rules have higher priority than OPEN_LINKS_IN_EXTERNAL_BROWSER option
	public static final String[] LINKS_OPENED_IN_INTERNAL_WEBVIEW = {
			"target=webview",
			"target=internal"
	};

	// list of file extensions for download,
	// if webview URL ends with this extension, that file will be downloaded via download manager,
	// keep this array empty if you do not want to use download manager
	public static final String[] DOWNLOAD_FILE_TYPES = {
			".zip", ".rar", ".pdf", ".doc", ".xls",
			".mp3", ".wma", ".ogg", ".m4a", ".wav",
			".avi", ".mov", ".mp4", ".mpg", ".3gp",
			".jpg", ".png",
	};
}

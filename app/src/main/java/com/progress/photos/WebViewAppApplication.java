package com.progress.photos;

import android.app.Application;
import android.content.Context;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.parse.Parse;
import com.progress.photos.R;


public class WebViewAppApplication extends Application
{
	private static WebViewAppApplication mInstance;

	private Tracker mTracker;


	public WebViewAppApplication()
	{
		mInstance = this;
	}


	@Override
	public void onCreate()
	{
		super.onCreate();
		
		// force AsyncTask to be initialized in the main thread due to the bug:
		// http://stackoverflow.com/questions/4280330/onpostexecute-not-being-called-in-asynctask-handler-runtime-exception
		try
		{
			Class.forName("android.os.AsyncTask");
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		// initialize Parse
		if(WebViewAppConfig.PARSE_APPLICATION_ID != null && !WebViewAppConfig.PARSE_APPLICATION_ID.equals("") &&
				WebViewAppConfig.PARSE_CLIENT_KEY != null && !WebViewAppConfig.PARSE_CLIENT_KEY.equals(""))
		{
			Parse.initialize(this, WebViewAppConfig.PARSE_APPLICATION_ID, WebViewAppConfig.PARSE_CLIENT_KEY);
		}
	}


	public static Context getContext()
	{
		return mInstance;
	}


	public synchronized Tracker getTracker()
	{
		if(mTracker==null)
		{
			GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
			analytics.setDryRun(!WebViewAppConfig.ANALYTICS);
			mTracker = analytics.newTracker(R.xml.analytics_app_tracker);
		}
		return mTracker;
	}
}

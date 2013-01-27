package com.hou.tuanpinforandroid.app;

import android.app.Application;

public class TPApplication extends Application {
	
	private static Application app;
	
	static public Application get(){
		return app;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		
		app = this;
	}
	
	

}

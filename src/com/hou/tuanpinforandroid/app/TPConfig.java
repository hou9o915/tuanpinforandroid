package com.hou.tuanpinforandroid.app;

import android.content.Context;
import android.content.SharedPreferences;

public class TPConfig {
	
	static SharedPreferences sp = TPApplication.get().getSharedPreferences("tuanpin", Context.MODE_PRIVATE);
	
	

}

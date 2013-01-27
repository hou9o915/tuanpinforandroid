package com.hou.tuanpinforandroid;

import java.lang.ref.WeakReference;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.content.Intent;

public class StartupActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_startup);
		
		MyHandler handler = new MyHandler(this);
		handler.sendEmptyMessageDelayed(0, 1000);
		
		
		
	}
	
	private void GotoMainActivity(){
		Intent i = new Intent(this,MainActivity.class);
		startActivity(i);
		overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		finish();
	}

	private static class MyHandler extends Handler {
		private final WeakReference<StartupActivity> mActivity;

		public MyHandler(StartupActivity activity) {
			mActivity = new WeakReference<StartupActivity>(activity);
		}

		@Override
		public void handleMessage(Message msg) {
			if (mActivity.get() != null) {
				mActivity.get().GotoMainActivity();
			}
		}
	}

}

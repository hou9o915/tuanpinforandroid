package com.hou.tuanpinforandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends BaseActivity implements OnClickListener{
	
	private EditText mUsername,mPassword;
	private Button mLogin,mSignup;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		mUsername = (EditText)findViewById(R.id.activity_login_username);
		mPassword = (EditText)findViewById(R.id.activity_login_password);
		
		mLogin = (Button)findViewById(R.id.activity_login_button_login);
		mSignup = (Button)findViewById(R.id.activity_login_button_signup);
		
		mLogin.setOnClickListener(this);
		mSignup.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.activity_login_button_login:
			doLogin();
			break;
			
		case R.id.activity_login_button_signup:
			doSignup();
			break;
		}
		
	}

	private void doSignup() {
		// TODO Auto-generated method stub
		Intent i = new Intent();
		i.setClass(this,SignupActivity.class);
		startActivity(i);
		finish();
	}

	private void doLogin() {
		// TODO Auto-generated method stub
		
	}
}

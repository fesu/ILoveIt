package com.blackfoxmedia.iloveit;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.graphics.drawable.*;

public class LoginActivity extends Activity implements OnClickListener {

	private ImageView ivlogo;
	private Button btnlogin;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		getActionBar().setBackgroundDrawable(new ColorDrawable(0x663f51b5));
		getActionBar().setTitle("I Love It");
		//getWindow().requestFeature(Window.FEATURE_ACTION_BAR_OVERLAY);
		getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
		
		ivlogo = (ImageView)findViewById(R.id.imglogo);
		btnlogin = (Button)findViewById(R.id.btn_login);
		
		btnlogin.setOnClickListener(this);
				
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_custom_menu, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onClick(View v) {
		
		Intent inthome = new Intent(LoginActivity.this, HomeActivity.class);
		startActivity(inthome);
		
	}
}

package com.example.myfirstapp;

//press Ctrl + Shift + O to import missing classes
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}



	// Called when the user clicks the Send button
	// In order for the system to
	// match this method to the method name given to android:onClick, the
	// signature must be exactly as shown. Specifically, the method must:
	// 1) Be public
	// 2) Have a void return value
	// 3) Have a View as the only parameter (this will be the View that was
	// clicked)
	public void sendMessage(View view) {
		// Do something in response to button
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
	}

}

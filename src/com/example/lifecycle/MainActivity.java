package com.example.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends Activity {
		private static final String TAG = "Lifecycle";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG,"onCreate is called.");
		setContentView(R.layout.activity_main);
	}
	
	@Override
	protected void onStart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onStart();
		Log.v(TAG,"onStart is called.");
	}
	
	@Override
	protected void onRestart() {
		//TODO 自動生成されたメソッド・スタブ
		super.onRestart();
		Log.v(TAG,"onRestart is called.");
	}
	
	@Override
	protected void onResume() {
		//TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Log.v(TAG,"onResume is called.");
	}
	
	@Override
	protected void onPause() {
		//TODO 自動生成されたメソッド・スタブ
		super.onPause();
		Log.v(TAG,"onPause is called.");
	}
	
	@Override
	protected void onStop() {
		//TODO 自動生成されたメソッド・スタブ
		super.onStop();
		Log.v(TAG,"onStop is called.");
	}
	
	@Override
	protected void onDestroy() {
		//TODO 自動生成されたメソッド・スタブ
		super.onDestroy();
		Log.v(TAG,"onDestroy is called.");
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container, false);
			return rootView;
		}
	}

}

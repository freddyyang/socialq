package edu.ucsb.cs.cs185.socialqs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.new_qs) {
			Intent intent = new Intent(this, PostQsActivity.class);
		    startActivity(intent);
			return true;
		}
		if (id == R.id.list_view) {
			Intent intent = new Intent(this, ListViewActivity.class);
		    startActivity(intent);
			return true;
		}
		if (id == R.id.map_view) {
			Intent intent = new Intent(this, Map.class);
		    startActivity(intent);
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
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

	public void view_list(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, ListViewActivity.class);
	    startActivity(intent);
	}
	
	public void post_qs(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, PostQsActivity.class);
	    startActivity(intent);
	}
	
}

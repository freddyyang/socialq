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

public class PostQsActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.post_qs);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.post_qs, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
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
	
	public void view_list(View view) {
	    // Do something in response to button
		Intent intent = new Intent(this, ListViewActivity.class);
	    startActivity(intent);
	}
	
}

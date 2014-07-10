package edu.ucsb.cs.cs185.socialqs;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.os.Build;

public class QsRespondActivity extends QsViewActivity {
	String name_string;
	ImageView myImgView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_qs_respond);
        Button button = (Button)findViewById(R.id.buttonLocation);
        //EditText name = (EditText)findViewById(R.id.name);
        //name_string = name.getText().toString();
        button.setOnClickListener(buttonOnClick);
        myImgView = (ImageView)findViewById(R.id.addLocationMap);
    }
	  
  	Button.OnClickListener buttonOnClick = new Button.OnClickListener() {
		public void onClick(View view) {
			//Toast.makeText(QsViewActivity.this, "Selected :", Toast.LENGTH_SHORT).show();
        	//Intent intent = new Intent(QsViewActivity.this, QsRespondActivity.class);
		    //startActivity(intent);
			//addName[0] = ;
			myImgView.setVisibility(View.VISIBLE);

		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.qs_respond, menu);
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

}

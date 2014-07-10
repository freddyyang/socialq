package edu.ucsb.cs.cs185.socialqs;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class QsViewActivity extends ListViewActivity {// ActionBarActivity {

	  @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_qs_view);
	    TextView textVieww = (TextView) findViewById(R.id.textView1);
	    textVieww.setText(textView);
	    //Toast.makeText(QsViewActivity.this, "Selected :" + " " + heyo, Toast.LENGTH_SHORT).show();
	   // ArrayList<qs_entry> image_details = getListData();
        final ListView lv1 = (ListView) findViewById(R.id.listView_qs);
        lv1.setAdapter(new CustomListAdapter(this, reply_details));
        Button button = (Button)findViewById(R.id.buttonRespond);
        button.setOnClickListener(buttonOnClick);
    }
	  
  	Button.OnClickListener buttonOnClick = new Button.OnClickListener() {
		public void onClick(View view) {
			//Toast.makeText(QsViewActivity.this, "Selected :", Toast.LENGTH_SHORT).show();
        	Intent intent = new Intent(QsViewActivity.this, QsRespondActivity.class);
		    startActivity(intent);
		}
	};
 
    private ArrayList<qs_entry> getListData() {
        ArrayList<qs_entry> results = new ArrayList<qs_entry>();
        ArrayList<String> tags = new ArrayList<String>();
        tags.add("Directory");
        qs_entry newsData = new qs_entry("Where is the coffee shop called Good Cup?",tags, 0, 0);
        results.add(newsData);
        
        
        tags = new ArrayList<String>();
        tags.add("Event");
        tags.add("On Sale");
        newsData = new qs_entry("Is there any special deals in Macy today?",tags, 0, 0);
        results.add(newsData);
 
        tags = new ArrayList<String>();
        tags.add("Directory");
        newsData = new qs_entry("Where can I park for free?",tags, 0, 0);
        results.add(newsData);
        
        return results;
	  }

	  
	  @Override
		public boolean onCreateOptionsMenu(Menu menu) {

			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.list_view, menu);
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
			if (id == R.id.map_view) {
				Intent intent = new Intent(this, Map.class);
			    startActivity(intent);
				return true;
			}
			return super.onOptionsItemSelected(item);
		}
		
	} 
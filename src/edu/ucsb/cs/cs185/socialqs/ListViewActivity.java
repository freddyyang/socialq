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
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewActivity extends ActionBarActivity {

	public static ArrayList<qs_entry> reply_details;
	public static ArrayList<String> addName; // change it to array for more
												// input
	public static ArrayList<String> addReply;
	public static String textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		addName = new ArrayList<String>();
		addReply = new ArrayList<String>();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view);
		// reply_details = oneReply();
		ArrayList<qs_entry> image_details = getListData();
		final ListView lv1 = (ListView) findViewById(R.id.listview);
		lv1.setAdapter(new CustomListAdapter(this, image_details));
		// public ArrayList<qs_entry> reply_details;
		lv1.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				if (position == 0) {
					reply_details = threeReplies();
					textView = "I'm new to Isla Vista. I want to know where is the best spot for surfing.";
				} else if (position == 1) {
					reply_details = twoReplies();
					textView = "Does anyone know a shop called Good Cup around here? My friend told"
							+ " me that this place makes delicious coffee?";
				} else if (position == 2) {
					reply_details = noReply();
					textView = "My friend and I are going to State Street for shopping. It's our first time here"
							+ ". I want to know where I can park for free in Downtown.";
				} else if (position == 3) {
					textView = "It's my first time to visit this outlet. I want to know whether Calvin Klein has special deals today.";
					reply_details = oneReply();
				} else if (position == 4) {
					textView = "Where should I buy a blazer from? I’m on a low budget.";
					reply_details = noReply();
				} else {
					textView = "I’m visiting my friend’s graduation at UCSB, where can I park without paying?";
					reply_details = noReply();
				}
				Intent intent = new Intent(ListViewActivity.this,
						QsViewActivity.class);
				startActivity(intent);
				// Toast.makeText(ListViewActivity.this, "Selected :" + " " +
				// position, Toast.LENGTH_SHORT).show();
			}
		});

	}

	private ArrayList<qs_entry> getListData() {
		ArrayList<qs_entry> results = new ArrayList<qs_entry>();
		ArrayList<String> tags = new ArrayList<String>();

		tags = new ArrayList<String>();
		tags.add("Direction");
		tags.add("Sport");
		// tags.add("tagq3");
		// tags.add("tagq4");
		qs_entry newsData = new qs_entry(
				"Where is a good spot to surf around here?", tags, 0, 0);
		results.add(newsData);
		tags = new ArrayList<String>();
		tags.add("Direction");
		// tags.add("");
		// tags.add("tag3");
		// tags.add("tag4");
		newsData = new qs_entry("Where is the coffee shop called Good Cup?",
				tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		// tags.add("tagqqq2");
		tags.add("Direction");
		tags.add("Parking");
		// tags.add("tagqqq3");
		newsData = new qs_entry("Where can I park for free in Downtown SB?",
				tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Event");
		tags.add("On Sale");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"Is there any special deals in Calvin Klein today?", tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Direction");
		tags.add("On Sale");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"Where should I buy a blazer from?", tags,
				0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Parking");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"I’m visiting my friend’s graduation at UCSB, where can I park without paying?",
				tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Time");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"How crowded is the Rec Cen at 5pm?",
				tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("General");
		newsData = new qs_entry(
				"How can I join the Daily Nexus?",
				tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Lost Pet");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry("Have anyone seen a white Yorkshire Terrier around? I lost my dog.", tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Location");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"Is there a barber shop around here?", tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Direction");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"How can I get to the Starbucks?", tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Event");
		tags.add("On Sale");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"Is there any special deals in Macy's today?", tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Location");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"Where is the nearest Vons", tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Event");
		tags.add("Time");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"I heard there will be a marathon race. When is it going to start tomorrow?", tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Location");
		// tags.add("tagq3");
		// tags.add("tagq4");
		newsData = new qs_entry(
				"Is there an Apple shop in this city?", tags, 0, 0);
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

	// The following are answers once entering each question
	public static ArrayList<qs_entry> twoReplies() {
		ArrayList<qs_entry> results = new ArrayList<qs_entry>();
		// my tag becomes usernames
		ArrayList<String> tags = new ArrayList<String>();
		tags.add("Mike");
		qs_entry newsData = new qs_entry("It's right next to the Starbucks.",
				tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Sarah");
		// tags.add("On Sale");
		newsData = new qs_entry("It's between Starbucks and Wendy's.", tags, 0,
				0);
		results.add(newsData);

		return results;
	}
	public static ArrayList<qs_entry> threeReplies() {
		ArrayList<qs_entry> results = new ArrayList<qs_entry>();
		// my tag becomes usernames
		ArrayList<String> tags = new ArrayList<String>();
		tags.add("Jake");
		qs_entry newsData = new qs_entry("I would say Devereux at the west end of Isla Vista. ",
				tags, 0, 0);
		results.add(newsData);

		tags = new ArrayList<String>();
		tags.add("Jorge");
		// tags.add("On Sale");
		newsData = new qs_entry("If you are looking for bigger waves, go to Sands, it's just around Devereux.", tags, 0,
				0);
		results.add(newsData);
		
		tags = new ArrayList<String>();
		tags.add("Tyrion");
		// tags.add("On Sale");
		newsData = new qs_entry("It's got to be Sands. Best with a higher tide and peaky windswell. Gets very crowded. Some dangerous rock hazards, especially during low tide. Lots of students on the beach on sunny, warm days. Over toward the slough mouth, sandbars replace rocks, and it can get good and quite hollow. Needs peaky windswells and medium-high incoming tide here too. Low tides create rip currents and close-outs. Blows offshore with a SE storm wind.", tags, 0,
				0);
		results.add(newsData);

		return results;
	}
	public static ArrayList<qs_entry> oneReply() {
		ArrayList<qs_entry> results = new ArrayList<qs_entry>();
		ArrayList<String> tags = new ArrayList<String>();
		tags.add("Tony");
		qs_entry newsData = new qs_entry(
				"Yes, tell the cashier that you have the Coupon Code (FFJUNE30) when buying any type of belts, and you can get 20% off. ",
				tags, 0, 0);
		results.add(newsData);
		return results;
	}
	public static ArrayList<qs_entry> noReply() {
		ArrayList<qs_entry> results = new ArrayList<qs_entry>();
		ArrayList<String> tags = new ArrayList<String>();
		// tags.add(addName[0]);
		// qs_entry newsData = new qs_entry(addReply[0],tags,0,0);
		// results.add(newsData);
		return results;
	}
}
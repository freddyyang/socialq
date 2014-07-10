package edu.ucsb.cs.cs185.socialqs;

import java.util.ArrayList;
import java.util.Random;

import android.text.format.Time;

public class qs_entry {
	String qs = "";
	ArrayList<String> tags = new ArrayList<String>();
	double lat = 0;
	double longi = 0;
	Time now;
	int distance = 0;
	
	public qs_entry(String qs, ArrayList<String> tags, double lat, double longi) {
		this.qs = qs;
		this.tags = tags;
		now = new Time();
		now.setToNow();
		this.lat = lat;
		this.longi = longi;
		Random rand = new Random();
		this.distance = rand.nextInt(200) + 1;
	}
	
	public String getqs()
	{
		return this.qs;
	}
	
	public String getdistance()
	{
		return Integer.toString(this.distance)+" feet away";
	}
	
	public String gettags()
	{
		String temp = "";
		for (int i = 0; i < this.tags.size()-1; ++i) {
		      temp += this.tags.get(i) + ", ";
		    }
	    if (this.tags.size()-1 >= 0)
		temp += this.tags.get(this.tags.size()-1);
	    
	    return temp;
	}
	
	public String getdate()
	{
		return this.now.format3339(true);
	}
	
	@Override
    public String toString() {
         String temp;
         temp = this.qs + "\n";
 	    for (int i = 0; i < this.tags.size()-1; ++i) {
 		      temp += this.tags.get(i) + ", ";
 		    }
 	   if (this.tags.size()-1 >= 0)
 	    temp += this.tags.get(this.tags.size()-1);
 	    
 	    return temp;
    }
}

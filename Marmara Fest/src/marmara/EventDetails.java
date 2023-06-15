package marmara;

import java.io.File;


public class EventDetails {
	String event_name[]= {"Uzi","Billie Elish","Manga","Romeo ve Juliet","Hamlet","12.Night"};
	String event_coordinator[]= {"NS company ","NS company","NS company","Tuna media","Tuna media","Tuna media"};
	static String event_ticket[]= {"150","800","200","400","350","150"};		//static because we are taking the data for price calculations.
	String event_seating[]= {"On Foot","On Foot","On Foot","Chair","Chair","Chair"};
	String event_date[]= {"10/June","11/June","12/June","10/June","11/June","12/June"};
	String event_time[]= {"22.00","22.00","22.00","20.00","20.00","20.00"};
	String event;
	int ind;
	
	
	EventDetails(String event)
	{
		this.event=event;										
		for (int i=0;i<event_name.length;i++) {			//Determine which event is selected
		    if (event_name[i].equals(event)) {
		        ind = i;
		        break;
		    }
		}}

	public String name() {
		return event_name[ind];
	}
	public String coordinator()
	{
		return event_coordinator[ind];
	}
	public String ticket()
	{
		return event_ticket[ind];
	}
	public String seating()
	{
		return event_seating[ind];
	}
	public String date()
	{
		return event_date[ind];
	}
	public String time()
	{
		return event_time[ind];
	}
	
}

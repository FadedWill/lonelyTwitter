package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.LonelyTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;

public class LastModelTests extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

	public LastModelTests(){
		super(LonelyTwitterActivity.class);
	}
	
	public LastModelTests(Class<LonelyTwitterActivity> activityClass) {
		super(LonelyTwitterActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void lmao(){
		Date ha=new Date();
		LonelyTweetModel nerd1=new NormalTweetModel("geegee",ha);
		NormalTweetModel nerd2=new NormalTweetModel("geegee",ha);
		nerd1.equals(nerd2);
	}

}

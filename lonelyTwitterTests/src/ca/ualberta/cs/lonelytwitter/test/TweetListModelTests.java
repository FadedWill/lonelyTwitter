package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TwitterListModel;
import android.test.ActivityInstrumentationTestCase2;

public class TweetListModelTests extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	TwitterListModel tweets=new TwitterListModel();
	
	public TweetListModelTests(){
		super(LonelyTwitterActivity.class);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		tweets=new TwitterListModel();
	}
	
	public void tweetsListsInitailized(){
		
		assertNotNull("Is my arraylist not initialized?",tweets);
	}
	
	public void testListCount(){
		
		NormalTweetModel tweet=new NormalTweetModel("hi");
		tweets.addTweet(tweet);
		assertEquals("Added a tweet, counter updated?",1,tweets.getListLength());
	}

}

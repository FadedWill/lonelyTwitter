package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import android.test.ActivityInstrumentationTestCase2;

public class lonelyTwitterModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
	
	private int count;
	
	
	
	public lonelyTwitterModelTest(){
		super(LonelyTwitterActivity.class);
	}
	
	protected void setUp() throws Exception{
		super.setUp();
	}
	
	public void sampleTest(){
		assertTrue("my frist statement is",greaterThan(5,7));		
	}
	
	public void testEqual(){
		Date date=new Date(12313);
		NormalTweetModel normal=new NormalTweetModel("test tweet");
		NormalTweetModel secondTweet=new NormalTweetModel("Test tweet 2");
		assertFalse("Deifferent Tweets are not equal",normal.equals(secondTweet));
	}
	
	public boolean greaterThan(int i,int j){
		if(i>j) return true;
		else return false;
	}
	
	
	public void testTrue(){
		assertEquals("They are not equal",5,5);
	}
	
}

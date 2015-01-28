package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TwitterListModel {
	private ArrayList<LonelyTweetModel> tweets;
	private int count;

	public TwitterListModel() {
		count=0;
		tweets=new ArrayList<LonelyTweetModel>();
	}

	public int getListLength() {
		return count;
	}
	
	public void addTweet(LonelyTweetModel tweet){
		tweets.add(tweet);
		count++;
	}
	
	public LonelyTweetModel[] getTweets(){
		LonelyTweetModel[] newList=new LonelyTweetModel[tweets.size()];
		for(int i=0;i<tweets.size();i++){
			newList[i]=tweets.get(i);
		}
		return newList;
	}
	
	public boolean hasTweet(LonelyTweetModel gee){
		return tweets.contains(gee);
	}
	
	public void removeTweet(LonelyTweetModel gee){
		tweets.remove(gee);
	}
	
	public int getCount(){
		return tweets.size();
	}
}

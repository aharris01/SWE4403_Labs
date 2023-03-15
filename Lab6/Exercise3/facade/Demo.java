package facade;

import java.util.List;

public class Demo {
  public static void show() {
    TwitterControl twitterControl = new TwitterControl("appKey", "secret");

    twitterControl.getTweets();
  }

  public static void main(String[] args){
    show();
  }
}

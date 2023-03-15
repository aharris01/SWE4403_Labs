package facade;

import java.util.List;

public class TwitterControl {
    private OAuth oauth = new OAuth();
    private String appKey;
    private String appSecret;

    public TwitterControl(String appKey, String appSecret){
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public List<Tweet> getTweets(){
        String requestToken = oauth.requestToken("appKey", "secret");
        String accessToken = oauth.getAccessToken(requestToken);

        TwitterClient twitterClient = new TwitterClient();
        return twitterClient.getRecentTweets(accessToken);
    } 
}

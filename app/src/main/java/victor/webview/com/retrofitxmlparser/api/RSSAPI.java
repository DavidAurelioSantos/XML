package victor.webview.com.retrofitxmlparser.api;


import retrofit2.Call;
import retrofit2.http.GET;
import victor.webview.com.retrofitxmlparser.model.Feed;

public interface RSSAPI {

	@GET("rssfeedstopstories.cms")
	Call<Feed> getFeed();
}

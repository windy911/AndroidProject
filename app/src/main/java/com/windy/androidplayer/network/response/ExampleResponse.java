package com.windy.androidplayer.network.response;

import com.windy.androidplayer.data.bean.Feed;

import org.json.JSONObject;
import org.json.JSONTokener;

/**
 * Created by windy on 15/8/20.
 */
public class ExampleResponse extends AbsBaseResponse {

    public Feed parseResponse(Feed feed, String resp) {
        super.parseBaseResponse(feed, resp);
        return parseLocalResponse(feed, resp);
    }

    private Feed parseLocalResponse(Feed feed, String resp) {
        try {
            JSONObject jsonObject = (JSONObject) new JSONTokener(resp).nextValue();
            JSONObject data = jsonObject.getJSONObject("data");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return feed;
    }


}

package com.example.administrator.coolweather.util;

/**
 * Created by Administrator on 2016/8/22.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}

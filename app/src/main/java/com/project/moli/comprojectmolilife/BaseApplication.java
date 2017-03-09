package com.project.moli.comprojectmolilife;

import android.app.Activity;
import android.app.Application;

import com.tencent.bugly.Bugly;

import java.util.List;

/**
 * Created by Administrator on 2017/3/9.
 */

public class BaseApplication extends Application {
    private List<Activity> activitys;

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化NoHttp
        /**
         * 初始化bugly
         * 参数1：上下文对象
         * 参数2：注册时申请的APPID
         * 参数3：是否开启debug模式，true表示打开debug模式，false表示关闭调试模式
         */
        Bugly.init(getApplicationContext(), "49f040c94d", true);
    }
}

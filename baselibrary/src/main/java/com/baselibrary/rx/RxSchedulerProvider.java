package com.baselibrary.rx;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:00
 */
public class RxSchedulerProvider {
    public static boolean isJavaEnv = false;

    public RxSchedulerProvider() {
    }

    public static BaseSchedulerProvider getInstance() {
        return (BaseSchedulerProvider)(isJavaEnv ? JavaSchedulerProvider.getInstance() : AndroidSchedulerProvider.getInstance());
    }
}

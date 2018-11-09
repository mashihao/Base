package com.baselibrary.rx;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:00
 */

public class AndroidSchedulerProvider implements BaseSchedulerProvider {
    @Nullable
    private static AndroidSchedulerProvider INSTANCE;

    private AndroidSchedulerProvider() {
    }

    public static synchronized AndroidSchedulerProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AndroidSchedulerProvider();
        }

        return INSTANCE;
    }

    @NonNull
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @NonNull
    public Scheduler io() {
        return Schedulers.io();
    }

    @NonNull
    public Scheduler newThread() {
        return Schedulers.newThread();
    }

    @NonNull
    public Scheduler ui() {
        return AndroidSchedulers.mainThread();
    }
}


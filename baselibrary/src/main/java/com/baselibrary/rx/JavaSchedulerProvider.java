package com.baselibrary.rx;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:00
 */

public class JavaSchedulerProvider implements BaseSchedulerProvider {
    @Nullable
    private static JavaSchedulerProvider INSTANCE;

    private JavaSchedulerProvider() {
    }

    public static synchronized JavaSchedulerProvider getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new JavaSchedulerProvider();
        }

        return INSTANCE;
    }

    @NonNull
    public Scheduler computation() {
        return Schedulers.computation();
    }

    @NonNull
    public Scheduler io() {
        return Schedulers.computation();
    }

    public Scheduler newThread() {
        return Schedulers.newThread();
    }

    @NonNull
    public Scheduler ui() {
        return Schedulers.computation();
    }
}

package com.baselibrary.rx;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:00
 */

public interface BaseSchedulerProvider {
    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    Scheduler newThread();

    @NonNull
    Scheduler ui();
}


package com.baselibrary.view.inter;

import android.support.annotation.MainThread;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:01
 */
@MainThread
public interface IProgressView {
    void showProgress();

    void showProgress(boolean var1);

    void closeProgress();
}

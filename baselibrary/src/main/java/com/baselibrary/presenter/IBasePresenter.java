package com.baselibrary.presenter;

import android.support.annotation.NonNull;

import com.baselibrary.view.inter.IBaseView;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:00
 */
public abstract class IBasePresenter<T extends IBaseView> {
    protected String tag = this.getClass().getSimpleName();
    @NonNull
    protected T view;

    public IBasePresenter(@NonNull T view) {
        this.view = view;
    }

    public void onInit() {
    }

    public void onDestroy() {
    }
}

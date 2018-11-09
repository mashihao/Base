package com.baselibrary.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.baselibrary.presenter.IBasePresenter;
import com.baselibrary.view.inter.IBaseView;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:01
 */

public abstract class IBaseActivity<T extends IBasePresenter, V extends IBaseView> extends AppCompatActivity implements IBaseView {
    protected String tag;
    protected Activity mContext;
    protected T presenter;
    protected V mView;

    public IBaseActivity() {
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        this.mContext = this;
        super.onCreate(savedInstanceState);
        this.initBase();
        this.setContentView(this.getView(this.mContext));
        this.init(savedInstanceState);
        this.initListener();
        this.loadData();
        if (this.presenter != null) {
            this.presenter.onInit();
        }

    }

    protected abstract View getView(Context var1);

    protected void initBase() {
        this.tag = this.getClass().getSimpleName();
        if (this.isTranslucentNavigation()) {
            this.getWindow().addFlags(67108864);
        }

    }

    protected boolean isTranslucentNavigation() {
        return true;
    }

    protected abstract void init(@Nullable Bundle var1);

    protected void initListener() {
    }

    protected void loadData() {
    }

    public void setContentView(View view) {
        super.setContentView(view);
        this.injectView();
    }

    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        this.injectView();
    }

    protected void injectView() {
    }

    protected void onDestroy() {
        super.onDestroy();
        if (this.presenter != null) {
            this.presenter.onDestroy();
        }

        if (this.mView != null) {
            this.mView.destroy();
        }

    }

    public void showProgress() {
        this.getWrapView().showProgress();
    }

    public void showProgress(boolean cancelable) {
        this.getWrapView().showProgress(cancelable);
    }

    public void closeProgress() {
        this.getWrapView().closeProgress();
    }

    public void tip(@NonNull String msg) {
        this.getWrapView().tip(msg);
    }

    public void tip(@NonNull String msg, TipEnum tipEnum) {
        this.getWrapView().tip(msg, tipEnum);
    }

    public void tip(int rsd) {
        this.getWrapView().tip(rsd);
    }

    public void tip(int rsd, @NonNull TipEnum tipEnum) {
        this.getWrapView().tip(rsd, tipEnum);
    }

    public void destroy() {
        this.getWrapView().destroy();
    }

    private V getWrapView() {
        if (this.mView == null) {
            this.mView = this.onCreateBaseView();
        }

        return this.mView;
    }

    protected abstract V onCreateBaseView();
}

package com.baselibrary.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.baselibrary.presenter.IBasePresenter;
import com.baselibrary.view.inter.IBaseView;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:01
 */

public abstract class IBaseFragment<T extends IBasePresenter> extends Fragment implements IBaseView {
    protected String tag = this.getClass().getSimpleName();
    protected T presenter;
    protected Activity mContext;
    private View mContentView = null;
    @NonNull
    private IBaseView baseView;

    public IBaseFragment() {
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = this.getActivity();
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mContext = this.getActivity();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (this.mContentView == null) {
            this.mContentView = this.getLayout(inflater, container, savedInstanceState);
            this.injectView(this.mContentView);
            this.init(this.mContentView, savedInstanceState, this.getArguments());
            this.initListener();
            this.loadData();
            if (this.presenter != null) {
                this.presenter.onInit();
            }
        }

        return this.mContentView;
    }

    protected void injectView(View contentView) {
    }

    public abstract View getLayout(LayoutInflater var1, ViewGroup var2, Bundle var3);

    public void init(@NonNull View view, Bundle savedInstanceState, Bundle arguments) {
    }

    public void loadData() {
    }

    public void initListener() {
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

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.presenter != null) {
            this.presenter.onDestroy();
        }

        if (this.baseView != null) {
            this.baseView.destroy();
        }

    }

    protected IBaseView getWrapView() {
        if (this.baseView == null) {
            this.baseView = this.getRawWrapView();
        }

        return this.baseView;
    }

    protected abstract IBaseView getRawWrapView();
}


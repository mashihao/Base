package com.baselibrary.presenter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.baselibrary.rx.RxSchedulerProvider;
import com.baselibrary.view.inter.IBaseView;

import org.reactivestreams.Subscription;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/**
 * describe :
 * author   : 马世豪 29350
 * time     : 2018/11/9 13:00
 */

public abstract class IBaseRxPresenter<T extends IBaseView> extends IBasePresenter<T> {
    protected final CompositeDisposable compositeSubscription = new CompositeDisposable();

    public IBaseRxPresenter(@NonNull T view) {
        super(view);
    }

    protected final <T> void subscribeNoDialog(@NonNull Observable<T> o, @NonNull Consumer<T> success) {
        this.subscribe(o, success, (Consumer)null, (Action)null, false, false);
    }

    protected final <T> void subscribeNoDialog(@NonNull Observable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.subscribe(o, success, fail, (Action)null, false, false);
    }

    protected final <T> void subscribeNoDialog(@NonNull Observable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail, @NonNull Action complete) {
        this.subscribe(o, success, fail, complete, false, false);
    }

    protected final <T> void subscribeNoDialog(@NonNull Observable<T> o, @NonNull Consumer<T> success, @NonNull Action complete) {
        this.subscribe(o, success, (Consumer)null, complete, false, false);
    }

    protected final <T> void fSubscribeNoDialog(@NonNull Flowable<T> o, @NonNull Consumer<T> success) {
        this.fSubscribe(o, success, (Consumer)null, (Action)null, false, false);
    }

    protected final <T> void fSubscribeNoDialog(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.fSubscribe(o, success, fail, (Action)null, false, false);
    }

    protected final <T> void fSubscribeNoDialog(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail, @NonNull Action complete) {
        this.fSubscribe(o, success, fail, complete, false, false);
    }

    protected final <T> void fSubscribeNoDialog(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @NonNull Action complete) {
        this.fSubscribe(o, success, (Consumer)null, complete, false, false);
    }

    protected final <T> void sgSubscribeNoDialog(@NonNull Single<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.sgSubscribe(o, success, fail, false, false);
    }

    protected final <T> void sgSubscribeNoDialog(@NonNull Single<T> o, @NonNull Consumer<T> success) {
        this.sgSubscribe(o, success, (Consumer)null, false, false);
    }

    protected final <T> void comSubscribeNoDialog(@NonNull Completable o, @NonNull Action complete, @NonNull Consumer<Throwable> fail) {
        this.comSubscribe(o, fail, complete, false, false);
    }

    protected final <T> void comSubscribeNoDialog(@NonNull Completable o, @NonNull Action complete) {
        this.comSubscribe(o, (Consumer)null, complete, false, false);
    }

    protected final <T> void mbSubscribeNoDialog(@NonNull Maybe<T> o, @NonNull Consumer<T> success) {
        this.mbSubscribe(o, success, (Consumer)null, (Action)null, false, false);
    }

    protected final <T> void mbSubscribeNoDialog(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.mbSubscribe(o, success, fail, (Action)null, false, false);
    }

    protected final <T> void mbSubscribeNoDialog(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail, @NonNull Action complete) {
        this.mbSubscribe(o, success, fail, complete, false, false);
    }

    protected final <T> void mbSubscribeNoDialog(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @NonNull Action complete) {
        this.mbSubscribe(o, success, (Consumer)null, complete, false, false);
    }

    protected final <T> void subscribeCannotCancel(@NonNull Observable<T> o, @NonNull Consumer<T> success) {
        this.subscribe(o, success, (Consumer)null, (Action)null, true, false);
    }

    protected final <T> void subscribeCannotCancel(@NonNull Observable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.subscribe(o, success, fail, (Action)null, true, false);
    }

    protected final <T> void subscribeCannotCancel(@NonNull Observable<T> o, @NonNull Consumer<T> success, @NonNull Action complete) {
        this.subscribe(o, success, (Consumer)null, complete, true, false);
    }

    protected final <T> void subscribeCannotCancel(@NonNull Observable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail, @NonNull Action complete) {
        this.subscribe(o, success, fail, complete, true, false);
    }

    protected final <T> void fSubscribeCannotCancel(@NonNull Flowable<T> o, @NonNull Consumer<T> success) {
        this.fSubscribe(o, success, (Consumer)null, (Action)null, true, false);
    }

    protected final <T> void fSubscribeCannotCancel(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.fSubscribe(o, success, fail, (Action)null, true, false);
    }

    protected final <T> void fSubscribeCannotCancel(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @NonNull Action complete) {
        this.fSubscribe(o, success, (Consumer)null, complete, true, false);
    }

    protected final <T> void fSubscribeCannotCancel(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail, @NonNull Action complete) {
        this.fSubscribe(o, success, fail, complete, true, false);
    }

    protected final <T> void sgSubscribeCannotCancel(@NonNull Single<T> o, @NonNull Consumer<T> success) {
        this.sgSubscribe(o, success, (Consumer)null, true, false);
    }

    protected final <T> void sgSubscribeCannotCancel(@NonNull Single<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.sgSubscribe(o, success, fail, true, false);
    }

    protected final <T> void comSubscribeCannotCancel(@NonNull Completable o, @NonNull Action complete) {
        this.comSubscribe(o, (Consumer)null, complete, true, false);
    }

    protected final <T> void comSubscribeCannotCancel(@NonNull Completable o, @NonNull Action complete, @NonNull Consumer<Throwable> fail) {
        this.comSubscribe(o, fail, complete, true, false);
    }

    protected final <T> void mbSubscribeCannotCancel(@NonNull Maybe<T> o, @NonNull Consumer<T> success) {
        this.mbSubscribe(o, success, (Consumer)null, (Action)null, true, false);
    }

    protected final <T> void mbSubscribeCannotCancel(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail) {
        this.mbSubscribe(o, success, fail, (Action)null, true, false);
    }

    protected final <T> void mbSubscribeCannotCancel(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @NonNull Action complete) {
        this.mbSubscribe(o, success, (Consumer)null, complete, true, false);
    }

    protected final <T> void mbSubscribeCannotCancel(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @NonNull Consumer<Throwable> fail, @NonNull Action complete) {
        this.mbSubscribe(o, success, fail, complete, true, false);
    }

    protected final <T> void subscribe(@NonNull Observable<T> o, @NonNull Consumer<T> success) {
        this.subscribe(o, success, (Consumer)null, (Action)null, true, true);
    }

    protected final <T> void subscribe(@NonNull Observable<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail) {
        this.subscribe(o, success, fail, (Action)null, true, true);
    }

    protected final <T> void subscribe(@NonNull Observable<T> o, @NonNull Consumer<T> success, boolean isShowDialog) {
        this.subscribe(o, success, (Consumer)null, (Action)null, isShowDialog, true);
    }

    protected final <T> void subscribe(@NonNull Observable<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, boolean isShowDialog) {
        this.subscribe(o, success, fail, (Action)null, isShowDialog, true);
    }

    protected final <T> void fSubscribe(@NonNull Flowable<T> o, @NonNull Consumer<T> success) {
        this.fSubscribe(o, success, (Consumer)null, (Action)null, true, true);
    }

    protected final <T> void fSubscribe(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail) {
        this.fSubscribe(o, success, fail, (Action)null, true, true);
    }

    protected final <T> void fSubscribe(@NonNull Flowable<T> o, @NonNull Consumer<T> success, boolean isShowDialog) {
        this.fSubscribe(o, success, (Consumer)null, (Action)null, isShowDialog, true);
    }

    protected final <T> void fSubscribe(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, boolean isShowDialog) {
        this.fSubscribe(o, success, fail, (Action)null, isShowDialog, true);
    }

    protected final <T> void sgSubscribe(@NonNull Single<T> o, @NonNull Consumer<T> success) {
        this.sgSubscribe(o, success, (Consumer)null, true, true);
    }

    protected final <T> void sgSubscribe(@NonNull Single<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail) {
        this.sgSubscribe(o, success, fail, true, true);
    }

    protected final <T> void sgSubscribe(@NonNull Single<T> o, @NonNull Consumer<T> success, boolean isShowDialog) {
        this.sgSubscribe(o, success, (Consumer)null, isShowDialog, true);
    }

    protected final <T> void sgSubscribe(@NonNull Single<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, boolean isShowDialog) {
        this.sgSubscribe(o, success, fail, isShowDialog, true);
    }

    protected final <T> void comSubscribe(@NonNull Completable o, @Nullable Consumer<Throwable> fail) {
        this.comSubscribe(o, fail, (Action)null, true, true);
    }

    protected final <T> void comSubscribe(@NonNull Completable o, @Nullable Consumer<Throwable> fail, @NonNull Action complete) {
        this.comSubscribe(o, fail, complete, true, true);
    }

    protected final <T> void comSubscribe(@NonNull Completable o, @Nullable Consumer<Throwable> fail, boolean isShowDialog) {
        this.comSubscribe(o, fail, (Action)null, isShowDialog, true);
    }

    protected final <T> void comSubscribe(@NonNull Completable o, @Nullable Consumer<Throwable> fail, @NonNull Action complete, boolean isShowDialog) {
        this.comSubscribe(o, fail, complete, isShowDialog, true);
    }

    protected final <T> void mbSubscribe(@NonNull Maybe<T> o, @NonNull Consumer<T> success) {
        this.mbSubscribe(o, success, (Consumer)null, (Action)null, true, true);
    }

    protected final <T> void mbSubscribe(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail) {
        this.mbSubscribe(o, success, fail, (Action)null, true, true);
    }

    protected final <T> void mbSubscribe(@NonNull Maybe<T> o, @NonNull Consumer<T> success, boolean isShowDialog) {
        this.mbSubscribe(o, success, (Consumer)null, (Action)null, isShowDialog, true);
    }

    protected final <T> void mbSubscribe(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, boolean isShowDialog) {
        this.mbSubscribe(o, success, fail, (Action)null, isShowDialog, true);
    }

    protected final <T> void fSubscribe(@NonNull Flowable<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, @Nullable Action complete, final boolean isShowDialog, final boolean cancelable) {
        Disposable disposable = o.observeOn(RxSchedulerProvider.getInstance().ui()).subscribeOn(RxSchedulerProvider.getInstance().io()).doOnSubscribe(new Consumer<Subscription>() {
            public void accept(Subscription subscription) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.showProgress(cancelable);
                }

            }
        }).doOnError(new Consumer<Throwable>() {
            public void accept(Throwable throwable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

            }
        }).subscribeOn(RxSchedulerProvider.getInstance().ui()).subscribe(this.acceptConsumer(success), this.errorConsumer(fail, isShowDialog), this.completeAction(complete, isShowDialog));
        this.compositeSubscription.add(disposable);
    }

    protected final <T> void subscribe(@NonNull Observable<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, @Nullable Action complete, final boolean isShowDialog, final boolean cancelable) {
        Disposable disposable = o.observeOn(RxSchedulerProvider.getInstance().ui()).subscribeOn(RxSchedulerProvider.getInstance().io()).doOnSubscribe(new Consumer<Disposable>() {
            public void accept(Disposable disposable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.showProgress(cancelable);
                }

            }
        }).doOnError(new Consumer<Throwable>() {
            public void accept(Throwable throwable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

            }
        }).subscribeOn(RxSchedulerProvider.getInstance().ui()).subscribe(this.acceptConsumer(success), this.errorConsumer(fail, isShowDialog), this.completeAction(complete, isShowDialog));
        this.compositeSubscription.add(disposable);
    }

    protected final <T> void sgSubscribe(@NonNull Single<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, final boolean isShowDialog, final boolean cancelable) {
        Disposable disposable = o.observeOn(RxSchedulerProvider.getInstance().ui()).subscribeOn(RxSchedulerProvider.getInstance().io()).doOnSubscribe(new Consumer<Disposable>() {
            public void accept(Disposable disposable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.showProgress(cancelable);
                }

            }
        }).doOnError(new Consumer<Throwable>() {
            public void accept(Throwable throwable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

            }
        }).subscribeOn(RxSchedulerProvider.getInstance().ui()).subscribe(this.singleAcceptConsumer(success, isShowDialog), this.errorConsumer(fail, isShowDialog));
        this.compositeSubscription.add(disposable);
    }

    protected final <T> void comSubscribe(@NonNull Completable o, @Nullable Consumer<Throwable> fail, @Nullable Action complete, final boolean isShowDialog, final boolean cancelable) {
        Disposable disposable = o.observeOn(RxSchedulerProvider.getInstance().ui()).subscribeOn(RxSchedulerProvider.getInstance().io()).doOnSubscribe(new Consumer<Disposable>() {
            public void accept(Disposable disposable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.showProgress(cancelable);
                }

            }
        }).doOnError(new Consumer<Throwable>() {
            public void accept(Throwable throwable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

            }
        }).subscribeOn(RxSchedulerProvider.getInstance().ui()).subscribe(this.completeAction(complete, isShowDialog), this.errorConsumer(fail, isShowDialog));
        this.compositeSubscription.add(disposable);
    }

    protected final <T> void mbSubscribe(@NonNull Maybe<T> o, @NonNull Consumer<T> success, @Nullable Consumer<Throwable> fail, @Nullable Action complete, final boolean isShowDialog, final boolean cancelable) {
        Disposable disposable = o.observeOn(RxSchedulerProvider.getInstance().ui()).subscribeOn(RxSchedulerProvider.getInstance().io()).doOnSubscribe(new Consumer<Disposable>() {
            public void accept(Disposable disposable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.showProgress(cancelable);
                }

            }
        }).doOnError(new Consumer<Throwable>() {
            public void accept(Throwable throwable) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

            }
        }).subscribeOn(RxSchedulerProvider.getInstance().ui()).subscribe(this.acceptConsumer(success), this.errorConsumer(fail, isShowDialog), this.completeAction(complete, isShowDialog));
        this.compositeSubscription.add(disposable);
    }

    private <T> Consumer<T> acceptConsumer(@NonNull final Consumer<T> success) {
        return new Consumer<T>() {
            public void accept(T t) throws Exception {
                success.accept(t);
            }
        };
    }

    private <T> Consumer<T> singleAcceptConsumer(@NonNull final Consumer<T> success, final boolean isShowDialog) {
        return new Consumer<T>() {
            public void accept(T t) throws Exception {
                success.accept(t);
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

            }
        };
    }

    private Consumer<Throwable> errorConsumer(@Nullable final Consumer<Throwable> fail, final boolean isShowDialog) {
        return new Consumer<Throwable>() {
            public void accept(Throwable t) throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

                if (fail != null) {
                    fail.accept(t);
                } else {
                    IBaseRxPresenter.this.normalErrorSove(t);
                }

            }
        };
    }

    private Action completeAction(@Nullable final Action complete, final boolean isShowDialog) {
        return new Action() {
            public void run() throws Exception {
                if (IBaseRxPresenter.this.view != null && isShowDialog) {
                    IBaseRxPresenter.this.view.closeProgress();
                }

                if (complete != null) {
                    complete.run();
                }

            }
        };
    }

    protected abstract void normalErrorSove(@NonNull Throwable var1);

    public void unSubscribe() {
        if (this.compositeSubscription != null) {
            this.compositeSubscription.clear();
        }

    }

    public void onDestroy() {
        super.onDestroy();
        this.unSubscribe();
    }
}


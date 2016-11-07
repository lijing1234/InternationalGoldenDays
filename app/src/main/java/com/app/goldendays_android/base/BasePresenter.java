package com.app.goldendays_android.base;

/**
 * Created by 王立强 on 2016/11/7.
 */

public interface BasePresenter<T> {
    void attachView(T view);

    void detachView();
}

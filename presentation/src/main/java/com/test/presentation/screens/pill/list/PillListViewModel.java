package com.test.presentation.screens.pill.list;

import android.databinding.ObservableField;

import com.test.presentation.base.BaseViewModel;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class PillListViewModel extends BaseViewModel {

    public ObservableField<String> myText = new ObservableField("text");

    public PillListViewModel() {

        Observable
                .timer(5, TimeUnit.SECONDS)
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        getCompositeDisposable().add(d);
                    }

                    @Override
                    public void onNext(Long aLong) {
                        myText.set("New value");
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}

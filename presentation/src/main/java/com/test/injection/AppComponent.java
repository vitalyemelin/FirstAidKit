package com.test.injection;

import com.test.presentation.screens.pill.list.PillListViewModel;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    void runInject(PillListViewModel listViewModel);
}
package com.ashwin.java.api.di;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class GuiceyDemoModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("default-message")).toInstance("This is default message.");
    }
}

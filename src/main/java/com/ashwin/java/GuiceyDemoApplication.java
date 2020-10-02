package com.ashwin.java;

import com.ashwin.java.api.di.GuiceyDemoModule;
import com.ashwin.java.api.resource.HelloResource;
import com.ashwin.java.domain.service.MessageService;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

public class GuiceyDemoApplication extends Application<GuiceyDemoConfiguration> {
    public static void main(String[] args) throws Exception {
        new GuiceyDemoApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<GuiceyDemoConfiguration> bootstrap) {
        bootstrap.addBundle(GuiceBundle.builder()
                .enableAutoConfig(HelloResource.class.getPackage().getName())
                //.extensions(HelloResource.class)
                .modules(new GuiceyDemoModule())
                .build());
    }

    @Override
    public void run(GuiceyDemoConfiguration config, Environment env) throws Exception {
        // No need to register resources, since we used resource package in GuiceBundle.autoconfig.
        // The same can be achieved by adding resource classes in GuiceBundle.extensions.
    }
}

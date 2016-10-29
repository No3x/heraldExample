package de.no3x.heraldexample;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by No3x on 29.10.2016.
 */
public class Main {

    public static void main(String... args) {
        Injector injector = Guice.createInjector(new ApplicationConfig());
        injector.getInstance(Application.class).run();
    }

}

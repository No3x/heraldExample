package de.no3x.heraldexample;

import com.github.vbauer.herald.ext.guice.LogModule;
import com.google.inject.AbstractModule;

/**
 * Created by No3x on 29.10.2016.
 */
class ApplicationConfig extends AbstractModule {

    @Override
    protected void configure() {
        install(new LogModule());
    }

}

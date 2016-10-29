package de.no3x.heraldexample;

import com.github.vbauer.herald.annotation.Log;
import org.slf4j.Logger;

/**
 * Created by No3x on 29.10.2016.
 */
class Application {

    @Log
    private Logger log;

    void run() {
        log.debug("Herald");
    }

}

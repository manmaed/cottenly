package net.manmaed.cottonly.libs;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by manmaed on 16/05/2021.
 */
public class LogHelper {
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String LOG = ":[Cottonly]:";

    private static void log(Level loglvl, Object object) {
        LOGGER.log(loglvl, "[" + loglvl + "]:" + "-" + LOG + " " + object);
    }

    public static void info(Object object) {
        log(Level.INFO, object);
    }

    public static void warn(Object object) {
        log(Level.WARN, object);
    }

    public static void fatal(Object object) {
        log(Level.FATAL, object);
    }

    public static void debug(Object object) {
        log(Level.FATAL, object);
    }
}

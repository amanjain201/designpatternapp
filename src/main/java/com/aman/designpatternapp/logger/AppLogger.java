package com.aman.designpatternapp.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppLogger {
    Logger log = LoggerFactory.getLogger(AppLogger.class);
    private static AppLogger logger;

    private AppLogger() {
    }

    public static AppLogger getInstance() {
        if(logger == null) {
            logger = new AppLogger();
        }
        return logger;
    }

    public void info(String infoMessage) {
        log.info("DP APP:::: {}", infoMessage);
    }
}

package com.bee.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Test {

    public static void main(String[] args) {
        MDC.put("userId",String.valueOf(System.currentTimeMillis()));
        Logger log = LoggerFactory.getLogger(Test.class);
        log.info("info");
        log.error("ERROR");
    }
}
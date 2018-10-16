package com.bee.framework;

import com.bee.TestLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Test {

    static Logger log = LoggerFactory.getLogger(Test.class);
    static {
        MDC.put("userId",String.valueOf(System.currentTimeMillis()));
    }
    public static void main(String[] args) {
        log.info("info");
        TestLog.testLog();
//        log.error("ERROR");
    }
}
package com.bee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: $description$
 * @Author: huangdb002
 * @Date: 2018/10/16 14:39
 */

public class TestLog {

    static Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void testLog(){
        logger.debug("java debug");
        logger.info("java info");
    }
}

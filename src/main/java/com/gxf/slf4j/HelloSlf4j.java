package com.gxf.slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: <guanxiangfei@meituan.com>
 * @Description:
 * @Date: Created in : 2018/8/24 上午10:56
 **/
public class HelloSlf4j {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Logger logger = LoggerFactory.getLogger(HelloSlf4j.class);
            logger.debug("Hello Slf4j");
        }
    }
}

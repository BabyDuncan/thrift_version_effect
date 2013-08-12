package com.babyduncan.thrift.client.async;

import org.apache.log4j.Logger;
import org.apache.thrift.async.AsyncMethodCallback;

/**
 * User: guohaozhao (guohaozhao@sohu-inc.com)
 * Date: 13-8-12 10:23
 */
public class CallbackHandler implements AsyncMethodCallback {

    private static final Logger logger = Logger.getLogger(CallbackHandler.class);

    @Override
    public void onComplete(Object o) {
        logger.info("callback" + o.toString());
    }

    @Override
    public void onError(Exception e) {
        logger.error(e.getMessage(), e);
    }
}

package com.baoyu.framework;

public interface Protocol {

    void start(URL url);

    String send(URL url, Invocation invocation);
}

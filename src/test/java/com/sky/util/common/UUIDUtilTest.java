package com.sky.util.common;

import org.junit.Test;

/**
 * Created by Sky on 2018/6/5.
 */
public class UUIDUtilTest {

    @Test
    public void getUUID() throws Exception {
        String id = UUIDUtil.getUUID();
        System.out.println("随机ID：" + id);
    }

}
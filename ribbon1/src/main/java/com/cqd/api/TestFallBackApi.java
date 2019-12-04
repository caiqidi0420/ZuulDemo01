package com.cqd.api;

import org.springframework.stereotype.Component;

/**
 * 作者: LCG
 * 日期: 2019/12/2 15:58
 * 描述:
 */

@Component
public class TestFallBackApi implements TestApi {


    @Override
    public String test1(String name) {
        return "出错了";
    }
}

package com.mic.addressselectordemo;

import com.mic.adressselectorlib.CityInterface;

/**
 * Author: Blincheng.
 * Date: 2017/5/9.
 * Description:
 */

public class City implements CityInterface{
    private String n;
    private String v;

    @Override
    public String getCityCode() {
        return v;
    }

    @Override
    public String getCityName() {
        return n;
    }
}

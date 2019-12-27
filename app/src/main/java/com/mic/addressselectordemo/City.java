package com.mic.addressselectordemo;

import com.mic.adressselectorlib.CityInterface;

import java.util.List;

/**
 * Author: Blincheng.
 * Date: 2017/5/9.
 * Description:
 */

public class City implements CityInterface{
    private String n;
    private String v;
    private List<City> c;

    @Override
    public String getCityCode() {
        return v;
    }

    @Override
    public String getCityName() {
        return n;
    }

    @Override
    public List<City> getSubCity() {
        return c;
    }
}

package com.mic.adressselectorlib;

import java.util.List;

/**
 * Author: Blincheng.
 * Date: 2017/5/9.
 * Description:
 */

public interface CityInterface<T> {
    String getCityName();
    String getCityCode();
    List<T> getSubCity();
}

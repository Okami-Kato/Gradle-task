package com.epam.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String s) {
        double value = NumberUtils.toDouble(s);
        return value > 0;
    }
}

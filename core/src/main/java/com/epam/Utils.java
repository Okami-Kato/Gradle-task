package com.epam;

import com.epam.util.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        for (String s : str) {
            return StringUtils.isPositiveNumber(s);
        }
        return true;
    }
}

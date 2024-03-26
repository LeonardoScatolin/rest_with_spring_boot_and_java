package com.leonardo.validations;

import com.leonardo.converters.NumberConverter;

public class NumberValidation {

    public static void valid(String... numbers) {
        for (String number : numbers) {
            if (!NumberConverter.isNumeric(number)) {
                throw new UnsupportedOperationException("Please set a numeric value!");
            }
        }
    }

}

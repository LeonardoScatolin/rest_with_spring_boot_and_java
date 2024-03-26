package com.leonardo.controllers;

import com.leonardo.converters.NumberConverter;
import com.leonardo.math.SimpleMath;
import com.leonardo.validations.NumberValidation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    
    private static final AtomicLong counter = new AtomicLong();

    private final SimpleMath math = new SimpleMath();

    @GetMapping("/sum/{n1}/{n2}")
    public Double sum(@PathVariable String n1, @PathVariable String n2) throws Exception {
        NumberValidation.valid(n1, n2);
        return math.sum(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/subtraction/{n1}/{n2}")
    public Double subtraction(@PathVariable String n1, @PathVariable String n2) throws Exception {
        NumberValidation.valid(n1, n2);
        return math.subtraction(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/multiplication/{n1}/{n2}")
    public Double multiplication(@PathVariable String n1, @PathVariable String n2) throws Exception {
        NumberValidation.valid(n1, n2);
        return math.multiplication(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/division/{n1}/{n2}")
    public Double division(@PathVariable String n1, @PathVariable String n2) throws Exception {
        NumberValidation.valid(n1, n2);
        return math.division(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/average/{n1}/{n2}")
    public Double average(@PathVariable String n1, @PathVariable String n2) throws Exception {
        NumberValidation.valid(n1, n2);
        return math.average(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/square/{n1}")
    public Double square(@PathVariable String n1) throws Exception {
        NumberValidation.valid(n1);
        return math.square(Math.sqrt(NumberConverter.convertToDouble(n1)));
    }

}
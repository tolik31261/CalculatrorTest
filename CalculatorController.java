package com.example.calculatertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {
    private final CalcTestService calculator;

    public CalculatorController(CalcTestService calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/calculator")
    public String welcome() {
        return "Добро пожаловать в колькулятор";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        try { return num1 + "+" + num2 + "=" + calculator.plus(num1,num2);

        }catch (IllegalArgumentException e){
            return "Ошибка в запросе";
        }

    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        try {
            return num1 + "-" + num2 + "=" + calculator.minus(num1, num2);

        } catch (IllegalArgumentException e) {
            return "Ошибка в запросе";
        }
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        try {
            return num1 + "*" + num2 + "=" + calculator.multiply(num1, num2);

        } catch (IllegalArgumentException e) {
            return "Ошибка в запросе";
        }
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        try {
            return num1 + "/" + num2 + "=" + calculator.divide(num1, num2);

        } catch (IllegalArgumentException e) {
            return "Ошибка в запросе";
        }
    }
}

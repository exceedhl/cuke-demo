package com.thoughtworks;

import cuke4duke.Table;
import cuke4duke.annotation.I18n;

import java.util.List;
import java.util.Stack;

import static junit.framework.Assert.assertEquals;

public class ComplexNumberSteps {
    private Stack<Complex> complexNumbers;
    private Complex result;

    public ComplexNumberSteps() {
        complexNumbers = new Stack<Complex>();
    }

    @I18n.ZH_CN.假如("有以下复数，实部和虚部分别为：")
    public void thereAreComplexNumbers(Table numbers) {
        for (List<String> number : numbers.rows()) {
            complexNumbers.push(new Complex(Integer.parseInt(number.get(0)), Integer.parseInt(number.get(1))));
        }

    }

    @I18n.ZH_CN.当("它们相加后")
    public void add() {
        result = complexNumbers.pop();
        while (!complexNumbers.isEmpty()) {
            result = result.add(complexNumbers.pop());
        }

    }

    @I18n.ZH_CN.当("它们相减后")
    public void minus() {

    }

    @I18n.ZH_CN.当("它们相乘后")
    public void multiply() {

    }

    @I18n.ZH_CN.那么("我应该得到一个实部为(.+)虚部为(.+)的复数")
    public void getResult(int real, int virtual) {
        assertEquals(real, result.getReal());
        assertEquals(virtual, result.getVirtual());
    }
}

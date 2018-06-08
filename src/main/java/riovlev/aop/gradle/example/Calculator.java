package riovlev.aop.gradle.example;

import riovlev.aop.gradle.example.annotations.JLog;

/**
 * @author Roman Iovlev
 *         08/06/18
 */
public class Calculator {

    @JLog
    public int multiply(int a, int b) {
        return a*b;
    }

}

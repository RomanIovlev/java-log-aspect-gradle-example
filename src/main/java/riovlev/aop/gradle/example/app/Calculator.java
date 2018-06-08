package riovlev.aop.gradle.example.app;

import riovlev.aop.gradle.example.aspect.JLog;

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

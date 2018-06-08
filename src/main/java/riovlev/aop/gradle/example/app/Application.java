package riovlev.aop.gradle.example.app;

/**
 * @author Roman Iovlev
 *         08/06/18
 */

public class Application {
    public static void main(String[] args) {
        System.out.println(new Calculator().multiply(3, 5));
    }
}
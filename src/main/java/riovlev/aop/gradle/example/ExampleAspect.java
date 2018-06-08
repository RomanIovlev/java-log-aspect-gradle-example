package riovlev.aop.gradle.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author Roman Iovlev
 *         08/06/18
 */
@Aspect
public class ExampleAspect {

    @Before("execution(@JLog * *.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("Call method: " + joinPoint.getSignature().getName());
    }
}

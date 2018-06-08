package riovlev.aop.gradle.example.aspect;

import com.epam.jdi.tools.func.JAction1;
import com.epam.jdi.tools.func.JAction2;
import com.epam.jdi.tools.func.JFunc1;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Aspects {
    public static final String POINTCUT = "JLog";
    public static JAction1<JoinPoint> before = joinPoint ->
        System.out.println("Call method: " + joinPoint.getSignature().getName());
    public static JAction2<JoinPoint, Object> after = (joinPoint, result) ->
            System.out.println("Result: " + result);
    public static JFunc1<ProceedingJoinPoint, Object> around = pJoinPoint -> {
        System.out.println("Around:" + pJoinPoint.getSignature().getName());
        Object result = null;
        try {
            result = pJoinPoint.proceed();
        } catch (Throwable ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
        System.out.println("Around result: " + result);
        return result;
    };
}

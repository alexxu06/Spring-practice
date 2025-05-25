package prac3.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import prac3.model.Comment;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Order(2)
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

//    @Around("execution(* prac3.services.*.*(..))")
    @Around("@annotation(prac3.annotation.ToLog)")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable {
//        String methodName = joinPoint.getSignature().getName();
//        Object [] arguments = joinPoint.getArgs();
//
//        logger.info("Method " + methodName + " with paramters " +
//                Arrays.asList(arguments) + " will execute");

        logger.info("This is special interception");
        Object returnedValue = joinPoint.proceed();

        // Create a new comment to intercept
//        Comment comment = new Comment();
//        comment.setText("This is another text unrelated to first");
//        Object [] newArguments = {comment};

//        Object returnByMethod = joinPoint.proceed(newArguments); // calls main method
//        logger.info("Method executed and returned " + returnByMethod);

        // intercept return value and replace with below
//        return "FAILED";
    }

//    @After("execution(* prac3.services.*.*(..))")
//    public void logg() {
//        logger.info("Run this after every occurrence");
//    }
}

package org.nhnacademy.edu.springframework.sender;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import java.util.Arrays;

@Aspect
@Component
public class LggingAspect {

    @Around("execution(public * *.sendMessage(..)) && args(user,message)")
    public Object loggingExecutionTime(ProceedingJoinPoint pjp, User user,String message){
        StopWatch stopWatch = new StopWatch();
        Object rtVal;
        try{

            stopWatch.start();
            rtVal = pjp.proceed();
            System.out.println("User : "+user);
            System.out.println(message);
        } catch (Throwable e) { // 최상위 클래스가 Throwable, 그밑에 Exception, Error가 있는데 걔가 Throwable로 안받고 예외 만으로 받으면 어떻게 될까?
            //thorw e; 로 던져야한다.
            throw new RuntimeException(e);
        }finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());

        }

        return rtVal;
    }
}

package com.example.demo.spi.common.clog;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Aspect //AOP 切面
@Component
public class MethodLogAspect {

    @Around(value = "@annotation(com.ctrip.tour.order.train.actionservice.common.clog.MethodLog)")
    public Object writeLog(ProceedingJoinPoint point) throws Throwable {

        Object[] arguments = point.getArgs();
        //拦截的类名
        Class clazz = point.getTarget().getClass();
        //拦截的方法
        Method method = ((MethodSignature) point.getSignature()).getMethod();
        ILog logger = LogManager.getLogger(clazz);
        Map<String, String> clogTags = new HashMap<>();
        clogTags.put("msgid", UUID.randomUUID().toString());
        logger.info(method.getName() + "请求报文", arguments, clogTags);
        Object result = null;
        try {
            result = point.proceed(); //执行程序
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            result = throwable.getMessage();
        }
        logger.info(method.getName() + "返回报文", result, clogTags);
        return result;
    }

}

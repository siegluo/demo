package com.example.demo.springboot.retry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EndPoint {

    @Autowired
    RetryMethod retryMethod;

    @GetMapping(path = "/retry/{id}")
    public void endpoint(@PathVariable int id) {
        switch (id) {
            case 1:
                retryMethod.retryMethod(new RetryMethod.RetryArg(1, "retry"));
                break;
            case 2:
                retryMethod.retryMethod1(new RetryMethod.RetryArg(1, "retry"));
                break;
            case 3:
                retryMethod.retry();
                break;
            case 4:
                retryMethod.circuitBreaker(new RetryMethod.RetryArg(1, "retry"));
                break;
            default:
                return;
        }
    }
}

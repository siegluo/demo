package com.example.demo.springboot.retry;

import lombok.extern.slf4j.Slf4j;
import org.springframework.remoting.RemoteAccessException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalTime;

@Service
@Slf4j
public class RetryMethod {

    @Retryable(value = RemoteAccessException.class, maxAttempts = 3, backoff = @Backoff(delay = 500L, multiplier = 5))
    public void retryMethod(RetryArg retryArg) {
        retryArg.setA(retryArg.getA() + 1);
        log.info(String.valueOf(retryArg.getA()));
        throw new RemoteAccessException(retryArg.getB());
    }

    @Retryable(value = RemoteAccessException.class, stateful = true, backoff = @Backoff(delay = 500L, multiplier = 5))
    public void retryMethod1(RetryArg retryArg) {
        retryArg.setA(retryArg.getA() + 1);
        log.info(String.valueOf(retryArg.getA()));
        throw new RemoteAccessException(retryArg.getB());
    }

    @Retryable(value = {RemoteAccessException.class}, maxAttempts = 3, backoff = @Backoff(delay = 500l, multiplier = 1000))
    public void retry() {
        log.info(LocalTime.now() + " 执行业务操作...");
        throw new RemoteAccessException("RPC调用异常");
    }

    @CircuitBreaker(value = RemoteAccessException.class)
    public void circuitBreaker(RetryArg retryArg) {
        retryArg.setA(retryArg.getA() + 1);
        log.info(String.valueOf(retryArg.getA()));
        throw new RemoteAccessException(retryArg.getB());
    }

    @Recover
    private void freeBack(RetryArg retryArg) {
        retryArg.setA(retryArg.getA() + 1);
        log.info(String.valueOf(retryArg.getB() + retryArg.getA()));
    }

    public static class RetryArg {
        private int a;
        private String b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public RetryArg(int a, String b) {
            this.a = a;
            this.b = b;
        }
    }
}

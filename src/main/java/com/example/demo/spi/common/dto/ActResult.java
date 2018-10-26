package com.example.demo.spi.common.dto;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public class ActResult {

    private boolean isSucceed;

    private String errorMessage;

    private int errorCode;

    /**
     * generate success result
     */
    public static ActResult result() {
        ActResult actResult = new ActResult();
        actResult.isSucceed = true;
        actResult.errorMessage = "";
        return actResult;
    }

    /**
     * generate failed result
     */
    public static ActResult result(String errorMessage) {
        ActResult actResult = new ActResult();
        actResult.isSucceed = false;
        actResult.errorMessage = errorMessage;
        return actResult;
    }

    /**
     * generate failed result
     */
    public static ActResult result(int errorCode, String errorMessage) {
        ActResult actResult = new ActResult();
        actResult.isSucceed = false;
        actResult.errorCode = errorCode;
        actResult.errorMessage = errorMessage;
        return actResult;
    }


    public boolean isSucceed() {
        return isSucceed;
    }

    public void setSucceed(boolean succeed) {
        isSucceed = succeed;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
package com.example.demo.squirrel;

public enum  Trigger {
    APPLY_CONFIRM("APPLY_CONFIRM"),
    REJECT("REJECT"),
    APPLY_APPROVED("APPLY_APPROVED"),
    REFUND_APPROVED("REFUND_APPROVED"),
    REFUND_FINISH_CONFIRM("REFUND_FINISH_CONFIRM");

    private String code;

    Trigger(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

package com.example.demo.squirrel;

public enum  Status {
    PENDING("PENDING"),
    CONFIRMING("CONFIRMING"),
    REJECTED("REJECTED"),
    REFUND_APPROVING("REFUND_APPROVING"),
    REFUND_APPROVED("REFUND_APPROVED"),
    REFUND_FINISHED("REFUND_FINISHED");
    private String code;

    Status(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

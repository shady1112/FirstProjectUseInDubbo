package com.res.exception;

public class ResolverException extends RuntimeException{

    String returnCode;
    String returnMsg;

    public ResolverException(String returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public ResolverException(String message, String returnCode, String returnMsg) {
        super(message);
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public ResolverException(String message, Throwable cause, String returnCode, String returnMsg) {
        super(message, cause);
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public ResolverException(Throwable cause, String returnCode, String returnMsg) {
        super(cause);
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public ResolverException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String returnCode, String returnMsg) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }


    @Override
    public String toString() {
        return "ResolverException{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                '}';
    }
}

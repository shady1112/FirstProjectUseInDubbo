package com;

/**
 * 异常枚举类
 * @author Shady
 */
public enum ExceptionEnum {
    //登录失败
    LOGINEXCEPTION("1110", "登录失败"),

    ;

    private String returnCode;
    private String returnMsg;

    private ExceptionEnum(String returnCode,String returnMsg){
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
}

package com.res.entity.response;

import java.io.Serializable;

public class ResolverResponse implements Serializable {

    private String returnCode = "0000";
    private String returnMsg = "SUCCESS";

    public ResolverResponse(String returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }

    public ResolverResponse() {

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
        return "ResolverResponse{" +
                "returnCode='" + returnCode + '\'' +
                ", returnMsg='" + returnMsg + '\'' +
                '}';
    }
}

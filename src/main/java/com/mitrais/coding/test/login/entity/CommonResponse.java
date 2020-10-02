package com.mitrais.coding.test.login.entity;

import com.mitrais.coding.test.login.Constant;
import com.mitrais.coding.test.persistance.entity.User;

public class CommonResponse {
    String responseCode;
    String responseDesc;
    User data;

    public CommonResponse(User data){
        this.responseCode = Constant.SUCCESS_CODE;
        this.responseDesc = Constant.SUCCESS_DESC;
        this.data = data;
    }

    public CommonResponse(String code, String desc){
        this.responseCode = code;
        this.responseDesc = desc;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDesc() {
        return responseDesc;
    }

    public void setResponseDesc(String responseDesc) {
        this.responseDesc = responseDesc;
    }

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }
}

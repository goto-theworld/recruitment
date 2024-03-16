package com.it.util;

public class ServerResponse {
    private Integer status;
    private String message;
    private Object data;

    //    ===========================================新增=====================================================
    public static ServerResponse addSuccess() {
        return new ServerResponse(1, MessageUtil.ADD_SUCCESS);
    }

    public static ServerResponse addFailed() {
        return new ServerResponse(0, MessageUtil.ADD_FAIL);
    }

    //    ===========================================删除=====================================================
    public static ServerResponse deleteSuccess() {
        return new ServerResponse(1, MessageUtil.DELETE_SUCCESS);
    }

    public static ServerResponse deleteFailed() {
        return new ServerResponse(0, MessageUtil.DELETE_FAIL);
    }

    //    ===========================================修改=====================================================
    public static ServerResponse modifySuccess() {
        return new ServerResponse(1, MessageUtil.UPDATE_SUCCESS);
    }

    public static ServerResponse modifyFailed() {
        return new ServerResponse(0, MessageUtil.UPDATE_FAIL);
    }

    //    ===========================================查找=====================================================
    public static ServerResponse getSuccess(Object data) {
        ServerResponse serverResponse = new ServerResponse(1, MessageUtil.GET_SUCCESS);
        serverResponse.setData(data);
        return serverResponse;
    }

    public static ServerResponse getFailed() {
        return new ServerResponse(0, MessageUtil.GET_FAIL);
    }

    public static ServerResponse getFailed(String data) {
        ServerResponse serverResponse = new ServerResponse(0, MessageUtil.GET_FAIL);
        serverResponse.setData(data);
        return serverResponse;

    }

    //    ===========================================constructor=====================================================
    private ServerResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
        this.data = null;
    }

    //    =========================================== get & set =====================================================
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

package com.tzj.http.response;


import okhttp3.Response;

/**
 * http 返回类
 */
public class HttpResponse<B> implements IResponse<B>{
    protected Response response;
    /**
     * http返回码
     */
    protected int httpCode;
    /**
     * http返回信息
     */
    protected String httpMsg;
    /**
     * 返回码
     */
    protected int code;
    /**
     * 返回信息
     */
    protected String msg;
    /**
     *
     */
    protected B body;

    public HttpResponse(Response response) {
        this.response = response;
        httpCode = response.code();
        httpMsg = response.message();
    }

    /**
     * http 协议的 code
     */
    public int httpCode() {
        return httpCode;
    }

    /**
     * http 协议的 msg
     */
    public String httpMsg() {
        return httpMsg;
    }

    /**
     * 业务的 code
     */
    public int code() {
        return code;
    }

    /**
     * 业务的
     */
    public boolean isOk() {
        return code == 1;
    }

    /**
     * 业务的 msg
     */
    public String msg() {
        return msg;
    }

    public void setBody(B body) {
        this.body = body;
    }

    public B body() {
        return body;
    }

}

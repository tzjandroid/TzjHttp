package com.tzj.http.request;

import com.tzj.http.cache.CacheType;
import com.tzj.http.callback.IHttpCallBack;
import com.tzj.http.response.IResponse;

import java.lang.reflect.Type;
import java.util.Map;

import okhttp3.Request;
import okhttp3.RequestBody;

public interface IRequest {
    /**
     * 接口名
     */
    String methed();
    /**
     * url
     */
    String url();

    /**
     * 生成表单url
     */
    String formUrl();

    /**
     * contentType
     */
    String contentType();

    /**
     * 缓存方式
     */
    CacheType cacheType();

    /**
     * mapBody
     */
    Map<String, Object> mapBody();

    /**
     *  将入参字段名根据配置改掉
     */
    Map<String, Object> replaceMap(Map<String, Object> map);

    /**
     * 用于缓存的key
     */
    String cacheKey();
    /**
     * okhttp 的 body
     */
    RequestBody okBody();

    /**
     * okhttp 的 Request
     */
    Request request();

    /**
     * http 调用
     */
    void post(IHttpCallBack callBack);
    /**
     * http 调用
     */
    void postDelay(IHttpCallBack callBack,int time);

    /**
     * 返回的实体类
     * 名为Rsp的静态内部类
     */
    Type rspType();

    /**
     * 构建好返回体后，给个机会让 请求体对返回数据处理下
     */
    <T> void changeRsp(IResponse<T> response);
}

package com.young.service;

/**
 * Redis操作Service
 * 对象和数组都以json格式存储
 */
public interface RedisService {
    /**
     *  存数据
    */
    void set(String key,String value);
    /**
     * 取数据
    */
    String get(String key);
    /**
     * 删数据
    */
    void remove(String key);
    /**
    * 设置超时时间
    */
    boolean exprie(String key,Long expire);
    /**
     * 自增操作
     * @Param delta 自增步长
     */
    Long increment(String key,long delta);
}

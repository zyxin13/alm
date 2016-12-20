package com.zoula.alm.service.redis;

import org.apache.ibatis.cache.decorators.LoggingCache;

/**
 * Created by yuxin.zou on 2016/12/20.
 */
public class LoggingRedisCache extends LoggingCache {

    public LoggingRedisCache(String id) {
        super(new RedisCache(id));
    }

}

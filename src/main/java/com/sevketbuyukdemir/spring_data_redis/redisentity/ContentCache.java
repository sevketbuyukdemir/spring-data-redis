package com.sevketbuyukdemir.spring_data_redis.redisentity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "content", timeToLive = 86400)
@Data
public class ContentCache {
    @Id
    String path;
    private String content;

}

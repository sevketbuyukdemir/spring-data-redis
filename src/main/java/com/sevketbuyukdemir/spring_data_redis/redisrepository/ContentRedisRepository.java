package com.sevketbuyukdemir.spring_data_redis.redisrepository;

import com.sevketbuyukdemir.spring_data_redis.redisentity.ContentCache;
import org.springframework.data.repository.CrudRepository;


public interface ContentRedisRepository extends CrudRepository<ContentCache, String> {}
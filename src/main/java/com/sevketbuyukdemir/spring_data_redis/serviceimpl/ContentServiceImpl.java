package com.sevketbuyukdemir.spring_data_redis.serviceimpl;

import com.sevketbuyukdemir.spring_data_redis.redisentity.ContentCache;
import com.sevketbuyukdemir.spring_data_redis.redisrepository.ContentRedisRepository;
import com.sevketbuyukdemir.spring_data_redis.response.GetContentResponse;
import com.sevketbuyukdemir.spring_data_redis.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {
    private final ContentRedisRepository contentRedisRepository;

    @Override
    public GetContentResponse readContent(String path) {
        GetContentResponse response = new GetContentResponse();
        if(contentRedisRepository.existsById(path)) {
            response.setContent(contentRedisRepository.findById(path).get());
        } else {
            // simulate latency to retrieve data from database
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            ContentCache contentCache = getContent(path);
            response.setContent(contentCache);
            contentRedisRepository.save(contentCache);
        }
        return response;
    }

    private ContentCache getContent(String path) {
        ContentCache contentCache = new ContentCache();
        contentCache.setPath(path);
        contentCache.setContent("Redis implementation with Spring Boot");
        return contentCache;
    }
}

package com.sevketbuyukdemir.spring_data_redis.service;

import com.sevketbuyukdemir.spring_data_redis.response.GetContentResponse;

public interface ContentService {
    GetContentResponse readContent(String path);
}

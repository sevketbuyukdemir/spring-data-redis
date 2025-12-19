package com.sevketbuyukdemir.spring_data_redis.controller;

import com.sevketbuyukdemir.spring_data_redis.response.BaseResponse;
import com.sevketbuyukdemir.spring_data_redis.response.GetContentResponse;
import com.sevketbuyukdemir.spring_data_redis.service.ContentService;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
public class ContentController {
    private ContentService contentService;

    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @GetMapping(path = "/{path}")
    public ResponseEntity<BaseResponse> getContent(Authentication authentication, HttpServletRequest request, @PathVariable("path") String path) {
        GetContentResponse response = contentService.readContent(path);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}

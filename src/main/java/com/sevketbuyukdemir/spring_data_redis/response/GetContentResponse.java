package com.sevketbuyukdemir.spring_data_redis.response;

import com.sevketbuyukdemir.spring_data_redis.constant.ResponseStatusMessage;
import com.sevketbuyukdemir.spring_data_redis.redisentity.ContentCache;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GetContentResponse extends BaseResponse {
    private String status = ResponseStatusMessage.SUCCESS.toLower();
    private String message = "You can find content from content item.";
    private ContentCache content;
}

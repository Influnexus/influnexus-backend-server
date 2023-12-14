package com.custom.Service;

import com.custom.enties.ApiKey;
import com.custom.respository.ApiKeyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiKeyService {

    @Autowired
    ApiKeyRepository apiKeyRepository;

    public ApiKey addKey(ApiKey apiKey) {

        return apiKeyRepository.save(apiKey);
    }

    public List<ApiKey> getAllKeys() {

        return (List<ApiKey>) apiKeyRepository.findAll();
    }

    public ApiKey getSpecificKeyById(int apiId) {

        return apiKeyRepository.findByKeyId(apiId);
    }
}

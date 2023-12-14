package com.custom.respository;

import com.custom.enties.ApiKey;
import org.springframework.data.repository.CrudRepository;

public interface ApiKeyRepository extends CrudRepository<ApiKey,Integer> {

    ApiKey findByKeyId(int keyId);
}

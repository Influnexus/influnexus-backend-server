package com.custom.enties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ApiKey {

    @Id
    private int keyId;
    private String apiKey;

    public ApiKey(int keyId, String apiKey) {
        this.keyId = keyId;
        this.apiKey = apiKey;
    }

    public ApiKey() {
    }

    public int getKeyId() {
        return keyId;
    }

    public void setKeyId(int keyId) {
        this.keyId = keyId;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String toString() {
        return "ApiKey{" +
                "keyId=" + keyId +
                ", apiKey='" + apiKey + '\'' +
                '}';
    }
}

package com.juhodev.springboot.spring_boot_init;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/* 
 * @ConfigurationProperties 으로 application.properties 에서 설정값을 가져올 수 있다.
 * 외부 config properties 값을 매핑하기 위해 사용. (application.properties 에 하드코딩된 값 중 주어진 prefix를 가진 프로퍼티들을 자바 메모리롤 가져온 후, POJO에 매핑하여 Bean으로 생성.)
 * 
 */

@ConfigurationProperties(prefix = "currency-service")
@Component
public class CurrencyServiceConfig {

    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getKey() {
        return key;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setKey(String key) {
        this.key = key;
    }

}

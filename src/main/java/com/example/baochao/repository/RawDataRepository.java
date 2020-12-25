package com.example.baochao.repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Repository
public class RawDataRepository {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${baochao.data.file.location}")
    private String dataFileLocation;

    //@Cacheable(cacheNames = "rawData", sync = true)
    public JsonNode getRawData() {
        Resource resource = applicationContext.getResource("classpath:" + dataFileLocation);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readTree(resource.getFile());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

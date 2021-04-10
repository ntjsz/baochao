package com.example.baochao.repository;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@Repository
public class RawDataRepository {

    @Autowired
    private ApplicationContext applicationContext;

    private final String dataFileLocation = "data/baochao_data_24.json";

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

    public JsonNode getRawData(String path) {
        Resource resource = new ClassPathResource(path);
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readTree(resource.getFile());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

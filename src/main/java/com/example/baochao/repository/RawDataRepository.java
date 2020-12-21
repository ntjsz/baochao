package com.example.baochao.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class RawDataRepository {

    @Autowired
    private ApplicationContext applicationContext;

    @Value("${baochao.data.file.location}")
    private String dataFileLocation;

    @Cacheable(cacheNames = "rawData", sync = true)
    public String getRawData() {
        Resource resource = applicationContext.getResource("classpath:" + dataFileLocation);
        System.out.println(dataFileLocation);
        return resource.getFilename();
    }
}

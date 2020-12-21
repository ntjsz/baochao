package com.example.baochao.service;

import com.example.baochao.repository.RawDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private RawDataRepository rawDataRepository;


    public void refresh() {
        rawDataRepository.getRawData();
    }
}

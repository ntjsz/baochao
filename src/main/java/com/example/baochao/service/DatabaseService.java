package com.example.baochao.service;

import com.example.baochao.domain.common.GameInfo;
import com.example.baochao.repository.RawDataRepository;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    @Autowired
    private RawDataRepository rawDataRepository;


    public GameInfo refresh() {
        JsonNode documentNode = rawDataRepository.getRawData();

        GameInfo gameInfo = new GameInfo();
        gameInfo.parse(documentNode);

        return gameInfo;
    }
}

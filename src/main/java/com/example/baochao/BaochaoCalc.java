package com.example.baochao;

import com.example.baochao.domain.common.GameInfo;
import com.example.baochao.repository.RawDataRepository;
import com.example.baochao.util.DataChecker;
import com.fasterxml.jackson.databind.JsonNode;

public class BaochaoCalc {
    public static void main(String[] args) {
        RawDataRepository repository = new RawDataRepository();
        JsonNode document = repository.getRawData("data/food_data_24.json");
        GameInfo gameInfo = new GameInfo();
        gameInfo.parse(document);
        DataChecker.printAll();
    }
}

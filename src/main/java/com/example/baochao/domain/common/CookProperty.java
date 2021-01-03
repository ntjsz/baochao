package com.example.baochao.domain.common;

public enum CookProperty {
    CHAO("stirfry"),
    ZHU("boil"),
    QIE("knife"),
    ZHENG("steam"),
    ZHA("fry"),
    KAO("bake");

    private final String jsonKey;

    CookProperty(String jsonKey) {
        this.jsonKey = jsonKey;
    }

    public String getJsonKey() {
        return jsonKey;
    }
}

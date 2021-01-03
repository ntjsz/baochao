package com.example.baochao.domain.common;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

public class CookPropertyMap {
    Set<CookProperty> propertySet = EnumSet.noneOf(CookProperty.class);
    Map<CookProperty, Integer> propertyMap = new EnumMap<>(CookProperty.class);

    public void addProperty(CookProperty property, Integer value) {
        if (value > 0) {
            propertySet.add(property);
            propertyMap.compute(property, (k, old) -> old == null ? value : old + value);
        }
    }

    public void minusProperty(CookProperty property, Integer value) {
        if (value > 0) {
            Integer oldValue = propertyMap.get(property);
            if (oldValue == null || oldValue < value) {
                throw new RuntimeException("CookPropertyMap minus error");
            }
            int newValue = oldValue - value;
            propertyMap.put(property, newValue);

            if (newValue == 0) {
                propertySet.remove(property);
            }
        }
    }

    public static CookPropertyMap parseNode(JsonNode cookPropertyNode) {
        CookPropertyMap propertyMap = new CookPropertyMap();

        for (CookProperty cookProperty : CookProperty.values()) {
            int value = cookPropertyNode.get(cookProperty.getJsonKey()).asInt();
            propertyMap.addProperty(cookProperty, value);
        }

        return propertyMap;
    }
}

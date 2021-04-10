package com.example.baochao.util;

import com.fasterxml.jackson.databind.JsonNode;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class DataChecker {
    public static boolean check = true;

    private static Map<Class<?>, Set> classUnknownPool = new HashMap<>();

    private static Map<Class<?>, Set<String>> fieldsMap = new HashMap<>();
    private static Map<Class<?>, Set<String>> fieldsAbsentMap = new HashMap<>();

    public static <T> Set<T> getUnknownPool(Class<?> key) {
        Set<T> set = check ? new HashSet<>() : new NothingSet<>();
        classUnknownPool.put(key, set);
        return set;
    }

    public static void printAll() {
        printMap(classUnknownPool);
        printMap(fieldsAbsentMap);
    }

    private static void printMap(Map<Class<?>, ?> m) {
        m.forEach((k, v) -> System.out.println(k.getSimpleName() + ":" + v));
    }

    public static void checkFields(Class<?> c, JsonNode node) {
        if (!check) return;
        Set<String> set = fieldsMap.computeIfAbsent(c,
                k -> Arrays.stream(k.getDeclaredFields())
                        .map(Field::getName)
                        .collect(Collectors.toSet()));
        Iterator<String> stringIterator = node.fieldNames();
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            if (!set.contains(next)) {
                fieldsAbsentMap.computeIfAbsent(c, k -> new HashSet<>()).add(next);
            }
        }
    }

    private static class NothingSet<T> extends HashSet<T> {
        @Override
        public boolean add(T t) {
            return true;
        }
    }
}

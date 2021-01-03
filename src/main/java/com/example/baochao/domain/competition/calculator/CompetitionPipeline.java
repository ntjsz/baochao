package com.example.baochao.domain.competition.calculator;

public interface CompetitionPipeline<T> {
    boolean hasNext();

    void handleNext();

    void reset();
}

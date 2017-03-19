package com.company.processors;

import java.util.List;

public class MulProcessor implements Processor{
    private static MulProcessor instance = new MulProcessor();

    public static MulProcessor getInstance() {
        return instance;
    }

    private MulProcessor() {
    }

    public Integer process(List<Integer> numbers) {
        return numbers.stream().reduce(1, (a, b) -> a * b);
    }
}

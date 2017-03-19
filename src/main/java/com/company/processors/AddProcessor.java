package com.company.processors;

import java.util.List;

public class AddProcessor implements Processor{
    private static AddProcessor instance = new AddProcessor();

    public static AddProcessor getInstance() {
        return instance;
    }

    private AddProcessor() {
    }

    public Integer process(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}

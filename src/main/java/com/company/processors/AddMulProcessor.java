package com.company.processors;

import com.company.exceptions.InvalidNumberOfParametersException;

import java.util.List;

public class AddMulProcessor implements Processor {
    private static AddMulProcessor instance = new AddMulProcessor();

    public static AddMulProcessor getInstance() {
        return instance;
    }

    private AddMulProcessor() {
    }

    public Integer process(List<Integer> numbers) throws InvalidNumberOfParametersException {
        if (numbers.size() != 3)
            throw new InvalidNumberOfParametersException();
        return numbers.get(0) * numbers.get(1) + numbers.get(2);
    }
}

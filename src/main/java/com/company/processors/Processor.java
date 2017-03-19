package com.company.processors;

import com.company.exceptions.InvalidNumberOfParametersException;

import java.util.List;

public interface Processor {
    Integer process(List<Integer> numbers) throws InvalidNumberOfParametersException;
}

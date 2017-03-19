package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    private String commandName;
    private List<Integer> numbers;

    public Task(String line) throws NumberFormatException {
        List<String> args = Arrays.asList(line.split(" "));
        this.commandName = args.get(0);
        this.numbers = args.subList(1, args.size()).stream().map(Integer::parseInt).collect(Collectors.toList());
    }

    public String getCommandName() {
        return commandName;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}

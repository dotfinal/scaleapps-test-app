package com.company.utils;

import com.company.Task;
import com.company.exceptions.InvalidCommandNameException;
import com.company.exceptions.InvalidNumberOfParametersException;
import com.company.processors.AddMulProcessor;
import com.company.processors.AddProcessor;
import com.company.processors.MulProcessor;
import com.company.processors.Processor;

import java.util.HashMap;
import java.util.Map;

public class TaskHandler {
    private static Map<String, Processor> processors;

    static
    {
        processors = new HashMap<>();
        processors.put("add", AddProcessor.getInstance());
        processors.put("mul", MulProcessor.getInstance());
        processors.put("addmul", AddMulProcessor.getInstance());
    }

    public static String processTaskAndReturnResult(Task task) throws InvalidCommandNameException, InvalidNumberOfParametersException
    {
        Processor processor = processors.get(task.getCommandName());
        if (processor == null) {
            throw new InvalidCommandNameException();
        }
        return processors.get(task.getCommandName()).process(task.getNumbers()).toString();
    }
}

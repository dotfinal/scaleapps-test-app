package com.company;

import com.company.exceptions.InvalidCommandNameException;
import com.company.exceptions.InvalidNumberOfParametersException;
import com.company.utils.IOUtil;
import com.company.utils.TaskHandler;

import java.io.IOException;

public class TestApp {

    public static void main(String[] args) {
        try {
            String inputTypeOrFileName = args[0];
            String outputTypeOrFileName = args[1];
            String inputLine = IOUtil.readLineFromConsoleOrFile(inputTypeOrFileName);
            Task task = new Task(inputLine);
            String result = TaskHandler.processTaskAndReturnResult(task);
            IOUtil.writeLineToConsoleOrFile(outputTypeOrFileName, result);
        }
        catch (InvalidNumberOfParametersException e)
        {
            System.err.println("ERROR: Invalid number of parameters.");
        }
        catch (InvalidCommandNameException e)
        {
            System.err.println("ERROR: Invalid command.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ERROR: Invalid number of arguments, should've been two.");
        }
        catch (NumberFormatException e) {
            System.err.println("ERROR: The numbers can't be parsed.");
        }
        catch (IOException e)
        {
            System.err.println("ERROR: Something's wrong with the input and/or output.");
        }
    }
}

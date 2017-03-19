package com.company.utils;

import java.io.*;

public class IOUtil {
    public static final String CONSOLE_KEYWORD = "-";

    public static String readLineFromConsoleOrFile(String inputTypeOrFileName) throws IOException
    {
        try (Reader reader = inputTypeOrFileName.equals(CONSOLE_KEYWORD) ?
                new InputStreamReader(System.in) : new FileReader(inputTypeOrFileName);
             BufferedReader bufferedReader = new BufferedReader(reader))
        {
            return bufferedReader.readLine();
        }
    }

    public static void writeLineToConsoleOrFile(String outputTypeOrFileName, String line) throws IOException
    {
        try (Writer writer = outputTypeOrFileName.equals(CONSOLE_KEYWORD) ?
                new OutputStreamWriter(System.out) : new FileWriter(outputTypeOrFileName);
             BufferedWriter bufferedWriter = new BufferedWriter(writer))
        {
            bufferedWriter.write(line);
            bufferedWriter.write("\n");
        }
    }
}

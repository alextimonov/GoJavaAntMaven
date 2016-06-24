package ua.goit.timonov.antMaven.module01.view;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Class for printing list of Strings to console and to a file
 */
public class Printer {

//    public static final String PATHNAME = "src/main/resources/test_results.txt";
    public static final String PATHNAME = "test_results.txt";

    /**
     * prints given list of Strings to console
     * @param table         given list of Strings
     */
    public static void printToConsole(List<String> table) {
        for (String line : table) {
            System.out.println(line);
        }
        System.out.println();
    }

    /**
     * prints given list of Strings to file
     * @param table         given list of Strings
     */
    public static void printToFile(List<String> table) {
        String newLine = System.getProperty("line.separator");
        try (FileWriter writer = new FileWriter(PATHNAME)) {
            for (String line : table) {
                writer.write(line);
                writer.write(newLine);
            }
            writer.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

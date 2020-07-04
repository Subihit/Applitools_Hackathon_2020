package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Reporter {

    public static boolean generateHackathonReport(String fileName, int task, String testName, String domId, String viewport, String browser,
                                                  String device, boolean comparisonResult) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write("test");
            writer.write("Task: " + task + ", Test Name: " + testName + ", DOM Id: " + domId + ", Browser: " + browser
                    + ", Viewport: " + viewport + ", Device: " + device + ", Status: " + (comparisonResult ? "Pass" : "Fail"));
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error writing to report file");
            e.printStackTrace();
        }
        return comparisonResult;
    }
}

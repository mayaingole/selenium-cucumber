package utils;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class ReportGenerator {

    public static void generateReport() {
        File reportOutputDirectory = new File("target/html-report");
        List<String> jsonFiles = Collections.singletonList("target/cucumber.json");

        Configuration config = new Configuration(reportOutputDirectory, "BDD Automation Report");
        config.addClassifications("Platform", System.getProperty("os.name"));
        config.addClassifications("Browser", "Chrome");
        config.addClassifications("Java Version", System.getProperty("java.version"));

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();
    }
}

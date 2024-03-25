package ramadbes_build_gradle;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.io.IOException;

public class Chart {
    public static void main(String[] args) {
        // Erstelle ein Dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1.0, "Reihe1", "Kategorie1");
        dataset.addValue(4.0, "Reihe1", "Kategorie2");
        dataset.addValue(3.0, "Reihe1", "Kategorie3");

        // Erstelle ein Balkendiagramm
        JFreeChart barChart = ChartFactory.createBarChart(
                "Balkendiagramm von ramadbes", // Diagrammtitel
                "Kategorie", // X-Achsen-Beschriftung
                "Wert", // Y-Achsen-Beschriftung
                dataset);

        // Speichere das Diagramm als PNG
        try {
            ChartUtils.saveChartAsPNG(new File("Balkendiagramm.png"), barChart, 800, 600);
            System.out.println("Balkendiagramm wurde erfolgreich erstellt!");
        } catch (IOException e) {
            System.out.println("Ein Fehler ist beim Speichern des Balkendiagramms aufgetreten.");
            e.printStackTrace();
        }
    }
}

package trabarduino;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author cris
 */
public class TrabArduino {

    public static void main(String[] args) {
        
    DefaultCategoryDataset data = new DefaultCategoryDataset();
    data.addValue(40.5, "maximo", "dia 1");
    data.addValue(38.2, "maximo", "dia 2");
    data.addValue(37.3, "maximo", "dia 3");
    data.addValue(31.5, "maximo", "dia 4");
    data.addValue(35.7, "maximo", "dia 5");
    data.addValue(42.5, "maximo", "dia 6");
    
    JFreeChart grafico = ChartFactory.createLineChart("Meu Grafico", "Dia", 
    "Valor", data, PlotOrientation.VERTICAL, true, true, false);

    ChartFrame frame = new ChartFrame("First", grafico);
    frame.pack();
    frame.setVisible(true);
    
    }
}

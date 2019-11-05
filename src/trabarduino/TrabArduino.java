package trabarduino;

import java.util.HashMap;
import java.util.Map;
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
    //Esses dados abaixo devem vir do javino    
    HashMap<Double, Double> dadosTeste  = new HashMap<Double, Double>() {{
        put(40.5,1.0);
        put(35.2,2.0);
        put(25.8,3.0);
    }};

    GeradorDataset geradorDataset = new GeradorDataset();    
    GeradorGrafico geradorGrafico = new GeradorGrafico();
    
    geradorGrafico.gerarGrafico("Meu Grafico", "Primeiro Grafico", "Ponto de exemplo", "Valor",
            geradorDataset.gerar("Teste", dadosTeste));
    
    }
}

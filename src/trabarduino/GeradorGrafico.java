/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class GeradorGrafico {
    public void gerarGrafico(String nomeGrafico, String nomeJanela, String eixoX,
            String eixoY, DefaultCategoryDataset dataset) {
        JFreeChart grafico = ChartFactory.createLineChart(nomeGrafico, eixoX, 
        eixoY, dataset, PlotOrientation.VERTICAL, true, true, false);

        ChartFrame frame = new ChartFrame(nomeJanela, grafico);
        frame.pack();
        frame.setVisible(true);    
    }
}

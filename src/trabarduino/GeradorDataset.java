/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabarduino;

import java.util.HashMap;
import java.util.Map;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author cris
 */
class GeradorDataset {
    public DefaultCategoryDataset gerar(String serie, HashMap<Double, Double> valores) {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        valores.entrySet().forEach((parDeValores) -> {
            data.addValue(parDeValores.getKey(), serie, parDeValores.getValue());
        });
        return data;
    };
}

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
    public DefaultCategoryDataset gerarDatasetDuplo(String serie1, HashMap<Double, Double> valores1, String serie2, 
            HashMap<Double, Double> valores2) {
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        
        valores1.entrySet().forEach((parDeValores) -> {
            data.addValue(parDeValores.getValue(), serie1, parDeValores.getKey() );
        });
        
        valores2.entrySet().forEach((parDeValores) -> {
            data.addValue(parDeValores.getValue(), serie2, parDeValores.getKey());
        });
        return data;
    };
}

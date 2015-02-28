/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid.util;


import edu.cmu.sphinx.frontend.*;
import edu.cmu.sphinx.frontend.util.StreamDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;



/**
 *
 * @author Manu
 */
public class FeatureGen {
    /*
     *
     * Process the file and store the features
     * 
     * @param inputAudioFile
     *            the input audio file
     * @throws FileNotFoundException
     * 
     * 
     */
 

    private List<double[]> getAllFeatures() {
        //throw new UnsupportedOperationException("Not yet implemented");
        List<double[]> allFeatures = new LinkedList<double[]>();
        /*
         * Run through all the data and produce feature.
         */
        try {
            assert (allFeatures != null);
            Data feature = frontEnd.getData();
            while (!(feature instanceof DataEndSignal)) {
                if (feature instanceof DoubleData) {
                    double[] featureData = ((DoubleData) feature).getValues();
                    double[] convertedData = new double[featureData.length];
                    for (int i = 0; i < featureData.length; i++) {
                        convertedData[i] = featureData[i];
                      //System.out.println("Feature:"+i+" "+featureData[i]+						  " Feature Length"+featureData.length+" Converted: "+convertedData[i]);
						//System.out.println(featureData[i]+"\n"); 
                    }
                    allFeatures.add(convertedData);
                        
                } else if (feature instanceof FloatData) {
                	
                    float[] floatArray = ((FloatData) feature).getValues();
                    double[] featureData = new double[floatArray.length];
                    for (int i = 0; i < floatArray.length; i++) {
                    	featureData[i] = (double) floatArray[i];
                    }
                    allFeatures.add(featureData);
                }
                feature = frontEnd.getData();
           //    System.out.println("Feature:"+feature+" Features"+allFeatures.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allFeatures;
    }
}
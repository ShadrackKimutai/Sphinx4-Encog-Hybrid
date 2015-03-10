/**
 * 
 */
package sphinx4.encognn.hybrid.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import edu.cmu.sphinx.frontend.Data;
import edu.cmu.sphinx.frontend.DataEndSignal;
import edu.cmu.sphinx.frontend.DoubleData;
import edu.cmu.sphinx.frontend.FloatData;
import edu.cmu.sphinx.frontend.FrontEnd;
import edu.cmu.sphinx.frontend.util.StreamDataSource;
import edu.cmu.sphinx.util.props.ConfigurationManager;

/**
 * @author Manu
 *
 */

public class FeatureExtractor {
	
	public static String FRONT_END = "cepstraFrontEnd";
	public static String AUDIO_SOURCE = "streamDataSource";
	public static String CONFIG = "frontend.config.xml";
	
	public FeatureExtractor() {
		ConfigurationManager cm = new ConfigurationManager(CONFIG);
        frontEnd = (FrontEnd) cm.lookup(FRONT_END);
        audioSource = (StreamDataSource) cm.lookup(AUDIO_SOURCE);
	}
	private StreamDataSource audioSource;
	private FrontEnd frontEnd;

	public List<double[]> fileProcessor(File inputAudioFile)  throws FileNotFoundException{
		 audioSource.setInputStream(new FileInputStream(inputAudioFile));
		 return getAllFeatures();
	
	}
	private List<double[]> getAllFeatures() {
		// TODO Auto-generated method stub
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
            //System.out.println("Feature:"+feature+" Features"+allFeatures.size());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allFeatures;
	}

}

/**
 * 
 */
package sphinx4.encognn.hybrid.nn.encog.recognizer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import org.encog.Encog;
import org.encog.engine.network.activation.ActivationSigmoid;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.data.basic.BasicMLData;
import org.encog.ml.data.basic.BasicMLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.neural.networks.training.propagation.resilient.ResilientPropagation;
import sphinx4.encognn.hybrid.util.FeatureExtractor;
import sphinx4.encognn.hybrid.util.Labeler;



/**
 * @author Manu
 *
 */
public class Recognizer {

	/**
	 * 
	 */
	public static int NUM_IN;
	public static int NUM_OUT;
	
	public Recognizer() {
		this.NUM_IN=13;
		this.NUM_OUT=10;
		// TODO Auto-generated constructor stub
	}
	public void recognizer(List<File> files){
            
FeatureExtractor fe=new FeatureExtractor();
		MLDataSet trainingSet = new BasicMLDataSet();
    		for (File f : files) {
    			//System.out.println(f.getAbsolutePath());
    		
				List<double[]> data;
				try {
					data = fe.fileProcessor(f);
					MLData mldataIn = new BasicMLData(data.get(0));
					double[] out = new double[NUM_OUT];
					Integer index = new Integer(Labeler.getLabel(f));
					//System.out.println(index+""+data.get(0));
					out[index] = 1.;
					MLData mldataout = new BasicMLData(out);
					trainingSet.add(mldataIn, mldataout);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	}
    	
    		BasicNetwork network = new BasicNetwork();
    		network.addLayer(new BasicLayer(NUM_IN));
    		network.addLayer(new BasicLayer(new ActivationSigmoid(), true, 4 * NUM_IN));
    		//network.addLayer(new BasicLayer(new ActivationSigmoid(), true, 2 * NUM_IN));
    		network.addLayer(new BasicLayer(new ActivationSigmoid(), false, NUM_OUT));
    		network.getStructure().finalizeStructure();
    		network.reset();
     
    		// train the neural network
    		ResilientPropagation train = new ResilientPropagation(network, trainingSet);
     
    		System.out.println("Training Set: "+ trainingSet.size());
                
    		int epoch = 1;
     
    		do {
    			train.iteration();
    			System.out.println("Epoch:" + epoch + " Error-->" + train.getError());
    			epoch++;
    		} while(train.getError() > 0.001);
    		train.finishTraining();
     
    		// test the neural network
    		System.out.println("Neural Network Results:");
    		for(MLDataPair pair: trainingSet ) {
    			final MLData output = network.compute(pair.getInput());
    			System.out.println("actual-->" + Labeler.getWord(output) + ", ideal-->" + Labeler.getWord(pair.getIdeal()));
    		}
    		
     		Encog.getInstance().shutdown();  
     		
            
           
	}

}

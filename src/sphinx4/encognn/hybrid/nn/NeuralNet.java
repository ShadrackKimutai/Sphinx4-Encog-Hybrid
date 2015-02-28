/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid.nn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import org.encog.engine.network.activation.ActivationSigmoid;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.data.basic.BasicMLData;
import org.encog.ml.data.basic.BasicMLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.neural.networks.layers.BasicLayer;
import org.encog.neural.networks.training.propagation.resilient.ResilientPropagation;
import sphinx4.encognn.hybrid.util.FileProcessor;
import sphinx4.encognn.hybrid.util.SpeechTagger;

/**
 *
 * @author Manu
 */
public class NeuralNet {
    private int NUM_OUT;
    private int NUM_IN;
    public void neuralNet(List<File> trainFiles){
    MLDataSet trainingSet = new BasicMLDataSet();
    	for (File f : trainFiles) {
    		System.out.println(f.getAbsolutePath());
    		try {
    			List<double[]> data = FileProcessor.processFile(f);
    			MLData mldataIn = new BasicMLData(data.get(0));
    			double[] out = new double[NUM_OUT];
				Integer index = new Integer(SpeechTagger.getLabel(f));
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
		network.addLayer(new BasicLayer(new ActivationSigmoid(), true, 2 * NUM_IN));
		network.addLayer(new BasicLayer(new ActivationSigmoid(), false, NUM_OUT));
		network.getStructure().finalizeStructure();
		network.reset();
 
		// train the neural network
		ResilientPropagation train = new ResilientPropagation(network, trainingSet);
 
		int epoch = 1;
 
		do {
			train.iteration();
			System.out.println("Epoch #" + epoch + " Error:" + train.getError());
			epoch++;
		} while(train.getError() > 0.01);
		train.finishTraining();
 
		// test the neural network
		System.out.println("Neural Network Results:");
		for(MLDataPair pair: trainingSet ) {
			final MLData output = network.compute(pair.getInput());
			System.out.println("actual=" + getWord(output) + ", ideal=" + getWord(pair.getIdeal()));
		}
                
    }

    private String getWord(MLData output) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

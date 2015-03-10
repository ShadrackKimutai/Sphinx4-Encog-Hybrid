package sphinx4.encognn.hybrid.util;

import java.io.File;

import org.encog.ml.data.MLData;

public class Labeler {

	public Labeler() {
		// TODO Auto-generated constructor stub
	}
	 public static String getLabel(File f) {
	    	String name = f.getName();
	    	String res = name.substring(0, name.indexOf(".wav"));
	    	return res;
	    }
	 public static int getWord(MLData data) {
	    	int res = 0;
	    	double largest = data.getData(0);
	    	for (int i = 1; i < data.size(); i++) {
	    		double value = data.getData(i); 
	    		if (value > largest) {
	    			largest = value;
	    			res = i;
	    		}
	    	}
	    	return res;
	    }

}

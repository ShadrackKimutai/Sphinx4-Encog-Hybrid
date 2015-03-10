/**
 * 
 */
package sphinx4.encognn.hybrid.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import sphinx4.encognn.hybrid.nn.encog.recognizer.Recognizer;
import sphinx4.encognn.hybrid.util.FileProcessor;




/**
 * @author Shadrack
 *
 */
public class Processor {

	/**
	 * First Step: initialize fundamental variables used by the neural network recognizer
	 */
	public static String DATA_FOLDER = "data";
	public static String FRONT_END = "cepstraFrontEnd";
	public static String AUDIO_SOURCE = "streamDataSource";
	public static String CONFIG = "frontend.config.xml";
	public static int NUM_IN = 13;
	public static int NUM_OUT = 10;
	public Processor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileProcessor fp=new FileProcessor();
		Recognizer recog=new Recognizer();
		@SuppressWarnings("unused")
		List<double[]>feats=null;
		String inputAudioFile="C:\\Users\\Manu\\Documents\\Downloads\\numRec\\numRec\\data";
		List<File> files=fp.wavFileProcessor(inputAudioFile);
			
			recog.recognizer(files);
			
	}
}


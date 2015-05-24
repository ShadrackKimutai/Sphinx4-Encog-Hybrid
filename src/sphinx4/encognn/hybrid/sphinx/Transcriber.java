/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid.sphinx;

/**
 *
 * @author Shadrack
 */
import edu.cmu.sphinx.frontend.util.AudioFileDataSource;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.util.props.ConfigurationManager;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import sphinx4.encognn.hybrid.util.FileProcessor;

/** A simple example that shows how to transcribe a continuous audio file that has multiple utterances in it. */
public class Transcriber {
    private  String resultText="";


    public static String transcribe(String[] args) throws IOException, UnsupportedAudioFileException {
        
		Transcription trans= new Transcription();
                
		FileProcessor fp=new FileProcessor();
		String inputAudioFile="I:\\Thesis\\Research Waveforms\\Refined\\Speaker1\\";
		List<File> files=fp.wavFileProcessor(inputAudioFile);
		for(File x:files){
			System.out.println(x.getName());
			trans.transcription(x.getCanonicalPath());
		}
        return null;
    }

}

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
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

/** A simple example that shows how to transcribe a continuous audio file that has multiple utterances in it. */
public class Transcription{


    public void transcription(String[] args ) throws IOException, UnsupportedAudioFileException {
        URL audioURL;

        if (args.length > 0) {
            audioURL = new File(args[0]).toURI().toURL();
            System.out.println(audioURL);
        } else {
            audioURL = new File("").toURI().toURL();
        }

        URL configURL =new File("Config.xml").toURI().toURL();//Transcriber.class.getResource("Config.xml");
        		// Transcriber.class.getResource("Config.xml");
       System.out.println(configURL);
 try {
       ConfigurationManager cm = new ConfigurationManager(configURL);
       
    
      
        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");

        // allocate the resource necessary for the recognizer //
        recognizer.allocate();

        // configure the audio input for the recognizer
        AudioFileDataSource dataSource = (AudioFileDataSource) cm.lookup("audioFileDataSource");
        dataSource.setAudioFile(audioURL, null);

        // Loop until last utterance in the audio file has been decoded, in which case the recognizer will return null.
        Result result;
       
			while ((result = recognizer.recognize()) != null) {

				String resultText = result.getBestResultNoFiller();
				System.out.println(resultText);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
      
    }

	public void transcription(String canonicalPath) throws MalformedURLException,UnsupportedAudioFileException {
		// TODO Auto-generated method stub
		 URL audioURL;

	      
	            audioURL = new File(canonicalPath).toURI().toURL();
	        

	        URL configURL =new File("Config.xml").toURI().toURL();//Transcriber.class.getResource("Config.xml");
	        		// Transcriber.class.getResource("Config.xml");
	      // System.out.println(configURL);
	 try {
	       ConfigurationManager cm = new ConfigurationManager(configURL);
	       
	    
	      
	        Recognizer recognizer = (Recognizer) cm.lookup("recognizer");

	        // allocate the resource necessary for the recognizer //
	        recognizer.allocate();

	        // configure the audio input for the recognizer
	        AudioFileDataSource dataSource = (AudioFileDataSource) cm.lookup("audioFileDataSource");
	        dataSource.setAudioFile(audioURL, null);

	        // Loop until last utterance in the audio file has been decoded, in which case the recognizer will return null.
	        Result result;
	       
				while ((result = recognizer.recognize()) != null) {

					String resultText = result.getBestResultNoFiller();
					System.out.println(resultText);
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}
	}
}

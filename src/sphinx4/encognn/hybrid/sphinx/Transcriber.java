/*
 * Copyright 1999-2004 Carnegie Mellon University.
 * Portions Copyright 2004 Sun Microsystems, Inc.
 * Portions Copyright 2004 Mitsubishi Electric Research Laboratories.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL
 * WARRANTIES.
 *
 */
package sphinx4.encognn.hybrid.sphinx;

import edu.cmu.sphinx.frontend.util.AudioFileDataSource;
import edu.cmu.sphinx.recognizer.Recognizer;
import edu.cmu.sphinx.result.ConfidenceResult;
import edu.cmu.sphinx.result.ConfidenceScorer;
import edu.cmu.sphinx.result.Path;
import edu.cmu.sphinx.result.Result;
import edu.cmu.sphinx.result.WordResult;
import edu.cmu.sphinx.util.props.ConfigurationManager;

import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Set;

/**
 * A simple example that shows how to transcribe a continuous audio file that
 * has multiple utterances in it.
 */
public class Transcriber {

    private static DecimalFormat format = new DecimalFormat("#.#####");

    public void transcribe(String[] args,URL configURL) throws IOException, UnsupportedAudioFileException {
        URL audioURL;

        if (args.length > 0) {
            audioURL = new File(args[0]).toURI().toURL();
            System.out.println(audioURL);
        } else {
            audioURL = new File("").toURI().toURL();
        }

        
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

    public void transcribe(String canonicalPath,URL configURL) throws MalformedURLException, UnsupportedAudioFileException {
        // TODO Auto-generated method stub
        URL audioURL;

        audioURL = new File(canonicalPath).toURI().toURL();

       // URL configURL = new ;//Transcriber.class.getResource("Config.xml");
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

    private static void printWordConfidence(WordResult wr) {
        String word = wr.getPronunciation().getWord().getSpelling();

        System.out.print(word);

        /* pad spaces between the word and its score */
        int entirePadLength = 10;
        if (word.length() < entirePadLength) {
            for (int i = word.length(); i < entirePadLength; i++) {
                System.out.print(" ");
            }
        }

      //  System.out.println(" (confidence: " + format.format(wr.getLogMath().logToLinear((float) wr.getConfidence())) + ')');
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author Manu
 */
public class SpeechTagger {
    public void  loadDict(Path dictPath){
       String  nameString=null;
        try (InputStream in = Files.newInputStream(dictPath);
                
                 
            BufferedReader reader =new BufferedReader(new InputStreamReader(in))) {
            String line = null;
           
            while (((line = reader.readLine()) != null) ) {
           
                 
           nameString=line.substring(0,line.indexOf(" "));
                System.out.println(nameString);
            
            }
        } catch (IOException x) {
            System.err.println(x);
        }
    }
    
}

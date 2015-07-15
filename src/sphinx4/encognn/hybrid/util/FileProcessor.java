/**
 * 
 */
package sphinx4.encognn.hybrid.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import sphinx4.encognn.hybrid.encogNeuralNet;



/**
 * @author Manu
 *
 */
public class FileProcessor   {

	
	
	//
	public FileProcessor(){
		
	}
	
	public List<File> wavFileProcessor( String SPEECH_FOLDER) {
		// TODO Auto-generated method stub
		List<File> trainFiles = new ArrayList<File>();
    	File dataFolder = new File(SPEECH_FOLDER);
    	for (File dir : dataFolder.listFiles()) {
    		if (dir.isDirectory()) {
        		for (File file : dir.listFiles())
        			if (file.isFile() ){
        				trainFiles.add(file);
        				
        			}
    		}
    		else {
    			if (dir.isFile())
    				trainFiles.add(dir);
    			
    		}
    	}
    	return trainFiles;
	}
	public List<File> wavFileProcessor(String [] SPEECH_FOLDERS){
         List<File> trainFiles = new ArrayList<>();
    	 for(int x =0;x<=SPEECH_FOLDERS.length-1 ;x++){
          try
          {
              File dataFolder = new File(SPEECH_FOLDERS[x]);
        
            for (File dir : dataFolder.listFiles()) {
                
                if (dir.isDirectory()) {
        		for (File file : dir.listFiles())
        			if (file.isFile())
        				trainFiles.add(file);
    		}
    		else {
    			if (dir.isFile())
    				trainFiles.add(dir);
    		}
            }
          }catch(Exception ex){
                
                   System.out.println("Exception:"+ex.getMessage()); 
                }
          }
          return trainFiles;
        }
        
	
       
    
}

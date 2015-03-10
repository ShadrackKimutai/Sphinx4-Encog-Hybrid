/**
 * 
 */
package sphinx4.encognn.hybrid.util;

import java.io.File;
import java.util.ArrayList;
import java.util.List;



/**
 * @author Manu
 *
 */
public class FileProcessor   {

	/**
	 * @param DATA_FOLDER 
	 * 
	 */
	
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
	
	
}

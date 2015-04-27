package sphinx4.encognn.hybrid.util;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.encog.ml.data.MLData;

public class Labeler {

    public Labeler() {
        // TODO Auto-generated constructor stub
    }

    public int getMarker(String str) {
        int marker = 0;
        String markList = "CHDHGHKHNGNYSHTH";
        int[] markArray = {35, 36, 37, 38, 39, 40, 41, 42};
        marker = markArray[ markList.indexOf(str)];
        // System.out.println("Entry:"+str+ " Marker:"+marker);
        return marker;
    }

    public int getMarker(char Ch) {
        int marker = 0;
        String markList = "AEIOUWYBDFGHJKLMNPRSTVZ";
        int[] markArray = {45, 46, 47, 48, 49, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
        marker = markArray[ markList.indexOf(Ch)];
        //System.out.println("Entry:"+Ch+ " Marker:"+marker);

        return marker;
    }
    public int getIndex(File filepath) {
        int index = 0;
        FileProcessor fp = new FileProcessor();

        List<File> files = fp.wavFileProcessor(filepath.getParent());
        int i = 0;
        for (File file : files) {
            String compString=(file.getAbsolutePath());
            if (compString.compareTo(filepath.getAbsolutePath())==0){
                 index=i;
            }
            
            i++;
        }
           // System.out.println(filepath.getCanonicalPath()+"\n"+filepath.getParent());

        return index;
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

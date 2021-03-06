/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.encog.Encog;
import org.encog.ml.data.MLData;
import org.encog.ml.data.MLDataPair;
import org.encog.ml.data.MLDataSet;
import org.encog.ml.data.basic.BasicMLData;
import org.encog.ml.data.basic.BasicMLDataSet;
import org.encog.neural.networks.BasicNetwork;
import org.encog.persist.EncogDirectoryPersistence;
import sphinx4.encognn.hybrid.util.AccuracyBridge;
import sphinx4.encognn.hybrid.util.FeatureExtractor;
import sphinx4.encognn.hybrid.util.FileProcessor;
import sphinx4.encognn.hybrid.util.Labeler;

/**
 *
 * @author Manu
 */
public class TestEncogNN extends javax.swing.JInternalFrame {

    public File SAVEDNNINSTANCE;
    AccuracyBridge acc;
    private int OUTPUT_NODES;
// private List<File> files;
  private File file;
    /**
     * Creates new form TestEncogNN
     */
    public TestEncogNN() {
        this.SAVEDNNINSTANCE = new File("files/network.csv");

        this.OUTPUT_NODES = new TrainEncogNN().OUTPUT_NODES;

        //this.jSlider1.setValue(acc.ACCURACY);
        initComponents();



    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        accuracySlider = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtSingleWordUtter = new javax.swing.JTextField();
        btnRecogFile = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSingleRecog = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnRecogFolder = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        txtIndividualsSpokenWord = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBulkResults = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Test Trained Network");
        setDoubleBuffered(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/sphinx4/encognn/hybrid/Icons/logo.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Accuracy Standings"));
        jPanel2.setPreferredSize(new java.awt.Dimension(904, 307));

        jLabel1.setText("Sphinx4");

        jLabel2.setText("Sphinx4-Neural Network Hybrid");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(accuracySlider, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accuracySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Open Single Spoken File(wav)"));

        jButton1.setText("Load Spoken Word File");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtSingleWordUtter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSingleWordUtterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSingleWordUtter, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSingleWordUtter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        btnRecogFile.setText("Recognize");
        btnRecogFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecogFileActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Recognized Word"));

        txtSingleRecog.setColumns(20);
        txtSingleRecog.setRows(5);
        jScrollPane1.setViewportView(txtSingleRecog);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRecogFile)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnRecogFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel5.getAccessibleContext().setAccessibleName("Open Single Spoken File");

        jTabbedPane1.addTab("Test Word", jPanel1);

        jPanel3.setMinimumSize(new java.awt.Dimension(900, 500));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 500));

        btnRecogFolder.setText("Recognize");
        btnRecogFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecogFolderActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Open Single Speaker's Speech Folder"));

        jButton5.setText("Load Folder");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        txtIndividualsSpokenWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndividualsSpokenWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(txtIndividualsSpokenWord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIndividualsSpokenWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Results"));

        txtBulkResults.setColumns(20);
        txtBulkResults.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txtBulkResults.setRows(5);
        txtBulkResults.setDoubleBuffered(true);
        jScrollPane2.setViewportView(txtBulkResults);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRecogFolder))
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecogFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Test Individual Speaker's Spoken Words", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtSingleWordUtter.setText(fileDialog());
    }//GEN-LAST:event_jButton1ActionPerformed
    private String fileDialog() {
        String replyString = null;

        final JFileChooser fc = new JFileChooser();

        fc.setDialogTitle("Open Speech Wave File");
        fc.setFileFilter(new FileNameExtensionFilter("Wave File(*.wav)", "*.wav"));
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setName("Select");


        int returnVal = fc.showOpenDialog(this);
        if (returnVal == 1) {
        } else {
            try {
                //System.out.println(returnVal);
                replyString = fc.getSelectedFile().getCanonicalFile().toString();
            } catch (IOException ex) {
                Logger.getLogger(TrainEncogNN.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return replyString;
    }

    private void txtSingleWordUtterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSingleWordUtterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSingleWordUtterActionPerformed

    private void btnRecogFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecogFileActionPerformed

        // TODO add your handling code here:
        if (txtSingleWordUtter.getText()==""){
            return;
        } else{
        SwingUtilities.invokeLater(new Runnable(){

            @Override
            public void run() {
                FileProcessor fp = new FileProcessor();
                String inputAudioFile = txtSingleWordUtter.getText();
                File file = new File(inputAudioFile);
                LoadnTest(file);
            } 
        });
        }
    }//GEN-LAST:event_btnRecogFileActionPerformed
    private void LoadnTest(final List<File> files) {
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {
            private int error;
 BasicNetwork network = (BasicNetwork) EncogDirectoryPersistence.loadObject(SAVEDNNINSTANCE);
               MLDataSet trainingSet = new BasicMLDataSet();
            
            @Override
            protected Void doInBackground() throws Exception {
               // System.out.println("Inside LoadnTest(final List<File> files)");
                FeatureExtractor fe = new FeatureExtractor();
                
                int i = 0;
                for (File f : files) {


                    List<double[]> data;
                    try {
                        data = fe.fileProcessor(f);
                        MLData mldataIn = new BasicMLData(data.get(0));
                        //	System.out.println(mldataIn);
                        double[] out = new double[OUTPUT_NODES];
                        //Integer index = new Integer(Labeler.getLabel(f));
                       //System.out.println(i+""+data.get(0));
                        out[i] = 1.;
                        MLData mldataout = new BasicMLData(out);
                        trainingSet.add(mldataIn, mldataout);
                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                    }
                    if (i < 30) {
                        i++;
                    } else {
                        i = 0;
                    }
                }
                for (MLDataPair pair : trainingSet) {
                    final MLData output = network.compute(pair.getInput());

                   txtBulkResults.append("actual-->" + Labeler.getWord(output) + ", ideal-->" + Labeler.getWord(pair.getIdeal())+"\n");
                   txtBulkResults.moveCaretPosition(txtBulkResults.getText().length());
                   String s =String.valueOf(Labeler.getWord(pair.getIdeal()));
                   String t=String.valueOf(Labeler.getWord(output));
                   if (Integer.valueOf(s.compareTo(t))!=0)
                       error++;
                }
                Encog.getInstance().shutdown();
                return null;
            }
            @Override
            protected void process(List<String> chunks) {
                String value = chunks.get(chunks.size() - 1);
                txtBulkResults.append(value);
            }

            @Override
            protected void done() {
                float results=((31-error)*100)/31;
              txtBulkResults.append("Trancription accuracy for this speaker is: "+String.valueOf(results)+"% \nThe overall error of this network is:"+network.calculateError(trainingSet));
            }

        };
        worker.execute();
    }

    private void LoadnTest(final File file) {
        SwingWorker<Void, String> worker = new SwingWorker<Void, String>() {

            @Override
            protected Void doInBackground() throws Exception {
                FeatureExtractor fe = new FeatureExtractor();
                MLDataSet trainingSet = new BasicMLDataSet();

                List<double[]> data;
                try {
                    data = fe.fileProcessor(file);
                    MLData mldataIn = new BasicMLData(data.get(0));
                    //	System.out.println(mldataIn);
                    double[] out = new double[OUTPUT_NODES];
                    Integer index = new Labeler().getIndex(file);

                    //System.out.println(index+""+data.get(0));
                    out[index] = 1.;
                    MLData mldataout = new BasicMLData(out);
                    trainingSet.add(mldataIn, mldataout);
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                }

                BasicNetwork network = (BasicNetwork) EncogDirectoryPersistence.loadObject(SAVEDNNINSTANCE);
                for (MLDataPair pair : trainingSet) {
                    final MLData output = network.compute(pair.getInput());
float error=nnTranscriptionAccuracy(file.getParent());
                    txtSingleRecog.setText("actual-->" + Labeler.getWord(output) + ", ideal-->" + Labeler.getWord(pair.getIdeal())+" \nThis speaker had a transciption accuracy of:"+error+"% and the network has an overall error of:"+network.calculateError(trainingSet));
                    
                }
                Encog.getInstance().shutdown();

                return null;
            }

        };
        worker.execute();
    }

    private void clearBulk(){
        txtBulkResults.selectAll();
        txtBulkResults.replaceSelection("");
        txtBulkResults.removeAll();
    }
    private void btnRecogFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecogFolderActionPerformed
        // TODO add your handling code here:
        clearBulk();
        if (txtIndividualsSpokenWord.getText() == "") {
            return;
        } else {
            SwingUtilities.invokeLater(new Runnable() {

                @Override
                public void run() {
                    FileProcessor fp = new FileProcessor();
                    String inputAudioFiles = txtIndividualsSpokenWord.getText();
                    List<File> files = fp.wavFileProcessor(inputAudioFiles);
                    LoadnTest(files);
                }
            });
        }
    }//GEN-LAST:event_btnRecogFolderActionPerformed
   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        txtIndividualsSpokenWord.setText(Dialog());
    }//GEN-LAST:event_jButton5ActionPerformed
    private String Dialog() {
        String replyString = null;
        final JFileChooser fc = new JFileChooser();

        fc.setDialogTitle("Open Speech Directory");

        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.setName("Select");


        int returnVal = fc.showOpenDialog(this);
        if (returnVal == 1) {
        } else {
            try {
                //System.out.println(returnVal);
                replyString = fc.getSelectedFile().getCanonicalFile().toString();
            } catch (IOException ex) {
                Logger.getLogger(TrainEncogNN.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return replyString;
    }
    private void txtIndividualsSpokenWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndividualsSpokenWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndividualsSpokenWordActionPerformed
    public BasicNetwork loadNetwork() {
        File file = SAVEDNNINSTANCE;

        if (!file.exists()) {
            System.out.println("Can't read file: " + file.getAbsolutePath());
            return null;
        }

        BasicNetwork network = (BasicNetwork) EncogDirectoryPersistence.loadObject(file);

        return network;
    }
    private float nnTranscriptionAccuracy(String Path){
       FileProcessor fp=new FileProcessor();
        List<File> files = fp.wavFileProcessor(Path);
                   
             int error=0;
 BasicNetwork network = (BasicNetwork) EncogDirectoryPersistence.loadObject(SAVEDNNINSTANCE);
               MLDataSet trainingSet = new BasicMLDataSet();
                      
         FeatureExtractor fe = new FeatureExtractor();
                
                int i = 0;
                for (File f : files) {


                    List<double[]> data;
                    try {
                        data = fe.fileProcessor(f);
                        MLData mldataIn = new BasicMLData(data.get(0));
                        //	System.out.println(mldataIn);
                        double[] out = new double[OUTPUT_NODES];
                        //Integer index = new Integer(Labeler.getLabel(f));
                       //System.out.println(i+""+data.get(0));
                        out[i] = 1.;
                        MLData mldataout = new BasicMLData(out);
                        trainingSet.add(mldataIn, mldataout);
                    } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                    }
                    if (i < 30) {
                        i++;
                    } else {
                        i = 0;
                    }
                }
                for (MLDataPair pair : trainingSet) {
                    final MLData output = network.compute(pair.getInput());

                  // txtBulkResults.append("actual-->" + Labeler.getWord(output) + ", ideal-->" + Labeler.getWord(pair.getIdeal())+"\n");
                   //txtBulkResults.moveCaretPosition(txtBulkResults.getText().length());
                   String s =String.valueOf(Labeler.getWord(pair.getIdeal()));
                   String t=String.valueOf(Labeler.getWord(output));
                   if (Integer.valueOf(s.compareTo(t))!=0)
                       error++;
                }
                Encog.getInstance().shutdown();
float results=((31-error)*100)/31;
                return results;
                 
          
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSlider accuracySlider;
    private javax.swing.JButton btnRecogFile;
    private javax.swing.JButton btnRecogFolder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtBulkResults;
    private javax.swing.JTextField txtIndividualsSpokenWord;
    private javax.swing.JTextArea txtSingleRecog;
    private javax.swing.JTextField txtSingleWordUtter;
    // End of variables declaration//GEN-END:variables
}

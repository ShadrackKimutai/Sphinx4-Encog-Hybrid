/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sphinx4.encognn.hybrid;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import sphinx4.encognn.hybrid.util.FileProcessor;
//import sphinx4.encognn.hybrid.util.SpeechTagger;

/**
 *
 * @author Manu
 */
public class encogNeuralNet extends javax.swing.JInternalFrame {

    /**
     * Creates new form encogNeuralNet
     */
    public encogNeuralNet() {
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
        lblSpeaker1 = new javax.swing.JLabel();
        lblSpeaker2 = new javax.swing.JLabel();
        lblSpeaker3 = new javax.swing.JLabel();
        lblSpeaker4 = new javax.swing.JLabel();
        lblSpeaker5 = new javax.swing.JLabel();
        txtSpeaker1 = new javax.swing.JTextField();
        txtSpeaker2 = new javax.swing.JTextField();
        txtSpeaker3 = new javax.swing.JTextField();
        txtSpeaker4 = new javax.swing.JTextField();
        txtSpeaker5 = new javax.swing.JTextField();
        btnSpeaker1 = new javax.swing.JButton();
        btnSpeaker2 = new javax.swing.JButton();
        btnSpeaker3 = new javax.swing.JButton();
        btnSpeaker4 = new javax.swing.JButton();
        btnSpeaker5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtDirectoryPath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        btnBeginTraining = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        numofnn = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        errorSpinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Encog Neural Network");
        setDesktopIcon(getDesktopIcon());
        setDoubleBuffered(true);
        setLayer(1);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Load Speakers"));

        lblSpeaker1.setText("Speech Directory 1");

        lblSpeaker2.setText("Speech Directory 2  ");

        lblSpeaker3.setText("Speech Directory 3");

        lblSpeaker4.setText("Speech Directory 4 ");

        lblSpeaker5.setText("Speech Directory 5");

        btnSpeaker1.setText("Load Speech");
        btnSpeaker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker1ActionPerformed(evt);
            }
        });

        btnSpeaker2.setText("Load Speech");
        btnSpeaker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker2ActionPerformed(evt);
            }
        });

        btnSpeaker3.setText("Load Speech");
        btnSpeaker3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker3ActionPerformed(evt);
            }
        });

        btnSpeaker4.setText("Load Speech");
        btnSpeaker4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker4ActionPerformed(evt);
            }
        });

        btnSpeaker5.setText("Load Speech");
        btnSpeaker5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpeaker5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSpeaker1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSpeaker1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSpeaker5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSpeaker5, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpeaker3)
                            .addComponent(lblSpeaker4)
                            .addComponent(lblSpeaker2))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSpeaker4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(txtSpeaker3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSpeaker2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSpeaker3)
                    .addComponent(btnSpeaker1)
                    .addComponent(btnSpeaker2)
                    .addComponent(btnSpeaker4)
                    .addComponent(btnSpeaker5)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker1)
                    .addComponent(txtSpeaker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeaker1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSpeaker2)
                    .addComponent(btnSpeaker2)
                    .addComponent(lblSpeaker2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker3)
                    .addComponent(txtSpeaker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeaker3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker4)
                    .addComponent(txtSpeaker4)
                    .addComponent(btnSpeaker4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpeaker5)
                    .addComponent(txtSpeaker5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeaker5)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Load Dictionary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));

        jButton1.setText("Load Dictionary");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Dictionary File");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDirectoryPath, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirectoryPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Train Network"));

        btnBeginTraining.setText("Train Network");
        btnBeginTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginTrainingActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnBeginTraining)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(btnBeginTraining, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Network Properties"));

        numofnn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Layers");

        errorSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Error");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numofnn, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numofnn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errorSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSpeaker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker1ActionPerformed
     
 txtSpeaker1.setText(Dialog());
    
    }//GEN-LAST:event_btnSpeaker1ActionPerformed
 
    private String Dialog(){
      String  replyString = null;
        final JFileChooser fc=new JFileChooser();
      
            fc.setDialogTitle("Open Speech Directory");
            
            fc.setDialogType(JFileChooser.OPEN_DIALOG);
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setName("Select");
        
        
            int returnVal=fc.showOpenDialog(this);
            if (returnVal==1){
               
            }else{
                try {
                    //System.out.println(returnVal);
                    replyString = fc.getSelectedFile().getCanonicalFile().toString();
                } catch (IOException ex) {
                    Logger.getLogger(encogNeuralNet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return replyString;
 }
    
     private String fileDialog(){
      String  replyString = null;
     
        final JFileChooser fc=new JFileChooser();
      
            fc.setDialogTitle("Open Speech Dictionary");
            fc.setFileFilter(new FileNameExtensionFilter("Dictionary File(*.dic)", "*.dic") );
            fc.setDialogType(JFileChooser.OPEN_DIALOG);
            fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fc.setName("Select");
        
        
            int returnVal=fc.showOpenDialog(this);
            if (returnVal==1){
               
            }else{
                try {
                    //System.out.println(returnVal);
                    replyString = fc.getSelectedFile().getCanonicalFile().toString();
                } catch (IOException ex) {
                    Logger.getLogger(encogNeuralNet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return replyString;
 }
    
    
    private void btnSpeaker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker2ActionPerformed
        // TODO add your handling code here:
        txtSpeaker2.setText(Dialog());
      
    }//GEN-LAST:event_btnSpeaker2ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
     
     
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnSpeaker3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker3ActionPerformed
        // TODO add your handling code here:
       txtSpeaker3.setText(Dialog());
    }//GEN-LAST:event_btnSpeaker3ActionPerformed

    private void btnSpeaker4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker4ActionPerformed
        // TODO add your handling code here:
       txtSpeaker4.setText(Dialog());
    }//GEN-LAST:event_btnSpeaker4ActionPerformed

    private void btnSpeaker5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpeaker5ActionPerformed
        // TODO add your handling code here:
        txtSpeaker5.setText(Dialog());
    }//GEN-LAST:event_btnSpeaker5ActionPerformed

    private void btnBeginTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginTrainingActionPerformed
        // TODO add your handling code here:
        
        String inputFile[]={txtSpeaker1.getText(),txtSpeaker2.getText(),txtSpeaker3.getText(),txtSpeaker4.getText(),txtSpeaker5.getText()};
       
        List<File> trainFiles = new ArrayList<>();
    	for(int x =0;x<=inputFile.length-1 ;x++){
          try
          {
              File dataFolder = new File(inputFile[x]);
          
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
                
                   System.out.println(ex.getMessage()); 
                }
          }
        
                    
    }//GEN-LAST:event_btnBeginTrainingActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txtDirectoryPath.setText(fileDialog());
        initDict();
    }//GEN-LAST:event_jButton1ActionPerformed
private void initDict(){
    Path dirPath=Paths.get(txtDirectoryPath.getText());
        //SpeechTagger sT=new SpeechTagger();
      // sT.loadDict(dirPath);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeginTraining;
    private javax.swing.JButton btnSpeaker1;
    private javax.swing.JButton btnSpeaker2;
    private javax.swing.JButton btnSpeaker3;
    private javax.swing.JButton btnSpeaker4;
    private javax.swing.JButton btnSpeaker5;
    private javax.swing.JSpinner errorSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblSpeaker1;
    private javax.swing.JLabel lblSpeaker2;
    private javax.swing.JLabel lblSpeaker3;
    private javax.swing.JLabel lblSpeaker4;
    private javax.swing.JLabel lblSpeaker5;
    private javax.swing.JSpinner numofnn;
    private javax.swing.JTextField txtDirectoryPath;
    private javax.swing.JTextField txtSpeaker1;
    private javax.swing.JTextField txtSpeaker2;
    private javax.swing.JTextField txtSpeaker3;
    private javax.swing.JTextField txtSpeaker4;
    private javax.swing.JTextField txtSpeaker5;
    // End of variables declaration//GEN-END:variables
}

package GUI;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Create an input frame to create a new table.
 *  
 * @author mattvertescher
 */
public class CreateTableFrame extends javax.swing.JFrame {

    public static GUIClient clientRequest;
    
    /**
     * Creates new form CreateTableFrame.
     */
    public CreateTableFrame(GUIClient guic) {
        initComponents();        
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((screenSize.width/2)-(this.getWidth()/2), (screenSize.height/2)-(this.getHeight()/2));
        this.setIconImage(new ImageIcon(GUIClient.class.getResource("images/icon_playing_card.png")).getImage());
        
        clientRequest = guic; 
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tableNameLabel = new javax.swing.JLabel();
        anteLabel = new javax.swing.JLabel();
        bringInLabel = new javax.swing.JLabel();
        tableNameTextField = new javax.swing.JTextField();
        anteTextField = new javax.swing.JTextField();
        bringInTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        createTableButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Table");
        setResizable(false);

        tableNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tableNameLabel.setText("Table Name:");

        anteLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        anteLabel.setText("Ante:");

        bringInLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bringInLabel.setText("Bring In:");

        tableNameTextField.setText("New Table");

        anteTextField.setText("10");

        bringInTextField.setText("10");

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        createTableButton.setText("Create Table");
        createTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTableButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(cancelButton, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(createTableButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(mainPanelLayout.createSequentialGroup()
                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(bringInLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, anteLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, tableNameLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, tableNameTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .add(bringInTextField)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, anteTextField))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tableNameLabel)
                    .add(tableNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(anteTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(anteLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bringInTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(bringInLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancelButton)
                    .add(createTableButton))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * When the cancel button is pressed, this frame is destroyed.
     * @param evt 
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed
    
    /**
     * When the create table button is pressed, a new table is attempted to be
     * created on the server. 
     * @param evt 
     */
    private void createTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTableButtonActionPerformed
        String tableNameString = tableNameTextField.getText();
        String anteString = anteTextField.getText(); 
        String bringInString = bringInTextField.getText();   
        
        int ante = Integer.parseInt(anteString);
     
        ///else if (Integer.parseInt(anteString))
           // JOptionPane.showMessageDialog(this, "The ante is not a number", "Table Creation Failed", JOptionPane.ERROR_MESSAGE);
        //else if (Integer.parseInt(anteString))
            //JOptionPane.showMessageDialog(this, "The bring in is not a number", "Table Creation Failed", JOptionPane.ERROR_MESSAGE);
        
        if (tableNameString.equals("") || anteString.equals("") || bringInString.equals(""))
            JOptionPane.showMessageDialog(this, "Please fill in all fields", "Table Creation Failed", JOptionPane.ERROR_MESSAGE);
        else {
            String[] createNewTableFields = {tableNameString, anteString, bringInString};
            if(clientRequest.getCurrentTable() !=null){
                JOptionPane.showMessageDialog(this, "You're already part of a table", "Unjoin that one, then try again.", JOptionPane.ERROR_MESSAGE);
            }
            else if(clientRequest.checkTableName(tableNameString)){
                
                JOptionPane.showMessageDialog(this, "Already a table with that name", "Try again.", JOptionPane.ERROR_MESSAGE);
                
            }
            else{
            boolean accepted = clientRequest.createNewTable(createNewTableFields);
        
            if (accepted = false)
                JOptionPane.showMessageDialog(this, "The server hates you.", "Table Creation Failed", JOptionPane.ERROR_MESSAGE);

            else {
                JOptionPane.showMessageDialog(this, "New Table Made", "Success!", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                this.dispose();
            }    
            
            }
        }     
    }//GEN-LAST:event_createTableButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anteLabel;
    private javax.swing.JTextField anteTextField;
    private javax.swing.JLabel bringInLabel;
    private javax.swing.JTextField bringInTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton createTableButton;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel tableNameLabel;
    private javax.swing.JTextField tableNameTextField;
    // End of variables declaration//GEN-END:variables
}

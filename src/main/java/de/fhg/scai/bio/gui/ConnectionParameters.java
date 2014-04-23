/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.fhg.scai.bio.gui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vishal
 */
public class ConnectionParameters extends javax.swing.JFrame {
    
    private String DatabaseName;
    private String ConnectionURL;
    private String Username;
    private String Password;
    private String DriverClass;
    public List<String> PARAMETERS;
    
    public List<String> getParameters() {
        return getConnectionParameters();
    }

    /**
     *
     * @return
     */
    public List<String> getConnectionParameters() {
        this.DatabaseName = databaseName.getText().trim();
        this.ConnectionURL = connectionURL.getText().trim();
        this.Username = username.getText().trim();
        this.Password = String.valueOf(password.getPassword());
        this.DriverClass = driverClass.getSelectedItem().toString();
        
        List<String> params = new ArrayList<>();
        params.add(0, DatabaseName);
        params.add(1, ConnectionURL);
        params.add(2, Username);
        params.add(3, Password);
        params.add(4, DriverClass);
        
        return params;
    }

    /**
     * Creates new form Params
     */
    public ConnectionParameters() {
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

        parameterPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        databaseName = new javax.swing.JTextField();
        testConnection = new javax.swing.JButton();
        createConnection = new javax.swing.JButton();
        connectionURL = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        driverClass = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        parameterPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        jLabel1.setText("Database Name:");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        jLabel2.setText("Connection URL:");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        jLabel3.setText("Database Username:");

        jLabel4.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        jLabel4.setText("Database Password:");

        jLabel5.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        jLabel5.setText("Driver Class:");

        testConnection.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        testConnection.setIcon(new javax.swing.ImageIcon("/home/vsiramshetty/NetBeansProjects/VirtualSPARQLer/images/gears.png")); // NOI18N
        testConnection.setText("Test");
        testConnection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testConnectionActionPerformed(evt);
            }
        });

        createConnection.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        createConnection.setIcon(new javax.swing.ImageIcon("/home/vsiramshetty/NetBeansProjects/VirtualSPARQLer/images/plus_plus.png")); // NOI18N
        createConnection.setText("Create");
        createConnection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createConnection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createConnectionActionPerformed(evt);
            }
        });

        driverClass.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 12)); // NOI18N
        driverClass.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select a JDBC Driver's class", "com.mysql.jdbc.Driver", "org.postgresql.Driver" }));
        driverClass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout parameterPanelLayout = new javax.swing.GroupLayout(parameterPanel);
        parameterPanel.setLayout(parameterPanelLayout);
        parameterPanelLayout.setHorizontalGroup(
            parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parameterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(10, 10, 10)
                .addGroup(parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parameterPanelLayout.createSequentialGroup()
                        .addComponent(databaseName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(connectionURL)
                    .addComponent(username)
                    .addComponent(password)
                    .addComponent(driverClass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        parameterPanelLayout.setVerticalGroup(
            parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parameterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(databaseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testConnection)
                    .addComponent(createConnection, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(connectionURL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(parameterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(driverClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parameterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(parameterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createConnectionActionPerformed
        this.PARAMETERS = getConnectionParameters();
        VirtualSparqler.connectionParameters = getConnectionParameters();
        dispose();
    }//GEN-LAST:event_createConnectionActionPerformed

    private void testConnectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testConnectionActionPerformed
        VirtualSparqler.connectionParameters = getConnectionParameters();
        VirtualSparqler.testConnection(evt);
    }//GEN-LAST:event_testConnectionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectionParameters.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectionParameters().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField connectionURL;
    private javax.swing.JButton createConnection;
    private javax.swing.JTextField databaseName;
    private javax.swing.JComboBox driverClass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel parameterPanel;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton testConnection;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

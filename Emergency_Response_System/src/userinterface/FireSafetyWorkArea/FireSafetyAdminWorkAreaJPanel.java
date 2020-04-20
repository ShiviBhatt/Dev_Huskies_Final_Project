/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FireSafetyWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Utils.HeaderColors;
import Business.WorkQueue.EmergencyUnitRequest;
import Business.WorkQueue.ReportingAdminSceneRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhankuwarsisodiya
 */
public class FireSafetyAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Organization organization;
    Network network;
    UserAccount account;

    /**
     * Creates new form FireSafetyAdminWorkAreaJPanel
     */
    public FireSafetyAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        this.network = network;
        this.account = account;
        populateTable();
    }

    private void populateTable() {
        workRequestTable.getTableHeader().setDefaultRenderer(new HeaderColors());
        DefaultTableModel model = (DefaultTableModel) workRequestTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof EmergencyUnitRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = ((EmergencyUnitRequest) wr);
                row[1] = ((EmergencyUnitRequest) wr).getSender().getEmployee().getName();
                row[2] = ((EmergencyUnitRequest) wr).getSceneName();
                row[3] = ((EmergencyUnitRequest) wr).getNoOfVictims();
                row[4] = ((EmergencyUnitRequest) wr).getSceneLocationPoint();
                row[5] = ((EmergencyUnitRequest) wr).getMessage();
                row[6] = ((EmergencyUnitRequest) wr).getStatus();
                row[7] = ((EmergencyUnitRequest) wr).getSenderOrganization().getName();
                row[8] = ((EmergencyUnitRequest) wr).getSenderNetwork().getName();
                row[9] = ((EmergencyUnitRequest) wr).getRequestDate();
                model.addRow(row);
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestTable = new javax.swing.JTable();
        processReqBtn = new javax.swing.JButton();
        acceptBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        completeReqBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1338, 840));
        setPreferredSize(new java.awt.Dimension(1338, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Fire Safety Management Admin Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 20, -1, -1));

        workRequestTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        workRequestTable.setForeground(new java.awt.Color(25, 56, 82));
        workRequestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Scene Id", "Sender", "Scene Name", "Victims", "Location", "Message", "Status", "Sender Org", "Sender Network", "Requested Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        workRequestTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane2.setViewportView(workRequestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 170, 1290, 172));

        processReqBtn.setBackground(new java.awt.Color(255, 255, 255));
        processReqBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        processReqBtn.setForeground(new java.awt.Color(25, 56, 82));
        processReqBtn.setText("Process Request");
        processReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processReqBtnActionPerformed(evt);
            }
        });
        add(processReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 360, -1, -1));

        acceptBtn.setBackground(new java.awt.Color(255, 255, 255));
        acceptBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(25, 56, 82));
        acceptBtn.setText("Accept Request");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });
        add(acceptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 360, -1, -1));

        rejectBtn.setBackground(new java.awt.Color(255, 255, 255));
        rejectBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        rejectBtn.setForeground(new java.awt.Color(25, 56, 82));
        rejectBtn.setText("Reject Request");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });
        add(rejectBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 360, -1, -1));

        completeReqBtn.setBackground(new java.awt.Color(255, 255, 255));
        completeReqBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        completeReqBtn.setForeground(new java.awt.Color(25, 56, 82));
        completeReqBtn.setText("Complete Request");
        completeReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeReqBtnActionPerformed(evt);
            }
        });
        add(completeReqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 360, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/FireWorkAreaRequest128xx.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fireWorkRequest512xx.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processReqBtnActionPerformed
        // TODO add your handling code here:
        int count = workRequestTable.getSelectedRowCount();
        if (count != 1) {
            JOptionPane.showMessageDialog(null, "Select one row", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            int selectedRow = workRequestTable.getSelectedRow();
            EmergencyUnitRequest emerReq = (EmergencyUnitRequest) workRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else if(emerReq.getStatus().equals("Processing")){
                JOptionPane.showMessageDialog(null, "Request is already Processing");
            }else if(emerReq.getStatus().equals("Rejected")){
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Completed")){
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Request is not yet Accepted");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");                
                emerReq.setStatus("Processing");
                emerReq.setMessage(msg);
                populateTable();
            }            
        }
    }//GEN-LAST:event_processReqBtnActionPerformed

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        int count = workRequestTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = workRequestTable.getSelectedRow();
            EmergencyUnitRequest emerReq = (EmergencyUnitRequest) workRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted");
            }else if(emerReq.getStatus().equals("Processing")) {
                JOptionPane.showMessageDialog(null, "Request is already Processing");
            }else if(emerReq.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                emerReq.setStatus("Accepted");
                emerReq.setMessage(msg);
                populateTable();
            }
            //emerReq.setStatus("Accepted");
        }
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        int count = workRequestTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = workRequestTable.getSelectedRow();
            EmergencyUnitRequest emerReq = (EmergencyUnitRequest) workRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted");
            }else if(emerReq.getStatus().equals("Processing")) {
                JOptionPane.showMessageDialog(null, "Request is already Accepted and Processing");
            }else if(emerReq.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                emerReq.setStatus("Rejected");
                emerReq.setMessage(msg);
                populateTable();
            }
        }
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void completeReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeReqBtnActionPerformed
        int count = workRequestTable.getSelectedRowCount();
        if(count != 1) {
            JOptionPane.showMessageDialog(null, "Select a request");
        }else {
            int selectedRow = workRequestTable.getSelectedRow();
            EmergencyUnitRequest emerReq = (EmergencyUnitRequest) workRequestTable.getValueAt(selectedRow, 0);
            if(emerReq.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Request is already Rejected");
            }else if(emerReq.getStatus().equals("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request should be in processing state before marking complete");
            }else if(emerReq.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "Request is already Completed");
            }else if(emerReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "Request is already cancelled by sender");
            }else if(emerReq.getStatus().equals("Requested")) {
                JOptionPane.showMessageDialog(null, "Request is not yet Accepted");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                emerReq.setStatus("Completed");
                emerReq.setMessage(msg);
                populateTable();
            }
        }
    }//GEN-LAST:event_completeReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JButton completeReqBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processReqBtn;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JTable workRequestTable;
    // End of variables declaration//GEN-END:variables
}

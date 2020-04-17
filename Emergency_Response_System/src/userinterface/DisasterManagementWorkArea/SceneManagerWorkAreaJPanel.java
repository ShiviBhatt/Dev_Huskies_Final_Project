/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DisasterManagementWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VoluntaryOperatingUnit;
import Business.Network.Network;
import Business.Organization.DisasterOrganization;
import Business.Organization.IncidentManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Utils.Validation;
import Business.WorkQueue.BroadcastAlertRequest;
import Business.WorkQueue.EmergencyUnitRequest;
import Business.WorkQueue.ReportingAdminSceneRequest;
import Business.WorkQueue.UserRegistrationRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import userinterface.GoogleMAP.NearestOrganizationJPanel;
import userinterface.UserRegistration.UserRegistrationJPanel;

/**
 *
 * @author dhankuwarsisodiya
 */
public class SceneManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SceneManagerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    Network network;
    EcoSystem business;
    Organization organization;
    ReportingAdminSceneRequest selectedWorkReq;
    
    public SceneManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.enterprise = enterprise;
        this.network = network;
        this.organization = organization;
        selectedWorkReq = null;
        populateSceneTable();
        populateStatusTable();
    }

    private void populateStatusTable() {
        
        /*int selectedRow = sceneTable.getSelectedRow();
        ReportingAdminSceneRequest ss = (ReportingAdminSceneRequest) sceneTable.getValueAt(selectedRow, 0);*/
        
        DefaultTableModel model = (DefaultTableModel) statusTable.getModel();
        model.setRowCount(0);
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {            
            if(wr instanceof EmergencyUnitRequest && null != selectedWorkReq) {//selectedWorkReq.getSceneId().equals(((EmergencyUnitRequest) wr).getSceneId())) {
                
                if(selectedWorkReq.getSceneId().equals(((EmergencyUnitRequest) wr).getSceneId())) {
                    Object[] row = new Object[model.getColumnCount()];                
                    row[0] = ((EmergencyUnitRequest) wr);
                    row[1] = ((EmergencyUnitRequest) wr).getStatus();
                    row[2] = ((EmergencyUnitRequest) wr).getRecieverOrganization().getName();
                    row[3] = ((EmergencyUnitRequest) wr).getRequestDate();
                    row[4] = ((EmergencyUnitRequest) wr).getSender().getEmployee().getName();
                    row[5] = ((EmergencyUnitRequest) wr).getMessage();
                    row[6] = ((EmergencyUnitRequest) wr).getSceneId();
                    row[7] = ((EmergencyUnitRequest) wr).getRecieverNetwork().getName();
                    model.addRow(row);
                }
            }            
        }
        /*commented by mayank for (Network network : business.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if ((!(o instanceof DisasterOrganization)) && (!(o instanceof IncidentManagementOrganization))) {
                        for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                            if(((EmergencyUnitRequest) wr).getSceneManager() != null && ((EmergencyUnitRequest) wr).getSceneManager().equals(account.getEmployee())){
                                Object[] row = new Object[7];
                                row[0] = o.getName();
                                row[1] = ((EmergencyUnitRequest) wr).getStatus();
                                row[2] = o.getName();
                                row[3] = wr.getRequestDate();
                                row[4] = ((EmergencyUnitRequest) wr).getSender();
                                row[5] = ((EmergencyUnitRequest) wr).getMessage();
                                row[6] = ((EmergencyUnitRequest) wr).getSceneId();
                                model.addRow(row);
                            }
                        }
                    }
                }
            }
        }*/
    }

    private void populateSceneTable() {
        DefaultTableModel model = (DefaultTableModel) sceneTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof ReportingAdminSceneRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = ((ReportingAdminSceneRequest) wr);
                row[1] = ((ReportingAdminSceneRequest) wr).getSceneName();
                row[2] = ((ReportingAdminSceneRequest) wr).getNoOfVictims();
                row[3] = ((ReportingAdminSceneRequest) wr).getSceneZipcode();
                row[4] = ((ReportingAdminSceneRequest) wr).getSender();
                row[5] = ((ReportingAdminSceneRequest) wr).getStatus();
                row[6] = ((ReportingAdminSceneRequest) wr).getRequestDate();
                row[7] = ((ReportingAdminSceneRequest) wr).getMessage();
                model.addRow(row);
            }
        }
        
        /* commented by mayank for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof DisasterOrganization) {
                    for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                        if (wr instanceof ReportingAdminSceneRequest ){//&& ((ReportingAdminSceneRequest) wr).getSceneManager().equals(account.getEmployee())) {
=======
//        for(WorkRequest wr: account.getWorkQueue().getWorkRequestList()){
//            Object[] row = new Object[5];
//                            row[0] = ((ReportingAdminSceneRequest) wr).getSceneId();
//                            row[1] = ((ReportingAdminSceneRequest) wr).getSceneName();
//                            row[2] = ((ReportingAdminSceneRequest) wr).getNoOfVictims();
//                            row[3] = ((ReportingAdminSceneRequest) wr).getSceneZipcode();
//                            row[4] = ((ReportingAdminSceneRequest) wr).getSender();
//
//                            model.addRow(row);
//        }
//        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
//            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
//                
//                if (o instanceof DisasterOrganization) {
                    for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()) {
                        if (wr instanceof ReportingAdminSceneRequest &&((ReportingAdminSceneRequest) wr).getSceneManager() != null && ((ReportingAdminSceneRequest) wr).getSceneManager().equals(account.getEmployee())) {
                            Object[] row = new Object[5];
                            row[0] = ((ReportingAdminSceneRequest) wr).getSceneId();
                            row[1] = ((ReportingAdminSceneRequest) wr).getSceneName();
                            row[2] = ((ReportingAdminSceneRequest) wr).getNoOfVictims();
                            row[3] = ((ReportingAdminSceneRequest) wr).getSceneZipcode();
                            row[4] = ((ReportingAdminSceneRequest) wr).getSender();

                            model.addRow(row);
                        }
                    }
                }
            }

        }*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sceneTable = new javax.swing.JTable();
        nearestOrgSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        processBtn = new javax.swing.JButton();
        cancelReqBtn = new javax.swing.JButton();

        sceneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Scene Id", "Scene Name", "Victims", "ZipCode", "Sender", "Status", "Created Date", "Additional Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sceneTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sceneTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sceneTable);

        nearestOrgSearch.setText("Search for nearest Organization");
        nearestOrgSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nearestOrgSearchActionPerformed(evt);
            }
        });

        statusTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emergency Request Id", "Status", "Reciever Organization", "Request Date", "Sender", "Message", "Scene Id", "Reciever Network"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(statusTable);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Mark Resolved");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Broadcast Alerts");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        processBtn.setText("Process");
        processBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBtnActionPerformed(evt);
            }
        });

        cancelReqBtn.setText("Cancel Request");
        cancelReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(cancelReqBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nearestOrgSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(processBtn)))
                        .addGap(0, 297, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nearestOrgSearch)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(processBtn))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(cancelReqBtn))
                .addContainerGap(145, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nearestOrgSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nearestOrgSearchActionPerformed
        // TODO add your handling code here:
        int selectedRow = sceneTable.getSelectedRow();        
        ReportingAdminSceneRequest selectedScene = null;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to view nearest organizations", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            selectedScene = (ReportingAdminSceneRequest) sceneTable.getValueAt(selectedRow, 0);
            /*for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof DisasterOrganization) {
                        for (WorkRequest wr : o.getWorkQueue().getWorkRequestList()) {
                            if (wr instanceof ReportingAdminSceneRequest && ((ReportingAdminSceneRequest) wr).getSceneManager().equals(account.getEmployee()) && ((ReportingAdminSceneRequest) wr).getSceneId() != null && ((ReportingAdminSceneRequest) wr).getSceneId().equals(id)) {
                                selectedScene = wr;
                            }
                        }
                    }
                }
            }*/
            /*if(selectedScene.getStatus().equals("Resolved")) {
                JOptionPane.showMessageDialog(null, "Scene is already Resolved");
            }else {*/
                NearestOrganizationJPanel ramop = new NearestOrganizationJPanel(userProcessContainer, account, organization, selectedScene, enterprise, network, business);
                userProcessContainer.add("Nearest_Distance_Panel", ramop);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            //}
        }
    }//GEN-LAST:event_nearestOrgSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateSceneTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateStatusTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = sceneTable.getSelectedRow();        
        ReportingAdminSceneRequest selectedScene = null;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Scene", "Warning", JOptionPane.WARNING_MESSAGE);
        }else {
            boolean isReqCompleted = true;
            for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {            
                if(wr instanceof EmergencyUnitRequest && null != selectedWorkReq) {
                    if(selectedWorkReq.getSceneId().equals(((EmergencyUnitRequest) wr).getSceneId())) {
                        if(!((EmergencyUnitRequest)wr).getStatus().equals("Completed") && !((EmergencyUnitRequest)wr).getStatus().equals("Cancelled") && !((EmergencyUnitRequest)wr).getStatus().equals("Rejected")) {
                            isReqCompleted = false;
                            break;
                        }
                    }
                }            
            }
            
            if(isReqCompleted) {
                ReportingAdminSceneRequest sScene = (ReportingAdminSceneRequest) sceneTable.getValueAt(selectedRow, 0);
                if(sScene.getStatus().equals("Resolved")) {
                    JOptionPane.showMessageDialog(null, "Scene is already Resolved");
                }else {
                    String msg = JOptionPane.showInputDialog("Additional Message");                    
                    sScene.setStatus("Resolved");
                    sScene.setMessage(msg);
                }
                
            }else {
                JOptionPane.showMessageDialog(null, "There are pending emergency requests for this scene. Please wait for them to be completed before marking resolved.");
            }
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sceneTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sceneTableMouseClicked
        int selectedReq = sceneTable.getSelectedRow();
        selectedWorkReq = (ReportingAdminSceneRequest)sceneTable.getValueAt(selectedReq, 0);
        populateStatusTable();
    }//GEN-LAST:event_sceneTableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //String text = "one two three four five six seven eight nine ten ";
        String emailIds = "";
        String contacts = "";
        JTextArea textArea = new JTextArea();
        textArea.setColumns(30);
        textArea.setRows(5);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setSize(textArea.getPreferredSize().width, 1);
        int result = JOptionPane.showConfirmDialog(null, new JScrollPane(textArea), "Enter Alert to be broadcasted!", JOptionPane.OK_CANCEL_OPTION);
        
        if (result == JOptionPane.OK_OPTION) {
            BroadcastAlertRequest alertRequest = new BroadcastAlertRequest();
            alertRequest.setAlertMessage(textArea.getText());
            alertRequest.setSender(account);
            alertRequest.setRequestDate(new Date());
            alertRequest.setInNetwork(network);
            
            for(Network n : business.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    System.out.println("1===--->> " + e.getName());
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        o.getWorkQueue().getWorkRequestList().add(alertRequest);
                    }
                    if(e instanceof VoluntaryOperatingUnit) {
                        System.out.println("2===--->> " + e.getName());
                        for(WorkRequest wr : e.getWorkQueue().getWorkRequestList()) {
                            System.out.println("3===--->> " + e.getName());
                            if(wr instanceof UserRegistrationRequest) {
                                System.out.println("4===--->> " + e.getName());
                                //((UserRegistrationRequest) wr).setContactCarrierName("8574247014@txt.att.net");
                                emailIds += ((UserRegistrationRequest) wr).getUserEmailId() + ",";
                                contacts += ((UserRegistrationRequest) wr).getContactCarrierName() + ",";
                            }
                        }
                    }
                }
            }
            
            String broadcastMsg = new Date() + "; Broadcasted by: " + account.getEmployee().getName() + "(Scene Manager)\n";
            broadcastMsg += "Alert Message: " + textArea.getText();
            
            Validation.sendEmailMessage(emailIds.substring(0, emailIds.length()-1), "Alert Message", broadcastMsg);
            Validation.sendTextMessage(contacts.substring(0, contacts.length()-1), "Alert Message", broadcastMsg);
            JOptionPane.showMessageDialog(null, "Alert has been broadcasted successfully");
        } else {
            System.out.println("Canceled");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void processBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBtnActionPerformed
        int selectedRow = sceneTable.getSelectedRow();        
        ReportingAdminSceneRequest selectedScene = null;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the scene", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            selectedScene = (ReportingAdminSceneRequest) sceneTable.getValueAt(selectedRow, 0);
            if(selectedScene.getStatus().equals("Processing")) {
                JOptionPane.showMessageDialog(null, "Scene is already in Processing state");
            }else if(selectedScene.getStatus().equals("Resolved")) {
                JOptionPane.showMessageDialog(null, "Scene is already Resolved");
            }else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                selectedScene.setStatus("Processing");
                selectedScene.setMessage(msg);
                populateSceneTable();
            }
            
        }
    }//GEN-LAST:event_processBtnActionPerformed

    private void cancelReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReqBtnActionPerformed
        int selectedRow = statusTable.getSelectedRow();        
        EmergencyUnitRequest selectedReq = null;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            selectedReq = (EmergencyUnitRequest) statusTable.getValueAt(selectedRow, 0);
            if(selectedReq.getStatus().equals("Processing") || selectedReq.getStatus().equals("Completed")) {
                JOptionPane.showMessageDialog(null, "This request canot be cancelled");
            }else if(selectedReq.getStatus().equals("Cancelled")) {
                JOptionPane.showMessageDialog(null, "This request is already cancelled");
            } else {
                String msg = JOptionPane.showInputDialog("Additional Message");
                selectedReq.setStatus("Cancelled");
                selectedReq.setMessage(msg);
                populateStatusTable();
            }            
        }
    }//GEN-LAST:event_cancelReqBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelReqBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nearestOrgSearch;
    private javax.swing.JButton processBtn;
    private javax.swing.JTable sceneTable;
    private javax.swing.JTable statusTable;
    // End of variables declaration//GEN-END:variables
}

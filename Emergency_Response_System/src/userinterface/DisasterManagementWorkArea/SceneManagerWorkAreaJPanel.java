/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DisasterManagementWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DisasterOrganization;
import Business.Organization.IncidentManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyUnitRequest;
import Business.WorkQueue.ReportingAdminSceneRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.GoogleMAP.NearestOrganizationJPanel;

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

    public SceneManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.business = business;
        this.enterprise = enterprise;
        this.network = network;
        this.organization = organization;

        populateSceneTable();
        populateStatusTable();
    }

    private void populateStatusTable() {
        DefaultTableModel model = (DefaultTableModel) statusTable.getModel();
        model.setRowCount(0);
        /*for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[7];
            row[0] = organization.getName();
            row[1] = ((ReportingAdminSceneRequest) wr).getStatus();
            row[2] = organization.getName();
            row[3] = wr.getRequestDate();
            row[4] = ((ReportingAdminSceneRequest) wr).getSender();
            row[5] = ((ReportingAdminSceneRequest) wr).getMessage();
            row[6] = ((ReportingAdminSceneRequest) wr).getSceneId();
            model.addRow(row);
        }*/
        for (Network network : business.getNetworkList()) {
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
        }
    }

    private void populateSceneTable() {
        DefaultTableModel model = (DefaultTableModel) sceneTable.getModel();
        model.setRowCount(0);
        
        for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) {
            if(wr instanceof ReportingAdminSceneRequest) {
                Object[] row = new Object[5];
                row[0] = ((ReportingAdminSceneRequest) wr);
                row[1] = ((ReportingAdminSceneRequest) wr).getSceneName();
                row[2] = ((ReportingAdminSceneRequest) wr).getNoOfVictims();
                row[3] = ((ReportingAdminSceneRequest) wr).getSceneZipcode();
                row[4] = ((ReportingAdminSceneRequest) wr).getSender();

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

        sceneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Scene Id", "Scene Name", "Victims", "ZipCode", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Organization", "Status", "Reciever", "Request Date", "Sender", "Message", "Scene Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nearestOrgSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nearestOrgSearch)
                    .addComponent(jButton1))
                .addGap(112, 112, 112)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(156, Short.MAX_VALUE))
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
            NearestOrganizationJPanel ramop = new NearestOrganizationJPanel(userProcessContainer, account, organization, selectedScene, enterprise, network, business);
            userProcessContainer.add("Nearest_Distance_Panel", ramop);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nearestOrgSearch;
    private javax.swing.JTable sceneTable;
    private javax.swing.JTable statusTable;
    // End of variables declaration//GEN-END:variables
}

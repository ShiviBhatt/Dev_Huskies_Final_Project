/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VoluntaryUnitWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Location.LocationPoint;
import Business.Network.Network;
import Business.Organization.VolunteerHospitalOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.VolunteerCompanyOrganization;
import Business.Organization.VolunteerNGOOrganization;
import Business.Organization.VolunteerPersonalOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.GoogleMAP.OrganizationLocationJPanel;

/**
 *
 * @author shivibhatt
 */
public class VoluntaryOperatingUnitManageOrganizationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VoluntaryOperatingUnitOrganizationJPanel
     */
    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private Network network;
    private EcoSystem system;
    private LocationPoint location;
    private int index = -1;

    public VoluntaryOperatingUnitManageOrganizationsJPanel(JPanel userProcessContainer, OrganizationDirectory directory, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;

        populateTable();
        populateOrganizationTypeComboBox();

    }

    private void populateOrganizationTypeComboBox() {
        OrganizationTypeComboBox.removeAllItems();
        OrganizationTypeComboBox.addItem(Organization.Type.Personal);
        OrganizationTypeComboBox.addItem(Organization.Type.Company);
        OrganizationTypeComboBox.addItem(Organization.Type.NGO);
        OrganizationTypeComboBox.addItem(Organization.Type.Hospital);

    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblVoluntaryOrg.getModel();
        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof VolunteerHospitalOrganization) {
                VolunteerHospitalOrganization orgHospital = (VolunteerHospitalOrganization) organization;
               
              
                System.out.println("Organization 2  = " + enterprise.getOrganizationDirectory());
                Object[] row = new Object[model.getColumnCount()];
                enterprise.setType(Organization.Type.Hospital);
                  System.out.println("Organization 2  = " + enterprise.getType().getValue());
                row[0] = enterprise.getType().getValue();
                row[1] = orgHospital.getHospital();
                row[2] = orgHospital.getLocationPoint();
                model.addRow(row);
            } else if (organization instanceof VolunteerPersonalOrganization) {
                VolunteerPersonalOrganization orgPersonal = (VolunteerPersonalOrganization) organization;
                Object[] row = new Object[model.getColumnCount()];
                enterprise.setType(Organization.Type.Personal);
                row[0] = enterprise.getType().getValue();
                row[1] = orgPersonal.getVolunteerPersonal();
                row[2] = orgPersonal.getLocationPoint();
                model.addRow(row);
            } else if (organization instanceof VolunteerNGOOrganization) {
                VolunteerNGOOrganization orgNGO = (VolunteerNGOOrganization) organization;
                Object[] row = new Object[model.getColumnCount()];
                enterprise.setType(Organization.Type.NGO);
                row[0] = enterprise.getType().getValue();
                row[1] = orgNGO.getVolunteerNGO();
                row[2] = orgNGO.getLocationPoint();
                model.addRow(row);
            } else if (organization instanceof VolunteerCompanyOrganization) {
                VolunteerCompanyOrganization orgCompany = (VolunteerCompanyOrganization) organization;
                Object[] row = new Object[model.getColumnCount()];
                enterprise.setType(Organization.Type.Company);
                row[0] = enterprise.getType().getValue();
                row[1] = orgCompany.getVolunteerCompany();
                row[2] = orgCompany.getLocationPoint();
                model.addRow(row);
            }

        }

    }

    public void populateLongituteLatitude(LocationPoint locationPoint) {
        this.location = locationPoint;
        setLongituteLatitude.setText(location.getLatitude() + "," + location.getLongitude());
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
        tblVoluntaryOrg = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OrganizationTypeComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        organizationName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        setLongituteLatitude = new javax.swing.JTextField();
        locationBtn = new javax.swing.JButton();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        tblVoluntaryOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Type", "Organization Name", "Organization Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVoluntaryOrg);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD VOLUNTARY ORGANIZATION");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("Organization Type ");

        OrganizationTypeComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("Organization Name");

        organizationName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Set Location");

        setLongituteLatitude.setEditable(false);
        setLongituteLatitude.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        locationBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        locationBtn.setText("Set Location");
        locationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationBtnActionPerformed(evt);
            }
        });

        addJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        addJButton.setText("ADD Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        backJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1162, Short.MAX_VALUE)
                                    .addComponent(backJButton))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addJButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel3)
                                .addGap(38, 38, 38)
                                .addComponent(organizationName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(38, 38, 38)
                                .addComponent(OrganizationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(38, 38, 38)
                        .addComponent(setLongituteLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(locationBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(organizationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(OrganizationTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(setLongituteLatitude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(locationBtn)))
                .addGap(29, 29, 29)
                .addComponent(addJButton)
                .addContainerGap(359, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void locationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationBtnActionPerformed
        // TODO add your handling code here:
        OrganizationLocationJPanel oLJP = new OrganizationLocationJPanel(userProcessContainer);
        userProcessContainer.add("Organization_Postion_Panel", oLJP);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_locationBtnActionPerformed

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        
        Organization.Type type = (Organization.Type) OrganizationTypeComboBox.getSelectedItem();
        
        if("".equals(organizationName.getText())) {
            JOptionPane.showMessageDialog(null, "Enter organization name!"); 
        }else if("".equals(setLongituteLatitude.getText())) {
            JOptionPane.showMessageDialog(null, "Please set a location"); 
        }else {
            directory.createOrganization(type, organizationName.getText(), location);
            populateTable();
            organizationName.setText("");
            setLongituteLatitude.setText("");
            JOptionPane.showMessageDialog(null, "Organization created successfully"); 
        }

    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox OrganizationTypeComboBox;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton locationBtn;
    private javax.swing.JTextField organizationName;
    private javax.swing.JTextField setLongituteLatitude;
    private javax.swing.JTable tblVoluntaryOrg;
    // End of variables declaration//GEN-END:variables
}

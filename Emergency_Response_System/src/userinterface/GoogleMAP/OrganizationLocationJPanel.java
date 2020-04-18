/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GoogleMAP;

import Business.Location.LocationPoint;
import com.teamdev.jxbrowser.browser.Browser;
import com.teamdev.jxbrowser.engine.Engine;
import com.teamdev.jxbrowser.engine.EngineOptions;
import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;
import com.teamdev.jxbrowser.view.swing.BrowserView;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import userinterface.EmergencyUnitWorkArea.EmergencyManageOrganizationJPanel;
import userinterface.IncidentUnitWorkArea.IncidentManagerManageOrganizationJPanel;
import userinterface.ReportingAdminWorkArea.ReportingAdminManageSceneJPanel;
import userinterface.UserRegistration.UserRegistrationJPanel;
import userinterface.VoluntaryUnitCompanySupervisor.ManageSceneJPanel;
import userinterface.VoluntaryUnitHospital.ManageHospitalSceneJPanel;
import userinterface.VoluntaryUnitWorkArea.VoluntaryOperatingUnitManageOrganizationsJPanel;
import userinterface.voluntaryUnitPersonal.ManageIndividualSceneJPanel;

/**
 *
 * @author shivibhatt
 */
public class OrganizationLocationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganizationLocationJPanel
     */
    
    JPanel userProcessContainer;
    LocationPoint locationPoint;
    Browser browser;
    
    public OrganizationLocationJPanel(JPanel userProcessContainer) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        locationPoint = new LocationPoint();
        
        EngineOptions options =
                EngineOptions.newBuilder(HARDWARE_ACCELERATED).licenseKey("1BNDHFSC1FV3AVC573VVDZLJMH4GM0F2LEEC89Z3D9HIMNGKQZEH4PIJYFW22I0A9NMRRK").build();
        Engine engine = Engine.newInstance(options);
        browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl("https://www.google.com/maps");
        
        mapCanvas.add(view, "a");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        setLocationBtn = new javax.swing.JButton();
        mapCanvas = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        setLocationBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        setLocationBtn.setText("Set Location");
        setLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setLocationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(358, 358, 358)
                .addComponent(setLocationBtn)
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(setLocationBtn)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        mapCanvas.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(mapCanvas);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void setLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setLocationBtnActionPerformed
        // TODO add your handling code here:
        try {

            if (browser.url()!= null) {

                System.out.println(browser.url());
                String[] a = browser.url().split("!3d", 0);
                String[] b = a[1].split("!4d");
                System.out.println("Lat" + b[0] + "  " + "Lon" + b[1]);
                double lat = Double.parseDouble(b[0]);
                double lon = Double.parseDouble(b[1]);
                locationPoint.setLatitude(lat);
                locationPoint.setLongitude(lon);
            }
            System.out.println("Lat" + locationPoint.getLatitude() + locationPoint.getLongitude());

            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            if (userProcessContainer.getComponent(componentArray.length - 1) instanceof EmergencyManageOrganizationJPanel) {
                EmergencyManageOrganizationJPanel orgManagement = (EmergencyManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                orgManagement.populateLongituteLatitude(locationPoint);
            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof IncidentManagerManageOrganizationJPanel) {
                IncidentManagerManageOrganizationJPanel orgManagement = (IncidentManagerManageOrganizationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                orgManagement.populateLongituteLatitude(locationPoint);
            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof VoluntaryOperatingUnitManageOrganizationsJPanel) {
                VoluntaryOperatingUnitManageOrganizationsJPanel orgManagement = (VoluntaryOperatingUnitManageOrganizationsJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                orgManagement.populateLongituteLatitude(locationPoint);
            }else if (userProcessContainer.getComponent(componentArray.length - 1) instanceof UserRegistrationJPanel) {
                UserRegistrationJPanel orgManagement = (UserRegistrationJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                orgManagement.populateLongituteLatitude(locationPoint);
            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof ReportingAdminManageSceneJPanel){
                ReportingAdminManageSceneJPanel reportingComponent = (ReportingAdminManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                reportingComponent.populateLongituteLatitude(locationPoint);
            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof ManageIndividualSceneJPanel){
                ManageIndividualSceneJPanel reportingComponent = (ManageIndividualSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                reportingComponent.populateLongituteLatitude(locationPoint);
            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof ManageHospitalSceneJPanel){
                ManageHospitalSceneJPanel reportingComponent = (ManageHospitalSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                reportingComponent.populateLongituteLatitude(locationPoint);
            }else if(userProcessContainer.getComponent(componentArray.length - 1) instanceof ManageSceneJPanel){
                ManageSceneJPanel reportingComponent = (ManageSceneJPanel) userProcessContainer.getComponent(componentArray.length - 1);
                reportingComponent.populateLongituteLatitude(locationPoint);
            }
          

            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Set Position first");
        }
    }//GEN-LAST:event_setLocationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mapCanvas;
    private javax.swing.JButton setLocationBtn;
    // End of variables declaration//GEN-END:variables
}

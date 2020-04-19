/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UserRegistration;

import java.awt.Color;
import javax.swing.BorderFactory;
import userinterface.GoogleMAP.OrganizationLocationJPanel;

/**
 *
 * @author shivibhatt
 */
public class RegisterUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterUserJPanel
     */
    public RegisterUserJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        uPass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        uEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        uCity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        uContact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        uLocation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        stateCombo = new javax.swing.JComboBox();
        orgCombo = new javax.swing.JComboBox();
        btnRegister = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        contactCarrier = new javax.swing.JComboBox<>();
        usernameExistsMessage = new javax.swing.JLabel();
        emailValidateMessage = new javax.swing.JLabel();
        contactFormatMessage = new javax.swing.JLabel();
        emailSuccessLabel = new javax.swing.JLabel();
        userNameSuccessLabel = new javax.swing.JLabel();
        contactSuccessLabel = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("User Registration");

        jLabel2.setText("Name");

        userName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameActionPerformed(evt);
            }
        });
        userName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                userNameKeyPressed(evt);
            }
        });

        jLabel3.setText("Username");

        uName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uNameKeyTyped(evt);
            }
        });

        uPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uPassKeyTyped(evt);
            }
        });

        jLabel4.setText("Password");

        jLabel5.setText("Email Id");

        uEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uEmailKeyTyped(evt);
            }
        });

        jLabel6.setText("State");

        uCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uCityKeyTyped(evt);
            }
        });

        jLabel7.setText("City");

        jLabel8.setText("Organization");

        jLabel9.setText("Contact");

        uContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uContactKeyTyped(evt);
            }
        });

        jLabel10.setText("Location");

        uLocation.setEditable(false);
        uLocation.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                uLocationInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        uLocation.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                uLocationPropertyChange(evt);
            }
        });
        uLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uLocationKeyTyped(evt);
            }
        });

        jButton1.setText("Set Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        stateCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                stateComboItemStateChanged(evt);
            }
        });
        stateCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboActionPerformed(evt);
            }
        });

        orgCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                orgComboKeyTyped(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel11.setText("Contact");

        contactCarrier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        contactCarrier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contactCarrierKeyTyped(evt);
            }
        });

        usernameExistsMessage.setForeground(new java.awt.Color(255, 0, 0));
        usernameExistsMessage.setText("Username already exists");

        emailValidateMessage.setForeground(new java.awt.Color(255, 0, 0));
        emailValidateMessage.setText("Email format incorrect");

        contactFormatMessage.setForeground(new java.awt.Color(255, 0, 0));
        contactFormatMessage.setText("Contact No format Incorrect");

        emailSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick1.4.gif"))); // NOI18N

        userNameSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick1.4.gif"))); // NOI18N

        contactSuccessLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/tick1.4.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel2)
                .addGap(63, 63, 63)
                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(userNameSuccessLabel)
                .addGap(6, 6, 6)
                .addComponent(usernameExistsMessage))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(uPass, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel5)
                .addGap(49, 49, 49)
                .addComponent(uEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(emailSuccessLabel)
                .addGap(4, 4, 4)
                .addComponent(emailValidateMessage))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel6)
                .addGap(68, 68, 68)
                .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel7)
                .addGap(74, 74, 74)
                .addComponent(uCity, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel11)
                .addGap(50, 50, 50)
                .addComponent(contactCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel9)
                .addGap(50, 50, 50)
                .addComponent(uContact, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(contactSuccessLabel)
                .addGap(6, 6, 6)
                .addComponent(contactFormatMessage))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(uLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(btnRegister))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(userNameSuccessLabel))
                    .addComponent(usernameExistsMessage))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4))
                    .addComponent(uPass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(uEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailSuccessLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(emailValidateMessage)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6))
                    .addComponent(stateCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7))
                    .addComponent(uCity, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(contactCarrier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9))
                    .addComponent(uContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactSuccessLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(contactFormatMessage)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(uLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addGap(51, 51, 51)
                .addComponent(btnRegister))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_userNameActionPerformed

    private void userNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyTyped
        // TODO add your handling code here:
        userName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        userName.setForeground(Color.BLACK);
    }//GEN-LAST:event_userNameKeyTyped

    private void userNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_userNameKeyPressed

    private void uNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uNameKeyTyped
        // TODO add your handling code here:
//        uName.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        uName.setForeground(Color.BLACK);
//        if(!system.checkIfUserIsUnique(uName.getText())){
//            usernameExistsMessage.setVisible(true);
//        } else{
//            usernameExistsMessage.setVisible(false);
//            userNameSuccessLabel.setVisible(true);
//            int delay = 2500; //milliseconds
//            ActionListener taskPerformer = new ActionListener() {
//                public void actionPerformed(ActionEvent evt) {
//                    userNameSuccessLabel.setVisible(false);
//                }
//            };
//            javax.swing.Timer tick=new javax.swing.Timer(delay,taskPerformer);
//            tick.setRepeats(false);
//            tick.start();
//        }
    }//GEN-LAST:event_uNameKeyTyped

    private void uPassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uPassKeyTyped
        // TODO add your handling code here:
        uPass.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        uPass.setForeground(Color.BLACK);
    }//GEN-LAST:event_uPassKeyTyped

    private void uEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uEmailKeyTyped
        // TODO add your handling code here:
//        uEmail.setBorder(BorderFactory.createLineBorder(Color.BLACK));
//        uEmail.setForeground(Color.BLACK);
//        if(!validation.emailValidator(uEmail.getText())){
//            emailValidateMessage.setVisible(true);
//        } else{
//            emailValidateMessage.setVisible(false);
//            emailSuccessLabel.setVisible(true);
//            int delay = 2500; //milliseconds
//            ActionListener taskPerformer = new ActionListener() {
//                public void actionPerformed(ActionEvent evt) {
//                    emailSuccessLabel.setVisible(false);
//                }
//            };
//            javax.swing.Timer tick=new javax.swing.Timer(delay,taskPerformer);
//            tick.setRepeats(false);
//            tick.start();
//        }
    }//GEN-LAST:event_uEmailKeyTyped

    private void uCityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uCityKeyTyped
        // TODO add your handling code here:
        uCity.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        uCity.setForeground(Color.BLACK);
    }//GEN-LAST:event_uCityKeyTyped

    private void uContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uContactKeyTyped
        // TODO add your handling code here:
//        if(!validation.phoneNumberValidator(uContact.getText())){
//            contactFormatMessage.setVisible(true);
//        } else{
//            contactFormatMessage.setVisible(false);
//            contactSuccessLabel.setVisible(true);
//            int delay = 2500; //milliseconds
//            ActionListener taskPerformer = new ActionListener() {
//                public void actionPerformed(ActionEvent evt) {
//                    contactSuccessLabel.setVisible(false);
//                }
//            };
//            javax.swing.Timer tick=new javax.swing.Timer(delay,taskPerformer);
//            tick.setRepeats(false);
//            tick.start();
//        }
    }//GEN-LAST:event_uContactKeyTyped

    private void uLocationInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_uLocationInputMethodTextChanged
        // TODO add your handling code here:
        uLocation.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        uLocation.setForeground(Color.BLACK);
    }//GEN-LAST:event_uLocationInputMethodTextChanged

    private void uLocationPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_uLocationPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_uLocationPropertyChange

    private void uLocationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uLocationKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_uLocationKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        OrganizationLocationJPanel oLJP = new OrganizationLocationJPanel(userProcessContainer);
//        userProcessContainer.add("Organization_Postion_Panel", oLJP);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void stateComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stateComboItemStateChanged
        // TODO add your handling code here:
        stateCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        stateCombo.setForeground(Color.BLACK);
    }//GEN-LAST:event_stateComboItemStateChanged

    private void stateComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboActionPerformed
//        Network n = (Network) stateCombo.getSelectedItem();
//        for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
//            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
//                if (o instanceof VolunteerCompanyOrganization) {
//                    orgCombo.addItem(Organization.Type.Company);
//                } else if (o instanceof VolunteerNGOOrganization) {
//                    orgCombo.addItem(Organization.Type.NGO);
//                } else if (o instanceof VolunteerPersonalOrganization) {
//                    orgCombo.addItem(Organization.Type.Personal);
//                } else if (o instanceof VolunteerHospitalOrganization) {
//                    orgCombo.addItem(Organization.Type.Hospital);
//                }
//            }
//        }
    }//GEN-LAST:event_stateComboActionPerformed

    private void orgComboKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orgComboKeyTyped
        // TODO add your handling code here:
        orgCombo.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        orgCombo.setForeground(Color.BLACK);
    }//GEN-LAST:event_orgComboKeyTyped

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
//        Network network = (Network) stateCombo.getSelectedItem();
//        Organization.Type type = (Organization.Type) orgCombo.getSelectedItem();
//
//        if(network == null ){
//            stateCombo.setBorder(BorderFactory.createLineBorder(Color.RED));
//            stateCombo.setForeground(Color.red);
//
//        }if(uName.getText().isEmpty() ){
//            uName.setBorder(BorderFactory.createLineBorder(Color.RED));
//            uName.setForeground(Color.red);
//
//        }if(userName.getText().isEmpty() ){
//            userName.setBorder(BorderFactory.createLineBorder(Color.RED));
//            userName.setForeground(Color.red);
//
//        }if(uPass.getText().isEmpty() ){
//            uPass.setBorder(BorderFactory.createLineBorder(Color.RED));
//            uPass.setForeground(Color.red);
//
//        }if(uEmail.getText().isEmpty() ){
//            uEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
//            uEmail.setForeground(Color.red);
//
//        }if(uCity.getText().isEmpty() ){
//            uCity.setBorder(BorderFactory.createLineBorder(Color.RED));
//            uCity.setForeground(Color.red);
//
//        }if(type == null ){
//            orgCombo.setBorder(BorderFactory.createLineBorder(Color.RED));
//            orgCombo.setForeground(Color.red);
//
//        }if(uContact.getText().isEmpty() ){
//            uContact.setBorder(BorderFactory.createLineBorder(Color.RED));
//            uContact.setForeground(Color.red);
//
//        }if(locationPoint == null){
//            uLocation.setBorder(BorderFactory.createLineBorder(Color.RED));
//            uLocation.setForeground(Color.red);
//
//        }
//        if(userName.getText().isEmpty()
//            || uPass.getText().isEmpty()
//            || uEmail.getText().isEmpty()
//            || uCity.getText().isEmpty()
//            || type == null
//            || uContact.getText().isEmpty()
//            || locationPoint == null
//        ){
//            JOptionPane.showMessageDialog(null, "Enter all fields");
//        } else{
//            UserRegistrationRequest registrationRequest = new UserRegistrationRequest();
//            registrationRequest.setName(uName.getText());
//            registrationRequest.setUserName(userName.getText());
//            registrationRequest.setUserPassword(uPass.getText());
//            registrationRequest.setUserEmailId(uEmail.getText());
//            registrationRequest.setNetwork(network);
//            registrationRequest.setUserCity(uCity.getText());
//            registrationRequest.setOrgType(type);
//            registrationRequest.setStatus("Requested");
//            registrationRequest.setUserContact(uContact.getText());
//            registrationRequest.setUserLocationPoint(locationPoint);
//            String contact = "";
//
//            if (contactCarrier.getSelectedItem().equals("ATT")) {
//                contact = uContact.getText() + "@txt.att.net";
//            } else if (contactCarrier.getSelectedItem().equals("Verizon")) {
//                contact = uContact.getText() + "@vmobl.com";
//            } else if (contactCarrier.getSelectedItem().equals("Sprint")) {
//                contact = uContact.getText() + "@messaging.sprintpcs.com";
//            } else if (contactCarrier.getSelectedItem().equals("TMobile")) {
//                contact = uContact.getText() + "@tmomail.net";
//            }
//            registrationRequest.setContactCarrierName(contact);
//            sendEmailMessage(uEmail.getText());
//            sendTextMessage(contact);
//            for (Network network1 : system.getNetworkList()) {
//                for (Enterprise enterprise : network1.getEnterpriseDirectory().getEnterpriseList()) {
//                    if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.VoluntaryOperatingUnit) {
//                        if (enterprise.getWorkQueue() == null) {
//                            enterprise.setWorkQueue(new WorkQueue());
//                        }
//                        enterprise.getWorkQueue().getWorkRequestList().add(registrationRequest);
//                    }
//                }
//            }
//        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void contactCarrierKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactCarrierKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_contactCarrierKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> contactCarrier;
    private javax.swing.JLabel contactFormatMessage;
    private javax.swing.JLabel contactSuccessLabel;
    private javax.swing.JLabel emailSuccessLabel;
    private javax.swing.JLabel emailValidateMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox orgCombo;
    private javax.swing.JComboBox stateCombo;
    private javax.swing.JTextField uCity;
    private javax.swing.JTextField uContact;
    private javax.swing.JTextField uEmail;
    private javax.swing.JTextField uLocation;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uPass;
    private javax.swing.JTextField userName;
    private javax.swing.JLabel userNameSuccessLabel;
    private javax.swing.JLabel usernameExistsMessage;
    // End of variables declaration//GEN-END:variables
}

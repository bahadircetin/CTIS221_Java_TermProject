/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Classes.HotelSys;
import static Frames.StandardRoomFrame.sdinmonth;
import static Frames.StandardRoomFrame.sdoutmonth;
import java.awt.event.KeyEvent;

/**
 *
 * @author rog91
 */
public class KingSuiteRoom_Frame extends javax.swing.JFrame {

    /**
     * Creates new form KingSuiteRoom_Frame
     */
    public static String inmonth;
    public static String outmonth;
    
    public KingSuiteRoom_Frame() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtGuestName3 = new javax.swing.JTextField();
        txtCheckInDay3 = new javax.swing.JTextField();
        txtGuestNum3 = new javax.swing.JTextField();
        txtCheckInMonth3 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        txtCheckOutDay3 = new javax.swing.JTextField();
        txtCheckOutMonth3 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        btnAdd2 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Vintage = new javax.swing.JRadioButton();
        Modern = new javax.swing.JRadioButton();
        cmbColors2 = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        messageBox = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel3.setEndColor(new java.awt.Color(204, 158, 126));
        kGradientPanel3.setGradientFocus(500);
        kGradientPanel3.setStartColor(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setText("King Suite Room");
        kGradientPanel3.add(jLabel1);
        jLabel1.setBounds(30, 20, 192, 32);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel44.setText("Name Surname");

        jLabel45.setText("Check-In Date");

        jLabel46.setText("Check-Out Date");

        jLabel47.setText("Guest Number");

        txtGuestName3.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestName3.setForeground(new java.awt.Color(0, 0, 0));
        txtGuestName3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 255)));

        txtCheckInDay3.setBackground(new java.awt.Color(255, 255, 255));
        txtCheckInDay3.setForeground(new java.awt.Color(0, 0, 0));
        txtCheckInDay3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 255)));
        txtCheckInDay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckInDay3ActionPerformed(evt);
            }
        });

        txtGuestNum3.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestNum3.setForeground(new java.awt.Color(0, 0, 0));
        txtGuestNum3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 255)));
        txtGuestNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestNum3ActionPerformed(evt);
            }
        });

        txtCheckInMonth3.setBackground(new java.awt.Color(255, 255, 255));
        txtCheckInMonth3.setForeground(new java.awt.Color(0, 0, 0));
        txtCheckInMonth3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 255)));
        txtCheckInMonth3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckInMonth3ActionPerformed(evt);
            }
        });

        jLabel48.setText("Day");

        jLabel49.setText("Month");

        jLabel50.setText("2019");

        jLabel51.setText("Day");

        jLabel52.setText("Month");

        txtCheckOutDay3.setBackground(new java.awt.Color(255, 255, 255));
        txtCheckOutDay3.setForeground(new java.awt.Color(0, 0, 0));
        txtCheckOutDay3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 255)));
        txtCheckOutDay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckOutDay3ActionPerformed(evt);
            }
        });

        txtCheckOutMonth3.setBackground(new java.awt.Color(255, 255, 255));
        txtCheckOutMonth3.setForeground(new java.awt.Color(0, 0, 0));
        txtCheckOutMonth3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 51, 255)));
        txtCheckOutMonth3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckOutMonth3ActionPerformed(evt);
            }
        });

        jLabel53.setText("2019");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtGuestName3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addComponent(txtGuestNum3)
                        .addComponent(jLabel47)
                        .addComponent(jLabel45)
                        .addComponent(jLabel44)
                        .addComponent(jLabel46))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckInDay3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckInMonth3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel50))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckOutDay3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCheckOutMonth3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGuestName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCheckInMonth3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(txtCheckInDay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtCheckOutDay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(txtCheckOutMonth3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(txtGuestNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );

        kGradientPanel3.add(jPanel7);
        jPanel7.setBounds(580, 40, 240, 290);

        btnAdd2.setBackground(new java.awt.Color(25, 170, 166));
        btnAdd2.setText("Book This Room");
        btnAdd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnAdd2, org.jdesktop.beansbinding.ELProperty.create("false"), btnAdd2, org.jdesktop.beansbinding.BeanProperty.create("opaque"));
        bindingGroup.addBinding(binding);

        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        btnAdd2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAdd2KeyPressed(evt);
            }
        });
        kGradientPanel3.add(btnAdd2);
        btnAdd2.setBounds(650, 390, 122, 70);

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Preferences");
        kGradientPanel3.add(jLabel54);
        jLabel54.setBounds(410, 360, 100, 25);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        Vintage.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Vintage);
        Vintage.setText("Vintage");

        Modern.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(Modern);
        Modern.setText("Modern");

        cmbColors2.setBackground(new java.awt.Color(255, 255, 255));
        cmbColors2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbColors2.setForeground(new java.awt.Color(102, 102, 255));
        cmbColors2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blue", "Light Blue", "Orange", "Red", "Green", "Pink", "Yellow", "Purple", "Dark Blue", "Magenta", "Rose", "Gray", "Brown", "Camel", " " }));
        cmbColors2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 153, 255)));
        cmbColors2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColors2ActionPerformed(evt);
            }
        });

        jLabel55.setForeground(new java.awt.Color(204, 0, 153));
        jLabel55.setText("Furniture Design");

        jLabel56.setForeground(new java.awt.Color(204, 0, 153));
        jLabel56.setText("Room Color");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(cmbColors2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Vintage)
                        .addGap(29, 29, 29)
                        .addComponent(Modern))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel56)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addGap(18, 18, 18)
                .addComponent(cmbColors2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vintage)
                    .addComponent(Modern))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        kGradientPanel3.add(jPanel8);
        jPanel8.setBounds(340, 400, 240, 160);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/KingSuiteIMG.jpg"))); // NOI18N
        kGradientPanel3.add(jLabel57);
        jLabel57.setBounds(20, 80, 500, 250);

        btnClear.setText("CLEAR");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, btnClear, org.jdesktop.beansbinding.ELProperty.create("false"), btnClear, org.jdesktop.beansbinding.BeanProperty.create("opaque"));
        bindingGroup.addBinding(binding);

        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        kGradientPanel3.add(btnClear);
        btnClear.setBounds(680, 490, 68, 32);

        messageBox.setBackground(new java.awt.Color(204, 0, 0));
        messageBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        messageBox.setForeground(new java.awt.Color(0, 0, 102));
        kGradientPanel3.add(messageBox);
        messageBox.setBounds(10, 430, 310, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCheckInDay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckInDay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckInDay3ActionPerformed

    private void txtGuestNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestNum3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestNum3ActionPerformed

    private void txtCheckInMonth3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckInMonth3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckInMonth3ActionPerformed

    private void txtCheckOutDay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckOutDay3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckOutDay3ActionPerformed

    private void txtCheckOutMonth3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckOutMonth3ActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_txtCheckOutMonth3ActionPerformed

    private void cmbColors2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColors2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbColors2ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtCheckInDay3.setText(null);
        txtCheckInMonth3.setText(null);
        txtCheckOutDay3.setText(null);
        txtCheckOutMonth3.setText(null);
        txtGuestNum3.setText(null);
        txtGuestName3.setText(null);
        messageBox.setText(null);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        // TODO add your handling code here:

        double pricee = 0.0;
        int checkOutday = Integer.parseInt(txtCheckOutDay3.getText());
        int checkInday = Integer.parseInt(txtCheckInDay3.getText());
        int checkOutMonth = Integer.parseInt(txtCheckOutMonth3.getText());
        int checkInMonth = Integer.parseInt(txtCheckInMonth3.getText());
        int guestNum = Integer.parseInt(txtGuestNum3.getText());
        String color = cmbColors2.getSelectedItem().toString();
        String furniture = "";

        if (txtGuestName3.getText().isEmpty() && txtCheckInDay3.getText().isEmpty() && txtCheckOutDay3.getText().isEmpty() && txtCheckInMonth3.getText().isEmpty() && txtCheckOutMonth3.getText().isEmpty() && txtGuestNum3.getText().isEmpty()) {
            messageBox.setText("Please fill the necessary fields!!");
        } else {

            if (checkOutMonth - checkInMonth == 0) {
                pricee = (checkOutday - checkInday) * 1050;
            } else if (checkOutMonth - checkInMonth > 0) {
                pricee = ((30 * (checkOutMonth - checkInMonth)) - (checkInday - checkOutday)) * 1050;
            }

            
            if (guestNum > 3) {
                pricee += 400;
            }

            if (Vintage.isSelected()) {
                furniture += "Vintage";
            } else if (Modern.isSelected()) {
                furniture += "Modern";
            }
            inmonth=txtCheckInMonth3.getText();
            outmonth=txtCheckOutMonth3.getText();
            
            HotelSys.addKingSuitRoom(txtGuestName3.getText(), checkInday, checkOutday, guestNum, pricee, color, furniture);

            messageBox.setText("A Room is Booked for You :)");
        }
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void btnAdd2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAdd2KeyPressed
        // TODO add your handling code here:
          
         
    }//GEN-LAST:event_btnAdd2KeyPressed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Modern;
    private javax.swing.JRadioButton Vintage;
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnClear;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbColors2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel messageBox;
    private javax.swing.JTextField txtCheckInDay3;
    private javax.swing.JTextField txtCheckInMonth3;
    private javax.swing.JTextField txtCheckOutDay3;
    private javax.swing.JTextField txtCheckOutMonth3;
    private javax.swing.JTextField txtGuestName3;
    private javax.swing.JTextField txtGuestNum3;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

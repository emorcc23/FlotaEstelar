/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.design.add;

import branches.fev2.dao.DaoTripulant;
import branches.fev2.files.Ship;
import branches.fev2.files.Tripulant;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Álvaro Santos
 */
public class AddTripulant extends javax.swing.JDialog {

      /**
       * Creates new form removeShip
       */
      public AddTripulant(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
            try {
                  int lastId = DaoTripulant.getInstance().extractLastId();
                  txtIdTripulant.setText(String.valueOf(lastId));
                  ArrayList<Ship> listIdShip = DaoTripulant.getInstance().extractIdShip();
                  comboIdShip.removeAllItems();
                  for (int i = 0; i < listIdShip.size(); i++) {
                        String ids = Integer.toString(listIdShip.get(i).getId_ship());
                        comboIdShip.addItem(ids);
                  }
            } catch (SQLException e) {
                  System.out.println(e);
            }
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jLabel10 = new javax.swing.JLabel();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            txtIdTripulant = new javax.swing.JTextField();
            txtName = new javax.swing.JTextField();
            txtPosition = new javax.swing.JTextField();
            txtGender = new javax.swing.JTextField();
            txtExperience = new javax.swing.JTextField();
            txtOrigin = new javax.swing.JTextField();
            txtRace = new javax.swing.JTextField();
            txtAge = new javax.swing.JTextField();
            txtImage = new javax.swing.JTextField();
            comboIdShip = new javax.swing.JComboBox<>();
            btnAddTripulant = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("FlotaEstelar");

            jPanel1.setLayout(null);

            jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Add a tripulant");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(110, 60, 170, 21);

            jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("ID of the tripulant");
            jPanel1.add(jLabel3);
            jLabel3.setBounds(130, 110, 130, 14);

            jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Name");
            jPanel1.add(jLabel4);
            jLabel4.setBounds(170, 160, 70, 14);

            jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("Position");
            jPanel1.add(jLabel5);
            jLabel5.setBounds(160, 210, 80, 14);

            jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setText("Gender");
            jPanel1.add(jLabel6);
            jLabel6.setBounds(160, 260, 80, 14);

            jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setText("Experience");
            jPanel1.add(jLabel7);
            jLabel7.setBounds(150, 310, 100, 14);

            jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 255, 255));
            jLabel8.setText("Origin");
            jPanel1.add(jLabel8);
            jLabel8.setBounds(160, 360, 70, 14);

            jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(255, 255, 255));
            jLabel9.setText("Race");
            jPanel1.add(jLabel9);
            jLabel9.setBounds(170, 410, 70, 14);

            jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(255, 255, 255));
            jLabel10.setText("Age");
            jPanel1.add(jLabel10);
            jLabel10.setBounds(170, 460, 60, 14);

            jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(255, 255, 255));
            jLabel11.setText("Image");
            jPanel1.add(jLabel11);
            jLabel11.setBounds(160, 510, 70, 14);

            jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(255, 255, 255));
            jLabel12.setText("ID of the ship");
            jPanel1.add(jLabel12);
            jLabel12.setBounds(140, 560, 90, 14);

            txtIdTripulant.setEditable(false);
            txtIdTripulant.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtIdTripulant);
            txtIdTripulant.setBounds(31, 130, 300, 26);

            txtName.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtName);
            txtName.setBounds(31, 180, 300, 26);

            txtPosition.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtPosition);
            txtPosition.setBounds(31, 230, 300, 26);

            txtGender.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtGender);
            txtGender.setBounds(31, 280, 300, 26);

            txtExperience.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtExperience);
            txtExperience.setBounds(31, 330, 300, 26);

            txtOrigin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtOrigin);
            txtOrigin.setBounds(31, 380, 300, 26);

            txtRace.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtRace);
            txtRace.setBounds(31, 430, 300, 26);

            txtAge.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtAge);
            txtAge.setBounds(31, 480, 300, 26);

            txtImage.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(txtImage);
            txtImage.setBounds(31, 530, 300, 26);

            comboIdShip.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel1.add(comboIdShip);
            comboIdShip.setBounds(24, 580, 310, 24);

            btnAddTripulant.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnAddTripulant.setText("Add");
            btnAddTripulant.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnAddTripulantActionPerformed(evt);
                  }
            });
            jPanel1.add(btnAddTripulant);
            btnAddTripulant.setBounds(30, 640, 300, 26);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/AddTripulant.JPG"))); // NOI18N
            jPanel1.add(jLabel1);
            jLabel1.setBounds(-6, -20, 386, 740);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void btnAddTripulantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTripulantActionPerformed

            try {
                  String name = txtName.getText();
                  String position = txtPosition.getText();
                  String gender = txtGender.getText();
                  int experience = Integer.parseInt(txtExperience.getText());
                  String origin = txtOrigin.getText();
                  String race = txtRace.getText();
                  int age = Integer.parseInt(txtAge.getText());
                  String image = txtImage.getText();
                  int idShip  = Integer.parseInt(comboIdShip.getSelectedItem().toString());
                  Tripulant tripulant = new Tripulant(name, position, gender, experience, origin, race, age, image, idShip);
                  DaoTripulant.getInstance().insert(tripulant);
                  System.out.println("Add successfully");
                  JOptionPane.showMessageDialog(null, "Added successfully");
            } catch (Exception e) {
                  System.out.println(e);
            }

      }//GEN-LAST:event_btnAddTripulantActionPerformed

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
                  java.util.logging.Logger.getLogger(AddTripulant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(AddTripulant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(AddTripulant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(AddTripulant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>
            //</editor-fold>

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        AddTripulant dialog = new AddTripulant(new javax.swing.JFrame(), true);
                        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                              @Override
                              public void windowClosing(java.awt.event.WindowEvent e) {
                                    System.exit(0);
                              }
                        });
                        dialog.setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnAddTripulant;
      private javax.swing.JComboBox<String> comboIdShip;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JTextField txtAge;
      private javax.swing.JTextField txtExperience;
      private javax.swing.JTextField txtGender;
      private javax.swing.JTextField txtIdTripulant;
      private javax.swing.JTextField txtImage;
      private javax.swing.JTextField txtName;
      private javax.swing.JTextField txtOrigin;
      private javax.swing.JTextField txtPosition;
      private javax.swing.JTextField txtRace;
      // End of variables declaration//GEN-END:variables
}

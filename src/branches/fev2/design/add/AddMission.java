/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package branches.fev2.design.add;

/**
 *
 * @author alvaro.santos
 */
public class AddMission extends javax.swing.JDialog {

      /**
       * Creates new form AddMission
       */
      public AddMission(java.awt.Frame parent, boolean modal) {
            super(parent, modal);
            initComponents();
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel2 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            btnAddMission = new javax.swing.JButton();
            comboIdShip = new javax.swing.JComboBox<>();
            txtDescription = new javax.swing.JTextField();
            txtName = new javax.swing.JTextField();
            txtIdMission = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
            setTitle("FlotaEstelar");

            jPanel2.setLayout(null);

            jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setText("Add a mission");
            jPanel2.add(jLabel2);
            jLabel2.setBounds(120, 80, 140, 21);

            jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(255, 255, 255));
            jLabel3.setText("ID of the mission");
            jPanel2.add(jLabel3);
            jLabel3.setBounds(130, 160, 111, 14);

            jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(255, 255, 255));
            jLabel4.setText("Name");
            jPanel2.add(jLabel4);
            jLabel4.setBounds(170, 220, 35, 14);

            jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 255, 255));
            jLabel5.setText("ID of the ship");
            jPanel2.add(jLabel5);
            jLabel5.setBounds(140, 280, 90, 14);

            jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(255, 255, 255));
            jLabel6.setText("Description");
            jPanel2.add(jLabel6);
            jLabel6.setBounds(150, 340, 81, 14);

            btnAddMission.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            btnAddMission.setText("Add");
            jPanel2.add(btnAddMission);
            btnAddMission.setBounds(40, 500, 290, 26);

            comboIdShip.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            comboIdShip.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
            jPanel2.add(comboIdShip);
            comboIdShip.setBounds(44, 300, 280, 26);

            txtDescription.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel2.add(txtDescription);
            txtDescription.setBounds(41, 360, 290, 26);

            txtName.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel2.add(txtName);
            txtName.setBounds(41, 240, 290, 26);

            txtIdMission.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
            jPanel2.add(txtIdMission);
            txtIdMission.setBounds(41, 180, 290, 26);

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/branches/fev2/design/images/AddMission.JPG"))); // NOI18N
            jPanel2.add(jLabel1);
            jLabel1.setBounds(0, 0, 370, 572);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

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
                  java.util.logging.Logger.getLogger(AddMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(AddMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(AddMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(AddMission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the dialog */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        AddMission dialog = new AddMission(new javax.swing.JFrame(), true);
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
      private javax.swing.JButton btnAddMission;
      private javax.swing.JComboBox<String> comboIdShip;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JTextField txtDescription;
      private javax.swing.JTextField txtIdMission;
      private javax.swing.JTextField txtName;
      // End of variables declaration//GEN-END:variables
}

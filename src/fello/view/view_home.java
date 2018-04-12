package fello.view;

import fello.controller.MemberManager;
import fello.pojo.Member;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class view_home extends javax.swing.JFrame {
    Member member = new Member();
    MemberManager memberManager = new MemberManager();
    public view_home() {
        initComponents();
    }
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fellowmange = new javax.swing.JPanel();
        userregistration = new javax.swing.JButton();
        memeberregistration = new javax.swing.JButton();
        updatemember = new javax.swing.JButton();
        teamleaderchange = new javax.swing.JButton();
        teamadd = new javax.swing.JButton();
        bsadd = new javax.swing.JButton();
        generalleaderchange = new javax.swing.JButton();
        bsupdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);

        fellowmange.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fellow management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        fellowmange.setFocusable(false);

        userregistration.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        userregistration.setText("Register user");
        userregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userregistrationActionPerformed(evt);
            }
        });

        memeberregistration.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        memeberregistration.setText("Register member");
        memeberregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memeberregistrationActionPerformed(evt);
            }
        });

        updatemember.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        updatemember.setText("Update member");
        updatemember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatememberActionPerformed(evt);
            }
        });

        teamleaderchange.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        teamleaderchange.setText("Change team leaders");

        teamadd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        teamadd.setText("Add team");

        bsadd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bsadd.setText("Add bible study group");

        generalleaderchange.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        generalleaderchange.setText("Change general leaders");

        bsupdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bsupdate.setText("Update bible study group");

        javax.swing.GroupLayout fellowmangeLayout = new javax.swing.GroupLayout(fellowmange);
        fellowmange.setLayout(fellowmangeLayout);
        fellowmangeLayout.setHorizontalGroup(
            fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fellowmangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(teamleaderchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatemember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(memeberregistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userregistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bsupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teamadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bsadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generalleaderchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(91, 91, 91))
        );
        fellowmangeLayout.setVerticalGroup(
            fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fellowmangeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userregistration)
                    .addComponent(teamadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memeberregistration)
                    .addComponent(bsadd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatemember)
                    .addComponent(generalleaderchange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fellowmangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamleaderchange)
                    .addComponent(bsupdate))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fellowmange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fellowmange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userregistrationActionPerformed
       view_userRegistration registration =  new view_userRegistration();
       view_home home = new view_home();
       registration.setVisible(true);
       registration.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_userregistrationActionPerformed

    private void memeberregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memeberregistrationActionPerformed
      view_registration registration = new view_registration();
      registration.setVisible(true);
      registration.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_memeberregistrationActionPerformed

    private void updatememberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatememberActionPerformed
        try {
            memberManager.selectAll();
        } catch (SQLException ex) {
            Logger.getLogger(view_home.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(member.getFristname());
    }//GEN-LAST:event_updatememberActionPerformed
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bsadd;
    private javax.swing.JButton bsupdate;
    private javax.swing.JPanel fellowmange;
    private javax.swing.JButton generalleaderchange;
    private javax.swing.JButton memeberregistration;
    private javax.swing.JButton teamadd;
    private javax.swing.JButton teamleaderchange;
    private javax.swing.JButton updatemember;
    private javax.swing.JButton userregistration;
    // End of variables declaration//GEN-END:variables
}

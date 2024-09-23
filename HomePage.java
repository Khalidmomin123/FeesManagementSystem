/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fees_management_system;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        homepagepanel2 = new javax.swing.JPanel();
        viewreportpanel = new javax.swing.JPanel();
        lblviewreport = new javax.swing.JLabel();
        addfeespanel = new javax.swing.JPanel();
        lblAddfees = new javax.swing.JLabel();
        searchrecordpanel = new javax.swing.JPanel();
        lblsearchrecord = new javax.swing.JLabel();
        viewrecordpanel = new javax.swing.JPanel();
        lblviewrecord = new javax.swing.JLabel();
        aboutpanel = new javax.swing.JPanel();
        lblabout = new javax.swing.JLabel();
        editcoursepanel = new javax.swing.JPanel();
        lbleditcourse = new javax.swing.JLabel();
        logoutpanel = new javax.swing.JPanel();
        lbllogout = new javax.swing.JLabel();
        homepagepanel = new javax.swing.JPanel();
        lblclgname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblclgLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 1500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homepagepanel2.setBackground(new java.awt.Color(0, 102, 102));
        homepagepanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        homepagepanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        homepagepanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        homepagepanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homepagepanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homepagepanel2MouseExited(evt);
            }
        });
        homepagepanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewreportpanel.setBackground(new java.awt.Color(0, 151, 151));
        viewreportpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        viewreportpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblviewreport.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblviewreport.setForeground(new java.awt.Color(255, 255, 255));
        lblviewreport.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\view report.png")); // NOI18N
        lblviewreport.setText("View Report");
        lblviewreport.setToolTipText("");
        lblviewreport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblviewreportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblviewreportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblviewreportMouseExited(evt);
            }
        });
        viewreportpanel.add(lblviewreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 140));

        homepagepanel2.add(viewreportpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 330, 160));

        addfeespanel.setBackground(new java.awt.Color(0, 151, 151));
        addfeespanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        addfeespanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddfees.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAddfees.setForeground(new java.awt.Color(255, 255, 255));
        lblAddfees.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\add2.png")); // NOI18N
        lblAddfees.setText("Add Fees");
        lblAddfees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddfeesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddfeesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddfeesMouseExited(evt);
            }
        });
        addfeespanel.add(lblAddfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 160, 70));

        homepagepanel2.add(addfeespanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 320, 160));

        searchrecordpanel.setBackground(new java.awt.Color(0, 151, 151));
        searchrecordpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        searchrecordpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsearchrecord.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblsearchrecord.setForeground(new java.awt.Color(255, 255, 255));
        lblsearchrecord.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\search-document.png")); // NOI18N
        lblsearchrecord.setText("Search Record");
        lblsearchrecord.setToolTipText("");
        lblsearchrecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsearchrecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblsearchrecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblsearchrecordMouseExited(evt);
            }
        });
        searchrecordpanel.add(lblsearchrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 130));

        homepagepanel2.add(searchrecordpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 330, 160));

        viewrecordpanel.setBackground(new java.awt.Color(0, 151, 151));
        viewrecordpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        viewrecordpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblviewrecord.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblviewrecord.setForeground(new java.awt.Color(255, 255, 255));
        lblviewrecord.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\text-book-opened-from-top-view.png")); // NOI18N
        lblviewrecord.setText("View Record");
        lblviewrecord.setToolTipText("");
        lblviewrecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblviewrecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblviewrecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblviewrecordMouseExited(evt);
            }
        });
        viewrecordpanel.add(lblviewrecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 280, 100));

        homepagepanel2.add(viewrecordpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 40, 330, 160));

        aboutpanel.setBackground(new java.awt.Color(0, 151, 151));
        aboutpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        aboutpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblabout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblabout.setForeground(new java.awt.Color(255, 255, 255));
        lblabout.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\about.png")); // NOI18N
        lblabout.setText("About");
        lblabout.setToolTipText("");
        lblabout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblaboutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblaboutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblaboutMouseExited(evt);
            }
        });
        aboutpanel.add(lblabout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 70));

        homepagepanel2.add(aboutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 180, 100));

        editcoursepanel.setBackground(new java.awt.Color(0, 151, 151));
        editcoursepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        editcoursepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbleditcourse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbleditcourse.setForeground(new java.awt.Color(255, 255, 255));
        lbleditcourse.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\edit.png")); // NOI18N
        lbleditcourse.setText("Edit Course");
        lbleditcourse.setToolTipText("");
        lbleditcourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbleditcourseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbleditcourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbleditcourseMouseExited(evt);
            }
        });
        editcoursepanel.add(lbleditcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 140));

        homepagepanel2.add(editcoursepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 320, 160));

        logoutpanel.setBackground(new java.awt.Color(0, 151, 151));
        logoutpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        logoutpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbllogout.setForeground(new java.awt.Color(255, 255, 255));
        lbllogout.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\logout.png")); // NOI18N
        lbllogout.setText("Logout");
        lbllogout.setToolTipText("");
        lbllogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbllogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbllogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbllogoutMouseExited(evt);
            }
        });
        logoutpanel.add(lbllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 80));

        homepagepanel2.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 200, 100));

        getContentPane().add(homepagepanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1130, 1660));

        homepagepanel.setBackground(new java.awt.Color(0, 51, 51));
        homepagepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblclgname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblclgname.setForeground(new java.awt.Color(255, 255, 255));
        lblclgname.setText("Institute of Magement and Rural Development Administration");
        homepagepanel.add(lblclgname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 410, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bharati Vidyapeeth's");
        homepagepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rajwada Chowk,  Police station near, Sangli-  416 416");
        homepagepanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 360, 30));

        lblclgLogo.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\imrd.png")); // NOI18N
        homepagepanel.add(lblclgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 120, 120));

        getContentPane().add(homepagepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 120));

        setSize(new java.awt.Dimension(1145, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homepagepanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepagepanel2MouseEntered
    
    }//GEN-LAST:event_homepagepanel2MouseEntered

    private void homepagepanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepagepanel2MouseExited
  
    }//GEN-LAST:event_homepagepanel2MouseExited

    private void lblviewreportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblviewreportMouseEntered
       Color clr = new Color(0,51,51);
       viewreportpanel.setBackground(clr);
    }//GEN-LAST:event_lblviewreportMouseEntered

    private void lblviewreportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblviewreportMouseExited
        Color clr = new Color(0,151,151);
       viewreportpanel.setBackground(clr);
    }//GEN-LAST:event_lblviewreportMouseExited

    private void lblAddfeesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddfeesMouseEntered
        Color clr = new Color(0,51,51);
       addfeespanel.setBackground(clr);
    }//GEN-LAST:event_lblAddfeesMouseEntered

    private void lblAddfeesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddfeesMouseExited
         Color clr = new Color(0,151,151);
       addfeespanel.setBackground(clr);

    }//GEN-LAST:event_lblAddfeesMouseExited

    private void lblsearchrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchrecordMouseEntered
         Color clr = new Color(0,51,51);
      searchrecordpanel.setBackground(clr);
    }//GEN-LAST:event_lblsearchrecordMouseEntered

    private void lblsearchrecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchrecordMouseExited
         Color clr = new Color(0,151,151);
       searchrecordpanel.setBackground(clr);
    }//GEN-LAST:event_lblsearchrecordMouseExited

    private void lblviewrecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblviewrecordMouseEntered
         Color clr = new Color(0,51,51);
      viewrecordpanel.setBackground(clr);
    }//GEN-LAST:event_lblviewrecordMouseEntered

    private void lblviewrecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblviewrecordMouseExited
       Color clr = new Color(0,151,151);
        viewrecordpanel.setBackground(clr);
    }//GEN-LAST:event_lblviewrecordMouseExited

    private void lblaboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaboutMouseEntered
         Color clr = new Color(0,51,51);
     aboutpanel.setBackground(clr);
    }//GEN-LAST:event_lblaboutMouseEntered

    private void lblaboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaboutMouseExited
       Color clr = new Color(0,151,151);
         aboutpanel.setBackground(clr);
    }//GEN-LAST:event_lblaboutMouseExited

    private void lbleditcourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbleditcourseMouseEntered
            Color clr = new Color(0,51,51);
    editcoursepanel.setBackground(clr);
    }//GEN-LAST:event_lbleditcourseMouseEntered

    private void lbleditcourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbleditcourseMouseExited
       Color clr = new Color(0,151,151);
         editcoursepanel.setBackground(clr);
    }//GEN-LAST:event_lbleditcourseMouseExited

    private void lbllogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseEntered
         Color clr = new Color(0,51,51);
      logoutpanel.setBackground(clr);
    }//GEN-LAST:event_lbllogoutMouseEntered

    private void lbllogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseExited
        Color clr = new Color(0,151,151);
         logoutpanel.setBackground(clr);
    }//GEN-LAST:event_lbllogoutMouseExited

    private void lblAddfeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddfeesMouseClicked
       AddFees af = new AddFees();
       af.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblAddfeesMouseClicked

    private void lblsearchrecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchrecordMouseClicked
       SearchRecord sr = new SearchRecord();
       sr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblsearchrecordMouseClicked

    private void lbleditcourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbleditcourseMouseClicked
      EditCourse ec = new EditCourse();
      ec.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_lbleditcourseMouseClicked

    private void lblviewrecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblviewrecordMouseClicked
        ViewAllRecord vr = new ViewAllRecord();
        vr.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_lblviewrecordMouseClicked

    private void lblaboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblaboutMouseClicked
       CopyRight cr = new CopyRight();
       cr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblaboutMouseClicked

    private void lblviewreportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblviewreportMouseClicked
       ViewReport vr = new ViewReport();
       vr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblviewreportMouseClicked

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseClicked
       SignUp su = new SignUp();
       su.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lbllogoutMouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutpanel;
    private javax.swing.JPanel addfeespanel;
    private javax.swing.JPanel editcoursepanel;
    private javax.swing.JPanel homepagepanel;
    private javax.swing.JPanel homepagepanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblAddfees;
    private javax.swing.JLabel lblabout;
    private javax.swing.JLabel lblclgLogo;
    private javax.swing.JLabel lblclgname;
    private javax.swing.JLabel lbleditcourse;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblsearchrecord;
    private javax.swing.JLabel lblviewrecord;
    private javax.swing.JLabel lblviewreport;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JPanel searchrecordpanel;
    private javax.swing.JPanel viewrecordpanel;
    private javax.swing.JPanel viewreportpanel;
    // End of variables declaration//GEN-END:variables
}

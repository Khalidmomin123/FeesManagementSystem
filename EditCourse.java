/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fees_management_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ADMIN
 */
public class EditCourse extends javax.swing.JFrame {
       DefaultTableModel model;
    /**
     * Creates new form EditCourse
     */
    public EditCourse() {
        initComponents();
        setEditCourseTable();
    } 
    
     public void deleteTable(int id){
           try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fees_managementsystemdb";
            Connection con =  DriverManager.getConnection(url,"root","Khalid@123");
            String sql = "delete from course where ID = ?";
            PreparedStatement st = con.prepareStatement(sql);
           
           
            
             st.setInt(1,id);
          
           int rowCount = st.executeUpdate();
           if(rowCount == 1){
               JOptionPane.showMessageDialog(this,"Course Deleted Successfully");
               clearTable();
               setEditCourseTable();
           }
           else{
               JOptionPane.showMessageDialog(this, "Course Deletion Failed");
           }
           
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Course Deletion  Failed");
            e.printStackTrace();
        }
    }
    
    
    public void updateTable(int id,String cname,float cost){
           try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fees_managementsystemdb";
            Connection con =  DriverManager.getConnection(url,"root","Khalid@123");
            String sql = "update course set CNAME = ?,COST = ? where ID = ?";
            PreparedStatement st = con.prepareStatement(sql);
           
           
            st.setString(1,cname);
            st.setFloat(2, cost);
             st.setInt(3,id);
          
           int rowCount = st.executeUpdate();
           if(rowCount == 1){
               JOptionPane.showMessageDialog(this,"Course Updated Successfully");
               clearTable();
               setEditCourseTable();
           }
           else{
               JOptionPane.showMessageDialog(this, "Course Updation Failed");
           }
           
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Course Updation  Failed");
            e.printStackTrace();
        }
    }
    public void clearTable(){
        DefaultTableModel model = (DefaultTableModel)editCourseTable.getModel();
        model.setRowCount(0);
    }
    public void addCourse(int id,String cname,float cost){
         try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fees_managementsystemdb";
            Connection con =  DriverManager.getConnection(url,"root","Khalid@123");
            String sql = "insert into course values(?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
           
            st.setInt(1,id);
            st.setString(2,cname);
            st.setFloat(3, cost);
          
           int rowCount = st.executeUpdate();
           if(rowCount == 1){
               JOptionPane.showMessageDialog(this,"Course Added Successfully");
               clearTable();
               setEditCourseTable();
           }
           else{
               JOptionPane.showMessageDialog(this, "Course Insertion Failed");
           }
           
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(this, "Course Insertion Failed");
            e.printStackTrace();
        }
    }
    
    
    
    public void setEditCourseTable(){
         try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fees_managementsystemdb";
            Connection con =  DriverManager.getConnection(url,"root","Khalid@123");
            String sql = "select * from course";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String courseId= rs.getString("ID");
                String courseName = rs.getString("CNAME");
                String courseCost = rs.getString("COST");
                
               
                
                Object[] obj = { courseId,courseName,courseCost };
                model = (DefaultTableModel)editCourseTable.getModel();
                model.addRow(obj);
               
         
          }
       
         }  
        
        catch(Exception e){
            
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        logoutpanel = new javax.swing.JPanel();
        lbllogout = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        lblhome = new javax.swing.JLabel();
        searchpanel = new javax.swing.JPanel();
        lblsearch = new javax.swing.JLabel();
        courselistpanel = new javax.swing.JPanel();
        lblcourseList = new javax.swing.JLabel();
        backpanel = new javax.swing.JPanel();
        lblback = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editCourseTable = new javax.swing.JTable();
        txtCourseID = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        txtCourseCost = new javax.swing.JTextField();
        lblCourseID = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblCourseCost = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblEditCourse = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 51, 51));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutpanel.setBackground(new java.awt.Color(0, 51, 51));
        logoutpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        logoutpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbllogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbllogout.setForeground(new java.awt.Color(255, 255, 255));
        lbllogout.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\exit.png")); // NOI18N
        lbllogout.setText("Logout");
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
        logoutpanel.add(lbllogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        panel1.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 120, 40));

        homepanel.setBackground(new java.awt.Color(0, 51, 51));
        homepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        homepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblhome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblhome.setForeground(new java.awt.Color(255, 255, 255));
        lblhome.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\home.png")); // NOI18N
        lblhome.setText("Home");
        lblhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblhomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblhomeMouseExited(evt);
            }
        });
        homepanel.add(lblhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        panel1.add(homepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 160, 60));

        searchpanel.setBackground(new java.awt.Color(0, 51, 51));
        searchpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        searchpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblsearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsearch.setForeground(new java.awt.Color(255, 255, 255));
        lblsearch.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\search2.png")); // NOI18N
        lblsearch.setText("Search Record");
        lblsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblsearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblsearchMouseExited(evt);
            }
        });
        searchpanel.add(lblsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, -1));

        panel1.add(searchpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 170, 70));

        courselistpanel.setBackground(new java.awt.Color(0, 51, 51));
        courselistpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        courselistpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcourseList.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblcourseList.setForeground(new java.awt.Color(255, 255, 255));
        lblcourseList.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\view all record_1.png")); // NOI18N
        lblcourseList.setText("View Record");
        lblcourseList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcourseListMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblcourseListMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblcourseListMouseExited(evt);
            }
        });
        courselistpanel.add(lblcourseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, -1));

        panel1.add(courselistpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 170, 70));

        backpanel.setBackground(new java.awt.Color(0, 51, 51));
        backpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        backpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblback.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblback.setForeground(new java.awt.Color(255, 255, 255));
        lblback.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\back1.png")); // NOI18N
        lblback.setText("Back");
        lblback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblbackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblbackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblbackMouseExited(evt);
            }
        });
        backpanel.add(lblback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, -1));

        panel1.add(backpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 120, 40));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 290, 640));

        panel2.setBackground(new java.awt.Color(0, 153, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editCourseTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editCourseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Course Name", "Cost"
            }
        ));
        editCourseTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCourseTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(editCourseTable);

        panel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        txtCourseID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel2.add(txtCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 200, 30));

        txtCourseName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel2.add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 222, 200, 30));

        txtCourseCost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        panel2.add(txtCourseCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 200, 30));

        lblCourseID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCourseID.setText("Course ID:");
        panel2.add(lblCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, 30));

        lblCourseName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCourseName.setText("Course Name:");
        panel2.add(lblCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, 30));

        lblCourseCost.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCourseCost.setText("Course Cost:");
        panel2.add(lblCourseCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, 30));

        btnAdd.setBackground(new java.awt.Color(0, 51, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        panel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, 30));

        btnUpdate.setBackground(new java.awt.Color(0, 51, 51));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, -1, 30));

        btnDelete.setBackground(new java.awt.Color(0, 51, 51));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, 30));

        lblEditCourse.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEditCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblEditCourse.setText("Edit Course Details");
        panel2.add(lblEditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 220, 30));
        panel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 270, -1));

        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\back1.png")); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        panel2.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 30));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 640));

        setSize(new java.awt.Dimension(1232, 648));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbllogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseEntered
        Color clr = new Color(0,153,153);
        logoutpanel.setBackground(clr);
    }//GEN-LAST:event_lbllogoutMouseEntered

    private void lbllogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseExited
        Color clr = new Color(0,51,51);
        logoutpanel.setBackground(clr);
    }//GEN-LAST:event_lbllogoutMouseExited

    private void lblhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseClicked
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblhomeMouseClicked

    private void lblhomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseEntered
        Color clr = new Color(0,153,153);
        homepanel.setBackground(clr);
    }//GEN-LAST:event_lblhomeMouseEntered

    private void lblhomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseExited
        Color clr = new Color(0,51,51);
        homepanel.setBackground(clr);
    }//GEN-LAST:event_lblhomeMouseExited

    private void lblsearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchMouseEntered
        Color clr = new Color(0,153,153);
        searchpanel.setBackground(clr);
    }//GEN-LAST:event_lblsearchMouseEntered

    private void lblsearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchMouseExited
        Color clr = new Color(0,51,51);
        searchpanel.setBackground(clr);
    }//GEN-LAST:event_lblsearchMouseExited

    private void lblcourseListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcourseListMouseEntered
        Color clr = new Color(0,153,153);
        courselistpanel.setBackground(clr);
    }//GEN-LAST:event_lblcourseListMouseEntered

    private void lblcourseListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcourseListMouseExited
        Color clr = new Color(0,51,51);
        courselistpanel.setBackground(clr);
    }//GEN-LAST:event_lblcourseListMouseExited

    private void lblbackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseEntered
        Color clr = new Color(0,153,153);
        backpanel.setBackground(clr);
    }//GEN-LAST:event_lblbackMouseEntered

    private void lblbackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseExited
        Color clr = new Color(0,51,51);
        backpanel.setBackground(clr);
    }//GEN-LAST:event_lblbackMouseExited

    private void lblsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchMouseClicked
       SearchRecord sr = new SearchRecord();
       sr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblsearchMouseClicked

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
       Color clr = new Color(0,153,153);
       btnAdd.setBackground(clr);
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
      Color clr = new Color(0,51,51);
       btnAdd.setBackground(clr);
    }//GEN-LAST:event_btnAddMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        Color clr = new Color(0,153,153);
       btnUpdate.setBackground(clr);
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
       Color clr = new Color(0,51,51);
       btnUpdate.setBackground(clr);
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
       Color clr = new Color(0,153,153);
       btnDelete.setBackground(clr);
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
       Color clr = new Color(0,51,51);
        btnDelete.setBackground(clr);
    }//GEN-LAST:event_btnDeleteMouseExited

    private void editCourseTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCourseTableMouseClicked
      int rowNo = editCourseTable.getSelectedRow();
       TableModel model = editCourseTable.getModel();
       txtCourseID.setText(model.getValueAt(rowNo,0).toString());
      txtCourseName.setText(model.getValueAt(rowNo,1).toString());
       txtCourseCost.setText(model.getValueAt(rowNo,2).toString());
       
    }//GEN-LAST:event_editCourseTableMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int id = Integer.parseInt(txtCourseID.getText());
        String cname = txtCourseName.getText();
        float cost = Float.parseFloat(txtCourseCost.getText());
        addCourse(id,cname,cost);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int id = Integer.parseInt(txtCourseID.getText());
        String cname = txtCourseName.getText();
        float cost = Float.parseFloat(txtCourseCost.getText());
        updateTable(id,cname,cost);     
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       int id = Integer.parseInt(txtCourseID.getText());
       
       deleteTable(id);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
      HomePage hp = new HomePage();
      hp.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseClicked
       SignUp su = new SignUp();
       su.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lbllogoutMouseClicked

    private void lblcourseListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcourseListMouseClicked
      ViewAllRecord var = new ViewAllRecord();
      var.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_lblcourseListMouseClicked

    private void lblbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblbackMouseClicked
        
    }//GEN-LAST:event_lblbackMouseClicked

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
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backpanel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel courselistpanel;
    private javax.swing.JTable editCourseTable;
    private javax.swing.JPanel homepanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblCourseCost;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblEditCourse;
    private javax.swing.JLabel lblback;
    private javax.swing.JLabel lblcourseList;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JPanel logoutpanel;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private javax.swing.JPanel searchpanel;
    private javax.swing.JTextField txtCourseCost;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    // End of variables declaration//GEN-END:variables
}

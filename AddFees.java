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
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */

public class  AddFees extends javax.swing.JFrame {

    /**
     * Creates new form AddFees
     */
     public AddFees() {
        initComponents();
        fillComboBox();
      
        
       int r = getRecieptNo();
       r++;
       txtReceiptNo.setText(Integer.toString(r));
        
      
    }



public static  class NumberToWordsConverter {

	public static final String[] units = { "", "One", "Two", "Three", "Four",
			"Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
			"Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
			"Eighteen", "Nineteen" };

	public static final String[] tens = { 
			"", 		
			"",		
			"Twenty", 	
			"Thirty", 	
			"Forty", 	
			"Fifty", 	
			"Sixty", 	
			"Seventy",	
			"Eighty", 	
			"Ninety" 	
	};

	public static String convert(final int n) {
		if (n < 0) 
                {
			return "Minus " + convert(-n);
		}

		if (n < 20) 
                {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " Hundred" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
		}

		if (n < 100000) {
			return convert(n / 1000) + " Thousand" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
		}

		if (n < 10000000) {
			return convert(n / 100000) + " Lakh" + ((n % 100000 != 0) ? " " : "") + convert(n % 100000);
		}

		return convert(n / 10000000) + " Crore" + ((n % 10000000 != 0) ? " " : "") + convert(n % 10000000);
	}

	public static void main(final String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Amount : ");
		float n=sc.nextInt();

		
		System.out.println( convert((int)n)+ " Only");

	
	}
}


       
    public String insertData(){
        
       
        int recieptno = Integer.parseInt(txtReceiptNo.getText());
        String sname = txtReceiverN.getText();
        String rollno = txtRollNo.getText();
        String paymentmode = ComboModeOP.getSelectedItem().toString();
        String chequeno = txtCheque.getText();
        String bankname = txtBankN.getText();
        String ddno = txtDD.getText();
        String upi = txtUPI.getText();
        String coursename = ComboBCourse.getSelectedItem().toString();
        String gstno = lblGSTNO.getText();
        float totalamt = Float.parseFloat( txtTotal.getText());
       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(date_C.getDate());
        float amt = Float.parseFloat(txtAmount.getText());
        float cgst = Float.parseFloat(txtcgst.getText());
        float sgst = Float.parseFloat(txtsgst.getText());
        String totalinwords = txtTotalWords.getText();
        String remark = txtRemark.getText();
        int year1 = Integer.parseInt(txtfromYr.getText());
        int year2 = Integer.parseInt(txtToYear.getText());
        
         String status = "";
         
         try{
             
         
               
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fees_managementsystemdb";
            Connection con =  DriverManager.getConnection(url,"root","Khalid@123");
            String sql = "insert into fees_details values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
           
           
           st.setInt(1,recieptno );
           st.setString(2, sname);
           st.setString(3, rollno);
           st.setString(4, paymentmode);
           st.setString(5, chequeno);
           st.setString(6, bankname );
           st.setString(7, ddno);
           st.setString(8, upi);
           st.setString(9, coursename);
           st.setString(10,  gstno );
           st.setFloat(11,totalamt );
           st.setString(12,  date);
           st.setFloat(13,amt);
           st.setFloat(14,cgst);
           st.setFloat(15,sgst );
           st.setString(16,  totalinwords);
           st.setString(17,  remark );
           st.setInt(18, year1);
           st.setInt(19,year2 );
           
          int count = st.executeUpdate();
      
          
          if(count == 1){
              status = "success";
          }
          else{
              status = "failed";
          }
           
        }
        catch(Exception e){
            
            e.printStackTrace();
        }
        
        
        return status;
    }  
   
   
    boolean validation(){
        
        if(txtReceiverN.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please, Enter Receiver Name First.");
            return false;
        }
        
        if(date_C.getDate() == null){
            JOptionPane.showMessageDialog(this, "Please, Enter Date.");
            return false;
        }
        
        if(txtfromYr.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please, Enter Year of From.");
            return false;
        }
        
        if(txtToYear.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please, Enter Year of To.");
            return false;
        }
        
        if(txtRollNo.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Please, Enter a Roll No.");
            return false;
        }
        
        
        
        if(txtAmount.getText().equals("")||txtAmount.getText().matches("[0-9]+")== false){
            JOptionPane.showMessageDialog(this,"Please, Enter Amount (in numbers)");
            return false;
        }
        
        if(txtRemark.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please, Enter Remark");
            return false;
        }
       
        
        if(ComboModeOP.getSelectedItem().toString().equalsIgnoreCase("Cheque")){
            if(txtCheque.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please, Enter Cheque Number");
            return false;
        }
             if(txtBankN.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Please, Enter Bank Name.");  
               return false;
            } 
             if(txtAmount.getText().equals("")||txtAmount.getText().matches("[0-9]+")== false){
            JOptionPane.showMessageDialog(this,"Please, Enter Amount(in numbers)");
            return false;
        }
             
          
        }
        
         
  
        if(ComboModeOP.getSelectedItem().toString().equalsIgnoreCase("DD")){
            if(txtDD.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please, Enter DD Number");
            return false;
            
            
            }
            if(txtBankN.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Please, Enter Bank Name.");  
               return false;
            } 
            
            if(txtAmount.getText().equals("")||txtAmount.getText().matches("[0-9]+")== false){
            JOptionPane.showMessageDialog(this,"Please, Enter Amount(in numbers)");
            return false;
        }
        }
        
       
          
        
            
         if(ComboModeOP.getSelectedItem().toString().equalsIgnoreCase("UPI")){
            if(txtUPI.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Please, Enter UPI ID.");
            return false;
        }
            
            if(txtBankN.getText().equals("")){
               JOptionPane.showMessageDialog(this, "Please, Enter Bank Name.");  
               return false;
            } 
            
              if(txtAmount.getText().equals("")||txtAmount.getText().matches("[0-9]+")== false){
            JOptionPane.showMessageDialog(this,"Please, Enter Amount(in numbers)");
            return false;
        }
                
   }
    
      return true;

    }
    
  
         
  
    
    public void fillComboBox(){
      
        try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fees_managementsystemdb";
            Connection con =  DriverManager.getConnection(url,"root","Khalid@123");
            String sql = "select cname from course";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
             
            ComboBCourse.addItem(rs.getString("cname"));
            
          }
       
           
        }
        catch(Exception e){
            
            e.printStackTrace();
        }
    }
   
     public int getRecieptNo(){
      int rno = 0;
      
        try{
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/fees_managementsystemdb";
            Connection con =  DriverManager.getConnection(url,"root","Khalid@123");
            String sql = "select max(reciept_no) from fees_details";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next() == true){
                rno = rs.getInt(1);
            }
           
       
           
        }
        catch(Exception e){
            
            e.printStackTrace();
        }
        
        return rno;
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
        editcoursepanel = new javax.swing.JPanel();
        lbleditCourse = new javax.swing.JLabel();
        courselistpanel = new javax.swing.JPanel();
        lblcourseList = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        lblDD = new javax.swing.JLabel();
        ComboModeOP = new javax.swing.JComboBox<>();
        lblModeOP = new javax.swing.JLabel();
        lblCheque = new javax.swing.JLabel();
        txtReceiptNo = new javax.swing.JTextField();
        txtCheque = new javax.swing.JTextField();
        lblBank = new javax.swing.JLabel();
        txtToYear = new javax.swing.JTextField();
        lblGSTNO = new javax.swing.JLabel();
        lblReceipt = new javax.swing.JLabel();
        date_C = new com.toedter.calendar.JDateChooser();
        lblDate = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        txtDD = new javax.swing.JTextField();
        lblGST = new javax.swing.JLabel();
        txtBankN = new javax.swing.JTextField();
        lblCourse = new javax.swing.JLabel();
        lblUPI = new javax.swing.JLabel();
        lblUPI2 = new javax.swing.JLabel();
        txtUPI = new javax.swing.JTextField();
        txtfromYr = new javax.swing.JTextField();
        ComboBCourse = new javax.swing.JComboBox<>();
        panel4 = new java.awt.Panel();
        lblReceiver = new javax.swing.JLabel();
        txtReceiverN = new javax.swing.JTextField();
        lblRollNo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        txtsgst = new javax.swing.JTextField();
        txtRollNo = new javax.swing.JTextField();
        txtTotalWords = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtcgst = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        btnPrint = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRemark = new javax.swing.JTextArea();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        txtAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 204));
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

        panel1.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 120, 40));

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

        editcoursepanel.setBackground(new java.awt.Color(0, 51, 51));
        editcoursepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        editcoursepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbleditCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbleditCourse.setForeground(new java.awt.Color(255, 255, 255));
        lbleditCourse.setIcon(new javax.swing.ImageIcon("E:\\Project\\Fees_Management_System\\src\\main\\java\\com\\mycompany\\fees_management_system\\my icons\\edit2.png")); // NOI18N
        lbleditCourse.setText("Edit Course");
        lbleditCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbleditCourseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbleditCourseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbleditCourseMouseExited(evt);
            }
        });
        editcoursepanel.add(lbleditCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panel1.add(editcoursepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 170, -1));

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
        courselistpanel.add(lblcourseList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, -1));

        panel1.add(courselistpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 170, 70));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 290, 640));

        panel2.setBackground(new java.awt.Color(0, 153, 153));
        panel2.setPreferredSize(new java.awt.Dimension(690, 200));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDD.setForeground(new java.awt.Color(255, 255, 255));
        lblDD.setText("DD No");
        panel2.add(lblDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 30));

        ComboModeOP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DD", "CASH", "CHEQUE", "UPI", " " }));
        ComboModeOP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboModeOPActionPerformed(evt);
            }
        });
        panel2.add(ComboModeOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        lblModeOP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModeOP.setForeground(new java.awt.Color(255, 255, 255));
        lblModeOP.setText("Mode of Payment");
        panel2.add(lblModeOP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 30));

        lblCheque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCheque.setForeground(new java.awt.Color(255, 255, 255));
        lblCheque.setText("Cheque No");
        panel2.add(lblCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));

        txtReceiptNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel2.add(txtReceiptNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 120, 30));

        txtCheque.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChequeActionPerformed(evt);
            }
        });
        panel2.add(txtCheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, 30));

        lblBank.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBank.setForeground(new java.awt.Color(255, 255, 255));
        lblBank.setText("Bank Name");
        panel2.add(lblBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 80, 30));

        txtToYear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtToYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToYearActionPerformed(evt);
            }
        });
        panel2.add(txtToYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 50, 30));

        lblGSTNO.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGSTNO.setForeground(new java.awt.Color(255, 255, 255));
        lblGSTNO.setText("AWC568C7R5");
        panel2.add(lblGSTNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 80, 30));

        lblReceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReceipt.setForeground(new java.awt.Color(255, 255, 255));
        lblReceipt.setText("Receipt No");
        panel2.add(lblReceipt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 30));
        panel2.add(date_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 150, 30));

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("Date:");
        panel2.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 50, 30));

        lblTo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTo.setForeground(new java.awt.Color(255, 255, 255));
        lblTo.setText("to");
        panel2.add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 20, 30));

        txtDD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDDActionPerformed(evt);
            }
        });
        panel2.add(txtDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 130, 30));

        lblGST.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGST.setForeground(new java.awt.Color(255, 255, 255));
        lblGST.setText("GSTIN NO");
        panel2.add(lblGST, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 80, 30));

        txtBankN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel2.add(txtBankN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 30));

        lblCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCourse.setForeground(new java.awt.Color(255, 255, 255));
        lblCourse.setText("Course");
        panel2.add(lblCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 60, 30));

        lblUPI.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUPI.setForeground(new java.awt.Color(255, 255, 255));
        lblUPI.setText("UPI ID");
        panel2.add(lblUPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 30));

        lblUPI2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUPI2.setForeground(new java.awt.Color(255, 255, 255));
        lblUPI2.setText("From Year");
        panel2.add(lblUPI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 60, 30));

        txtUPI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel2.add(txtUPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 130, 30));

        txtfromYr.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfromYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfromYrActionPerformed(evt);
            }
        });
        panel2.add(txtfromYr, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 60, 30));

        ComboBCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBCourseActionPerformed(evt);
            }
        });
        panel2.add(ComboBCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 690, 210));

        panel4.setBackground(new java.awt.Color(0, 153, 153));
        panel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReceiver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReceiver.setForeground(new java.awt.Color(255, 255, 255));
        lblReceiver.setText("Recivier Name");
        panel4.add(lblReceiver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        txtReceiverN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        panel4.add(txtReceiverN, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 250, 30));

        lblRollNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRollNo.setForeground(new java.awt.Color(255, 255, 255));
        lblRollNo.setText("ROLL NO");
        panel4.add(lblRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 60, 30));
        panel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));
        panel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));
        panel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total in Words");
        panel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 110, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sr No");
        panel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 50, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Head");
        panel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 40, 30));

        txtCourseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });
        panel4.add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 300, 30));

        txtsgst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsgst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsgstActionPerformed(evt);
            }
        });
        panel4.add(txtsgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 130, 30));

        txtRollNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRollNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRollNoActionPerformed(evt);
            }
        });
        panel4.add(txtRollNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 60, 30));

        txtTotalWords.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTotalWords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalWordsActionPerformed(evt);
            }
        });
        panel4.add(txtTotalWords, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 300, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Amount");
        panel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 60, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CGST 7%");
        panel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 60, 30));

        jSeparator5.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator5.setForeground(new java.awt.Color(255, 51, 51));
        panel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 256, 180, -1));

        jSeparator6.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator6.setForeground(new java.awt.Color(255, 51, 51));
        panel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, 170, 0));

        txtcgst.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcgst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcgstActionPerformed(evt);
            }
        });
        panel4.add(txtcgst, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 130, 30));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("SGST 7%");
        panel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 60, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Remark");
        panel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 50, 30));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        panel4.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 130, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Receiver Signature");
        panel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 130, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Total");
        panel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 50, 30));

        jSeparator7.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator7.setForeground(new java.awt.Color(255, 51, 51));
        panel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 376, 180, 0));

        jSeparator8.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(255, 0, 51));
        panel4.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 690, 0));

        btnPrint.setBackground(new java.awt.Color(0, 51, 51));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panel4.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator9.setForeground(new java.awt.Color(255, 51, 51));
        panel4.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 353, 180, 10));

        txtRemark.setColumns(20);
        txtRemark.setRows(5);
        jScrollPane1.setViewportView(txtRemark);

        panel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 270, 70));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        panel4.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, 690, -1));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        panel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 690, -1));

        txtAmount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        panel4.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 130, 30));

        getContentPane().add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 690, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChequeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChequeActionPerformed

    private void txtDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDDActionPerformed

    private void ComboModeOPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboModeOPActionPerformed
        if(ComboModeOP.getSelectedIndex() == 0) {
            lblDD.setVisible(true);
            txtDD.setVisible(true);
            lblCheque.setVisible(false);
            txtCheque.setVisible(false);
            lblBank.setVisible(true);
            txtBankN.setVisible(true);
            lblUPI.setVisible(false);
            txtUPI.setVisible(false);
            lblReceiver.setVisible(true);
            txtReceiverN.setVisible(true);
        }
        if(ComboModeOP.getSelectedIndex() == 1){
         lblReceiver.setVisible(true);
         txtReceiverN.setVisible(true);
         lblDD.setVisible(false);
         txtDD.setVisible(false);
         lblCheque.setVisible(false);
         txtCheque.setVisible(false);
         lblBank.setVisible(false);
         txtBankN.setVisible(false);
         lblUPI.setVisible(false);
         txtUPI.setVisible(false);
         
        
        }
         if(ComboModeOP.getSelectedIndex() == 2){
             lblCheque.setVisible(true);
             txtCheque.setVisible(true);
             lblBank.setVisible(true);
             txtBankN.setVisible(true);
             lblUPI.setVisible(false);
             txtUPI.setVisible(false);
             lblReceiver.setVisible(true);
             txtReceiverN.setVisible(true);
             lblDD.setVisible(false);
             txtDD.setVisible(false);
           
        } 
         
         if(ComboModeOP.getSelectedIndex() == 3){
             lblUPI.setVisible(true);
             txtUPI.setVisible(true);
             lblCheque.setVisible(false);
             txtCheque.setVisible(false);
             lblBank.setVisible(true);
             txtBankN.setVisible(true);
             lblReceiver.setVisible(true);
             txtReceiverN.setVisible(true);
             lblDD.setVisible(false);
             txtDD.setVisible(false);
           
        } 
         
    }//GEN-LAST:event_ComboModeOPActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if(validation() == true){
         String s = insertData();
         
         if(s.equals("success")){
             
             JOptionPane.showMessageDialog(this,"Record Inserted Successfully.");
             PrintReciept pr = new PrintReciept();
             pr.setVisible(true);
             this.dispose();
         }
         else{
             
             JOptionPane.showMessageDialog(this,"Record Insertion failed");
         }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtCourseNameActionPerformed

    private void txtcgstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcgstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcgstActionPerformed

    private void txtTotalWordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalWordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalWordsActionPerformed

    private void txtRollNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRollNoActionPerformed
      
    }//GEN-LAST:event_txtRollNoActionPerformed

    private void txtsgstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsgstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsgstActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
      String s1 =txtAmount.getText();
       float amt = Float.parseFloat(s1);
       
       float cgst = amt * 0.07f;
       float sgst = amt * 0.07f;
       
       txtcgst.setText(Float.toString(cgst));
       txtsgst.setText(Float.toString(sgst));
       
       float t = amt + cgst + sgst;
       txtTotal.setText(Float.toString(t));
       
       txtTotalWords.setText(NumberToWordsConverter.convert((int)t));
    }//GEN-LAST:event_txtAmountActionPerformed

    private void lbllogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseEntered
        Color clr = new Color(0,153,153);
        logoutpanel.setBackground(clr);
    }//GEN-LAST:event_lbllogoutMouseEntered

    private void lbllogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseExited
        Color clr = new Color(0,51,51);
        logoutpanel.setBackground(clr);
    }//GEN-LAST:event_lbllogoutMouseExited

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

    private void lbleditCourseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbleditCourseMouseEntered
         Color clr = new Color(0,153,153);
      editcoursepanel.setBackground(clr);
    }//GEN-LAST:event_lbleditCourseMouseEntered

    private void lbleditCourseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbleditCourseMouseExited
       Color clr = new Color(0,51,51);
       editcoursepanel.setBackground(clr);
    }//GEN-LAST:event_lbleditCourseMouseExited

    private void lblcourseListMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcourseListMouseEntered
         Color clr = new Color(0,153,153);
     courselistpanel.setBackground(clr);
    }//GEN-LAST:event_lblcourseListMouseEntered

    private void lblcourseListMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcourseListMouseExited
       Color clr = new Color(0,51,51);
       courselistpanel.setBackground(clr);
    }//GEN-LAST:event_lblcourseListMouseExited

    private void lblhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhomeMouseClicked
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblhomeMouseClicked

    private void ComboBCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBCourseActionPerformed
            txtCourseName.setText(ComboBCourse.getSelectedItem().toString());
    }//GEN-LAST:event_ComboBCourseActionPerformed

    private void lblsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsearchMouseClicked
       SearchRecord sr = new SearchRecord();
       sr.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblsearchMouseClicked

    private void lbleditCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbleditCourseMouseClicked
       EditCourse ec = new EditCourse();
       ec.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lbleditCourseMouseClicked

    private void txtToYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToYearActionPerformed

    private void txtfromYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfromYrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfromYrActionPerformed

    private void lbllogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllogoutMouseClicked
       SignUp su = new SignUp();
       su.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lbllogoutMouseClicked

    private void lblcourseListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcourseListMouseClicked
        ViewAllRecord vr = new ViewAllRecord();
        vr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblcourseListMouseClicked

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
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBCourse;
    private javax.swing.JComboBox<String> ComboModeOP;
    private javax.swing.JButton btnPrint;
    private javax.swing.JPanel courselistpanel;
    private com.toedter.calendar.JDateChooser date_C;
    private javax.swing.JPanel editcoursepanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblBank;
    private javax.swing.JLabel lblCheque;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblDD;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblGST;
    private javax.swing.JLabel lblGSTNO;
    private javax.swing.JLabel lblModeOP;
    private javax.swing.JLabel lblReceipt;
    private javax.swing.JLabel lblReceiver;
    private javax.swing.JLabel lblRollNo;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblUPI;
    private javax.swing.JLabel lblUPI2;
    private javax.swing.JLabel lblcourseList;
    private javax.swing.JLabel lbleditCourse;
    private javax.swing.JLabel lblhome;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblsearch;
    private javax.swing.JPanel logoutpanel;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel4;
    private javax.swing.JPanel searchpanel;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBankN;
    private javax.swing.JTextField txtCheque;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtDD;
    private javax.swing.JTextField txtReceiptNo;
    private javax.swing.JTextField txtReceiverN;
    private javax.swing.JTextArea txtRemark;
    private javax.swing.JTextField txtRollNo;
    private javax.swing.JTextField txtToYear;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalWords;
    private javax.swing.JTextField txtUPI;
    private javax.swing.JTextField txtcgst;
    private javax.swing.JTextField txtfromYr;
    private javax.swing.JTextField txtsgst;
    // End of variables declaration//GEN-END:variables

    private void JOptionPane() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

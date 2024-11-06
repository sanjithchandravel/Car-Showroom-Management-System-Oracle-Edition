/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Sanjith
 */

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
public class UpdateUser extends javax.swing.JFrame {


    /**
     * Creates new form Register
     * @param User
     */
    public UpdateUser(String User) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,(int)dim.getWidth(), (int)dim.getHeight());
        jLabel5.setText(User);
         setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         setExtendedState(MAXIMIZED_BOTH);
        //setResizable(false);
        //Color c = new Color(255, 255, 255, 100);
        //j11.setBackground(c);
        //j11.setOpaque(true);
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system", "sanjith23");
            //JOptionPane.showMessageDialog(null,"Connected");
            Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);   
            ResultSet  rs = stmt.executeQuery("select * FROM client");
            int i = 0;
            while(rs.next())
            {
                String s1 = rs.getString("cid");
                if(s1.equals(User))
                {
                    jDateChooser1.setDate(rs.getDate("dob"));
                    String s13 = rs.getString("cname");
                    jLabel4.setText(s13);
                    String s14 = rs.getString("State");
                    jTextField1.setText(s14);
                    String s2 = rs.getString("Address");
                    ta1.setText(s2);
                    String s3 = rs.getString("City");
                    t2.setText(s3);
                    String s4 = rs.getString("MobileNo");
                    t4.setText(s4);
                    String s5 = rs.getString("EmailId");
                    t5.setText(s5);
                    String s6 = rs.getString("pincode");
                    t3.setText(s6);
                    i++;
                }
                /*else
                {
                    JOptionPane.showMessageDialog(null,"Error");
                }*/
            
            }
            if(i==0)
            {
                this.dispose();
                JOptionPane.showMessageDialog(null,"Error");
            }
            rs.close();
            stmt.close();

        }
        catch(ClassNotFoundException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }
       catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
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

        jLabel1 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        c1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        l10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Updation Form");
        jLabel1.setMaximumSize(new java.awt.Dimension(114, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 250, 38));

        l1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 0, 0));
        l1.setText("Client ID");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 117, -1));

        l2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 0, 0));
        l2.setText("Address");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        l3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 0, 0));
        l3.setText("City");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 45, -1));

        l4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 0, 0));
        l4.setText("MobileNo");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, -1));

        l5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 0, 0));
        l5.setText("EmailID");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, 34));

        b1.setBackground(new java.awt.Color(255, 0, 0));
        b1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Update");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 710, 158, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ZIP");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 37, -1));

        t2.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 143, -1));

        t4.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 143, -1));

        t5.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 190, -1));

        t3.setForeground(new java.awt.Color(255, 0, 0));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        getContentPane().add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 93, 30));

        ta1.setColumns(20);
        ta1.setForeground(new java.awt.Color(255, 0, 0));
        ta1.setRows(5);
        jScrollPane2.setViewportView(ta1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 352, 33));

        c1.setForeground(new java.awt.Color(255, 0, 0));
        c1.setText("Accept terms & conditions");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 670, 173, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("XXXXX");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 140, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Client Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("XXXXXXX");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("State");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("DOB");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 160, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 150, -1));

        l10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sanjith\\Downloads\\speedometer.jpg")); // NOI18N
        getContentPane().add(l10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
             // TODO add your handling code here:
        
        try 
        {
            boolean i=true;
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XE", "system", "sanjith23");
            Statement stmt = con.createStatement(); 
            //String user = jLabel5.getText();
              Pattern p = Pattern.compile("^\\d{10}$");
            Matcher m = p.matcher(t4.getText());
            System.out.println(m.matches());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String text4 = sdf.format(jDateChooser1.getDate());
            
            if (ta1.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Enter a valid Address", "Error", JOptionPane.ERROR_MESSAGE);
                 i=false;
                
                
                
            }
         
            
            else if (t2.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Enter a valid City", "Error", JOptionPane.ERROR_MESSAGE);
                 i=false;
               
                
            }
            else  if (t3.getText().length()!= 6)
            {
                JOptionPane.showMessageDialog(null, "Enter a valid ZIP", "Error", JOptionPane.ERROR_MESSAGE);
                 i=false;
                
                
            }
            else  if (t4.getText().length() != 10 || !m.matches())
            {
                JOptionPane.showMessageDialog(null, "Enter a valid Mobile no ", "Error", JOptionPane.ERROR_MESSAGE);
          
                 i=false;
                
            }
            else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", t5.getText()))) 
            {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            i=false;
            }
            if(c1.isSelected() && i)
            {
                String q1 = "UPDATE client SET Address='"+ta1.getText()+"',City = '"+t2.getText()+"',pincode ='"+t3.getText()+"',MobileNo='"+t4.getText()+"',EmailId = '"+t5.getText()+"',state='"+jTextField1.getText()+"',dob= date '"+text4+"'where cid = '"+jLabel5.getText()+"'";
                stmt.executeUpdate(q1);
                JOptionPane.showMessageDialog(null,"Updated");
                //new Loginpage(user).setVisible(true);
                this.dispose();
            }
            else if(!c1.isSelected())
            {
                JOptionPane.showMessageDialog(null,"Accept Terms and Condition");
            }
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Username is already taken");
            System.out.println(e);
        }
        catch(ClassNotFoundException e)
        {
          JOptionPane.showMessageDialog(null,"Not Connected");
        }

    }//GEN-LAST:event_b1ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
             if(c1.isSelected())
        {
         JOptionPane.showInternalMessageDialog(null,"On registration, we expect you to provide our showroom with an accurate and complete information of the compulsory fields.\nWe also expect you to keep the information secure, specifically access passwords and payment information. \nKindly update the information periodically to keep your account relevant.\nShowroom will guarantee with your details","Terms & Condtions",INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_c1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JCheckBox c1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables
}

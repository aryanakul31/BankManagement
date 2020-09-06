package Layouts;

import static Layouts.NewConnection.newConnection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    Connection con;
    static String username,password;
    public Home() throws IOException {
        initComponents();     
        facility.setVisible(false);
        setIconImage(ImageIO.read(getClass().getResource("/Resources/lock.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ResetBtn = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        facility = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank Management");
        setResizable(false);

        jPanel1.setLayout(null);

        ResetBtn.setBackground(new java.awt.Color(255, 255, 255));
        ResetBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ResetBtn);
        ResetBtn.setBounds(560, 500, 110, 25);

        txt_password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(txt_password);
        txt_password.setBounds(470, 440, 200, 23);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(380, 400, 62, 17);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 450, 56, 17);

        txt_username.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(txt_username);
        txt_username.setBounds(470, 400, 200, 23);

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn);
        loginBtn.setBounds(460, 500, 80, 25);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1360, 720);

        jMenuBar1.setBackground(new java.awt.Color(237, 146, 30));

        jMenu1.setText("Options");

        jMenuItem2.setText("New Account");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem7.setText("Forgot Password");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        facility.setText("Facilities");
        facility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facilityActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Withdraw");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        facility.add(jMenuItem3);

        jMenuItem4.setText("Deposit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        facility.add(jMenuItem4);

        jMenuItem9.setText("Transactions");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem9MouseClicked(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        facility.add(jMenuItem9);

        jMenuItem5.setText("Change Password");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        facility.add(jMenuItem5);

        jMenuItem6.setText("Delete Account");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        facility.add(jMenuItem6);

        jMenuItem8.setText("Log Out");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        facility.add(jMenuItem8);

        jMenuBar1.add(facility);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1318, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        txt_password.setText("");
        txt_username.setText("");
        facility.setVisible(false);
        username=null;
        password=null;
        ResetBtn.setText("Reset");
        jMenuItem7.setVisible(true);
        facility.setVisible(false);
        jMenuItem2.setVisible(true);
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
                        
        PasswordConverter pc=new PasswordConverter();
        username=txt_username.getText();
        password=pc.md5(String.valueOf(txt_password.getPassword()));
        try {            
            String query="select user_id ,password from newaccount where user_id='" +username+ "' and password='"+password+"'";
            con=newConnection();            
            if(username.equals("")||password.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please Fill All the Details");            
        }
        else
        {
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);            
            if(rs.next())
            {
             JOptionPane.showMessageDialog(this,"Welcome User");
             Data.user_id=username;
             txt_password.setText("");
             txt_username.setText("");
             jMenuItem7.setVisible(false);
             facility.setVisible(true);
             jMenuItem2.setVisible(false);
             ResetBtn.setText("Log Out");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid User");
            }
        }   
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,"Driver Error"+ ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,ex.toString());
        }      
    }//GEN-LAST:event_loginBtnActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            new NewAccount().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        try {
            new Recovery().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        
        jMenuItem7.setVisible(true);
        jMenuItem2.setVisible(true);
        txt_password.setText("");
        txt_username.setText("");// TODO add your handling code here:
        facility.setVisible(false);
        username=null;
        password=null;
        ResetBtn.setText("Reset");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       try {
            new WithDrawal().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    try {
            new ChangePass().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    
        try {
            new DeleteAccount().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        facility.setVisible(false);       

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void facilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facilityActionPerformed
        try {
            new WithDrawal().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_facilityActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
    try {
            new Deposit().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MouseClicked
        
    }//GEN-LAST:event_jMenuItem9MouseClicked

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        JOptionPane.showMessageDialog(this,"Opening Transactions...");
        new Transaction().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Home().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ResetBtn;
    private javax.swing.JMenu facility;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables

}

package Layouts;

import static Layouts.NewConnection.newConnection;
import java.io.IOException;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class WithDrawal extends javax.swing.JFrame {
        Home obj;
        String username=Home.username;
        static int Balance;
        
    public WithDrawal() throws IOException {
        this.obj = new Home();
        initComponents();
        setIconImage(ImageIO.read(getClass().getResource("/Resources/withdraw.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deposit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        WITHDRAW = new javax.swing.JButton();
        balance = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(290, 80));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WITHDRAWAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel5)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel1.setText("Current Balance");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel2.setText("Amount To Be Withdrawn");

        deposit.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        WITHDRAW.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        WITHDRAW.setText("WITHDRAW");
        WITHDRAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWActionPerformed(evt);
            }
        });

        balance.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(deposit, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(WITHDRAW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(87, 87, 87))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(deposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(WITHDRAW))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void WITHDRAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWActionPerformed

        try {
            Connection con;
            con=newConnection();
            String query1,query2;
            query1="select amount from newaccount where user_id='"+username+"'";
            PreparedStatement ps=con.prepareStatement(query1);
            ResultSet rs=ps.executeQuery(query1);
            if(rs.next())
            {
            Balance=Integer.parseInt(rs.getString(1));
            }
            if(!(deposit.getText()).equals("")&&Integer.parseInt(deposit.getText())<Balance)
            {
                Random rand = new Random();
                int id=rand.nextInt(1000);
                int amt=Balance-Integer.parseInt(deposit.getText());
                query2="update newaccount set amount='"+amt +"'where user_id='"+username+"'";
                String query_transaction="insert into transcations values (?,?,?,?)";
                PreparedStatement ps_t=con.prepareStatement(query_transaction);
                ps_t.setString(1,Data.user_id);
                ps_t.setString(2,String.valueOf(id));                
                ps_t.setString(3,deposit.getText());
                ps_t.setString(4,"WITHDRAW");
                int row1=ps_t.executeUpdate();
                int row=ps.executeUpdate(query2);
                if(row>0&&row1>0)
                {
                    JOptionPane.showMessageDialog(this,"Money Withdrawed");
                    setVisible(false);
                }
            }
            else if(Integer.parseInt(deposit.getText())<Balance)
            {
                JOptionPane.showMessageDialog(this,"Please Enter Amount less than the Balance");               
            }
            else
                JOptionPane.showMessageDialog(this,"Enter Deposit Amount");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this,"Class Error"+ex.toString());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Error"+ex.toString());
        }

    }//GEN-LAST:event_WITHDRAWActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
            
            try {
                Connection con;
                con=newConnection();
                String query="select amount from newaccount where user_id='"+username+"'";               
                PreparedStatement ps=con.prepareStatement(query);
                ResultSet rs=ps.executeQuery(query);
                if(rs.next())
                {
                    balance.setText(rs.getString(1));
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(WithDrawal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(WithDrawal.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_formWindowActivated
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WithDrawal().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(WithDrawal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton WITHDRAW;
    private javax.swing.JLabel balance;
    private javax.swing.JTextField deposit;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

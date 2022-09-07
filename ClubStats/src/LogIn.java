
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        
    }
 /*   void login()
    {
        boolean flag = false;
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OECCDJF\\SQLEXPRESS;databaseName=RMS","sa","alphacoders4T4");
                Connection conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433; databaseName=clubstats; user=sa; password=123456");
                Statement stmt = conn.createStatement();
                String qrry;
                qrry = "select * from signup WHERE u_name = '"+luname.getText()+"' AND pswrd = '"+lpass.getText()+"'";
                ResultSet rs = stmt.executeQuery(qrry);
                while(rs.next()){
                   flag=true;
                   //String NAME = rs.getString("NAME");
                   //JOptionPane.showMessageDialog(rootPane,NAME);
                }
                if(flag){
                    JOptionPane.showMessageDialog(null, "Successfully Logged In (^_*)");
                    //System.out.print(qrry);
                   Home TEMP = new Home();
                    TEMP.setVisible(true);
                   dispose();
                   
                   UserId tmp= new UserId();
                   tmp.setterID(luname.getText());
                    
                    }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid User-ID or Password (o_O) ");
                    //System.out.print(qrry);
                    }
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in Connectivity "+ex);
                }
    }
    */
    
     void logincombo()
    {
        boolean flag = false;
        String logtype=ltype.getSelectedItem().toString();
        if("Admin".equals(logtype))
        {
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OECCDJF\\SQLEXPRESS;databaseName=RMS","sa","alphacoders4T4");
                Connection conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433; databaseName=clubstats; user=sa; password=123456");
                Statement stmt = conn.createStatement();
                String qrry;
                qrry = "select * from signup WHERE u_name = '"+luname.getText()+"' AND pswrd = '"+lpass.getText()+"'";
                ResultSet rs = stmt.executeQuery(qrry);
                while(rs.next()){
                   flag=true;
                   //String NAME = rs.getString("NAME");
                   //JOptionPane.showMessageDialog(rootPane,NAME);
                }
                if(flag){
                    JOptionPane.showMessageDialog(null, "Successfully Logged In (^_*)");
                    //System.out.print(qrry);
                   Home TEMP = new Home();
                    TEMP.setVisible(true);
                   dispose();
                   
                   UserId tmp= new UserId();
                   tmp.setterID(luname.getText());
                    
                    }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid User-ID or Password (o_O) ");
                    //System.out.print(qrry);
                    }
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in Connectivity "+ex);
                }
    }
       else if("Player/Stuff".equals(logtype))
        {
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OECCDJF\\SQLEXPRESS;databaseName=RMS","sa","alphacoders4T4");
                Connection conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433; databaseName=clubstats; user=sa; password=123456");
                Statement stmt = conn.createStatement();
                String qrry;
                qrry = "select * from PlayerStuff INNER JOIN player ON  PlayerStuff.uid=player.playerid AND PlayerStuff.uid = '"+luid.getText()+"' AND PlayerStuff.username = '"+luname.getText()+"' AND PlayerStuff.password = '"+lpass.getText()+"'";
                ResultSet rs = stmt.executeQuery(qrry);
                while(rs.next()){
                   flag=true;
                   //String NAME = rs.getString("NAME");
                   //JOptionPane.showMessageDialog(rootPane,NAME);
                }
                if(flag){
                    JOptionPane.showMessageDialog(null, "Successfully Logged In (^_*)");
                    //System.out.print(qrry);
                   PSHome TEMP1 = new PSHome();
                    TEMP1.setVisible(true);
                   dispose();
                   
                   UserId tmp= new UserId();
                   tmp.setterID(luname.getText());
                    
                    }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid User-ID or Password (o_O) ");
                    //System.out.print(qrry);
                    }
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in Connectivity "+ex);
                }
    }
    }
     void login()
     {
         
     }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        luname = new javax.swing.JTextField();
        lpass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        ltype = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        luid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("ClubStats");

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel4.setText("Username:");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel7.setText("Password:");

        jButton1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton1.setText("LogIn");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel8.setText("Don't have an account!!!");

        jButton2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton2.setText("SignUp");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ltype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Player/Stuff" }));
        ltype.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 16))); // NOI18N
        ltype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltypeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel5.setText("ID:");

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel9.setText("Not for Admin!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(luname, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lpass, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(luid, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 76, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel8)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ltype, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(luid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(ltype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        logincombo();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        signup su= new signup();
        su.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ltypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltypeActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lpass;
    private javax.swing.JComboBox<String> ltype;
    private javax.swing.JTextField luid;
    private javax.swing.JTextField luname;
    // End of variables declaration//GEN-END:variables
}

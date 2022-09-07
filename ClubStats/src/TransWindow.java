
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shree
 */
public class TransWindow extends javax.swing.JFrame {

    /**
     * Creates new form TransWindow
     */
    private String name;
    private String position;
    private String age;
    private String sex;
    private String weight;
    private String height;
    private String nationality;
    private String rating;
    private String playerid;
    private String salary;
    private String value;
    
    
    public TransWindow() {
        initComponents();
        distableplayer();
        distableplayer2();
    }
     void insert_player(){
         
       try{
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://shovon\\SQLEXPRESS:1433;databaseName=clubstats","sa","123456");
            Statement stmt = (Statement) conn.createStatement();
            String qrry;
            qrry = "INSERT INTO TansPlayer VALUES("+"'"+pname.getText()+"'"+","+"'"+ppos.getSelectedItem().toString()+"'"+","+"'"+page.getText()+"'"+","+"'"+psex.getSelectedItem().toString()+"'"+","+"'"+pwt.getText()+"'"+","+"'"+pht.getText()+"'"+","+"'"+pnty.getText()+"'"+","+"'"+prtng.getText()+"'"+","+"'"+pid.getText()+"'"+","+"'"+psalary.getText()+"'"+","+"'"+pprice.getText()+"'"+");";
            boolean gotResults=stmt.execute(qrry);
            ResultSet rs = null;
            if(!gotResults){
                System.out.println("No results returned");
            }
            else {
                rs = stmt.getResultSet();
                }
            
            JOptionPane.showMessageDialog(rootPane,"data inserted");
            //tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid});
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(rootPane,ex);
        }
       distableplayer();
      clrtxtfld();
       
    }
       void clrtxtfld()
     {
          pname.setText("");
      // ppos.setText("");
       page.setText("");
       //psex.setText("");
       pwt.setText("");
       pht.setText("");
       pnty.setText("");
       prtng.setText("");
       pid.setText("");
       psalary.setText("");
       pprice.setText("");
     }
       void distableplayer()
     {
         DefaultTableModel tb1Model = (DefaultTableModel)transtable.getModel();
                   tb1Model.setRowCount(0);
                   // boolean flag = false;
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OECCDJF\\SQLEXPRESS;databaseName=RMS","sa","alphacoders4T4");
                Connection conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433; databaseName=clubstats; user=sa; password=123456");
                Statement stmt = conn.createStatement();
                String qrry;
                qrry = "select * from TansPlayer"; 
                ResultSet rs = stmt.executeQuery(qrry);
                while(rs.next()){
                   String pname=rs.getString("player_name");
                   //System.out.println(pname);
                   
                   String ppos=rs.getString("position");
                   String page=rs.getString("age");
                   String psex=rs.getString("sex");
                   String pwt=rs.getString("weight");
                   String pht=rs.getString("height");
                   String pnty=rs.getString("nationality");
                   String prtng=rs.getString("rating");
                   String pid=rs.getString("playerid");
                   //String psal=rs.getString("salary");
                   String psal=rs.getString("salary");
                   String pprice=rs.getString("value");
                  
                   
                   
                   //flag=true;
                   //String NAME = rs.getString("NAME");
                   //JOptionPane.showMessageDialog(rootPane,NAME);
                   tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid,psal,pprice});
                }
               
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in Connectivity "+ex);
                }
     }
         void transreadplayer()
     {
        // DefaultTableModel tb1Model = (DefaultTableModel)transtable.getModel();
                  // tb1Model.setRowCount(0);
                   // boolean flag = false;
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OECCDJF\\SQLEXPRESS;databaseName=RMS","sa","alphacoders4T4");
                Connection conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433; databaseName=clubstats; user=sa; password=123456");
                Statement stmt = conn.createStatement();
                String qrry;
                qrry = "select * from TansPlayer where playerid = '"+pid.getText()+"'";
                ResultSet rs = stmt.executeQuery(qrry);
                while(rs.next()){
                  name=rs.getString("player_name");
                   //System.out.println(pname);
                   
                   position=rs.getString("position");
                   age=rs.getString("age");
                   sex=rs.getString("sex");
                   weight=rs.getString("weight");
                   height=rs.getString("height");
                   nationality=rs.getString("nationality");
                   rating=rs.getString("rating");
                   playerid=rs.getString("playerid");
                   //String psal=rs.getString("salary");
                   salary=rs.getString("salary");
                    value=rs.getString("value");
                  System.out.println(playerid);
                   
                   
                   //flag=true;
                   //String NAME = rs.getString("NAME");
                   //JOptionPane.showMessageDialog(rootPane,NAME);
                  // tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid,psal});
                }
               
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in Connectivity "+ex);
                }
        teaminsertplayer();
     }
       
              void teamreadplayer()
     {
        // DefaultTableModel tb1Model = (DefaultTableModel)transtable.getModel();
                  // tb1Model.setRowCount(0);
                   // boolean flag = false;
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OECCDJF\\SQLEXPRESS;databaseName=RMS","sa","alphacoders4T4");
                Connection conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433; databaseName=clubstats; user=sa; password=123456");
                Statement stmt = conn.createStatement();
                String qrry;
                qrry = "select * from player where playerid = '"+pid.getText()+"'"; 
                ResultSet rs = stmt.executeQuery(qrry);
                while(rs.next()){
                  name=rs.getString("player_name");
                   //System.out.println(pname);
                    
                   position=rs.getString("position");
                   age=rs.getString("age");
                   sex=rs.getString("sex");
                   weight=rs.getString("weight");
                   height=rs.getString("height");
                   nationality=rs.getString("nationality");
                   rating=rs.getString("rating");
                   playerid=rs.getString("playerid");
                   //String psal=rs.getString("salary");
                   salary=rs.getString("salary");
                   value=rs.getString("value");
                   System.out.println(playerid);
                   
                   
                   //flag=true;
                   //String NAME = rs.getString("NAME");
                   //JOptionPane.showMessageDialog(rootPane,NAME);
                  // tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid,psal});
                }
               
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in Connectivity "+ex);
                }
        transinsertplayer();
     }
                  void transdeleteplayer(){
         
       try{
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://shovon\\SQLEXPRESS:1433;databaseName=clubstats","sa","123456");
            Statement stmt = (Statement) conn.createStatement();
            String qrry;
            //qrry = "INSERT INTO player VALUES("+"'"+pname.getText()+"'"+","+"'"+ppos.getSelectedItem().toString()+"'"+","+"'"+page.getText()+"'"+","+"'"+psex.getSelectedItem().toString()+"'"+","+"'"+pwt.getText()+"'"+","+"'"+pht.getText()+"'"+","+"'"+pnty.getText()+"'"+","+"'"+prtng.getText()+"'"+","+"'"+pid.getText()+"'"+","+"'"+psalary.getText()+"'"+");";
            qrry= "Delete from TansPlayer where playerid = "+"'"+playerid+"'; ";
            boolean gotResults=stmt.execute(qrry);
            ResultSet rs = null;
            if(!gotResults){
                System.out.println("No results returned");
            }
            else {
                rs = stmt.getResultSet();
                }
            
            JOptionPane.showMessageDialog(rootPane,"data deleted");
            //tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid});
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     }
                      void teamdeleteplayer(){
         
       try{
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://shovon\\SQLEXPRESS:1433;databaseName=clubstats","sa","123456");
            Statement stmt = (Statement) conn.createStatement();
            String qrry;
            //qrry = "INSERT INTO player VALUES("+"'"+pname.getText()+"'"+","+"'"+ppos.getSelectedItem().toString()+"'"+","+"'"+page.getText()+"'"+","+"'"+psex.getSelectedItem().toString()+"'"+","+"'"+pwt.getText()+"'"+","+"'"+pht.getText()+"'"+","+"'"+pnty.getText()+"'"+","+"'"+prtng.getText()+"'"+","+"'"+pid.getText()+"'"+","+"'"+psalary.getText()+"'"+");";
            qrry= "Delete from player where playerid = "+"'"+playerid+"'; ";
            boolean gotResults=stmt.execute(qrry);
            ResultSet rs = null;
            if(!gotResults){
                System.out.println("No results returned");
            }
            else {
                rs = stmt.getResultSet();
                }
            
            JOptionPane.showMessageDialog(rootPane,"data deleted");
            //tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid});
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(rootPane,ex);
        }
     }
                       void transinsertplayer(){
         
       try{
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://shovon\\SQLEXPRESS:1433;databaseName=clubstats","sa","123456");
            Statement stmt = (Statement) conn.createStatement();
            String qrry;
            qrry = "INSERT INTO TansPlayer VALUES("+"'"+name+"'"+","+"'"+position+"'"+","+"'"+age+"'"+","+"'"+sex+"'"+","+"'"+weight+"'"+","+"'"+height+"'"+","+"'"+nationality+"'"+","+"'"+rating+"'"+","+"'"+playerid+"'"+","+"'"+salary+"'"+","+"'"+value+"'"+");";
          

            //qrry = "INSERT INTO TansWindow VALUES("+"'"+pname.getText()+"'"+","+"'"+ppos.getSelectedItem().toString()+"'"+","+"'"+page.getText()+"'"+","+"'"+psex.getSelectedItem().toString()+"'"+","+"'"+pwt.getText()+"'"+","+"'"+pht.getText()+"'"+","+"'"+pnty.getText()+"'"+","+"'"+prtng.getText()+"'"+","+"'"+pid.getText()+"'"+","+"'"+psalary.getText()+"'"+");";
            boolean gotResults=stmt.execute(qrry);
            ResultSet rs = null;
            if(!gotResults){
                System.out.println("No results returned");
            }
            else {
                rs = stmt.getResultSet();
                }
            
            JOptionPane.showMessageDialog(rootPane,"data inserted");
            //tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid});
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(rootPane,ex);
        }
       distableplayer();
      clrtxtfld();
       
    }
    void teaminsertplayer(){
         
       try{
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://shovon\\SQLEXPRESS:1433;databaseName=clubstats","sa","123456");
            Statement stmt = (Statement) conn.createStatement();
            String qrry;
            qrry = "INSERT INTO player VALUES("+"'"+name+"'"+","+"'"+position+"'"+","+"'"+age+"'"+","+"'"+sex+"'"+","+"'"+weight+"'"+","+"'"+height+"'"+","+"'"+nationality+"'"+","+"'"+rating+"'"+","+"'"+playerid+"'"+","+"'"+salary+"'"+","+"'"+value+"'"+");";
            boolean gotResults=stmt.execute(qrry);
            ResultSet rs = null;
            if(!gotResults){
                System.out.println("No results returned");
            }
            else {
                rs = stmt.getResultSet();
                }
            
            JOptionPane.showMessageDialog(rootPane,"data inserted");
            //tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid});
            
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(rootPane,ex);
        }
      
       
    }
         void distableplayer2()
     {
         DefaultTableModel tb1Model = (DefaultTableModel)playertable2.getModel();
                   tb1Model.setRowCount(0);
                   // boolean flag = false;
        try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
               //Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-OECCDJF\\SQLEXPRESS;databaseName=RMS","sa","alphacoders4T4");
                Connection conn = DriverManager.getConnection ("jdbc:sqlserver://localhost:1433; databaseName=clubstats; user=sa; password=123456");
                Statement stmt = conn.createStatement();
                String qrry;
                qrry = "select * from player"; 
                ResultSet rs = stmt.executeQuery(qrry);
                while(rs.next()){
                   String pname=rs.getString("player_name");
                   //System.out.println(pname);
                   
                   String ppos=rs.getString("position");
                   String page=rs.getString("age");
                   String psex=rs.getString("sex");
                   String pwt=rs.getString("weight");
                   String pht=rs.getString("height");
                   String pnty=rs.getString("nationality");
                   String prtng=rs.getString("rating");
                   String pid=rs.getString("playerid");
                   //String psal=rs.getString("salary");
                   String psal=rs.getString("salary");
                   String pval=rs.getString("value");
                   
                   
                   
                   //flag=true;
                   //String NAME = rs.getString("NAME");
                   //JOptionPane.showMessageDialog(rootPane,NAME);
                   tb1Model.addRow(new Object[]{pname,ppos,page,psex,pwt,pht,pnty,prtng,pid,psal,pval});
                }
               
            }catch(HeadlessException | ClassNotFoundException | SQLException ex){
                JOptionPane.showMessageDialog(null,"Error in Connectivity "+ex);
                }
     }
           void distextfield()
     {
         int row = transtable.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel)transtable.getModel();
        pname.setText(model.getValueAt(row,0).toString());
        String post= model.getValueAt(row,1).toString();
        for(int i=0;i<ppos.getItemCount();i++){
            if(ppos.getItemAt(i).toString().equalsIgnoreCase(post)){
                ppos.setSelectedIndex(i);
            }
        }
        page.setText(model.getValueAt(row,2).toString());
        String pagge=(model.getValueAt(row,3).toString());
        for(int i=0;i<psex.getItemCount();i++){
            if(psex.getItemAt(i).toString().equalsIgnoreCase(pagge)){
                psex.setSelectedIndex(i);
            }
        }
        pwt.setText(model.getValueAt(row,4).toString());
        pht.setText(model.getValueAt(row,5).toString());
         pnty.setText(model.getValueAt(row,6).toString());
          prtng.setText(model.getValueAt(row,7).toString());
           pid.setText(model.getValueAt(row,8).toString());
            psalary.setText(model.getValueAt(row,9).toString());
             pprice.setText(model.getValueAt(row,10).toString());
     }
                      void distextfield2()
     {
         int row = playertable2.getSelectedRow();
        DefaultTableModel model =(DefaultTableModel)playertable2.getModel();
        pname.setText(model.getValueAt(row,0).toString());
        String post= model.getValueAt(row,1).toString();
        for(int i=0;i<ppos.getItemCount();i++){
            if(ppos.getItemAt(i).toString().equalsIgnoreCase(post)){
                ppos.setSelectedIndex(i);
            }
        }
        page.setText(model.getValueAt(row,2).toString());
        String pagge=(model.getValueAt(row,3).toString());
        for(int i=0;i<psex.getItemCount();i++){
            if(psex.getItemAt(i).toString().equalsIgnoreCase(pagge)){
                psex.setSelectedIndex(i);
            }
        }
        pwt.setText(model.getValueAt(row,4).toString());
        pht.setText(model.getValueAt(row,5).toString());
         pnty.setText(model.getValueAt(row,6).toString());
          prtng.setText(model.getValueAt(row,7).toString());
           pid.setText(model.getValueAt(row,8).toString());
            psalary.setText(model.getValueAt(row,9).toString());
           
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
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        transtable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        page = new javax.swing.JTextField();
        psex = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pwt = new javax.swing.JTextField();
        ppos = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pht = new javax.swing.JTextField();
        psalary = new javax.swing.JTextField();
        pnty = new javax.swing.JTextField();
        prtng = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        playertable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        pprice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("ClubStats");

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(361, 361, 361)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        transtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Position", "Age", "Sex", "Weight", "Height", "Nationality", "Rating", "Id", "Salary", "Price"
            }
        ));
        transtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(transtable);

        jLabel3.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel3.setText("Player for Transfer:");

        jLabel10.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel10.setText("player_id:");

        psex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel4.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel4.setText("Player Name:");

        jLabel5.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel5.setText("Position:");

        jLabel6.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel6.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel7.setText("Gender:");

        jLabel8.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel8.setText("Weight:");

        jLabel9.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel9.setText("Height:");

        jLabel11.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel11.setText("Rating:");

        ppos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L Forward", "R Forward", "C Forward", "L Mid-field", "C Mid-field", "R Mid-field", "L Defense", "R Defense", "C Defense", " " }));

        jLabel12.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel12.setText("Nationality:");

        jLabel13.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel13.setText("Player Salary:");

        playertable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Position", "Age", "Sex", "Weight", "Height", "Nationality", "Rating", "Id", "Salary"
            }
        ));
        playertable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playertable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(playertable2);

        jLabel14.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel14.setText("Our Players:");

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jButton4.setText("Buy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jButton5.setText("Sell");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Courier New", 0, 24)); // NOI18N
        jLabel15.setText("Price:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pname)
                                .addComponent(pwt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pht, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(prtng, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pnty)
                                .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(psex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ppos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(psalary, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pprice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ppos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(psex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(pwt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(pht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pnty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(prtng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(psalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(pprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transtableMouseClicked
        // TODO add your handling code here:
        distextfield();
    }//GEN-LAST:event_transtableMouseClicked

    private void playertable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playertable2MouseClicked
        // TODO add your handling code here:
        distextfield2();
    }//GEN-LAST:event_playertable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       // insert_Tournament();
       insert_player();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //read from table a
        // delete from table a;
        // insert to table b;
        transreadplayer();
        //teaminsertplayer();
        transdeleteplayer();
        distableplayer();
        distableplayer2();
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        teamreadplayer();
        teamdeleteplayer();
        //transinsertplayer();
        distableplayer();
        distableplayer2();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        clrtxtfld();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //close();
        Home pht= new Home();
        pht.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(TransWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField page;
    private javax.swing.JTextField pht;
    private javax.swing.JTextField pid;
    private javax.swing.JTable playertable2;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pnty;
    private javax.swing.JComboBox<String> ppos;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField prtng;
    private javax.swing.JTextField psalary;
    private javax.swing.JComboBox<String> psex;
    private javax.swing.JTextField pwt;
    private javax.swing.JTable transtable;
    // End of variables declaration//GEN-END:variables
}

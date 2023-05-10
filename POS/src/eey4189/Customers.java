/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eey4189;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author user
 */
public class Customers extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Customers() {
        initComponents();
        table_update();
        getlastid();
    }
    
    String name1;

    /**
     *
     * @param name
     */
    /*public Customers(String name) {
        initComponents();
        this.name1 = name;
        txtcncu.setText(name1);
       
    }*/
    
    Connection con1;
    PreparedStatement ps1;
    ResultSet rs;
    Statement st;
    int lastid;

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
        home = new javax.swing.JLabel();
        products = new javax.swing.JLabel();
        customers = new javax.swing.JLabel();
        suppliers = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtphonenumber = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Thunder");

        home.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        home.setText("Home");
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        products.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        products.setForeground(new java.awt.Color(255, 255, 255));
        products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        products.setText("Products");
        products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productsMouseClicked(evt);
            }
        });

        customers.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        customers.setForeground(new java.awt.Color(255, 255, 51));
        customers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customers.setText("Customers");

        suppliers.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        suppliers.setForeground(new java.awt.Color(255, 255, 255));
        suppliers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suppliers.setText("Suppliers");
        suppliers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suppliersMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Swis721 Cn BT", 1, 24)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Log Out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(suppliers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(customers)
                                .addComponent(products, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(home)
                .addGap(39, 39, 39)
                .addComponent(products)
                .addGap(34, 34, 34)
                .addComponent(customers)
                .addGap(38, 38, 38)
                .addComponent(suppliers)
                .addGap(41, 41, 41)
                .addComponent(logout)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 580));

        jLabel7.setFont(new java.awt.Font("Swis721 Cn BT", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jLabel7.setText("Point of Sales System");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 330, 50));

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 0, 20)); // NOI18N
        jLabel2.setText("Customers List");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Swis721 BT", 1, 20))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name");

        txtid.setEnabled(false);

        add.setBackground(new java.awt.Color(102, 0, 102));
        add.setFont(new java.awt.Font("Square721 BT", 1, 15)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(102, 0, 102));
        update.setFont(new java.awt.Font("Square721 BT", 1, 15)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(102, 0, 102));
        delete.setFont(new java.awt.Font("Square721 BT", 1, 15)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Phone Number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Address");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(32, 32, 32)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(update)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 360, 410));

        table.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Phone Number", "Address"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 530, 410));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 950, 580));

        setSize(new java.awt.Dimension(1209, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     *
     */
    public void getlastid(){
    
        try{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/pos","root", "");
            String sql = "select max(Customer_ID) FROM customers";
            st =con1.createStatement();
            rs = st.executeQuery(sql);
                       
                       
            if(rs.next()){
                
                lastid = rs.getInt(1);
                lastid++;
                txtid.setText(Integer.toString(lastid));
                            
            }
            
        }catch( Exception ex){
            JOptionPane.showMessageDialog(this, "ERROR\n"+ex);
        }
    }
    
    
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel d1 = (DefaultTableModel) table.getModel();
        int selectIndex = table.getSelectedRow();
        int Customer_ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
       
        String id = txtid.getText();
        String name = txtname.getText();
        String phone = txtphonenumber.getText();
        String address = txtaddress.getText();
       
        
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/pos","root", "");
            ps1 = con1.prepareStatement("update customers set Name=?, PhoneNumber = ?, Address=? where Customer_ID=?");
            
            ps1.setString(1,name);
            ps1.setString(2,phone);
            ps1.setString(3,address);
            ps1.setInt(4,Customer_ID);           
           
           
            ps1.executeUpdate();
            table_update();
                      
            txtid.setText("");
            txtname.setText("");
            txtphonenumber.setText("");
            txtaddress.setText("");
           
            txtname.requestFocus();
            getlastid();
            JOptionPane.showMessageDialog(null, "SUCCESSFULLY UPDATED!");
            
           

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR!", "ERROR" , JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void table_update(){
    
        
        try{
        
             int c;
             try{
                 
             Class.forName("com.mysql.cj.jdbc.Driver");         
             con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/pos","root", "");
             
             ps1 = con1.prepareStatement("select * from customers");
             ResultSet rs= ps1.executeQuery();
             ResultSetMetaData rsd = rs.getMetaData();
             c = rsd.getColumnCount();
             DefaultTableModel d = (DefaultTableModel) table.getModel();
             d.setRowCount(0);
             
             while(rs.next()){
             
                 Vector  v2 = new Vector();
                 for(int i=1; i<=c;i++){
                     v2.add(rs.getString("Customer_ID"));
                     v2.add(rs.getString("Name"));
                     v2.add(rs.getString("PhoneNumber"));
                     v2.add(rs.getString("Address"));
                     
                 }
                 
                 d.addRow(v2);             
             }
             
             
             }
             catch(ClassNotFoundException ex){
                 Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            }
                
         }
         catch(SQLException ex){
             Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
         
         }    
    
    }
    
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String phone = txtphonenumber.getText();
        String address = txtaddress.getText();
        String id = txtid.getText();
         
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/pos","root", "");
            
            
            String sql1 ="select * from customers where Name= '"+ name+"' OR PhoneNumber='"+phone+"'";
            ResultSet rs = ps1.executeQuery(sql1);
            
            if(rs.next()){
            
            JOptionPane.showMessageDialog(null, "This Customer Already Exist!");     
            
            
            }
            else{
            ps1 = con1.prepareStatement("insert into customers (Customer_ID,Name,PhoneNumber,Address) values (?,?,?,?)");
            ps1.setString(1, id);
            ps1.setString(2,name);
            ps1.setString(3,phone);
            ps1.setString(4,address);
          
           
            ps1.executeUpdate();
            table_update();
                      
           
            txtid.setText("");
           txtname.setText("");
           txtphonenumber.setText("");
           txtaddress.setText("");
            
           txtname.requestFocus();
           getlastid();
           JOptionPane.showMessageDialog(null, "SUCCESSFULLY INSERTED!");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR!", "ERROR" , JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_addActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void suppliersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suppliersMouseClicked
        // TODO add your handling code here:
        Suppliers sup = new Suppliers();
        sup.setVisible(true);
        sup.setLocationRelativeTo(null);
        this.dispose();
        
        /*Suppliers p = new Suppliers();
        this.dispose();
        new Suppliers(txtcncu.getText()).setVisible(true);*/
    }//GEN-LAST:event_suppliersMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
        dash.setLocationRelativeTo(null);
        this.dispose();
        
      /*  Dashboard p = new Dashboard();
        this.dispose();
        new Dashboard(txtcncu.getText()).setVisible(true);*/
        
        
    }//GEN-LAST:event_homeMouseClicked

    private void productsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productsMouseClicked
        // TODO add your handling code here:
        Products pro = new Products();
        pro.setVisible(true);
        pro.setLocationRelativeTo(null);
        this.dispose();
        
        /*Products p = new Products();
        this.dispose();
        new Products(txtcncu.getText()).setVisible(true);*/
        
    }//GEN-LAST:event_productsMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtname.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel d1 = (DefaultTableModel) table.getModel();
         int selectIndex = table.getSelectedRow();
         txtid.setText(d1.getValueAt(selectIndex, 0).toString());
         txtname.setText(d1.getValueAt(selectIndex, 1).toString());
         txtphonenumber.setText(d1.getValueAt(selectIndex, 2).toString());
         txtaddress.setText(d1.getValueAt(selectIndex,3).toString());
         
    }//GEN-LAST:event_tableMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel d1 = (DefaultTableModel) table.getModel();
        int selectIndex = table.getSelectedRow();
        int Customer_ID = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want delete the Record?", "Warning",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/pos","root", "");
                ps1 = con1.prepareStatement("delete  from customers where Customer_ID=?");
                ps1.setInt(1,Customer_ID);
                ps1.executeUpdate();
                table_update();
                      
                txtid.setText("");
                txtname.setText("");
                txtphonenumber.setText("");
                txtaddress.setText("");
                
                txtname.requestFocus();
                getlastid();
                JOptionPane.showMessageDialog(null, "SUCCESSFULLY DELETED");
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Suppliers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR", "ERROR" , JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(Suppliers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR", "ERROR" , JOptionPane.INFORMATION_MESSAGE);
            }
             
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel customers;
    private javax.swing.JButton delete;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel products;
    private javax.swing.JLabel suppliers;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphonenumber;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class searchJFrame extends javax.swing.JFrame {

    /**
     * Creates new form searchJFrame
     */
    public searchJFrame() {
        initComponents();
        i.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        info = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        i = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(61, 61, 61));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("search by ID :");

        jTextField1.setBackground(new java.awt.Color(66, 66, 66));
        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        info.setBackground(new java.awt.Color(58, 58, 58));
        info.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 13)); // NOI18N
        info.setForeground(new java.awt.Color(216, 216, 216));
        info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(54, 79, 79));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SEARCH");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        i.setText("jLabel2");

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("RESET");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
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
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(355, 355, 355)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(427, 427, 427)
                                .addComponent(i, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(i)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection con=null;
        String name = null;
        String last=null;
        String un=null;
        String p=null;
        String a=null;
        int ph=0;
        
        int id=0;
        String type =null;
        double price=0.0;
        int q=0;
        if(i.getText().equals("1"))
        {
            
            try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement p2 = con.prepareStatement("select * from items where id=?");
            p2.setInt(1, Integer.parseInt(jTextField1.getText()));
            ResultSet rs1 = p2.executeQuery();
            
            while(rs1.next())
            {
                id = rs1.getInt("id");
                type = rs1.getString("ItemType");
                price = rs1.getDouble("Price");
                q = rs1.getInt("quantity");
            }
            con.close();
            info.setText("Item ID: "+id+"         "+"Item Type: "+type+"         "+"Item Price: "+price+"         "+"Item Quantity: "+q);
        }
            
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        }
        else if(i.getText().equals("3"))
        {
            
            try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement ps2 = con.prepareStatement("select * from members where id=?");
            ps2.setInt(1, Integer.parseInt(jTextField1.getText()));
            ResultSet rs1 = ps2.executeQuery();
            
            while(rs1.next())
            {
                id = rs1.getInt("id");
                name = rs1.getString("fname");
                last = rs1.getString("lname");
                ph = rs1.getInt("phoneNum");
                type = rs1.getString("type");
                un = rs1.getString("date");
            }
            con.close();
            info.setText("Member ID: "+id+"       "+"First name: "+name+"       "+"Last name: "+last+"       "+"Phone number: "+ph+"       "+"Membership Type: "+type+"       "+"Roll In Date:"+un);
        }
            
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        }
        else if(i.getText().equals("4"))
        {
            
            try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement p2 = con.prepareStatement("select * from admin where admin_id=?");
            p2.setInt(1, Integer.parseInt(jTextField1.getText()));
            ResultSet rs1 = p2.executeQuery();
            
            while(rs1.next())
            {
                id = rs1.getInt("admin_id");
                name = rs1.getString("adminname");
            }
            con.close();
            info.setText("Admin ID: "+id+"         "+"Admin username: "+name);
        }
            
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        }
        else if(i.getText().equals("5"))
        {
            
            try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement ps2 = con.prepareStatement("select * from workers where id=?");
            ps2.setInt(1, Integer.parseInt(jTextField1.getText()));
            ResultSet rs1 = ps2.executeQuery();
            
            while(rs1.next())
            {
                id = rs1.getInt("id");
                name = rs1.getString("first name");
                last = rs1.getString("last name");
                ph = rs1.getInt("phoneNumber");
                type = rs1.getString("position");
                q = rs1.getInt("salary");
            }
            con.close();
            info.setText("Worker ID: "+id+"       "+"First name: "+name+"       "+"Last name: "+last+"       "+"Phone number: "+ph+"       "+"Works In: "+type+"       "+"Salary:"+q);
        }
            
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel i;
    public javax.swing.JLabel info;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

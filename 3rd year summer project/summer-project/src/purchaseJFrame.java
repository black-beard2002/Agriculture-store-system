
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class purchaseJFrame extends javax.swing.JFrame {

    /**
     * Creates new form purchaseJFrame
     */
    public purchaseJFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        phnum = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        iid = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("First Name :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("E-mail :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Card Number :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Card Password :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jCheckBox1.setBackground(new java.awt.Color(66, 66, 66));
        jCheckBox1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("CHECK");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, -1, -1));

        jButton1.setBackground(new java.awt.Color(68, 86, 68));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("CONFIRM");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 130, 50));

        jTextField1.setBackground(new java.awt.Color(63, 63, 63));
        jTextField1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 160, -1));

        jTextField2.setBackground(new java.awt.Color(63, 63, 63));
        jTextField2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 160, -1));

        jTextField3.setBackground(new java.awt.Color(63, 63, 63));
        jTextField3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 540, -1));

        jTextField4.setBackground(new java.awt.Color(63, 63, 63));
        jTextField4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 280, -1));

        phnum.setEditable(false);
        phnum.setBackground(new java.awt.Color(63, 63, 63));
        phnum.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        phnum.setForeground(new java.awt.Color(255, 255, 255));
        phnum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel2.add(phnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 160, -1));

        jTextField7.setBackground(new java.awt.Color(63, 63, 63));
        jTextField7.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 160, -1));

        jButton2.setBackground(new java.awt.Color(91, 58, 58));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("CANCEL");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 590, 130, 50));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Price :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 560, -1, -1));

        price.setEditable(false);
        price.setBackground(new java.awt.Color(86, 54, 54));
        price.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("jTextField8");
        jPanel2.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 120, -1));

        iid.setText("jLabel10");
        jPanel2.add(iid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jTextField5.setBackground(new java.awt.Color(58, 58, 58));
        jTextField5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 160, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aq_2_1100x666.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection c = null;
        int idi = 0;
        int quantity = 0;
        int quann = 0;
        int iiid = Integer.parseInt(iid.getText());
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        if (jCheckBox1.isSelected() && !jTextField1.getText().equals("") && !jTextField2.getText().equals("") && !jTextField3.getText().equals("") && !jTextField5.getText().equals("") && !jTextField7.getText().equals("")) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement pst1 = c.prepareStatement("insert into invoice values(?,?,?,?,?,?,?)");
                pst1.setInt(1, iiid);
                pst1.setString(2, null);
                pst1.setString(3, jTextField1.getText());
                pst1.setString(4, jTextField2.getText());
                pst1.setString(5, phnum.getText());
                pst1.setString(6, date.toString());
                pst1.setString(7, price.getText());
                pst1.executeUpdate();
                PreparedStatement ps3 = c.prepareStatement("select id from invoice ORDER BY id DESC LIMIT 1");
                ResultSet rs = ps3.executeQuery();
                while (rs.next()) {
                    idi = rs.getInt("id");

                    try {

                        for (int i = 0; i < NewJFrame.j.jTable22.getRowCount(); i++) {

                            PreparedStatement ps2 = c.prepareStatement("insert into invoicedetails values (?,?,?,?,?,?,?)");
                            ps2.setString(1, null);
                            ps2.setInt(2, Integer.parseInt(NewJFrame.j.jTable22.getValueAt(i, 0).toString()));
                            ps2.setString(3, NewJFrame.j.jTable22.getValueAt(i, 1).toString());
                            ps2.setString(4, NewJFrame.j.jTable22.getValueAt(i, 2).toString());
                            ps2.setInt(5, Integer.parseInt(NewJFrame.j.jTable22.getValueAt(i, 3).toString()));
                            ps2.setDouble(6, Double.parseDouble(NewJFrame.j.jTable22.getValueAt(i, 4).toString()));
                            ps2.setInt(7, idi);
                            int row = ps2.executeUpdate();

                            if (row > 0) {
                                try {
                                    quann = Integer.parseInt(NewJFrame.j.jTable22.getValueAt(i, 3).toString());
                                    String sql = "select quantity from items where id = ?";
                                    PreparedStatement ps5 = c.prepareStatement(sql);
                                    ps5.setInt(1, Integer.parseInt(NewJFrame.j.jTable22.getValueAt(i, 0).toString()));
                                    ResultSet rs1 = ps5.executeQuery();
                                    while (rs1.next()) {

                                        quantity = rs1.getInt("quantity");

                                        int newQuan = quantity - quann;

                                        int val = Integer.parseInt(NewJFrame.j.jTable22.getValueAt(i, 0).toString());
                                        PreparedStatement ps4 = c.prepareStatement("update items set quantity = ? where id = ?");
                                        ps4.setInt(1, newQuan);
                                        ps4.setInt(2, val);
                                        ps4.executeUpdate();
                                    }

                                } catch (Exception e) {
                                    System.out.println(e);
                                }

                            }
                        }

                    } catch (Exception ex) {
                        System.out.println(ex);
                    }

                }
            } catch (Exception ex) {
                System.out.println(ex);
            }

            JOptionPane.showMessageDialog(this, "Trade Completed Successfuly, " + price.getText() + "$ were detucted from your balance account");
            thanksJFrame1 t = new thanksJFrame1();
            t.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Fill The Missing Data 'OR' Check The CheckBox!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel iid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPasswordField jTextField5;
    private javax.swing.JTextField jTextField7;
    public javax.swing.JTextField phnum;
    public javax.swing.JTextField price;
    // End of variables declaration//GEN-END:variables
}

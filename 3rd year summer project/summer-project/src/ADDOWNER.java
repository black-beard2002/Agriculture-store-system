
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class ADDOWNER extends javax.swing.JFrame {

    /**
     * Creates new form ADDOWNER
     */
    public ADDOWNER() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        lastfield = new javax.swing.JTextField();
        add = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel000 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userfield = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        security = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        securityField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("First name:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Last name:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        namefield.setBackground(new java.awt.Color(61, 61, 61));
        namefield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        namefield.setForeground(new java.awt.Color(255, 255, 255));
        namefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel3.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, -1));

        lastfield.setBackground(new java.awt.Color(61, 61, 61));
        lastfield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        lastfield.setForeground(new java.awt.Color(255, 255, 255));
        lastfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel3.add(lastfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 170, -1));

        add.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD");
        add.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                addItemStateChanged(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, 80, 40));

        jButton1.setBackground(new java.awt.Color(85, 124, 104));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("DONE");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 500, 120, 60));

        jLabel000.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel000.setForeground(new java.awt.Color(255, 255, 255));
        jLabel000.setText("Phone number:");
        jPanel3.add(jLabel000, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        phone.setBackground(new java.awt.Color(61, 61, 61));
        phone.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel3.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 170, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RESET");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 120, 30));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        address.setBackground(new java.awt.Color(61, 61, 61));
        address.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        address.setForeground(new java.awt.Color(255, 255, 255));
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 230, -1));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, -1, -1));

        userfield.setBackground(new java.awt.Color(61, 61, 61));
        userfield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        userfield.setForeground(new java.awt.Color(255, 255, 255));
        userfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel3.add(userfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 180, -1));

        passfield.setBackground(new java.awt.Color(61, 61, 61));
        passfield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        passfield.setForeground(new java.awt.Color(255, 255, 255));
        passfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        passfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passfieldKeyReleased(evt);
            }
        });
        jPanel3.add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 170, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(191, 0, 0));
        jLabel5.setText("password must be at least 8 characters");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 220, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(191, 0, 0));
        jLabel7.setText("***************************************");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 220, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("security question :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        security.setBackground(new java.awt.Color(51, 51, 51));
        security.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 13)); // NOI18N
        security.setForeground(new java.awt.Color(255, 255, 255));
        security.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "what is your phone's first password?", "what is your favourite nickname?", "how many girlfriends you have had since your first one?", "what is your second favourite country?" }));
        security.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel3.add(security, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 410, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("(in case you forgot your account password)");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        securityField.setBackground(new java.awt.Color(102, 102, 102));
        securityField.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        securityField.setForeground(new java.awt.Color(255, 255, 255));
        securityField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        jPanel3.add(securityField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 180, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.jpeg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_addItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_addItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection c = null;
        int id = 0;
        int index = security.getSelectedIndex();
        String question = null;
        String role = null;
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        if (add.isSelected() && !namefield.getText().equals("") && !lastfield.getText().equals("") && !address.getText().equals("") && !phone.getText().equals("") && !passfield.getText().equals("") && !userfield.getText().equals("")&&security.getSelectedIndex() != -1 && !securityField.getText().equals("")) {
            switch (index) {
                    case 0 ->
                        question = securityField.getText() + "(Q1)";
                    case 1 ->
                        question = securityField.getText() + "(Q2)";
                    case 2 ->
                        question = securityField.getText() + "(Q3)";
                    case 3 ->
                        question = securityField.getText() + "(Q4)";
                    default -> {
                    }
                }
            try {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                try {
                    PreparedStatement ps = c.prepareStatement("insert into users values(?,?,?,?,?,?,?,?)");
                    ps.setString(1, null);
                    ps.setString(2, namefield.getText());
                    ps.setString(3, lastfield.getText());
                    ps.setString(4, phone.getText());
                    ps.setString(5, address.getText());
                    ps.setString(6, "owner");
                    ps.setString(7, date.toString());
                    ps.setInt(8, 3);
                    ps.executeUpdate();
                    PreparedStatement ps3 = c.prepareStatement("select id from users ORDER BY id DESC LIMIT 1");
                    ResultSet rs = ps3.executeQuery();
                    while (rs.next()) {
                        id = rs.getInt("id");

                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
                try {
                    PreparedStatement ps2 = c.prepareStatement("insert into accounts values(?,?,?,?)");
                    ps2.setInt(1, id);
                    ps2.setString(2, userfield.getText());
                    ps2.setString(3, passfield.getText());
                    ps2.setString(4, question);
                    ps2.executeUpdate();
                } catch (Exception e) {
                    System.out.println(e);
                }

                c.close();
            } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            }
            JOptionPane.showMessageDialog(this, "owner added");

        }  else {
            JOptionPane.showMessageDialog(this, "Fill the missing data!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        namefield.setText("");
        lastfield.setText("");
        phone.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void passfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passfieldKeyReleased
        // TODO add your handling code here:
        if (passfield.getText().length() < 8) {
            jLabel5.setVisible(true);
            jLabel7.setVisible(true);
            jButton1.setEnabled(false);
        } else if (passfield.getText().length() > 7) {
            jLabel5.setVisible(false);
            jLabel7.setVisible(false);
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_passfieldKeyReleased

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add;
    private javax.swing.JTextField address;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel000;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastfield;
    private javax.swing.JTextField namefield;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField phone;
    public javax.swing.JComboBox<String> security;
    private javax.swing.JTextField securityField;
    private javax.swing.JTextField userfield;
    // End of variables declaration//GEN-END:variables
}

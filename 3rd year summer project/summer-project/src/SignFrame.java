
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class SignFrame extends javax.swing.JFrame {



    public SignFrame() {
        initComponents();
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jButton1.setOpaque(false);
        //remove content area
        jButton1.setContentAreaFilled(false);
        //remove the border
        jButton1.setBorderPainted(false);

        jButton2.setOpaque(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setBorderPainted(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passField = new javax.swing.JTextField();
        sign = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SIGN IN PAGE");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(new java.awt.Color(102, 102, 102));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("username :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 80, -1));

        nameField.setBackground(new java.awt.Color(102, 102, 102));
        nameField.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 200, 30));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 71, -1));

        passField.setBackground(new java.awt.Color(102, 102, 102));
        passField.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        passField.setForeground(new java.awt.Color(204, 204, 204));
        passField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 4, true));
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passFieldKeyTyped(evt);
            }
        });
        jPanel2.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 200, 30));

        sign.setBackground(new java.awt.Color(51, 51, 51));
        sign.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        sign.setForeground(new java.awt.Color(204, 204, 204));
        sign.setText("SIGN IN");
        sign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signActionPerformed(evt);
            }
        });
        sign.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                signKeyPressed(evt);
            }
        });
        jPanel2.add(sign, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CREATE MY NEW ACCOUNT");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 150, 30));

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("DON'T HAVE ");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("AN ACCOUNT");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 3, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("forgot password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(173, 0, 0));
        jLabel6.setText("password is at least 8 characters");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 190, -1));

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(198, 198, 198));
        jLabel8.setText("CUSTOMER LOGIN PAGE");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(193, 193, 193));
        jLabel9.setText("___________________________________");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 240, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sign.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nameFieldActionPerformed

    private void signActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signActionPerformed
        // TODO add your handling code here:
        String username = null;
        String password = null;
        String fname = null;
        String lname = null;
        String ph = null;
        String rl = null;
        int id = 0;
        Connection conne = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conne = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            try {
                PreparedStatement p2 = conne.prepareStatement("select userID,username,password from accounts where username='" + nameField.getText() + "'and password='" + passField.getText() + "'");
                ResultSet r2 = p2.executeQuery();
                while (r2.next()) {
                    id = r2.getInt("userID");
                    username = r2.getString("username");
                    password = r2.getString("password");
                }

            } catch (SQLException e) {
                System.out.println(e);
            }
            try {
                PreparedStatement p = conne.prepareStatement("select firstname,lastname,phoneNumber,role from users where id= " + id);
                ResultSet r = p.executeQuery();

                while (r.next()) {

                    fname = r.getString("firstname");
                    lname = r.getString("lastname");
                    ph = r.getString("phoneNumber");
                    rl = r.getString("role");
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            conne.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        if (nameField.getText().equals(username) && passField.getText().equals(password) && (rl.equals("user") || rl.equals("null"))) {
            NewJFrame.j.name.setText(fname.toUpperCase());
            NewJFrame.j.lastt.setText(lname.toUpperCase());
            NewJFrame.j.phom.setText(String.valueOf(id));
            NewJFrame.j.jButton10.setEnabled(true);
            NewJFrame.j.iidd.setText(String.valueOf(id));
            NewJFrame.j.jButton11.setEnabled(true);
            NewJFrame.j.jTabbedPane1.setEnabledAt(1, true);
            NewJFrame.j.jButton5.setVisible(false);
            NewJFrame.j.jButton4.setVisible(false);
            NewJFrame.j.jLabel187.setText("u");
            NewJFrame.j.jLabel188.setText("u");
            NewJFrame.j.jLabel189.setText("u");
            NewJFrame.j.jLabel190.setText("u");
            NewJFrame.j.jLabel191.setText("u");
            NewJFrame.j.typ.setText("u");
            NewJFrame.j.jLabel192.setText("u");
            NewJFrame.j.jLabel193.setText("u");
            NewJFrame.j.pn.setText(ph);
            NewJFrame.j.zzz.setText("u");
            NewJFrame.j.jTabbedPane1.setEnabledAt(10, true);

            NewJFrame.j.jTabbedPane1.setSelectedIndex(1);

            NewJFrame.j.show();

            dispose();
        } else if (nameField.getText().equals(username) && passField.getText().equals(password) && rl.equals("member")) {
            NewJFrame.j.name.setText(fname.toUpperCase());
            NewJFrame.j.e1.setEnabled(true);
            NewJFrame.j.iidd.setText(String.valueOf(id));
            NewJFrame.j.e2.setEnabled(true);
            NewJFrame.j.e3.setEnabled(true);
            NewJFrame.j.e4.setEnabled(true);
            NewJFrame.j.jButton5.setVisible(false);
            NewJFrame.j.jButton4.setVisible(false);
            NewJFrame.j.e5.setEnabled(true);
            NewJFrame.j.e6.setEnabled(true);
            NewJFrame.j.jButton23.setEnabled(true);
            NewJFrame.j.jButton19.setEnabled(true);
            NewJFrame.j.jButton41.setEnabled(true);
            NewJFrame.j.jButton10.setEnabled(false);
            NewJFrame.j.jButton11.setEnabled(false);
            NewJFrame.j.jButton89.setEnabled(true);
            NewJFrame.j.jButton98.setEnabled(true);
            NewJFrame.j.jButton101.setEnabled(true);
            NewJFrame.j.jButton111.setEnabled(true);
            NewJFrame.j.jButton110.setEnabled(true);
            NewJFrame.j.typ.setText("m");
            NewJFrame.j.jButton109.setEnabled(true);
            NewJFrame.j.zzz.setText("m");
            NewJFrame.j.jLabel188.setText("m");
            NewJFrame.j.jLabel187.setText("m");
            NewJFrame.j.jLabel189.setText("m");
            NewJFrame.j.jLabel190.setText("m");
            NewJFrame.j.jLabel191.setText("m");
            NewJFrame.j.jLabel192.setText("m");
            NewJFrame.j.jLabel193.setText("m");
            NewJFrame.j.jButton108.setEnabled(true);
            NewJFrame.j.jButton105.setEnabled(true);
            NewJFrame.j.jButton93.setEnabled(true);
            NewJFrame.j.jButton113.setEnabled(true);
            NewJFrame.j.jButton122.setEnabled(true);
            NewJFrame.j.jButton125.setEnabled(true);
            NewJFrame.j.jButton135.setEnabled(true);
            NewJFrame.j.jButton134.setEnabled(true);
            NewJFrame.j.jButton133.setEnabled(true);
            NewJFrame.j.jButton132.setEnabled(true);
            NewJFrame.j.jButton129.setEnabled(true);
            NewJFrame.j.jButton47.setEnabled(true);
            NewJFrame.j.jButton137.setEnabled(true);
            NewJFrame.j.jButton146.setEnabled(true);
            NewJFrame.j.jButton149.setEnabled(true);
            NewJFrame.j.jButton159.setEnabled(true);
            NewJFrame.j.jButton158.setEnabled(true);
            NewJFrame.j.jButton157.setEnabled(true);
            NewJFrame.j.jButton173.setEnabled(true);
            NewJFrame.j.jButton156.setEnabled(true);
            NewJFrame.j.jButton153.setEnabled(true);
            NewJFrame.j.jButton141.setEnabled(true);
            NewJFrame.j.jButton47.setEnabled(true);
            NewJFrame.j.jButton61.setEnabled(true);
            NewJFrame.j.jButton70.setEnabled(true);
            NewJFrame.j.jButton83.setEnabled(true);
            NewJFrame.j.jButton82.setEnabled(true);
            NewJFrame.j.jButton81.setEnabled(true);
            NewJFrame.j.jButton80.setEnabled(true);
            NewJFrame.j.jButton77.setEnabled(true);
            NewJFrame.j.jButton65.setEnabled(true);
            NewJFrame.j.jButton20.setEnabled(true);
            NewJFrame.j.jButton29.setEnabled(true);
            NewJFrame.j.jButton59.setEnabled(true);
            NewJFrame.j.jButton58.setEnabled(true);
            NewJFrame.j.jButton57.setEnabled(true);
            NewJFrame.j.jButton56.setEnabled(true);
            NewJFrame.j.jButton33.setEnabled(true);
            NewJFrame.j.jButton51.setEnabled(true);
            NewJFrame.j.jButton162.setEnabled(true);
            NewJFrame.j.jButton163.setEnabled(true);
            NewJFrame.j.jButton167.setEnabled(true);
            NewJFrame.j.jButton166.setEnabled(true);
            NewJFrame.j.jButton168.setEnabled(true);
            NewJFrame.j.jButton171.setEnabled(true);
            NewJFrame.j.jButton169.setEnabled(true);
            NewJFrame.j.jButton170.setEnabled(true);
            NewJFrame.j.jButton164.setEnabled(true);
            NewJFrame.j.jButton117.setEnabled(true);
            NewJFrame.j.jButton73.setEnabled(true);
            NewJFrame.j.jButton165.setEnabled(true);
            NewJFrame.j.jButton172.setEnabled(true);
            NewJFrame.j.jTabbedPane1.setEnabledAt(1, true);
            NewJFrame.j.jTabbedPane1.setSelectedIndex(1);
            NewJFrame.j.jTabbedPane1.setEnabledAt(10, true);
            NewJFrame.j.pn.setText(ph);
            NewJFrame.j.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "invalid username or password");
        }


    }//GEN-LAST:event_signActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        regJFrame rjf = new regJFrame();
        dispose();
        rjf.show();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void signKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_signKeyPressed
        // TODO add your handling code here

    }//GEN-LAST:event_signKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_formKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Connection c = null;
        String pn = JOptionPane.showInputDialog("enter your phone number :");
        String phone = null;
        String ques = null;
        String answer = null;
        String answer2 = null;
        String newPass = null;
        int again=1;
        int pointer = 0;

        int index = 0;
        int id = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            try {

                PreparedStatement ps = c.prepareStatement("select id,phoneNumber from users where phoneNumber = '" + pn + "'");
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    phone = rs.getString("phoneNumber");
                    id = rs.getInt("id");
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
            if (pn.equals(phone)) {
                try {
                    PreparedStatement ps2 = c.prepareStatement("select securityQuestion from accounts where userID = " + id);
                    ResultSet rs2 = ps2.executeQuery();
                    while (rs2.next()) {
                        ques = rs2.getString("securityQuestion");
                    }
                } catch (SQLException e) {

                }
                Object[] questions = {"what is your phone's first password?", "what is your favourite nickname?", "how many girlfriends you have had since your first one?", "what is your favourite second country?"};
                JComboBox comboBox = new JComboBox(questions);
                comboBox.setSelectedItem(null);
                JOptionPane.showMessageDialog(null, comboBox, "choose your security question", JOptionPane.QUESTION_MESSAGE);
                answer = JOptionPane.showInputDialog("answer :");
                index = comboBox.getSelectedIndex();
                if(index==0)
                {
                    answer2 = answer + "(Q1)";
                    pointer=1;
                    
                }
                else if(index==1)
                {
                    answer2 = answer + "(Q2)";
                    pointer=1;
                }
                else if(index==2)
                {
                    answer2 = answer + "(Q3)";
                    pointer=1;
                }
                else if(index==3)
                {
                    answer2 = answer + "(Q4)";
                    pointer=1;
                }
                else
                {
                    pointer=0;
                }
                if(pointer==1)
                {
                    if (ques.equalsIgnoreCase(answer2)) {
                        
                
                for(int i=0;i<again;i++)
                {
                    newPass = JOptionPane.showInputDialog("Enter your new password :");
                if (!newPass.equals("") && newPass.length() > 7) {
                    
                    try {
                        PreparedStatement ps3 = c.prepareStatement("update accounts set password = '" + newPass + "'" + "where userID = " + id);
                        ps3.executeUpdate();
                        JOptionPane.showMessageDialog(this, "password changed, make sure to save it for next time");
                    } catch (HeadlessException | SQLException e) {
                        System.out.println(e);
                    }
                    break;

            } 
                else {
                    JOptionPane.showMessageDialog(this, "the password must contain at least 8 characters");
                    again++;
                }
                }

            
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Incorrect answer or question");
                }
                }
                
             
            
            } else {
                JOptionPane.showMessageDialog(this, "incorrect phone number");
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void passFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyReleased
        // TODO add your handling code here:
        if (passField.getText().length() < 8) {
            jLabel6.setVisible(true);
            sign.setEnabled(false);
        } else if (passField.getText().length() > 7) {
            jLabel6.setVisible(false);
            sign.setEnabled(true);
        }

    }//GEN-LAST:event_passFieldKeyReleased

    private void passFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyTyped
        // TODO add your handling code here:


    }//GEN-LAST:event_passFieldKeyTyped

    private void passFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_passFieldKeyPressed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField nameField;
    public javax.swing.JTextField passField;
    public javax.swing.JButton sign;
    // End of variables declaration//GEN-END:variables
}

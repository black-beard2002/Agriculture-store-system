
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class workerJFrame extends javax.swing.JFrame {

    /**
     * Creates new form workerJFrame
     */
    public workerJFrame() {
        initComponents();
        add.setSelected(true);
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
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        add = new javax.swing.JRadioButton();
        delete = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        alter = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        phonefield = new javax.swing.JTextField();
        price = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lastfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        salaryfield = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Works in :");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("First name :");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        namefield.setBackground(new java.awt.Color(61, 61, 61));
        namefield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        namefield.setForeground(new java.awt.Color(255, 255, 255));
        namefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel5.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, -1));

        buttonGroup1.add(add);
        add.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setText("ADD New Worker");
        add.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                addItemStateChanged(evt);
            }
        });
        jPanel5.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 150, 40));

        buttonGroup1.add(delete);
        delete.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("REMOVE Worker");
        delete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deleteItemStateChanged(evt);
            }
        });
        jPanel5.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 170, 40));

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
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 490, 120, 60));

        jLabel99.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("ID :");
        jPanel5.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        idField.setBackground(new java.awt.Color(56, 56, 56));
        idField.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        idField.setForeground(new java.awt.Color(255, 255, 255));
        idField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel5.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 120, -1));

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
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 120, 30));

        buttonGroup1.add(alter);
        alter.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        alter.setForeground(new java.awt.Color(255, 255, 255));
        alter.setText("Change Position");
        alter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                alterItemStateChanged(evt);
            }
        });
        jPanel5.add(alter, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, -1, 40));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number :");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        phonefield.setBackground(new java.awt.Color(58, 58, 58));
        phonefield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        phonefield.setForeground(new java.awt.Color(255, 255, 255));
        phonefield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel5.add(phonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 170, -1));

        buttonGroup1.add(price);
        price.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("Change Salary");
        price.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                priceItemStateChanged(evt);
            }
        });
        jPanel5.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, -1, 40));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last name :");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, -1, -1));

        lastfield.setBackground(new java.awt.Color(58, 58, 58));
        lastfield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        lastfield.setForeground(new java.awt.Color(255, 255, 255));
        lastfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel5.add(lastfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 160, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salary :");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        salaryfield.setBackground(new java.awt.Color(56, 56, 56));
        salaryfield.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        salaryfield.setForeground(new java.awt.Color(255, 255, 255));
        salaryfield.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel5.add(salaryfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 150, -1));

        jComboBox1.setBackground(new java.awt.Color(58, 58, 58));
        jComboBox1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Watering Section", "Pruning Section", "Sorting & Placing Section", "Minerals & Pesticides Section" }));
        jPanel5.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 180, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.jpeg"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 2, true));
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_addItemStateChanged
        // TODO add your handling code here:
        if (add.isSelected()) {
            jLabel23.setVisible(true);
            idField.setVisible(false);
            jLabel99.setVisible(false);
            jLabel3.setVisible(true);
            jLabel22.setVisible(true);
            jLabel2.setVisible(true);
            jLabel4.setVisible(true);
            namefield.setVisible(true);
            phonefield.setVisible(true);
            lastfield.setVisible(true);
            salaryfield.setVisible(true);
            jComboBox1.setVisible(true);

        }
    }//GEN-LAST:event_addItemStateChanged

    private void deleteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deleteItemStateChanged
        // TODO add your handling code here:
        if (delete.isSelected()) {
            jLabel23.setVisible(false);
            idField.setVisible(true);
            jLabel99.setVisible(true);
            jLabel3.setVisible(false);
            jLabel22.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            namefield.setVisible(false);
            phonefield.setVisible(false);
            lastfield.setVisible(false);
            salaryfield.setVisible(false);
            jComboBox1.setVisible(false);

        }
    }//GEN-LAST:event_deleteItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection c = null;
        int i=0;
        if(add.isSelected() && !namefield.getText().equals("") && !salaryfield.getText().equals("") && jComboBox1.getSelectedIndex()!=-1 && !phonefield.getText().equals("") && !lastfield.getText().equals(""))
        {

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps = c.prepareStatement("insert into workers values (?,?,?,?,?,?)");
                ps.setString(1, null);
                ps.setString(2,namefield.getText());
                ps.setString(3, lastfield.getText());
                ps.setString(4, jComboBox1.getSelectedItem().toString());
                ps.setDouble(5, Double.parseDouble(salaryfield.getText()));
                ps.setDouble(6, Integer.parseInt(phonefield.getText()));
                ps.executeUpdate();

            }
            catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        else if(delete.isSelected() && !idField.getText().equals(""))
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps3 = c.prepareStatement("delete from workers where id=?");
                ps3.setInt(1, Integer.parseInt(idField.getText()));
                ps3.executeUpdate();
                c.close();
            }
            catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e);
            }

        }
        else if(alter.isSelected() && !idField.getText().equals("") && jComboBox1.getSelectedIndex()!=-1)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps4 = c.prepareStatement("update workers set position= ? where id = ?");
                ps4.setString(1, jComboBox1.getSelectedItem().toString());
                ps4.setInt(2, Integer.parseInt(idField.getText()));
                ps4.executeUpdate();
                c.close();
            }
            catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        else if(price.isSelected() && !idField.getText().equals("") && !salaryfield.getText().equals(""))
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement pst4 = c.prepareStatement("update workers set salary = ? where id = ?");
                pst4.setInt(1, Integer.parseInt(salaryfield.getText()));
                pst4.setInt(2, Integer.parseInt(idField.getText()));
                pst4.executeUpdate();
                c.close();
            }
            catch (ClassNotFoundException | NumberFormatException | SQLException e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Fill the missing data!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        namefield.setText("");
        salaryfield.setText("");
        idField.setText("");
        lastfield.setText("");
        phonefield.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void alterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_alterItemStateChanged
        // TODO add your handling code here:
            jLabel23.setVisible(false);
            idField.setVisible(true);
            jLabel99.setVisible(true);
            jLabel3.setVisible(false);
            jLabel22.setVisible(true);
            jLabel2.setVisible(false);
            jLabel4.setVisible(false);
            namefield.setVisible(false);
            phonefield.setVisible(false);
            lastfield.setVisible(false);
            salaryfield.setVisible(false);
            jComboBox1.setVisible(true);
    }//GEN-LAST:event_alterItemStateChanged

    private void priceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_priceItemStateChanged
        // TODO add your handling code here:
            jLabel23.setVisible(false);
            idField.setVisible(true);
            jLabel99.setVisible(true);
            jLabel3.setVisible(false);
            jLabel22.setVisible(false);
            jLabel2.setVisible(false);
            jLabel4.setVisible(true);
            namefield.setVisible(false);
            phonefield.setVisible(false);
            lastfield.setVisible(false);
            salaryfield.setVisible(true);
            jComboBox1.setVisible(false);
    }//GEN-LAST:event_priceItemStateChanged

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add;
    private javax.swing.JRadioButton alter;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton delete;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField lastfield;
    private javax.swing.JTextField namefield;
    private javax.swing.JTextField phonefield;
    private javax.swing.JRadioButton price;
    private javax.swing.JTextField salaryfield;
    // End of variables declaration//GEN-END:variables
}

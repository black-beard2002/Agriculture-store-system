
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author User
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VIEW ALMOST SOLD OUT");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, 60));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   VIEW ALL ITEMS IN THE");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 330, 60));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   STOREHOUSE");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 210, 50));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 26)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("   ITEMS !");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mo.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        Connection c = null;
        String type = null;
        String id = null;
        int count = 0;
        String quantity = null;
        storeHouse s = new storeHouse();
        DefaultTableModel tbl1 = (DefaultTableModel) s.jTable1.getModel();
        String price = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement p2 = c.prepareStatement("SELECT COUNT(*) AS count FROM items");
            ResultSet rs2 = p2.executeQuery();
            while (rs2.next()) {
                count = rs2.getInt("count");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            for (int i = 1; i <= count; i++) {
                PreparedStatement p = c.prepareStatement("SELECT * FROM items LIMIT " + i);
                ResultSet rs = p.executeQuery();
                while (rs.next()) {
                    id = String.valueOf(rs.getInt("id"));
                    type = rs.getString("ItemType");
                    price = String.valueOf(rs.getDouble("Price"));
                    quantity = String.valueOf(rs.getInt("quantity"));
                }
                String items[] = {id, type, price, quantity};
                tbl1.addRow(items);
            }
            s.show();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        Connection c = null;
        String type = null;
        String id = null;
        int count = 0;
        String quantity = null;
        storeHouse s = new storeHouse();
        DefaultTableModel tbl1 = (DefaultTableModel) s.jTable1.getModel();
        String price = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement p2 = c.prepareStatement("SELECT COUNT(*) AS count FROM items");
            ResultSet rs2 = p2.executeQuery();
            while (rs2.next()) {
                count = rs2.getInt("count");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            for (int i = 1; i <= count; i++) {
                PreparedStatement p = c.prepareStatement("SELECT * FROM items LIMIT " + i);
                ResultSet rs = p.executeQuery();
                while (rs.next()) {
                    id = String.valueOf(rs.getInt("id"));
                    type = rs.getString("ItemType");
                    price = String.valueOf(rs.getDouble("Price"));
                    quantity = String.valueOf(rs.getInt("quantity"));
                }
                String items[] = {id, type, price, quantity};
                tbl1.addRow(items);
            }
            s.show();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        Connection c = null;
        String type = null;
        String id = null;
        int count = 0;
        String quantity = null;
        soldStore s = new soldStore();
        DefaultTableModel tbl1 = (DefaultTableModel) s.jTable1.getModel();
        String price = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement p2 = c.prepareStatement("SELECT COUNT(*) AS count FROM items where quantity<" + 20);
            ResultSet rs2 = p2.executeQuery();
            while (rs2.next()) {
                count = rs2.getInt("count");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            for (int i = 1; i <= count; i++) {
                PreparedStatement p = c.prepareStatement("SELECT * FROM items where quantity<" + 20 + " LIMIT " + i);
                ResultSet rs = p.executeQuery();
                while (rs.next()) {
                    id = String.valueOf(rs.getInt("id"));
                    type = rs.getString("ItemType");
                    price = String.valueOf(rs.getDouble("Price"));
                    quantity = String.valueOf(rs.getInt("quantity"));
                }
                String items[] = {id, type, price, quantity};
                tbl1.addRow(items);
            }
            s.show();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        Connection c = null;
        String type = null;
        String id = null;
        int count = 0;
        String quantity = null;
        soldStore s = new soldStore();
        DefaultTableModel tbl1 = (DefaultTableModel) s.jTable1.getModel();
        String price = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement p2 = c.prepareStatement("SELECT COUNT(*) AS count FROM items where quantity<" + 20);
            ResultSet rs2 = p2.executeQuery();
            while (rs2.next()) {
                count = rs2.getInt("count");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            for (int i = 1; i <= count; i++) {
                PreparedStatement p = c.prepareStatement("SELECT * FROM items where quantity<" + 20 + " LIMIT " + i);
                ResultSet rs = p.executeQuery();
                while (rs.next()) {
                    id = String.valueOf(rs.getInt("id"));
                    type = rs.getString("ItemType");
                    price = String.valueOf(rs.getDouble("Price"));
                    quantity = String.valueOf(rs.getInt("quantity"));
                }
                String items[] = {id, type, price, quantity};
                tbl1.addRow(items);
            }
            s.show();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

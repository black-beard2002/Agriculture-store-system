
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.JTableHeader;




public class NewJFrame extends javax.swing.JFrame {

   

    
    public NewJFrame() {
        initComponents();
        
        JTableHeader h = jTable22.getTableHeader();
        h.setBackground(Color.GRAY);
        h.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 14));
        t.setVisible(false);
        n.setVisible(false);
        s.setVisible(false);
        w.setVisible(false);
        har.setVisible(false);
        zzz.setVisible(false);
        wat.setVisible(false);
        jLabel3.setOpaque(false);
        jButton1.setOpaque(false);
        jButton1.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.setBorderPainted(false);
        jLabel188.setVisible(false);
        jButton3.setOpaque(false);
        jButton3.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton1.setContentAreaFilled(false);
        jButton3.setContentAreaFilled(false);
        jButton4.setOpaque(false);
        jButton4.setBorderPainted(false);
        jButton5.setOpaque(false);
        jButton5.setBorderPainted(false);
        jLabel187.setVisible(false);
        jButton4.setContentAreaFilled(false);
        jButton5.setContentAreaFilled(false);
        setExtendedState(NewJFrame.MAXIMIZED_BOTH);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        lastt.setVisible(false);
        phom.setVisible(false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);
        jTabbedPane1.setEnabledAt(4, false);
        jTabbedPane1.setEnabledAt(5, false);
        jTabbedPane1.setEnabledAt(6, false);
        jTabbedPane1.setEnabledAt(7, false);
        jTabbedPane1.setEnabledAt(8, false);
        jTabbedPane1.setEnabledAt(9, false);
        jTabbedPane1.setEnabledAt(10, false);
        e1.setEnabled(false);
        e2.setEnabled(false);
        e3.setEnabled(false);
        e4.setEnabled(false);
        e5.setEnabled(false);
        e6.setEnabled(false);
        pn.setVisible(false);
        jButton23.setEnabled(false);
        jButton19.setEnabled(false);
        jButton41.setEnabled(false);
        jButton172.setEnabled(false);
        jButton89.setEnabled(false);
        jButton98.setEnabled(false);
        jButton101.setEnabled(false);
        jButton111.setEnabled(false);
        jButton110.setEnabled(false);
        jButton109.setEnabled(false);
        jButton108.setEnabled(false);
        jButton105.setEnabled(false);
        jButton93.setEnabled(false);
        jButton173.setEnabled(false);
        jButton113.setEnabled(false);
        jButton122.setEnabled(false);
        jButton125.setEnabled(false);
        jButton135.setEnabled(false);
        jButton134.setEnabled(false);
        jButton133.setEnabled(false);
        jButton132.setEnabled(false);
        jButton129.setEnabled(false);
        jButton47.setEnabled(false);

        jButton137.setEnabled(false);
        jButton146.setEnabled(false);
        jButton149.setEnabled(false);
        jButton159.setEnabled(false);
        jButton158.setEnabled(false);
        jButton157.setEnabled(false);
        jButton156.setEnabled(false);
        jButton153.setEnabled(false);
        jButton141.setEnabled(false);

        jButton47.setEnabled(false);
        jButton20.setEnabled(false);
        jButton29.setEnabled(false);
        jButton59.setEnabled(false);
        jButton58.setEnabled(false);
        jButton57.setEnabled(false);
        jButton56.setEnabled(false);
        jButton33.setEnabled(false);
        jButton51.setEnabled(false);

        jButton61.setEnabled(false);
        jButton70.setEnabled(false);
        jButton83.setEnabled(false);
        jButton82.setEnabled(false);
        jButton81.setEnabled(false);
        jButton80.setEnabled(false);
        jButton77.setEnabled(false);
        jButton65.setEnabled(false);

        jButton167.setEnabled(false);
        jButton171.setEnabled(false);
        jButton164.setEnabled(false);
        jButton117.setEnabled(false);
        jButton73.setEnabled(false);
        jButton165.setEnabled(false);
        jButton172.setEnabled(false);
        jLabel190.setVisible(false);
        jLabel191.setVisible(false);
        jLabel192.setVisible(false);
        jLabel193.setVisible(false);
        iidd.setVisible(false);
        typ.setVisible(false);

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel184 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lastt = new javax.swing.JLabel();
        phom = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton36 = new javax.swing.JButton();
        e1 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        e2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        e6 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton136 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton151 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jButton155 = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        jButton157 = new javax.swing.JButton();
        jButton158 = new javax.swing.JButton();
        jButton159 = new javax.swing.JButton();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton162 = new javax.swing.JButton();
        jButton163 = new javax.swing.JButton();
        jButton164 = new javax.swing.JButton();
        jButton165 = new javax.swing.JButton();
        jButton166 = new javax.swing.JButton();
        jButton167 = new javax.swing.JButton();
        jButton168 = new javax.swing.JButton();
        jButton169 = new javax.swing.JButton();
        jButton170 = new javax.swing.JButton();
        jButton171 = new javax.swing.JButton();
        jButton172 = new javax.swing.JButton();
        jButton173 = new javax.swing.JButton();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable22 = new javax.swing.JTable();
        jButton160 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel185 = new javax.swing.JLabel();
        w = new javax.swing.JLabel();
        n = new javax.swing.JLabel();
        wat = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        har = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        pn = new javax.swing.JLabel();
        zzz = new javax.swing.JLabel();
        iidd = new javax.swing.JLabel();
        typ = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(59, 61, 63));
        jTabbedPane1.setForeground(new java.awt.Color(186, 186, 186));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1570, 790));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SHOP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ABOUT US");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        jButton3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("HELP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(219, 219, 219));
        jLabel3.setText("GREENLAND");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 40));

        jButton4.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("LOGIN");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 60, -1, -1));

        jButton5.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("SIGN UP");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 27)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("your surroundings green and charming.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 27)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("for one low monthly cost. Build your backyard, and make");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 27)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Get the highest quality Trees and best planting experience");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jButton10.setBackground(new java.awt.Color(51, 51, 51));
        jButton10.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        jButton10.setForeground(new java.awt.Color(198, 198, 198));
        jButton10.setText("99.99$/ year");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 130, 40));

        jButton11.setBackground(new java.awt.Color(51, 51, 51));
        jButton11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 16)); // NOI18N
        jButton11.setForeground(new java.awt.Color(198, 198, 198));
        jButton11.setText("9.99$/ month");
        jButton11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 130, 40));

        jLabel184.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 42)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(201, 201, 201));
        jLabel184.setText("Become a MEMBER !!");
        jPanel2.add(jLabel184, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel1.setBackground(new java.awt.Color(153, 51, 0));
        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f_1620x810.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 790));

        jTabbedPane1.addTab("       HOME       ", jPanel2);

        jPanel3.setPreferredSize(new java.awt.Dimension(1570, 790));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trees_3.jpg"))); // NOI18N
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 6, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 360, 300));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharm_360x300.jpg"))); // NOI18N
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 6, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 360, 300));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tool_360x300.jpg"))); // NOI18N
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 6, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 320, 360, 300));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssss_360x300.jpg"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 6, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 360, 300));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SEEDS");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 710, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOOLS");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 630, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TREES");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("PHARMACY");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 70, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("BUY,");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(160, 160, 160));
        jLabel9.setText("PLANT,");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("RELAX.");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("WELCOME");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 40, 190, -1));

        name.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(198, 198, 198));
        name.setText("jLabel12");
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 110, 200, -1));

        lastt.setText("jLabel185");
        jPanel3.add(lastt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 400, -1, -1));

        phom.setText("jLabel185");
        jPanel3.add(phom, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 420, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 51, 0));
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sss_1.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 790));

        jTabbedPane1.addTab("       SHOP       ", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(1680, 816));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a3_2.jpg"))); // NOI18N
        jButton84.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 5, true));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton84, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 420, 320));

        jButton85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aaa_420x320.jpg"))); // NOI18N
        jButton85.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 5, true));
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton85, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 420, 320));

        jButton86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b2_420x320.jpg"))); // NOI18N
        jButton86.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 5, true));
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton86, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 430, 420, 320));

        jButton87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/c1_420x320.jpeg"))); // NOI18N
        jButton87.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 5, true));
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton87, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 420, 320));

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(198, 198, 198));
        jLabel15.setText("EVERGREEN TREES");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(198, 198, 198));
        jLabel19.setText("SHRUB TREES");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 760, -1, -1));

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(198, 198, 198));
        jLabel20.setText("FRUIT TREES");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 370, -1, -1));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(198, 198, 198));
        jLabel21.setText("PRIVACY TREES");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 760, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/azx_1620x810.jpg"))); // NOI18N
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 810));

        jTabbedPane1.addTab("       TREES       ", jPanel4);

        jPanel8.setPreferredSize(new java.awt.Dimension(1680, 816));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e11.jpg"))); // NOI18N
        jButton36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 150));

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e4.jpg"))); // NOI18N
        e1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        jPanel8.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 170, 150));

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e12.jpeg"))); // NOI18N
        jButton38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 170, 150));

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e21.jpg"))); // NOI18N
        jButton39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, 150));

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e13.jpg"))); // NOI18N
        jButton40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 170, 150));

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e14.jpg"))); // NOI18N
        jButton41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton41MouseClicked(evt);
            }
        });
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 170, 150));

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e7.jpg"))); // NOI18N
        jButton42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 150));

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e9.jpg"))); // NOI18N
        jButton43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 150));

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e1.jpg"))); // NOI18N
        jButton44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, 150));

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e16.jpg"))); // NOI18N
        jButton45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 170, 150));

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e5.jpg"))); // NOI18N
        e2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        e2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e2ActionPerformed(evt);
            }
        });
        jPanel8.add(e2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 170, 150));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e22.png"))); // NOI18N
        jButton13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 170, 150));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e18.jpg"))); // NOI18N
        jButton14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, 150));

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e6.jpg"))); // NOI18N
        e3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });
        jPanel8.add(e3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 170, 150));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e23.jpg"))); // NOI18N
        jButton16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 170, 150));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e19.jpg"))); // NOI18N
        jButton17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 170, 150));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e2.jpg"))); // NOI18N
        jButton18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 170, 150));

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e20.jpg"))); // NOI18N
        jButton19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 210, 170, 150));

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e24.jpg"))); // NOI18N
        jButton21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 150));

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e17.jpg"))); // NOI18N
        jButton22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 170, 150));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e3.jpg"))); // NOI18N
        jButton23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, 170, 150));

        e6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e15.jpg"))); // NOI18N
        e6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        e6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e6ActionPerformed(evt);
            }
        });
        jPanel8.add(e6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 610, 170, 150));

        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e8.jpg"))); // NOI18N
        e5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        e5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ActionPerformed(evt);
            }
        });
        jPanel8.add(e5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 170, 150));

        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/e10.jpg"))); // NOI18N
        e4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });
        jPanel8.add(e4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 170, 150));

        jLabel22.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("noble fir");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel23.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("giant sequoia");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel24.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("larch");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel25.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("spartan");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, -1));

        jLabel26.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("hicks");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 170, -1, -1));

        jLabel27.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("frazer fir");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel28.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("nordmal");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel29.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Prosera");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        jLabel30.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Yow");
        jPanel8.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, -1, -1));

        jLabel31.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Blue Atlas");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, -1, -1));

        jLabel32.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Pillar Arborv");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, -1, -1));

        jLabel33.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Mount Giant");
        jPanel8.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, -1));

        jLabel34.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Hemlok");
        jPanel8.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));

        jLabel35.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("sypess");
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        jLabel36.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Spruce");
        jPanel8.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, -1, -1));

        jLabel37.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("BlackHills ");
        jPanel8.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 760, -1, -1));

        jLabel38.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("spike lan");
        jPanel8.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 760, -1, -1));

        jLabel39.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Emerlad");
        jPanel8.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 760, -1, -1));

        jLabel40.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Leyland");
        jPanel8.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 760, -1, -1));

        jLabel41.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Calusedros");
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 760, -1, -1));

        jLabel42.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("polar leaf");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 760, -1, -1));

        jLabel43.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Thuja green");
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 570, -1, -1));

        jLabel44.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Austrian Pine");
        jPanel8.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 370, -1, -1));

        jLabel45.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Blue Juniper");
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 170, -1, -1));

        jLabel187.setText("jLabel187");
        jPanel8.add(jLabel187, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 180, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/devils-tower_1620x810.jpg"))); // NOI18N
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 810));

        jTabbedPane1.addTab("evergreen", jPanel8);

        jPanel9.setPreferredSize(new java.awt.Dimension(1680, 816));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f3.jpg"))); // NOI18N
        jButton88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton88, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 150));

        jButton89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f4.jpg"))); // NOI18N
        jButton89.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton89, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 170, 150));

        jButton90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f5.jpg"))); // NOI18N
        jButton90.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton90, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 170, 150));

        jButton91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f17.jpg"))); // NOI18N
        jButton91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton91, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, 150));

        jButton92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f6.jpg"))); // NOI18N
        jButton92.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton92, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 170, 150));

        jButton93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f7.jpg"))); // NOI18N
        jButton93.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton93, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 170, 150));

        jButton94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f2.jpg"))); // NOI18N
        jButton94.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton94, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 150));

        jButton95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f11.jpg"))); // NOI18N
        jButton95.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton95, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 150));

        jButton96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f1.jpg"))); // NOI18N
        jButton96.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton96, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, 150));

        jButton97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f12.jpg"))); // NOI18N
        jButton97.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton97, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 170, 150));

        jButton98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f13.jpg"))); // NOI18N
        jButton98.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton98, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 170, 150));

        jButton99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f20.jpg"))); // NOI18N
        jButton99.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton99, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 170, 150));

        jButton100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f14.jpg"))); // NOI18N
        jButton100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton100, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, 150));

        jButton101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f18.jpg"))); // NOI18N
        jButton101.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton101, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 170, 150));

        jButton102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f21.jpg"))); // NOI18N
        jButton102.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton102, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 170, 150));

        jButton103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f19.jpg"))); // NOI18N
        jButton103.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton103, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 170, 150));

        jButton104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f8.jpg"))); // NOI18N
        jButton104.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton104, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 170, 150));

        jButton105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f220.jpg"))); // NOI18N
        jButton105.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton105, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 210, 170, 150));

        jButton106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f9.jpg"))); // NOI18N
        jButton106.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton106, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 150));

        jButton107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f10.jpeg"))); // NOI18N
        jButton107.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton107, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 170, 150));

        jButton108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hayba.jpg"))); // NOI18N
        jButton108.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton108, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, 170, 150));

        jButton109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f23.jpg"))); // NOI18N
        jButton109.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton109, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 610, 170, 150));

        jButton110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f15.jpg"))); // NOI18N
        jButton110.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton110, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 170, 150));

        jButton111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/f16.jpg"))); // NOI18N
        jButton111.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton111, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 170, 150));

        jLabel47.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Ashta");
        jPanel9.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel48.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Passion");
        jPanel9.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel49.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Almond");
        jPanel9.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel50.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Date");
        jPanel9.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, -1));

        jLabel51.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Coconut");
        jPanel9.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 170, -1, -1));

        jLabel52.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Hawthorn");
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel53.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Apricot");
        jPanel9.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel54.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Ineb");
        jPanel9.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, -1));

        jLabel55.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Grapes");
        jPanel9.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 370, -1, -1));

        jLabel56.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Calamondine");
        jPanel9.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 370, -1, -1));

        jLabel57.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Cherry");
        jPanel9.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        jLabel58.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Mango");
        jPanel9.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        jLabel59.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Banana");
        jPanel9.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));

        jLabel60.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Permanganate");
        jPanel9.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, -1, -1));

        jLabel61.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Figs");
        jPanel9.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, -1, -1));

        jLabel62.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Kiwi");
        jPanel9.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 760, -1, -1));

        jLabel63.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Peach");
        jPanel9.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 760, -1, -1));

        jLabel64.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Pear");
        jPanel9.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 760, -1, -1));

        jLabel65.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Black Mulberry");
        jPanel9.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 760, -1, -1));

        jLabel66.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Apple");
        jPanel9.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 760, -1, -1));

        jLabel67.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Orange");
        jPanel9.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 760, -1, -1));

        jLabel68.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Guava");
        jPanel9.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 570, -1, -1));

        jLabel69.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("Lemon");
        jPanel9.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 370, -1, -1));

        jLabel70.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("Avocado");
        jPanel9.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 170, -1, -1));

        jLabel188.setText("jLabel188");
        jPanel9.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aq_1570x810.jpg"))); // NOI18N
        jPanel9.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 810));

        jTabbedPane1.addTab("fruit", jPanel9);

        jPanel10.setPreferredSize(new java.awt.Dimension(1680, 816));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p5.jpg"))); // NOI18N
        jButton112.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton112, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 150));

        jButton113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p4.jpg"))); // NOI18N
        jButton113.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton113, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 170, 150));

        jButton114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p6.jpg"))); // NOI18N
        jButton114.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton114, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 170, 150));

        jButton115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p21.jpg"))); // NOI18N
        jButton115.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton115, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, 150));

        jButton116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p7.jpg"))); // NOI18N
        jButton116.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton116, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 170, 150));

        jButton117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p9.jpg"))); // NOI18N
        jButton117.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton117, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 170, 150));

        jButton118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p3.jpeg"))); // NOI18N
        jButton118.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton118, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 150));

        jButton119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p10.jpg"))); // NOI18N
        jButton119.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton119ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton119, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 150));

        jButton120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p2.jpg"))); // NOI18N
        jButton120.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton120ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton120, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, 150));

        jButton121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p11.jpg"))); // NOI18N
        jButton121.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton121ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton121, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 170, 150));

        jButton122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p8.jpg"))); // NOI18N
        jButton122.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton122ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton122, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 170, 150));

        jButton123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p223.jpg"))); // NOI18N
        jButton123.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton123ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton123, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 170, 150));

        jButton124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p12.jpg"))); // NOI18N
        jButton124.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton124ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton124, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, 150));

        jButton125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p24.jpg"))); // NOI18N
        jButton125.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton125ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton125, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 170, 150));

        jButton126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p1-.jpg"))); // NOI18N
        jButton126.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton126ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton126, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 170, 150));

        jButton127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p13.jpg"))); // NOI18N
        jButton127.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton127ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton127, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 170, 150));

        jButton128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p15.jpg"))); // NOI18N
        jButton128.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton128ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton128, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 170, 150));

        jButton129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p18.jpg"))); // NOI18N
        jButton129.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton129ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton129, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 210, 170, 150));

        jButton130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p20.jpg"))); // NOI18N
        jButton130.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton130ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton130, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 150));

        jButton131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p19.jpg"))); // NOI18N
        jButton131.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton131ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton131, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 170, 150));

        jButton132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p16.jpg"))); // NOI18N
        jButton132.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton132ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton132, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, 170, 150));

        jButton133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p14.png"))); // NOI18N
        jButton133.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton133ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton133, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 610, 170, 150));

        jButton134.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p17.jpg"))); // NOI18N
        jButton134.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton134ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton134, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 170, 150));

        jButton135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/p22.jpg"))); // NOI18N
        jButton135.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton135ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton135, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 170, 150));

        jLabel72.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Green Fill");
        jPanel10.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel73.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Soft mist");
        jPanel10.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel74.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Drought tolerant");
        jPanel10.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, -1, -1));

        jLabel75.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Blue Wonder");
        jPanel10.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));

        jLabel76.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Green wall");
        jPanel10.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, -1, -1));

        jLabel77.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("fabaceae");
        jPanel10.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel78.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("Latifolia");
        jPanel10.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel79.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Tomentosa");
        jPanel10.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        jLabel80.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("Oriantails");
        jPanel10.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, -1, -1));

        jLabel81.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Lethrace");
        jPanel10.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, -1, -1));

        jLabel82.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("Pillar Arborv");
        jPanel10.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 570, -1, -1));

        jLabel83.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("Updance");
        jPanel10.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        jLabel84.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Baby Giant");
        jPanel10.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, -1, -1));

        jLabel85.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Bamboo");
        jPanel10.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        jLabel86.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Lovarest");
        jPanel10.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, -1, -1));

        jLabel87.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Safely Hide");
        jPanel10.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 760, -1, -1));

        jLabel88.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("Fan palm");
        jPanel10.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 760, -1, -1));

        jLabel89.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("shine tower");
        jPanel10.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 760, -1, -1));

        jLabel90.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("nullsight");
        jPanel10.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 760, -1, -1));

        jLabel91.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Forlen");
        jPanel10.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 760, -1, -1));

        jLabel92.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("morvel cast");
        jPanel10.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 760, -1, -1));

        jLabel93.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("American Arborv");
        jPanel10.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 570, -1, -1));

        jLabel94.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Big Leaf");
        jPanel10.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 370, -1, -1));

        jLabel95.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Mist juniper");
        jPanel10.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 170, -1, -1));

        jLabel189.setText("jLabel189");
        jPanel10.add(jLabel189, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, -1));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mn_1620x810.jpg"))); // NOI18N
        jPanel10.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 810));

        jTabbedPane1.addTab("privacy", jPanel10);

        jPanel11.setPreferredSize(new java.awt.Dimension(1680, 816));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s7.jpg"))); // NOI18N
        jButton136.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton136ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton136, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 150));

        jButton137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s12.jpg"))); // NOI18N
        jButton137.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton137ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton137, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 170, 150));

        jButton138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s8.jpg"))); // NOI18N
        jButton138.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton138ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton138, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 170, 150));

        jButton139.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s19.jpg"))); // NOI18N
        jButton139.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton139ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton139, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, 150));

        jButton140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s4.jpg"))); // NOI18N
        jButton140.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton140ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton140, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 170, 150));

        jButton141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s3.jpg"))); // NOI18N
        jButton141.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton141ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton141, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 170, 150));

        jButton142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s2.jpg"))); // NOI18N
        jButton142.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton142ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton142, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 150));

        jButton143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s11.jpg"))); // NOI18N
        jButton143.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton143ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton143, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 150));

        jButton144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s1.jpg"))); // NOI18N
        jButton144.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton144ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton144, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, 150));

        jButton145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s13.jpg"))); // NOI18N
        jButton145.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton145ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton145, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 170, 150));

        jButton146.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s22.jpg"))); // NOI18N
        jButton146.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton146ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton146, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 170, 150));

        jButton147.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s25.jpeg"))); // NOI18N
        jButton147.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton147ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton147, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 170, 150));

        jButton148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s14.jpeg"))); // NOI18N
        jButton148.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton148ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton148, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, 150));

        jButton149.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s21.jpg"))); // NOI18N
        jButton149.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton149ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton149, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 170, 150));

        jButton150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s23.jpg"))); // NOI18N
        jButton150.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton150ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton150, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 170, 150));

        jButton151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s16.jpg"))); // NOI18N
        jButton151.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton151ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton151, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 170, 150));

        jButton152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s18.jpg"))); // NOI18N
        jButton152.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton152ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton152, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 170, 150));

        jButton153.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s9.jpg"))); // NOI18N
        jButton153.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton153ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton153, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 210, 170, 150));

        jButton154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s24.jpg"))); // NOI18N
        jButton154.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton154ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton154, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 150));

        jButton155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s20.jpg"))); // NOI18N
        jButton155.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton155ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton155, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 170, 150));

        jButton156.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s5.jpg"))); // NOI18N
        jButton156.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton156ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton156, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, 170, 150));

        jButton157.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s10.jpg"))); // NOI18N
        jButton157.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton157ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton157, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 610, 170, 150));

        jButton158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s6.jpeg"))); // NOI18N
        jButton158.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton158ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton158, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 170, 150));

        jButton159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/s17.jpg"))); // NOI18N
        jButton159.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton159ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton159, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 170, 150));

        jLabel97.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Palas");
        jPanel11.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel98.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Teak");
        jPanel11.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel99.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Biosac");
        jPanel11.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel100.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Hydrangea");
        jPanel11.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        jLabel101.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("perlaques");
        jPanel11.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, -1, -1));

        jLabel102.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Korean Lilac");
        jPanel11.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel103.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Karonda");
        jPanel11.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel104.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("Bay Loruel");
        jPanel11.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        jLabel105.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("Dwarf Barford");
        jPanel11.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        jLabel106.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Simal");
        jPanel11.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, -1, -1));

        jLabel107.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("Famtall");
        jPanel11.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        jLabel108.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Octimov");
        jPanel11.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, 60, -1));

        jLabel109.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("Lenrard");
        jPanel11.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));

        jLabel110.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Nardomn");
        jPanel11.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        jLabel111.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Green Velvet");
        jPanel11.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, -1, -1));

        jLabel112.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("Vamrel");
        jPanel11.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 760, -1, -1));

        jLabel113.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Cactove");
        jPanel11.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 760, -1, -1));

        jLabel114.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Lendia");
        jPanel11.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 760, -1, -1));

        jLabel115.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Vitex");
        jPanel11.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 760, -1, -1));

        jLabel116.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("Steeds japan");
        jPanel11.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 760, -1, -1));

        jLabel117.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Exastree");
        jPanel11.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 760, -1, -1));

        jLabel118.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("Vonlan");
        jPanel11.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 570, -1, -1));

        jLabel119.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("Rose wood");
        jPanel11.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 370, -1, -1));

        jLabel120.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("Soft touch");
        jPanel11.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 170, -1, -1));

        jLabel190.setText("jLabel190");
        jPanel11.add(jLabel190, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 570, -1, -1));

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cont_1610x810.jpg"))); // NOI18N
        jPanel11.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 810));

        jTabbedPane1.addTab("shrub", jPanel11);

        jPanel5.setPreferredSize(new java.awt.Dimension(1680, 816));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se3.jpg"))); // NOI18N
        jButton46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 150));

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se10.jpg"))); // NOI18N
        jButton47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 170, 150));

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se4.jpg"))); // NOI18N
        jButton48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 170, 150));

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se14.jpg"))); // NOI18N
        jButton49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, 150));

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se5.jpg"))); // NOI18N
        jButton50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 170, 150));

        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se6.gif"))); // NOI18N
        jButton51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 170, 150));

        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se2.jpg"))); // NOI18N
        jButton52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 150));

        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se13.jpg"))); // NOI18N
        jButton53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 150));

        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se1.jpg"))); // NOI18N
        jButton54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton54, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, 150));

        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se12.jpg"))); // NOI18N
        jButton55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton55, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 170, 150));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se15.gif"))); // NOI18N
        jButton20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 170, 150));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se23.jpg"))); // NOI18N
        jButton24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 170, 150));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se24.jpg"))); // NOI18N
        jButton25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, 150));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se22.jpg"))); // NOI18N
        jButton29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 170, 150));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se16.jpg"))); // NOI18N
        jButton30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 170, 150));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se9.jpg"))); // NOI18N
        jButton31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 170, 150));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se8.jpg"))); // NOI18N
        jButton32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 170, 150));

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se7.jpg"))); // NOI18N
        jButton33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 210, 170, 150));

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se17.jpg"))); // NOI18N
        jButton34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 150));

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se18.jpg"))); // NOI18N
        jButton35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 170, 150));

        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se11.jpg"))); // NOI18N
        jButton56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton56, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, 170, 150));

        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se19.jpg"))); // NOI18N
        jButton57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton57, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 610, 170, 150));

        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se20.jpg"))); // NOI18N
        jButton58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 170, 150));

        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/se21.jpg"))); // NOI18N
        jButton59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton59, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 170, 150));

        jLabel147.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setText("Cucumber");
        jPanel5.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel148.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Beans");
        jPanel5.add(jLabel148, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel149.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setText("Tomato");
        jPanel5.add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel150.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setText("Pumpkin");
        jPanel5.add(jLabel150, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 170, -1, -1));

        jLabel151.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setText("\t cauliflower");
        jPanel5.add(jLabel151, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, -1, -1));

        jLabel152.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setText("Brocoli");
        jPanel5.add(jLabel152, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 170, -1, -1));

        jLabel153.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setText("Maize");
        jPanel5.add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel154.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setText("chickpeas");
        jPanel5.add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        jLabel155.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setText("Artichoke");
        jPanel5.add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, -1));

        jLabel156.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setText("Coriander");
        jPanel5.add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 60, -1));

        jLabel157.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setText("Parsley");
        jPanel5.add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 370, -1, -1));

        jLabel158.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setText("Spinach");
        jPanel5.add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 370, -1, -1));

        jLabel159.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setText("Wheat");
        jPanel5.add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, -1, -1));

        jLabel160.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setText("Potato");
        jPanel5.add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        jLabel161.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setText("Lettuce");
        jPanel5.add(jLabel161, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));

        jLabel162.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setText("Pepper");
        jPanel5.add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, -1, -1));

        jLabel163.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setText("Melon");
        jPanel5.add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, -1, -1));

        jLabel164.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setText("Turnip");
        jPanel5.add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 570, -1, -1));

        jLabel165.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setText("Beet");
        jPanel5.add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 760, -1, -1));

        jLabel166.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setText("Cabbage");
        jPanel5.add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 760, -1, -1));

        jLabel167.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setText("Garlic");
        jPanel5.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 760, -1, -1));

        jLabel168.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setText("Onion");
        jPanel5.add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 760, -1, -1));

        jLabel169.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setText("Carrot");
        jPanel5.add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 760, -1, -1));

        jLabel170.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setText("Watermelon");
        jPanel5.add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 760, -1, -1));

        jLabel191.setText("jLabel191");
        jPanel5.add(jLabel191, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/570x810.jpg"))); // NOI18N
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 810));

        jTabbedPane1.addTab("       SEEDS       ", jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(1680, 816));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t3.jpeg"))); // NOI18N
        jButton60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton60, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 170, 150));

        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t19.jpg"))); // NOI18N
        jButton61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 170, 150));

        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t4.jpg"))); // NOI18N
        jButton62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton62, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 170, 150));

        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t13.jpg"))); // NOI18N
        jButton63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton63, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 170, 150));

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t5.jpg"))); // NOI18N
        jButton64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton64, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 170, 150));

        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t6.jpg"))); // NOI18N
        jButton65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, 170, 150));

        jButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t2.jpg"))); // NOI18N
        jButton66.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton66, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 170, 150));

        jButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t7.jpg"))); // NOI18N
        jButton67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton67, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 170, 150));

        jButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t1.jpg"))); // NOI18N
        jButton68.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton68, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 170, 150));

        jButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t8.jpg"))); // NOI18N
        jButton69.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton69, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 170, 150));

        jButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t20.jpg"))); // NOI18N
        jButton70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton70, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 170, 150));

        jButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t14.jpg"))); // NOI18N
        jButton71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton71, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 170, 150));

        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t9.jpeg"))); // NOI18N
        jButton72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton72, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 170, 150));

        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t21.jpg"))); // NOI18N
        jButton73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton73, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, 170, 150));

        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t15.jpg"))); // NOI18N
        jButton74.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton74, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 170, 150));

        jButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t10.jpg"))); // NOI18N
        jButton75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton75, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 170, 150));

        jButton76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t11.jpg"))); // NOI18N
        jButton76.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton76, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 170, 150));

        jButton77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t12.jpg"))); // NOI18N
        jButton77.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton77, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 210, 170, 150));

        jButton78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t16.jpg"))); // NOI18N
        jButton78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton78, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 170, 150));

        jButton79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t17.jpg"))); // NOI18N
        jButton79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton79, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 410, 170, 150));

        jButton80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t18.jpg"))); // NOI18N
        jButton80.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton80, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 410, 170, 150));

        jButton81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t24.jpg"))); // NOI18N
        jButton81.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton81, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 610, 170, 150));

        jButton82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t23.jpg"))); // NOI18N
        jButton82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton82, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 610, 170, 150));

        jButton83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t22.jpg"))); // NOI18N
        jButton83.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton83, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 170, 150));

        jLabel122.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("Trowel");
        jPanel6.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel123.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("Pruning Shears");
        jPanel6.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel124.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("Hose");
        jPanel6.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel125.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("Watering Can");
        jPanel6.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));

        jLabel126.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("Garden Rake");
        jPanel6.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 170, -1, -1));

        jLabel127.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("Shovel");
        jPanel6.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 170, -1, -1));

        jLabel128.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("Gloves");
        jPanel6.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel129.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("WheelBarrow");
        jPanel6.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));

        jLabel131.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("Hand-Held Weeder");
        jPanel6.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, -1, -1));

        jLabel132.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("Fork");
        jPanel6.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, -1, -1));

        jLabel133.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("Rake");
        jPanel6.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 370, -1, -1));

        jLabel134.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("Hoe");
        jPanel6.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 370, -1, -1));

        jLabel135.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Pick");
        jPanel6.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        jLabel136.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("Saw");
        jPanel6.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, -1, -1));

        jLabel137.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("Sickle");
        jPanel6.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));

        jLabel138.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setText("Sprinklers");
        jPanel6.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 570, -1, -1));

        jLabel139.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("Loppers");
        jPanel6.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 570, -1, -1));

        jLabel140.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setText("Dibbers");
        jPanel6.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(1380, 570, -1, -1));

        jLabel141.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("Bulb Planters");
        jPanel6.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 760, -1, -1));

        jLabel142.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("Cloches");
        jPanel6.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 760, -1, -1));

        jLabel143.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("Composters");
        jPanel6.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 760, -1, -1));

        jLabel144.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText("Cold frames");
        jPanel6.add(jLabel144, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 760, -1, -1));

        jLabel145.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText("Lawn Mowers");
        jPanel6.add(jLabel145, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 760, -1, -1));

        jLabel146.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("Pressure Washers");
        jPanel6.add(jLabel146, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 760, -1, -1));

        jLabel192.setText("jLabel192");
        jPanel6.add(jLabel192, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xscxcxs.jpg"))); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, 810));

        jTabbedPane1.addTab("       TOOLS       ", jPanel6);

        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph1.jpg"))); // NOI18N
        jButton162.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton162ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton162, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 220, 200));

        jButton163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph5.png"))); // NOI18N
        jButton163.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton163ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton163, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 220, 200));

        jButton164.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph11.jpg"))); // NOI18N
        jButton164.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton164ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton164, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 220, 200));

        jButton165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph4.jpg"))); // NOI18N
        jButton165.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton165ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton165, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 220, 200));

        jButton166.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph2.jpg"))); // NOI18N
        jButton166.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton166ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton166, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 220, 200));

        jButton167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph9.jpg"))); // NOI18N
        jButton167.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton167ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton167, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 220, 200));

        jButton168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph6.jpg"))); // NOI18N
        jButton168.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton168ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton168, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 220, 200));

        jButton169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph3.png"))); // NOI18N
        jButton169.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton169ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton169, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 220, 200));

        jButton170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph7.jpg"))); // NOI18N
        jButton170.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton170ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton170, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 290, 220, 200));

        jButton171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph10.jpg"))); // NOI18N
        jButton171.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton171ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton171, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 220, 200));

        jButton172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph8.jpg"))); // NOI18N
        jButton172.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton172ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton172, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 290, 220, 200));

        jButton173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ph12.jpg"))); // NOI18N
        jButton173.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 3, true));
        jButton173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton173ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton173, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 550, 220, 200));

        jLabel171.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setText("Foliar Spray");
        jPanel12.add(jLabel171, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel172.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setText("Myclobutanil");
        jPanel12.add(jLabel172, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, -1, -1));

        jLabel173.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setText("bifenthrin");
        jPanel12.add(jLabel173, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 240, -1, -1));

        jLabel174.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setText("chlorothalonil");
        jPanel12.add(jLabel174, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 240, -1, -1));

        jLabel175.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setText("TM 4.5");
        jPanel12.add(jLabel175, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 500, -1, -1));

        jLabel176.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setText("mefenoxam");
        jPanel12.add(jLabel176, new org.netbeans.lib.awtextra.AbsoluteConstraints(947, 500, 70, -1));

        jLabel177.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(255, 255, 255));
        jLabel177.setText("cyfluthrin");
        jPanel12.add(jLabel177, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, -1, -1));

        jLabel178.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(255, 255, 255));
        jLabel178.setText("malathion");
        jPanel12.add(jLabel178, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));

        jLabel179.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(255, 255, 255));
        jLabel179.setText("Systhane");
        jPanel12.add(jLabel179, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 750, -1, -1));

        jLabel180.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setText("Ethephon");
        jPanel12.add(jLabel180, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 750, -1, -1));

        jLabel181.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setText("Glyphosate");
        jPanel12.add(jLabel181, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 750, -1, -1));

        jLabel182.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setText("Miccorhizae");
        jPanel12.add(jLabel182, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 750, -1, -1));

        jLabel193.setText("jLabel193");
        jPanel12.add(jLabel193, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 430, -1, -1));

        jLabel130.setBackground(new java.awt.Color(153, 51, 0));
        jLabel130.setForeground(new java.awt.Color(153, 153, 153));
        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1111.jpeg"))); // NOI18N
        jPanel12.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 790));

        jTabbedPane1.addTab("     PHARMACY     ", jPanel12);

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable22.setBackground(new java.awt.Color(51, 51, 51));
        jTable22.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 12)); // NOI18N
        jTable22.setForeground(new java.awt.Color(204, 204, 204));
        jTable22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Type", "Item Name", "Quantity", "Total Price", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable22KeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(jTable22);
        if (jTable22.getColumnModel().getColumnCount() > 0) {
            jTable22.getColumnModel().getColumn(0).setResizable(false);
            jTable22.getColumnModel().getColumn(1).setResizable(false);
            jTable22.getColumnModel().getColumn(2).setResizable(false);
            jTable22.getColumnModel().getColumn(3).setResizable(false);
            jTable22.getColumnModel().getColumn(4).setResizable(false);
            jTable22.getColumnModel().getColumn(5).setPreferredWidth(140);
        }

        jPanel15.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 880, 500));

        jButton160.setBackground(new java.awt.Color(102, 51, 51));
        jButton160.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jButton160.setText("DELETE SELECTED ITEM");
        jButton160.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jButton160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton160ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton160, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, 230, -1));

        jButton15.setBackground(new java.awt.Color(119, 119, 77));
        jButton15.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jButton15.setText("Info about selected Item");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 270, 240, 60));

        jLabel185.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 36)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(191, 191, 191));
        jLabel185.setText("This is the list of items you've chose, you can change the quantity of any item you want");
        jPanel15.add(jLabel185, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        w.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        w.setForeground(new java.awt.Color(255, 255, 255));
        w.setText("jLabel196");
        jPanel15.add(w, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 460, 180, -1));

        n.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        n.setForeground(new java.awt.Color(255, 255, 255));
        n.setText("jLabel197");
        jPanel15.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 410, 180, -1));

        wat.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        wat.setForeground(new java.awt.Color(255, 255, 255));
        wat.setText("jLabel198");
        jPanel15.add(wat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 510, 230, -1));

        t.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("jLabel199");
        jPanel15.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 410, 180, -1));

        s.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        s.setForeground(new java.awt.Color(255, 255, 255));
        s.setText("jLabel200");
        jPanel15.add(s, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 180, -1));

        har.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 1, 12)); // NOI18N
        har.setForeground(new java.awt.Color(255, 255, 255));
        har.setText("jLabel201");
        jPanel15.add(har, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 460, 190, -1));

        jButton26.setBackground(new java.awt.Color(62, 79, 62));
        jButton26.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 18)); // NOI18N
        jButton26.setText("Purchase");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 690, 190, 70));

        pn.setText("jLabel196");
        jPanel15.add(pn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 120, -1));

        zzz.setText("jLabel196");
        jPanel15.add(zzz, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        iidd.setText("jLabel196");
        jPanel15.add(iidd, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        typ.setText("jLabel196");
        jPanel15.add(typ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mm_1620x810.jpg"))); // NOI18N
        jLabel183.setText("jLabel183");
        jPanel15.add(jLabel183, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1590, 790));

        jTabbedPane1.addTab("         CART         ", jPanel15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1590, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        beginJFrame bjf = new beginJFrame();
        bjf.show();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        regJFrame rjf = new regJFrame();
        rjf.show();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        subJFrame sjf = new subJFrame();
        sjf.n.setText(name.getText() + " " + lastt.getText());
        sjf.id.setText(phom.getText());
        sjf.jTabbedPane1.setSelectedIndex(0);
        sjf.show();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        subJFrame sjf = new subJFrame();
        sjf.n.setText(name.getText() + " " + lastt.getText());
        sjf.id.setText(phom.getText());
        sjf.jTabbedPane1.setSelectedIndex(0);
        sjf.show();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane1.isEnabledAt(1) == true) {
            jTabbedPane1.setSelectedIndex(1);
        } else {
            SignFrame sf = new SignFrame();
            sf.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked


    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(2, true);
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(7, true);
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(8, true);
        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(3, true);
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(4, true);
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(5, true);
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(6, true);
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setEnabledAt(9, true);
        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel22.getText());
        jf3.newImg.setIcon(jButton44.getIcon());
        jf3.idF.setText("18");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel23.getText());
        jf3.newImg.setIcon(jButton42.getIcon());
        jf3.idF.setText("20");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel24.getText());
        jf3.newImg.setIcon(jButton36.getIcon());
        jf3.idF.setText("21");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel25.getText());
        jf3.newImg.setIcon(jButton38.getIcon());
        jf3.idF.setText("19");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel26.getText());
        jf3.newImg.setIcon(jButton40.getIcon());
        jf3.idF.setText("22");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel45.getText());
        jf3.newImg.setIcon(jButton41.getIcon());
        jf3.idF.setText("10");
        jf3.jCheckBox1.setVisible(false);
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel27.getText());
        jf3.newImg.setIcon(jButton43.getIcon());
        jf3.idF.setText("23");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel28.getText());
        jf3.newImg.setIcon(jButton45.getIcon());
        jf3.idF.setText("24");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel29.getText());
        jf3.newImg.setIcon(jButton14.getIcon());
        jf3.idF.setText("11");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel30.getText());
        jf3.newImg.setIcon(jButton17.getIcon());
        jf3.idF.setText("4");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel31.getText());
        jf3.newImg.setIcon(jButton18.getIcon());
        jf3.idF.setText("3");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel44.getText());
        jf3.newImg.setIcon(jButton19.getIcon());
        jf3.idF.setText("9");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel32.getText());
        jf3.newImg.setIcon(jButton39.getIcon());
        jf3.idF.setText("8");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel33.getText());
        jf3.newImg.setIcon(jButton13.getIcon());
        jf3.idF.setText("2");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel34.getText());
        jf3.newImg.setIcon(jButton16.getIcon());
        jf3.idF.setText("5");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel35.getText());
        jf3.newImg.setIcon(jButton21.getIcon());
        jf3.idF.setText("1");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel36.getText());
        jf3.newImg.setIcon(jButton22.getIcon());
        jf3.idF.setText("12");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel43.getText());
        jf3.newImg.setIcon(jButton23.getIcon());
        jf3.idF.setText("13");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel37.getText());
        jf3.newImg.setIcon(e1.getIcon());
        jf3.idF.setText("6");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_e1ActionPerformed

    private void e2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e2ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel38.getText());
        jf3.newImg.setIcon(e2.getIcon());
        jf3.idF.setText("7");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_e2ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel39.getText());
        jf3.newImg.setIcon(e3.getIcon());
        jf3.idF.setText("14");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_e3ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel40.getText());
        jf3.newImg.setIcon(e4.getIcon());
        jf3.idF.setText("15");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_e4ActionPerformed

    private void e5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel41.getText());
        jf3.newImg.setIcon(e5.getIcon());
        jf3.idF.setText("16");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_e5ActionPerformed

    private void e6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e6ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Evergreen Tree");
        jf3.tn.setText(jLabel42.getText());
        jf3.newImg.setIcon(e6.getIcon());
        jf3.idF.setText("17");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_e6ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel47.getText());
        jf3.newImg.setIcon(jButton96.getIcon());
        jf3.idF.setText("48");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel48.getText());
        jf3.newImg.setIcon(jButton94.getIcon());
        jf3.idF.setText("47");
        if (jLabel187.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel187.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel49.getText());
        jf3.newImg.setIcon(jButton88.getIcon());
        jf3.idF.setText("46");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel50.getText());
        jf3.newImg.setIcon(jButton90.getIcon());
        jf3.idF.setText("44");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel51.getText());
        jf3.newImg.setIcon(jButton92.getIcon());
        jf3.idF.setText("43");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton92ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel70.getText());
        jf3.newImg.setIcon(jButton93.getIcon());
        jf3.idF.setText("42");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel52.getText());
        jf3.newImg.setIcon(jButton95.getIcon());
        jf3.idF.setText("38");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel53.getText());
        jf3.newImg.setIcon(jButton97.getIcon());
        jf3.idF.setText("37");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton97ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel54.getText());
        jf3.newImg.setIcon(jButton100.getIcon());
        jf3.idF.setText("35");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel55.getText());
        jf3.newImg.setIcon(jButton103.getIcon());
        jf3.idF.setText("28");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel56.getText());
        jf3.newImg.setIcon(jButton104.getIcon());
        jf3.idF.setText("41");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel69.getText());
        jf3.newImg.setIcon(jButton105.getIcon());
        jf3.idF.setText("39");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel57.getText());
        jf3.newImg.setIcon(jButton91.getIcon());
        jf3.idF.setText("30");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel58.getText());
        jf3.newImg.setIcon(jButton99.getIcon());
        jf3.idF.setText("26");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel59.getText());
        jf3.newImg.setIcon(jButton102.getIcon());
        jf3.idF.setText("27");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel60.getText());
        jf3.newImg.setIcon(jButton106.getIcon());
        jf3.idF.setText("40");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
            jf3.jCheckBox1.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel61.getText());
        jf3.newImg.setIcon(jButton107.getIcon());
        jf3.idF.setText("31");
        if (jLabel188.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
            jf3.jCheckBox1.setVisible(false);
        } else if (jLabel188.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel68.getText());
        jf3.newImg.setIcon(jButton108.getIcon());
        jf3.idF.setText("34");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel62.getText());
        jf3.newImg.setIcon(jButton89.getIcon());
        jf3.idF.setText("45");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel63.getText());
        jf3.newImg.setIcon(jButton98.getIcon());
        jf3.idF.setText("36");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel64.getText());
        jf3.newImg.setIcon(jButton101.getIcon());
        jf3.idF.setText("29");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel65.getText());
        jf3.newImg.setIcon(jButton111.getIcon());
        jf3.idF.setText("25");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel66.getText());
        jf3.newImg.setIcon(jButton110.getIcon());
        jf3.idF.setText("33");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Fruit Tree");
        jf3.tn.setText(jLabel67.getText());
        jf3.newImg.setIcon(jButton109.getIcon());
        jf3.idF.setText("32");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel74.getText());
        jf3.newImg.setIcon(jButton118.getIcon());
        jf3.idF.setText("65");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel74.getText());
        jf3.newImg.setIcon(jButton112.getIcon());
        jf3.idF.setText("54");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel75.getText());
        jf3.newImg.setIcon(jButton114.getIcon());
        jf3.idF.setText("53");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel76.getText());
        jf3.newImg.setIcon(jButton116.getIcon());
        jf3.idF.setText("62");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel95.getText());
        jf3.newImg.setIcon(jButton117.getIcon());
        jf3.idF.setText("57");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton119ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel77.getText());
        jf3.newImg.setIcon(jButton119.getIcon());
        jf3.idF.setText("58");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton119ActionPerformed

    private void jButton121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton121ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel78.getText());
        jf3.newImg.setIcon(jButton121.getIcon());
        jf3.idF.setText("59");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton121ActionPerformed

    private void jButton124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton124ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel79.getText());
        jf3.newImg.setIcon(jButton124.getIcon());
        jf3.idF.setText("60");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton124ActionPerformed

    private void jButton127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton127ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel80.getText());
        jf3.newImg.setIcon(jButton127.getIcon());
        jf3.idF.setText("61");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton127ActionPerformed

    private void jButton128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton128ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel81.getText());
        jf3.newImg.setIcon(jButton128.getIcon());
        jf3.idF.setText("63");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton128ActionPerformed

    private void jButton129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton129ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel94.getText());
        jf3.newImg.setIcon(jButton129.getIcon());
        jf3.idF.setText("70");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton129ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel82.getText());
        jf3.newImg.setIcon(jButton115.getIcon());
        jf3.idF.setText("50");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton123ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel83.getText());
        jf3.newImg.setIcon(jButton123.getIcon());
        jf3.idF.setText("66");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton123ActionPerformed

    private void jButton126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton126ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel84.getText());
        jf3.newImg.setIcon(jButton126.getIcon());
        jf3.idF.setText("51");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton126ActionPerformed

    private void jButton130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton130ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel85.getText());
        jf3.newImg.setIcon(jButton130.getIcon());
        jf3.idF.setText("56");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton130ActionPerformed

    private void jButton131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton131ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel86.getText());
        jf3.newImg.setIcon(jButton131.getIcon());
        jf3.idF.setText("71");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton131ActionPerformed

    private void jButton132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton132ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel93.getText());
        jf3.newImg.setIcon(jButton132.getIcon());
        jf3.idF.setText("49");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton132ActionPerformed

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel87.getText());
        jf3.newImg.setIcon(jButton113.getIcon());
        jf3.idF.setText("64");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jButton122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton122ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel88.getText());
        jf3.newImg.setIcon(jButton122.getIcon());
        jf3.idF.setText("55");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton122ActionPerformed

    private void jButton125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton125ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel89.getText());
        jf3.newImg.setIcon(jButton125.getIcon());
        jf3.idF.setText("68");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton125ActionPerformed

    private void jButton135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton135ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel90.getText());
        jf3.newImg.setIcon(jButton135.getIcon());
        jf3.idF.setText("67");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton135ActionPerformed

    private void jButton134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton134ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel91.getText());
        jf3.newImg.setIcon(jButton134.getIcon());
        jf3.idF.setText("69");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton134ActionPerformed

    private void jButton133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton133ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Privacy Tree");
        jf3.tn.setText(jLabel92.getText());
        jf3.newImg.setIcon(jButton133.getIcon());
        jf3.idF.setText("72");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton133ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel123.getText());
        jf3.newImg.setIcon(jButton66.getIcon());
        jf3.idF.setText("98");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel124.getText());
        jf3.newImg.setIcon(jButton60.getIcon());
        jf3.idF.setText("99");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel125.getText());
        jf3.newImg.setIcon(jButton62.getIcon());
        jf3.idF.setText("100");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel126.getText());
        jf3.newImg.setIcon(jButton64.getIcon());
        jf3.idF.setText("102");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel127.getText());
        jf3.newImg.setIcon(jButton65.getIcon());
        jf3.idF.setText("103");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel128.getText());
        jf3.newImg.setIcon(jButton67.getIcon());
        jf3.idF.setText("104");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel129.getText());
        jf3.newImg.setIcon(jButton69.getIcon());
        jf3.idF.setText("105");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel131.getText());
        jf3.newImg.setIcon(jButton72.getIcon());
        jf3.idF.setText("106");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel132.getText());
        jf3.newImg.setIcon(jButton75.getIcon());
        jf3.idF.setText("107");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel133.getText());
        jf3.newImg.setIcon(jButton76.getIcon());
        jf3.idF.setText("108");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel134.getText());
        jf3.newImg.setIcon(jButton77.getIcon());
        jf3.idF.setText("109");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel135.getText());
        jf3.newImg.setIcon(jButton63.getIcon());
        jf3.idF.setText("110");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel136.getText());
        jf3.newImg.setIcon(jButton71.getIcon());
        jf3.idF.setText("101");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel137.getText());
        jf3.newImg.setIcon(jButton74.getIcon());
        jf3.idF.setText("111");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel138.getText());
        jf3.newImg.setIcon(jButton78.getIcon());
        jf3.idF.setText("112");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel139.getText());
        jf3.newImg.setIcon(jButton79.getIcon());
        jf3.idF.setText("113");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel140.getText());
        jf3.newImg.setIcon(jButton80.getIcon());
        jf3.idF.setText("114");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel141.getText());
        jf3.newImg.setIcon(jButton61.getIcon());
        jf3.idF.setText("115");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel142.getText());
        jf3.newImg.setIcon(jButton70.getIcon());
        jf3.idF.setText("116");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel143.getText());
        jf3.newImg.setIcon(jButton73.getIcon());
        jf3.idF.setText("117");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel144.getText());
        jf3.newImg.setIcon(jButton83.getIcon());
        jf3.idF.setText("118");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel145.getText());
        jf3.newImg.setIcon(jButton82.getIcon());
        jf3.idF.setText("119");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel146.getText());
        jf3.newImg.setIcon(jButton81.getIcon());
        jf3.idF.setText("120");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton147ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel108.getText());
        jf3.newImg.setIcon(jButton147.getIcon());
        jf3.idF.setText("93");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton147ActionPerformed

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton120ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel72.getText());
        jf3.newImg.setIcon(jButton120.getIcon());
        jf3.idF.setText("52");
        if (jLabel189.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel189.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton120ActionPerformed

    private void jButton144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton144ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel97.getText());
        jf3.newImg.setIcon(jButton144.getIcon());
        jf3.idF.setText("85");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton144ActionPerformed

    private void jButton142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton142ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel98.getText());
        jf3.newImg.setIcon(jButton142.getIcon());
        jf3.idF.setText("86");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton142ActionPerformed

    private void jButton136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton136ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel99.getText());
        jf3.newImg.setIcon(jButton136.getIcon());
        jf3.idF.setText("87");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton136ActionPerformed

    private void jButton138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton138ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel100.getText());
        jf3.newImg.setIcon(jButton138.getIcon());
        jf3.idF.setText("76");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton138ActionPerformed

    private void jButton140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton140ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel101.getText());
        jf3.newImg.setIcon(jButton140.getIcon());
        jf3.idF.setText("96");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton140ActionPerformed

    private void jButton141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton141ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel120.getText());
        jf3.newImg.setIcon(jButton141.getIcon());
        jf3.idF.setText("78");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton141ActionPerformed

    private void jButton143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton143ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel102.getText());
        jf3.newImg.setIcon(jButton143.getIcon());
        jf3.idF.setText("75");

        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton143ActionPerformed

    private void jButton145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton145ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel103.getText());
        jf3.newImg.setIcon(jButton145.getIcon());
        jf3.idF.setText("84");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton145ActionPerformed

    private void jButton148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton148ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel104.getText());
        jf3.newImg.setIcon(jButton148.getIcon());
        jf3.idF.setText("73");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton148ActionPerformed

    private void jButton151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton151ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel105.getText());
        jf3.newImg.setIcon(jButton151.getIcon());
        jf3.idF.setText("74");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton151ActionPerformed

    private void jButton152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton152ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel106.getText());
        jf3.newImg.setIcon(jButton152.getIcon());
        jf3.idF.setText("83");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton152ActionPerformed

    private void jButton153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton153ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel119.getText());
        jf3.newImg.setIcon(jButton153.getIcon());
        jf3.idF.setText("82");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton153ActionPerformed

    private void jButton139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton139ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel107.getText());
        jf3.newImg.setIcon(jButton139.getIcon());
        jf3.idF.setText("94");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton139ActionPerformed

    private void jButton150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton150ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel109.getText());
        jf3.newImg.setIcon(jButton150.getIcon());
        jf3.idF.setText("92");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton150ActionPerformed

    private void jButton154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton154ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel110.getText());
        jf3.newImg.setIcon(jButton154.getIcon());
        jf3.idF.setText("91");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton154ActionPerformed

    private void jButton155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton155ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel111.getText());
        jf3.newImg.setIcon(jButton155.getIcon());
        jf3.idF.setText("77");
        if (jLabel190.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel190.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton155ActionPerformed

    private void jButton156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton156ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel118.getText());
        jf3.newImg.setIcon(jButton156.getIcon());
        jf3.idF.setText("88");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton156ActionPerformed

    private void jButton137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton137ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel112.getText());
        jf3.newImg.setIcon(jButton137.getIcon());
        jf3.idF.setText("95");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton137ActionPerformed

    private void jButton146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton146ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel113.getText());
        jf3.newImg.setIcon(jButton146.getIcon());
        jf3.idF.setText("90");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton146ActionPerformed

    private void jButton149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton149ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel114.getText());
        jf3.newImg.setIcon(jButton149.getIcon());
        jf3.idF.setText("81");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton149ActionPerformed

    private void jButton159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton159ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel115.getText());
        jf3.newImg.setIcon(jButton159.getIcon());
        jf3.idF.setText("80");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton159ActionPerformed

    private void jButton158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton158ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel116.getText());
        jf3.newImg.setIcon(jButton158.getIcon());
        jf3.idF.setText("79");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton158ActionPerformed

    private void jButton157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton157ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Shrub Tree");
        jf3.tn.setText(jLabel117.getText());
        jf3.newImg.setIcon(jButton157.getIcon());
        jf3.idF.setText("89");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton157ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel147.getText());
        jf3.newImg.setIcon(jButton54.getIcon());
        jf3.idF.setText("182");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel148.getText());
        jf3.newImg.setIcon(jButton52.getIcon());
        jf3.idF.setText("183");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel149.getText());
        jf3.newImg.setIcon(jButton46.getIcon());
        jf3.idF.setText("184");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel150.getText());
        jf3.newImg.setIcon(jButton48.getIcon());
        jf3.idF.setText("185");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel151.getText());
        jf3.newImg.setIcon(jButton50.getIcon());
        jf3.idF.setText("186");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel152.getText());
        jf3.newImg.setIcon(jButton51.getIcon());
        jf3.idF.setText("187");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel153.getText());
        jf3.newImg.setIcon(jButton53.getIcon());
        jf3.idF.setText("194");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel154.getText());
        jf3.newImg.setIcon(jButton55.getIcon());
        jf3.idF.setText("193");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel155.getText());
        jf3.newImg.setIcon(jButton25.getIcon());
        jf3.idF.setText("204");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel156.getText());
        jf3.newImg.setIcon(jButton31.getIcon());
        jf3.idF.setText("189");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel157.getText());
        jf3.newImg.setIcon(jButton32.getIcon());
        jf3.idF.setText("190");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel158.getText());
        jf3.newImg.setIcon(jButton33.getIcon());
        jf3.idF.setText("188");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel159.getText());
        jf3.newImg.setIcon(jButton49.getIcon());
        jf3.idF.setText("195");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel160.getText());
        jf3.newImg.setIcon(jButton24.getIcon());
        jf3.idF.setText("203");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel161.getText());
        jf3.newImg.setIcon(jButton30.getIcon());
        jf3.idF.setText("197");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel162.getText());
        jf3.newImg.setIcon(jButton34.getIcon());
        jf3.idF.setText("198");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel163.getText());
        jf3.newImg.setIcon(jButton35.getIcon());
        jf3.idF.setText("199");
        if (jLabel191.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel191.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel164.getText());
        jf3.newImg.setIcon(jButton56.getIcon());
        jf3.idF.setText("192");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel165.getText());
        jf3.newImg.setIcon(jButton47.getIcon());
        jf3.idF.setText("191");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel166.getText());
        jf3.newImg.setIcon(jButton20.getIcon());
        jf3.idF.setText("196");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel167.getText());
        jf3.newImg.setIcon(jButton29.getIcon());
        jf3.idF.setText("205");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel168.getText());
        jf3.newImg.setIcon(jButton59.getIcon());
        jf3.idF.setText("202");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel169.getText());
        jf3.newImg.setIcon(jButton58.getIcon());
        jf3.idF.setText("201");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Seeds");
        jf3.tn.setText(jLabel170.getText());
        jf3.newImg.setIcon(jButton57.getIcon());
        jf3.idF.setText("200");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton162ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel171.getText());
        jf3.newImg.setIcon(jButton162.getIcon());
        jf3.idF.setText("131");
        if (jLabel193.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel193.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton162ActionPerformed

    private void jButton166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton166ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel172.getText());
        jf3.newImg.setIcon(jButton166.getIcon());
        jf3.idF.setText("121");
        if (jLabel193.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel193.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton166ActionPerformed

    private void jButton169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton169ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel173.getText());
        jf3.newImg.setIcon(jButton169.getIcon());
        jf3.idF.setText("122");
        if (jLabel193.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel193.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton169ActionPerformed

    private void jButton165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton165ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel174.getText());
        jf3.newImg.setIcon(jButton165.getIcon());
        jf3.idF.setText("123");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton165ActionPerformed

    private void jButton163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton163ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel178.getText());
        jf3.newImg.setIcon(jButton163.getIcon());
        jf3.idF.setText("124");
        if (jLabel193.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel193.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton163ActionPerformed

    private void jButton168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton168ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel177.getText());
        jf3.newImg.setIcon(jButton168.getIcon());
        jf3.idF.setText("125");
        if (jLabel193.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel193.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton168ActionPerformed

    private void jButton170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton170ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel176.getText());
        jf3.newImg.setIcon(jButton170.getIcon());
        jf3.idF.setText("129");
        if (jLabel193.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel193.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton170ActionPerformed

    private void jButton172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton172ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel175.getText());
        jf3.newImg.setIcon(jButton172.getIcon());
        jf3.idF.setText("126");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton172ActionPerformed

    private void jButton167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton167ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel179.getText());
        jf3.newImg.setIcon(jButton167.getIcon());
        jf3.idF.setText("127");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton167ActionPerformed

    private void jButton171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton171ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel180.getText());
        jf3.newImg.setIcon(jButton171.getIcon());
        jf3.idF.setText("128");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton171ActionPerformed

    private void jButton164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton164ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel181.getText());
        jf3.newImg.setIcon(jButton164.getIcon());
        jf3.idF.setText("130");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton164ActionPerformed

    private void jButton173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton173ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Pharmacy");
        jf3.tn.setText(jLabel182.getText());
        jf3.newImg.setIcon(jButton173.getIcon());
        jf3.idF.setText("131");
        SpinnerNumberModel model1 = new SpinnerNumberModel(0, 0, 50, 1);
        jf3.jSpinner1.setModel(model1);
        jf3.show();
    }//GEN-LAST:event_jButton173ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jTabbedPane1.isEnabledAt(1) == true) {
            predJFrame p = new predJFrame();
            p.show();
        } else {
            SignFrame sf = new SignFrame();
            sf.show();
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        aboutJFrame ab = new aboutJFrame();
        ab.show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
        JFrame3 jf3 = new JFrame3();
        jf3.tt.setText("Farmer Tools");
        jf3.tn.setText(jLabel122.getText());
        jf3.newImg.setIcon(jButton68.getIcon());
        jf3.idF.setText("97");
        if (jLabel192.getText().equals("u")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 2, 1);
            jf3.jSpinner1.setModel(model1);
            jf3.jCheckBox1.setVisible(false);
            jf3.jLabel6.setVisible(false);
            jf3.jLabel7.setVisible(false);
        } else if (jLabel192.getText().equals("m")) {
            SpinnerNumberModel model1 = new SpinnerNumberModel(1, 1, 50, 1);
            jf3.jSpinner1.setModel(model1);
        }
        jf3.show();
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton41MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int a = jTable22.getSelectedRow();
        int id = Integer.parseInt(jTable22.getValueAt(a, 0).toString());
        String type = jTable22.getValueAt(a, 1).toString();
        Connection c = null;
        String name = null;
        String pt = null;
        String ht = null;
        String wtp = null;
        int wa = 0;
        String sql = null;
        String usedfor = null;
        int si = 0;

        if (type.equals("Evergreen Tree") || type.equals("Fruit Tree") || type.equals("Privacy Tree") || type.equals("Shrub Tree")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps = c.prepareStatement("select * from trees where id = " + id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    name = rs.getString("TreeName");
                    si = rs.getInt("TreeSize");
                    wa = rs.getInt("waterAmountPerWeek");
                    wtp = rs.getString("weatherType");
                    ht = rs.getString("HarvestTime");
                }

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

            t.setVisible(true);
            n.setVisible(true);
            s.setVisible(true);
            w.setVisible(true);
            har.setVisible(true);
            wat.setVisible(true);
            t.setText("TYPE : " + type);
            n.setText("NAME : " + name);
            s.setText("SIZE : " + si + " m");
            w.setText("WEATHER : " + wtp);
            har.setText("HARVEST TIME : " + ht);
            wat.setText("WaterAmountPerWeek : " + wa + " L");

        } else if (type.equals("Seeds")) {

            try {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps = c.prepareStatement("select * from seeds where id = " + id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    name = rs.getString("seedName");
                    wtp = rs.getString("plantingTime");
                    ht = rs.getString("harvestTime");
                }

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

            t.setVisible(true);
            n.setVisible(true);
            s.setVisible(false);
            w.setVisible(true);
            har.setVisible(true);
            wat.setVisible(false);
            t.setText("TYPE : " + type);
            n.setText("NAME : " + name);
            w.setText("PLANTING Time : " + wtp);
            har.setText("HARVEST Time : " + ht);
        } else if (type.equals("Pharmacy")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps = c.prepareStatement("select * from medecine where id = " + id);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    name = rs.getString("medecine");
                    wtp = rs.getString("used for");
                }

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

            t.setVisible(true);
            n.setVisible(true);
            s.setVisible(false);
            w.setVisible(true);
            har.setVisible(false);
            wat.setVisible(false);
            t.setText("TYPE : medecine");
            n.setText("NAME : " + name);
            w.setText("USED FOR : " + wtp);
        } else if (type.equals("Farmer Tools")) {
            t.setVisible(false);
            n.setVisible(false);
            s.setVisible(false);
            w.setVisible(false);
            har.setVisible(false);
            wat.setVisible(false);
            JOptionPane.showMessageDialog(this, "No Info To Show For This Item");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton160ActionPerformed
        DefaultTableModel tbl1 = (DefaultTableModel) jTable22.getModel();
        int r = jTable22.getSelectedRow();
        Connection c = null;
        int q = Integer.parseInt(tbl1.getValueAt(r, 3).toString());
        int id = Integer.parseInt(tbl1.getValueAt(r, 0).toString());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
            PreparedStatement ps3 = c.prepareStatement("update items set quantity =" + q + "where id=" + id);
            ps3.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        tbl1.removeRow(r);


    }//GEN-LAST:event_jButton160ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:

        double tas = 0.0;
        double total = 0.0;
        int s = jTable22.getRowCount();
        for (int j = 0; j < s; j++) {
            tas = Double.parseDouble(jTable22.getValueAt(j, 4).toString());
            total = total + tas;
        }

        purchaseJFrame p = new purchaseJFrame();
        p.iid.setText(iidd.getText());
        p.price.setText(Double.toString(total));
        p.phnum.setText(pn.getText());
        p.show();


    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTable22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable22KeyReleased
        // TODO add your handling code here:
        Connection conn = null;
        int s = jTable22.getRowCount();
        int id = 0;
        int qu = 0;
        double tp = 0.0;
        double price = 0.0;
        double t = 0.0;
        double p = 0.0;
        double tas = 0.0;
        double total = 0.0;
        boolean allowed = true;
        int count = 0;
        int quan = 0;
        double tt = 0.0;
        DefaultTableModel model = (DefaultTableModel) jTable22.getModel();
        for (int a = 0; a < s; a++) {

            id = Integer.parseInt(jTable22.getValueAt(a, 0).toString());
            qu = Integer.parseInt(jTable22.getValueAt(a, 3).toString());
            tp = Double.parseDouble(jTable22.getValueAt(a, 4).toString());
            if (tp == 0.01) {
                model.setValueAt(1, a, 3);
                continue;

            }

            try {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps1 = conn.prepareStatement("select price from items where id = " + id);
                ResultSet rs = ps1.executeQuery();
                while (rs.next()) {
                    price = rs.getInt("Price");
                    t = price * qu;
                    if (qu > 2 && typ.getText().equals("u")) {
                        model.setValueAt(1, a, 3);
                        model.setValueAt(price, a, 4);
                        allowed = false;
                        JOptionPane.showMessageDialog(this, "maximum quantity is 2, become a member to get more");
                        UIManager UI = new UIManager();
                        UI.put("OptionPane.background", new ColorUIResource(255, 0, 0));
                        UI.put("Panel.background", new ColorUIResource(255, 0, 0));
                        JOptionPane.showMessageDialog(this, "NOTE that the quantity has been reset to '1' ");
                        break;
                    }

                    if (t != tp) {
                        count++;
                    }

                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
            if (allowed) {

                if (count > 0) {
                    //JOptionPane.showMessageDialog(this, "please select the "+count+" rows you altered and press the 'update' button");
                    model.setValueAt(t, a, 4);

                } else {
                    for (int j = 0; j < s; j++) {
                        tas = Double.parseDouble(jTable22.getValueAt(j, 4).toString());
                        total = total + tas;
                    }

                }
            }
            try {
                int r = jTable22.getSelectedRow();
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SummerProject", "root", "");
                PreparedStatement ps3 = conn.prepareStatement("select quantity,price from items where id=?");
                ps3.setInt(1, id);
                ResultSet rs = ps3.executeQuery();

                while (rs.next()) {

                    quan = rs.getInt("quantity");
                    p = rs.getDouble("Price");

                }
                if (qu > quan) {

                    model.setValueAt(quan, r, 3);
                    tt = p * quan;
                    model.setValueAt(tt, r, 4);
                    JOptionPane.showMessageDialog(this, "There is only " + quan + " items left of this product");

                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_jTable22KeyReleased

    /**
     * @param args the command line arguments
     */
    static NewJFrame j;

    public static void main(String args[]) throws Exception {

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                j = new NewJFrame();
                j.setVisible(true);
            }
        });
       
        
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton e1;
    public javax.swing.JButton e2;
    public javax.swing.JButton e3;
    public javax.swing.JButton e4;
    public javax.swing.JButton e5;
    public javax.swing.JButton e6;
    private javax.swing.JLabel har;
    public javax.swing.JLabel iidd;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    public javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    public javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    public javax.swing.JButton jButton108;
    public javax.swing.JButton jButton109;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton110;
    public javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    public javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    public javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    public javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    public javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    public javax.swing.JButton jButton129;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    public javax.swing.JButton jButton132;
    public javax.swing.JButton jButton133;
    public javax.swing.JButton jButton134;
    public javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    public javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton140;
    public javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    public javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    public javax.swing.JButton jButton149;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    public javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton155;
    public javax.swing.JButton jButton156;
    public javax.swing.JButton jButton157;
    public javax.swing.JButton jButton158;
    public javax.swing.JButton jButton159;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton160;
    public javax.swing.JButton jButton162;
    public javax.swing.JButton jButton163;
    public javax.swing.JButton jButton164;
    public javax.swing.JButton jButton165;
    public javax.swing.JButton jButton166;
    public javax.swing.JButton jButton167;
    public javax.swing.JButton jButton168;
    public javax.swing.JButton jButton169;
    private javax.swing.JButton jButton17;
    public javax.swing.JButton jButton170;
    public javax.swing.JButton jButton171;
    public javax.swing.JButton jButton172;
    public javax.swing.JButton jButton173;
    private javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    public javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    public javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    public javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    public javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    public javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    public javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    public javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    public javax.swing.JButton jButton56;
    public javax.swing.JButton jButton57;
    public javax.swing.JButton jButton58;
    public javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    public javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    public javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    public javax.swing.JButton jButton70;
    public javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    public javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    public javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    public javax.swing.JButton jButton80;
    public javax.swing.JButton jButton81;
    public javax.swing.JButton jButton82;
    public javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    public javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    public javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    public javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    public javax.swing.JLabel jLabel187;
    public javax.swing.JLabel jLabel188;
    public javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel190;
    public javax.swing.JLabel jLabel191;
    public javax.swing.JLabel jLabel192;
    public javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    public javax.swing.JPanel jPanel10;
    public javax.swing.JPanel jPanel11;
    public javax.swing.JPanel jPanel12;
    public javax.swing.JPanel jPanel15;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JPanel jPanel5;
    public javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanel8;
    public javax.swing.JPanel jPanel9;
    public javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable22;
    public javax.swing.JLabel lastt;
    private javax.swing.JLabel n;
    public javax.swing.JLabel name;
    public javax.swing.JLabel phom;
    public javax.swing.JLabel pn;
    private javax.swing.JLabel s;
    private javax.swing.JLabel t;
    public javax.swing.JLabel typ;
    private javax.swing.JLabel w;
    private javax.swing.JLabel wat;
    public javax.swing.JLabel zzz;
    // End of variables declaration//GEN-END:variables

   
}

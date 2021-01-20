package office_pro;
import DB.DBConn;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class employee extends javax.swing.JFrame {
public employee() {
initComponents();
}
String uname="";
String eid="";
public employee(String u) {
        initComponents();
        uname=u;
        try{
        DBConn db=new DBConn();
        db.pstmt=db.con.prepareStatement("select eid from employee where ename='"+uname+"'");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
        eid=db.rst.getString(1);
        }   
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profile = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
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
        attendence = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel95 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Salary = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel98 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel114 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField38 = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setClosable(true);
        profile.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        profile.setTitle("View Profile");
        profile.setVisible(false);

        jPanel2.setBackground(new java.awt.Color(0, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-administrator-male-filled-100.png"))); // NOI18N
        jLabel65.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 110));

        jLabel58.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 180, 60));

        jLabel51.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("DOB");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 110, 20));

        jLabel47.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Gender");
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 110, 20));

        jLabel66.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Mobile");
        jPanel2.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 110, -1));

        jLabel61.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Aadhar No.");
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 150, -1));

        jLabel62.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Address");
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, -1));

        jLabel55.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Higher Education");
        jPanel2.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 130, -1));

        jLabel57.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Work Experience");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 130, -1));

        jLabel59.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Name");
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 110, -1));

        jLabel49.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Father's Name");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 140, -1));

        jLabel52.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Email");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 110, 20));

        jLabel53.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Pan No.");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 110, -1));

        jLabel63.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Pin Code");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 110, -1));

        jLabel64.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("City");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 110, -1));

        jLabel54.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("State");
        jPanel2.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 100, -1));

        jLabel60.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Country");
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 110, -1));

        jLabel48.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Department");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 120, 20));

        jLabel56.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Post");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 110, -1));

        jLabel67.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Employee Id");
        jPanel2.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 100, -1));

        jLabel68.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 100, 20));

        jLabel69.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 100, 20));

        jLabel70.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 100, 20));

        jLabel71.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 120, 20));

        jLabel72.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 180, 20));

        jLabel73.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 180, 20));

        jLabel74.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 180, 20));

        jLabel75.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 180, 20));

        jLabel76.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 180, 20));

        jLabel77.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 180, 20));

        jLabel78.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 180, 20));

        jLabel79.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 180, 20));

        jLabel80.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 180, 20));

        jLabel81.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 180, 20));

        jLabel82.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 180, 20));

        jLabel83.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 180, 20));

        jLabel84.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel2.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 180, 20));

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile.getContentPane());
        profile.getContentPane().setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 780, 460));

        attendence.setClosable(true);
        attendence.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        attendence.setTitle("Attendence");
        attendence.setVisible(false);

        jPanel3.setBackground(new java.awt.Color(0, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Name");
        jPanel3.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 110, -1));

        jLabel94.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Month");
        jPanel3.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 100, -1));

        jLabel103.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("Employee Id");
        jPanel3.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 100, -1));

        jLabel104.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel3.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 210, 20));

        jLabel121.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102)));
        jPanel3.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 100, 20));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 102));
        jComboBox1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 780, 340));

        jComboBox2.setBackground(new java.awt.Color(0, 0, 102));
        jComboBox2.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 140, -1));

        jLabel95.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("Year");
        jPanel3.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 90, -1));

        jButton1.setText("Show");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, -1, -1));

        javax.swing.GroupLayout attendenceLayout = new javax.swing.GroupLayout(attendence.getContentPane());
        attendence.getContentPane().setLayout(attendenceLayout);
        attendenceLayout.setHorizontalGroup(
            attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        attendenceLayout.setVerticalGroup(
            attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(attendence, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 780, 460));

        Salary.setClosable(true);
        Salary.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        Salary.setTitle("Salary");
        Salary.setVisible(false);

        jPanel4.setBackground(new java.awt.Color(0, 204, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Month");
        jPanel4.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 100, -1));

        jComboBox3.setBackground(new java.awt.Color(0, 0, 102));
        jComboBox3.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 140, -1));

        jComboBox4.setBackground(new java.awt.Color(0, 0, 102));
        jComboBox4.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 140, -1));

        jLabel98.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("Year");
        jPanel4.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 90, -1));

        jLabel107.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("Bank Name");
        jPanel4.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 76, -1));

        jLabel99.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Emp Id");
        jPanel4.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 76, -1));

        jLabel110.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("Bank A/C No.");
        jPanel4.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, 20));

        jTextField32.setBackground(new java.awt.Color(0, 204, 153));
        jTextField32.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField32.setForeground(new java.awt.Color(255, 255, 255));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField32.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 90, -1));

        jTextField34.setBackground(new java.awt.Color(0, 204, 153));
        jTextField34.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField34.setForeground(new java.awt.Color(255, 255, 255));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField34.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 385, 320, 20));

        jTextField36.setBackground(new java.awt.Color(0, 204, 153));
        jTextField36.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField36.setForeground(new java.awt.Color(255, 255, 255));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField36.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 20));

        jLabel100.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Department");
        jPanel4.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 101, -1));

        jTextField33.setBackground(new java.awt.Color(0, 204, 153));
        jTextField33.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField33.setForeground(new java.awt.Color(255, 255, 255));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField33.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 160, -1));

        jLabel101.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("Post");
        jPanel4.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 85, -1));

        jTextField30.setBackground(new java.awt.Color(0, 204, 153));
        jTextField30.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField30.setForeground(new java.awt.Color(255, 255, 255));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField30.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 140, -1));

        jTextField35.setBackground(new java.awt.Color(0, 204, 153));
        jTextField35.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField35.setForeground(new java.awt.Color(255, 255, 255));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField35.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 230, -1));

        jLabel108.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Name");
        jPanel4.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 101, 20));

        jTextField37.setBackground(new java.awt.Color(0, 204, 153));
        jTextField37.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(255, 255, 255));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField37.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 140, 20));

        jLabel109.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("PF No.");
        jPanel4.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 100, 20));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 10, 170));

        jLabel114.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("EARNING");
        jPanel4.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 100, 30));

        jLabel116.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Basic");
        jPanel4.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 100, 20));

        jLabel119.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("Allowances");
        jPanel4.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 100, 20));

        jLabel123.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("Gross Earning");
        jPanel4.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, 30));

        jLabel112.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("PER MONTH");
        jPanel4.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 100, 30));

        jLabel113.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("DEDUCTION");
        jPanel4.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 100, 30));

        jLabel117.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("PF");
        jPanel4.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 100, 30));

        jLabel118.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("Income Tax");
        jPanel4.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 100, 30));

        jLabel115.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("Professional Tax");
        jPanel4.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 140, 30));

        jLabel111.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("PER MONTH");
        jPanel4.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, 100, 30));

        jLabel120.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("Gross Deduction");
        jPanel4.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 140, 30));

        jLabel124.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("Net Salary Payable");
        jPanel4.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 170, 20));

        jTextField38.setBackground(new java.awt.Color(0, 204, 153));
        jTextField38.setFont(new java.awt.Font("OCR A Extended", 0, 12)); // NOI18N
        jTextField38.setForeground(new java.awt.Color(255, 255, 255));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 102)));
        jTextField38.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel4.add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 320, -1));

        jSeparator14.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 10, 170));

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 10, 170));

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 10, 170));

        jSeparator17.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 10, 170));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 750, 10));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 750, 10));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 750, 10));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 750, 10));

        jButton2.setText("Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        jLabel125.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("Basic");
        jPanel4.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, 20));

        jLabel126.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Allowances");
        jPanel4.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 100, 20));

        jLabel127.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("Gross Earning");
        jPanel4.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 120, 30));

        jLabel128.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("PF");
        jPanel4.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 100, 30));

        jLabel129.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("Income Tax");
        jPanel4.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 100, 30));

        jLabel130.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("Professional Tax");
        jPanel4.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 140, 30));

        jLabel131.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("Gross Deduction");
        jPanel4.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 140, 30));

        javax.swing.GroupLayout SalaryLayout = new javax.swing.GroupLayout(Salary.getContentPane());
        Salary.getContentPane().setLayout(SalaryLayout);
        SalaryLayout.setHorizontalGroup(
            SalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SalaryLayout.setVerticalGroup(
            SalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 780, 460));

        jLabel3.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Welcome");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-cash-in-hand-filled-100.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 150, -1));

        jLabel5.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-attendance-filled-100.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, -1));

        jLabel4.setFont(new java.awt.Font("OCR A Extended", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/icons8-administrator-male-filled-100.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Module");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/office_pro/keybo.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
profile.setVisible(true);
try {
        DBConn db=new DBConn();
        db.pstmt=db.con.prepareStatement("select * from employee where ename='"+uname+"'");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
            jLabel68.setText(db.rst.getString("eid"));
            jLabel84.setText(db.rst.getString("fname"));
            jLabel83.setText(db.rst.getString("email"));
            jLabel82.setText(db.rst.getString("pan"));
            jLabel81.setText(db.rst.getString("pin"));
            jLabel80.setText(db.rst.getString("city"));
            jLabel79.setText(db.rst.getString("states"));
            jLabel78.setText(db.rst.getString("country"));
            jLabel69.setText(db.rst.getString("dob"));
            jLabel71.setText(db.rst.getString("mobile"));
            jLabel73.setText(db.rst.getString("aadhar"));
            jLabel76.setText(db.rst.getString("post"));
            jLabel58.setText(db.rst.getString("address"));
            jLabel70.setText(db.rst.getString("gender"));
            jLabel74.setText(db.rst.getString("high_edu"));
            jLabel77.setText(db.rst.getString("department"));
            jLabel75.setText(db.rst.getString("experience"));
            Blob filen=db.rst.getBlob("photo");
            byte[] cont=filen.getBytes(1L,(int)filen.length());
            ImageIcon ik=new ImageIcon(cont);
            Image img=ik.getImage();
            Image nimg=img.getScaledInstance(jLabel65.getWidth(),jLabel65.getHeight(),java.awt.Image.SCALE_SMOOTH);
            ik=new ImageIcon(nimg);
            jLabel65.setIcon(ik);
            }
        else
        {
            JOptionPane.showMessageDialog(this,"No Match Found.");
        }
        } catch (Exception e) {
        e.printStackTrace();
        } 
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

jLabel121.setText(eid);
jLabel104.setText(uname);
        attendence.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
Salary.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Vector<String> head=new Vector<String>();
            head.add("Date");
            head.add("Attendance type");
            Vector<Vector<String>> data=new Vector<Vector<String>>();
        DBConn db=new DBConn();
        db.pstmt=db.con.prepareStatement("select datee,attendance from attendance where eid='"+eid+"'");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            String d=db.rst.getString(1);
            if(d.substring(3,5).equals(jComboBox1.getSelectedItem().toString())&&d.substring(6,10).equals(jComboBox2.getSelectedItem().toString()))
            {
                Vector<String> temp=new Vector<String>();
                temp.add(db.rst.getString(1));
                temp.add(db.rst.getString(2));
                data.add(temp);
            }
                }
        jTable1.setModel(new DefaultTableModel(data,head));
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        DBConn db=new DBConn();
        db.pstmt=db.con.prepareStatement("select * from salary where eid='"+eid+"' and mont='"+jComboBox3.getSelectedItem().toString()+"' and year='"+jComboBox4.getSelectedItem().toString()+"'");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
            jTextField32.setText(db.rst.getString(1));
            jTextField35.setText(db.rst.getString(2));
            jTextField33.setText(db.rst.getString(4));
            jTextField30.setText(db.rst.getString(5));
            jTextField38.setText(db.rst.getString(6));
            jTextField36.setText(db.rst.getString(7));
            jTextField37.setText(db.rst.getString(8));
            jLabel125.setText(db.rst.getString(9));//Do from here
            jLabel126.setText(db.rst.getString(10));
            jLabel127.setText(db.rst.getString(11));
            jLabel128.setText(db.rst.getString(12));
            jLabel129.setText(db.rst.getString(13));
            jLabel130.setText(db.rst.getString(14));
            jLabel131.setText(db.rst.getString(15));
            jTextField34.setText(db.rst.getString(16));
            
        }
        } catch (Exception e) {
        e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame Salary;
    private javax.swing.JInternalFrame attendence;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
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
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JInternalFrame profile;
    // End of variables declaration//GEN-END:variables
}

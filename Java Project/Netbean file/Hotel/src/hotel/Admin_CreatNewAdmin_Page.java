/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import java.awt.Color;
import java.sql.*;

import javax.swing.JOptionPane;

/**
 *
 * @author sunny
 */
public class Admin_CreatNewAdmin_Page extends javax.swing.JFrame {

    int IDuser = 1;
    int a = 0;
    public Admin_CreatNewAdmin_Page() {
        initComponents();
        get_info();
          close_checker();
    }

     public Admin_CreatNewAdmin_Page(int ID) {
        initComponents();
        IDuser = ID;
        get_info();
       close_checker(); 
    }
     
     private void close_checker(){
     FNChecker.setVisible(false);
     LNChecker.setVisible(false);
     PNChecker.setVisible(false);
     EMChecker.setVisible(false);
     PSChecker.setVisible(false);
     RPPSChecker.setVisible(false);
     }
     
     private void get_info(){
 
     
     try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
 
    String sql = "SELECT * FROM hotel.admin_account WHERE Admin_ID = ?;";
  PreparedStatement st1 = con.prepareStatement(sql);
  st1.setInt(1, IDuser);
  
  
   ResultSet st11 = st1.executeQuery();
    while(st11.next()){
        int ID = st11.getInt("Admin_ID");
     String username = st11.getString("Admin_Email");
     String password = st11.getString("Admin_password");
     String usernameF = st11.getString("Admin_FName");
     String usernameL = st11.getString("Admin_LName");
     String welcome = "Welcome " + usernameF +" " + usernameL;
     showName.setText(welcome);
     
    }
   
 }
      catch(Exception e){
JOptionPane.showMessageDialog(null, "UserName or Password is incorrect");
}
     
 }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        showName = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Setting1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        GetFN = new javax.swing.JTextField();
        GetLN = new javax.swing.JTextField();
        GetPN = new javax.swing.JTextField();
        GetEM = new javax.swing.JTextField();
        GetPS = new javax.swing.JPasswordField();
        GetRPPS = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Enter = new javax.swing.JButton();
        FNChecker = new javax.swing.JLabel();
        LNChecker = new javax.swing.JLabel();
        PNChecker = new javax.swing.JLabel();
        EMChecker = new javax.swing.JLabel();
        PSChecker = new javax.swing.JLabel();
        RPPSChecker = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hotel Reservation");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Create new admin account");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        showName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showName.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showName, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(showName)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        Logout.setBackground(new java.awt.Color(255, 204, 204));
        Logout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 204, 204));
        Logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\logout.png")); // NOI18N
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\newcustomersmall.png")); // NOI18N
        jLabel8.setText("Add new customer");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\arrow left.png")); // NOI18N
        jLabel1.setText("Back to Main Page");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\newadminicon.png")); // NOI18N
        jLabel5.setText("Create new admin account");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\customer-icon-small.png")); // NOI18N
        jLabel4.setText("Customer Setting");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
        });

        Setting1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Setting1.setForeground(new java.awt.Color(255, 255, 255));
        Setting1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\settingicon.png")); // NOI18N
        Setting1.setText("Account Setting");
        Setting1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Setting1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Setting1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Setting1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel5)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Setting1)
                        .addGap(18, 18, 18)
                        .addComponent(Logout))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(Logout)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Setting1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel7)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GetPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GetPSKeyReleased(evt);
            }
        });

        GetRPPS.setToolTipText("");
        GetRPPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetRPPSActionPerformed(evt);
            }
        });
        GetRPPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GetRPPSKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GetRPPSKeyReleased(evt);
            }
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel9.setText("Phone Number");

        jLabel10.setText("Email");

        jLabel11.setText("Password");

        jLabel12.setText("Repeat Password");

        Enter.setText("Create New Admin Account");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        FNChecker.setText("*");

        LNChecker.setText("*");

        PNChecker.setText("*");

        EMChecker.setText("*");

        PSChecker.setText("*");

        RPPSChecker.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Enter, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                    .addComponent(GetFN)
                    .addComponent(GetLN)
                    .addComponent(GetPN)
                    .addComponent(GetEM)
                    .addComponent(GetPS)
                    .addComponent(GetRPPS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LNChecker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PNChecker, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(EMChecker, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(PSChecker, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(RPPSChecker, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(FNChecker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(FNChecker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetLN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(LNChecker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(PNChecker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(EMChecker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(PSChecker))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetRPPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(RPPSChecker))
                .addGap(27, 27, 27)
                .addComponent(Enter)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new Lao_Poet_Hotel_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setForeground(Color.white);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked

        new Lao_Poet_Hotel_Page().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Logout.setForeground(Color.white);
    }//GEN-LAST:event_LogoutMouseExited

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Logout.setForeground(Color.black);
    }//GEN-LAST:event_LogoutMouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked

        new Lao_Poet_Hotel_Check_Room(IDuser).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        jLabel8.setForeground(Color.white);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Admin_CreatNewAdmin_Page(IDuser).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        jLabel5.setForeground(Color.white);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        new Admin_CustomerSetting_Page(IDuser).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Admin_main_page(IDuser).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
      jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
      jLabel1.setForeground(Color.BLACK); 
    }//GEN-LAST:event_jLabel1MouseExited

    private void Setting1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Setting1MouseClicked
        new Admin_AccountSetting_Page(IDuser).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Setting1MouseClicked

    private void Setting1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Setting1MouseExited
        Setting1.setForeground(Color.WHITE);
    }//GEN-LAST:event_Setting1MouseExited

    private void Setting1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Setting1MouseEntered
        Setting1.setForeground(Color.BLACK);
    }//GEN-LAST:event_Setting1MouseEntered

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        String FN = GetFN.getText();
        String LN = GetLN.getText();
        String PN = GetPN.getText();
        String EM = GetEM.getText();
        String PS = GetPS.getText();
        String RPPS = GetRPPS.getText(); 
    
        
        if(FN.equals("") || LN.equals("") || PN.equals("") || EM.equals("")|| PS.equals("")|| RPPS.equals("")){
        JOptionPane.showMessageDialog(null, "Please Fill in all the boxese");
        
        
        if(FN.equals("")){
       FNChecker.setVisible(true);
       FNChecker.setForeground(Color.red);
       FNChecker.setText("First name not fill");
       }
       else{
         FNChecker.setVisible(false);
       }
        
            
        if(LN.equals("")){
       LNChecker.setVisible(true);
       LNChecker.setForeground(Color.red);
       LNChecker.setText("Last name not fill");
       }
       else{
         LNChecker.setVisible(false);
       }
         
             if(PN.equals("")){
       PNChecker.setVisible(true);
       PNChecker.setForeground(Color.red);
       PNChecker.setText("Phone number not fill");
       }
       else{
         PNChecker.setVisible(false);
       }
         
             if(EM.equals("")){
       EMChecker.setVisible(true);
       EMChecker.setForeground(Color.red);
       EMChecker.setText("Email not fill");
       }
       else{
         EMChecker.setVisible(false);
       }      
             
              if(PS.equals("")){
       PSChecker.setVisible(true);
       PSChecker.setForeground(Color.red);
       PSChecker.setText("Password not fill");
       }
       else{
         PSChecker.setVisible(false);
       }      
             
              if(RPPS.equals("")){
       RPPSChecker.setVisible(true);
       RPPSChecker.setForeground(Color.red);
       RPPSChecker.setText("Repeat password not fill");
       }
       else{
         RPPSChecker.setVisible(false);
       }
             
        }
      
        else{  
            if(PS.equals(RPPS)){
                 if ( a == 1 ){
            JOptionPane.showMessageDialog(this, "Please make your password longer and add number some number into your password as while");
        }
                 else if(a ==2){
                     JOptionPane.showMessageDialog(this, "Please add some number into your password");
                 }
                 else if(a == 3){
                  close_checker();   
              
                 saveinfo();
                 }
                 else{
                  JOptionPane.showMessageDialog(this, "Something is wrong with your password and repeat password, please rewrite password and repeat password again");
                 }
        }
            else{
             JOptionPane.showMessageDialog(null, "Password and Repeat Password is not the same");
            }
        }
    }//GEN-LAST:event_EnterActionPerformed

    private void saveinfo(){
      String FN = GetFN.getText();
        String LN = GetLN.getText();
        String PN = GetPN.getText();
        String EM = GetEM.getText();
        String PS = GetPS.getText();
        String RPPS = GetRPPS.getText(); 
        int IDfornewc = 0;
        String CHECKEMrepeat ;
        int checkEMR = 0;
        int checkPhoneR = 0;
        String CHECKPNrepeat;
        
        
        
        try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
   
   String sql2 = "SELECT * FROM hotel.admin_account;"; 
   PreparedStatement st2 = con.prepareStatement(sql2); 
   ResultSet st12 = st2.executeQuery();
     while(st12.next()){
         CHECKEMrepeat = st12.getString("Admin_Email");
         CHECKPNrepeat = st12.getString("Admin_PhoneNum");
         if(CHECKEMrepeat.equals(EM)){
         checkEMR = 1;
         }
         if(CHECKPNrepeat.equals(PN)){
         checkPhoneR = 1;
         }
   }
   if(checkEMR == 0 && checkPhoneR == 0 ){
  String sql1 = "SELECT MAX(Admin_ID) AS Admin_ID FROM admin_account;"; 
   PreparedStatement st = con.prepareStatement(sql1); 
   ResultSet st11 = st.executeQuery();
     while(st11.next()){
         IDfornewc = st11.getInt("Admin_ID") + 1;
   }
   
   String sql = "INSERT INTO admin_account(Admin_ID,Admin_Email,Admin_password,Admin_FName,Admin_LName,Admin_PhoneNum) VALUE (?,?,?,?,?,?);"; 
   PreparedStatement st1 = con.prepareStatement(sql);
   st1.setInt(1, IDfornewc);
   st1.setString(2,EM); 
   st1.setString(3,PS); 
   st1.setString(4,FN); 
   st1.setString(5,LN); 
   st1.setString(6,PN); 
  int h = st1.executeUpdate();

    if(h>0){ JOptionPane.showMessageDialog(null, "Created New Account");
}
   }
   else if (checkEMR == 1 && checkPhoneR == 1){
   JOptionPane.showMessageDialog(null, "This Email Account and Phone Number has already been use");
   }
   else if(checkEMR == 1){
   JOptionPane.showMessageDialog(null, "This Email Account has already been use");
   }
   else if(checkPhoneR == 1){
   JOptionPane.showMessageDialog(null, "This Phone Number has already been use");
   }
 
  
   
   }
     catch(Exception e){
JOptionPane.showMessageDialog(null, "not connected");
}
    }
    
    
    private void GetRPPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetRPPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GetRPPSActionPerformed

    private void GetRPPSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GetRPPSKeyTyped
     
    }//GEN-LAST:event_GetRPPSKeyTyped

    private void GetRPPSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GetRPPSKeyReleased
    checkforpasswordsim();
    }//GEN-LAST:event_GetRPPSKeyReleased

    private void checkforpasswordsim(){
          RPPSChecker.setVisible(true);
        String Password, RePassword;
        Password = GetPS.getText();
        RePassword = GetRPPS.getText();
        if(0==Password.compareTo(RePassword)){
            RPPSChecker.setForeground(Color.green);
            RPPSChecker.setText("Correct");
        }
        else{RPPSChecker.setForeground(Color.red);
            RPPSChecker.setText("Incorrect");}
    }
    
    
    private void GetPSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GetPSKeyReleased
        
        PSChecker.setVisible(true);
          checkforpasswordsim();
        String Password = GetPS.getText();
        int length = Password.length();

        String sample = GetPS.getText();
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder sbs = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
                sbs.append(c);
            }
        }

        String singleString = sb.toString();
        if (singleString.isEmpty()){
            if(length >= 0 && length <= 5){
                PSChecker.setForeground(Color.red);
                PSChecker.setText("Weak");
                a = 1;
            }
            else if(length >= 6 ){
                PSChecker.setForeground(Color.ORANGE);
                PSChecker.setText("Ok");
                a = 2;
            }

        }
        else{
            if(length >= 0 && length <= 5){
                PSChecker.setForeground(Color.red);
                PSChecker.setText("Weak");
                a = 1;
            }
            else if(length >= 6 ){
                PSChecker.setForeground(Color.GREEN);
                PSChecker.setText("Strong");
                a = 3;
            }
        }
    }//GEN-LAST:event_GetPSKeyReleased

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
            java.util.logging.Logger.getLogger(Admin_CreatNewAdmin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_CreatNewAdmin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_CreatNewAdmin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_CreatNewAdmin_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_CreatNewAdmin_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EMChecker;
    private javax.swing.JButton Enter;
    private javax.swing.JLabel FNChecker;
    private javax.swing.JTextField GetEM;
    private javax.swing.JTextField GetFN;
    private javax.swing.JTextField GetLN;
    private javax.swing.JTextField GetPN;
    private javax.swing.JPasswordField GetPS;
    private javax.swing.JPasswordField GetRPPS;
    private javax.swing.JLabel LNChecker;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel PNChecker;
    private javax.swing.JLabel PSChecker;
    private javax.swing.JLabel RPPSChecker;
    private javax.swing.JLabel Setting1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel showName;
    // End of variables declaration//GEN-END:variables
}

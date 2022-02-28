/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sunny
 */
public class Lao_Poet_Hotel_Page extends javax.swing.JFrame {

     int CIDChecker;
      int CODChecker; 
    int RID;
    String J1 = "January";
            String F1 = "February";
        String Mr1 = "March";
        String A1 = "April";
        String My1 = "May";
        String Jn1 = "June";
        String Jl1 = "July";
        String Ag1 = "August";
        String S1 = "September";
        String Otb1 = "October";
        String Nvb1 = "November";
        String Dcb1 = "December";
        int date = 0;
        int dataOut = 0;
        int d = 1;
        int a = 0;
        int b = 0;
        int monthIn = 0;
        int MDFCIDS = 0;
        int monthOut = 0;
        int MDFCIDS1 = 0;
        int c= 0;
        int save = 0;
int NextPage = 0;
     int NextPage1 = 0;   
    int L = 1;
    int arrayI;
    int level = 1 ;
    int FL;
      String getRoomName = "0";
        int CFD = 0;
        String RN;
        int Rating_ID;
          String getEmailrepeat = "";
        
int R1A1= 0;
int R1A2= 0;
int R1A3= 0;
int R1A4= 0;
int R1B1= 0;
int R1B2= 0;
int R1B3= 0;
int R1B4= 0;
int R1C1= 0;
int R1C2= 0;
int R1C3= 0;
int R1C4= 0;
int R2A1= 0;
int R2A2= 0;
int R2A3= 0;
int R2A4= 0;
int R2B1= 0;
int R2B2= 0;
int R2B3= 0;
int R2B4= 0;
int R2C1= 0;
int R2C2= 0;
int R2C3= 0;
int R2C4= 0;
int R3A1= 0;
int R3A2= 0;
int R3A3= 0;
int R3A4= 0;
int R3B1= 0;
int R3B2= 0;
int R3B3= 0;
int R3B4= 0;
int R3C1= 0;
int R3C2= 0;
int R3C3= 0;
int R3C4= 0;
int R4A1= 0;
int R4A2= 0;
int R4A3= 0;
int R4A4= 0;
int R4B1= 0;
int R4B2= 0;
int R4B3= 0;
int R4B4= 0;
int R4C1= 0;
int R4C2= 0;
int R4C3= 0;
int R4C4= 0;
int R5A1= 0;
int R5A2= 0;
int R5A3= 0;
int R5A4= 0;
int R5B1= 0;
int R5B2= 0;
int R5B3= 0;
int R5B4= 0;
int R5C1= 0;
int R5C2= 0;
int R5C3= 0;
int R5C4= 0;
int R6A1= 0;
int R6A2= 0;
int R6A3= 0;
int R6A4= 0;
int R6B1= 0;
int R6B2= 0;
int R6B3= 0;
int R6B4= 0;
int R6C1= 0;
int R6C2= 0;
int R6C3= 0;
int R6C4= 0;
int R7A1= 0;
int R7A2= 0;
int R7A3= 0;
int R7A4= 0;
int R7B1= 0;
int R7B2= 0;
int R7B3= 0;
int R7B4= 0;
int R7C1= 0;
int R7C2= 0;
int R7C3= 0;
int R7C4= 0;
int R8A1= 0;
int R8A2= 0;
int R8A3= 0;
int R8A4= 0;
int R8B1= 0;
int R8B2= 0;
int R8B3= 0;
int R8B4= 0;
int R8C1= 0;
int R8C2= 0;
int R8C3= 0;
int R8C4= 0;
int R9A1= 0;
int R9A2= 0;
int R9A3= 0;
int R9A4= 0;
int R9B1= 0;
int R9B2= 0;
int R9B3= 0;
int R9B4= 0;
int R9C1= 0;
int R9C2= 0;
int R9C3= 0;
int R9C4= 0;
int R10A1= 0;
int R10A2= 0;
int R10A3= 0;
int R10A4= 0;
int R10B1= 0;
int R10B2= 0;
int R10B3= 0;
int R10B4= 0;
int R10C1= 0;
int R10C2= 0;
int R10C3= 0;
int R10C4= 0;

        
        
    public Lao_Poet_Hotel_Page() {
        initComponents();
            In32.setVisible(false);
        Out32.setVisible(false);
       
        show_rating();  
        
    }

     private void getmonth(){
   
         Object ComInMonth1 = ComInMonth. getSelectedItem();
      String ComInMonth2=ComInMonth1.toString();
  
   
        if ( ComInMonth2.equals(J1) ){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
           date = 0;
        }
        else if( ComInMonth2.equals(F1)){
              In31.setVisible(false);
            In30.setVisible(false);
            In29.setVisible(false);
           date = 31;
        }
        else if( ComInMonth2.equals(Mr1)){
              In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
           date = 59;
        }
        else if( ComInMonth2.equals(A1)){
              In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
          date = 90;
        }
        else if( ComInMonth2.equals(My1)){
              In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
          date = 120;
        }
        else if( ComInMonth2.equals(Jn1)){
              In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
          date = 151;
        }
        else if( ComInMonth2.equals(Jl1)){
              In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
        date = 181;
        }
        else if( ComInMonth2.equals(Ag1)){
              In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
           date = 212;
        }
        else if( ComInMonth2.equals(S1)){
              In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
        date = 243;
        }
        else if( ComInMonth2.equals(Otb1)){
              In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
          date = 273;
        }
        else if( ComInMonth2.equals(Nvb1)){
              In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
      date = 304;
        }
        else if( ComInMonth2.equals(Dcb1)){
              In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
      date = 334;
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

        GroupCID = new javax.swing.ButtonGroup();
        GroupCOD = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Facilities_List = new javax.swing.JButton();
        rule_list = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Booking = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        ComInMonth = new javax.swing.JComboBox<>();
        ComOutMonth = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        In8 = new javax.swing.JRadioButton();
        In16 = new javax.swing.JRadioButton();
        In24 = new javax.swing.JRadioButton();
        In32 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        In6 = new javax.swing.JRadioButton();
        In14 = new javax.swing.JRadioButton();
        In22 = new javax.swing.JRadioButton();
        In30 = new javax.swing.JRadioButton();
        jPanel29 = new javax.swing.JPanel();
        In1 = new javax.swing.JRadioButton();
        In9 = new javax.swing.JRadioButton();
        In17 = new javax.swing.JRadioButton();
        In25 = new javax.swing.JRadioButton();
        jPanel33 = new javax.swing.JPanel();
        In5 = new javax.swing.JRadioButton();
        In13 = new javax.swing.JRadioButton();
        In21 = new javax.swing.JRadioButton();
        In29 = new javax.swing.JRadioButton();
        jPanel43 = new javax.swing.JPanel();
        In4 = new javax.swing.JRadioButton();
        In12 = new javax.swing.JRadioButton();
        In20 = new javax.swing.JRadioButton();
        In28 = new javax.swing.JRadioButton();
        jPanel44 = new javax.swing.JPanel();
        In3 = new javax.swing.JRadioButton();
        In11 = new javax.swing.JRadioButton();
        In19 = new javax.swing.JRadioButton();
        In27 = new javax.swing.JRadioButton();
        jPanel45 = new javax.swing.JPanel();
        In2 = new javax.swing.JRadioButton();
        In10 = new javax.swing.JRadioButton();
        In18 = new javax.swing.JRadioButton();
        In26 = new javax.swing.JRadioButton();
        jPanel28 = new javax.swing.JPanel();
        In31 = new javax.swing.JRadioButton();
        In23 = new javax.swing.JRadioButton();
        In15 = new javax.swing.JRadioButton();
        In7 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        Out8 = new javax.swing.JRadioButton();
        Out16 = new javax.swing.JRadioButton();
        Out24 = new javax.swing.JRadioButton();
        Out32 = new javax.swing.JRadioButton();
        jPanel26 = new javax.swing.JPanel();
        Out6 = new javax.swing.JRadioButton();
        Out14 = new javax.swing.JRadioButton();
        Out22 = new javax.swing.JRadioButton();
        Out30 = new javax.swing.JRadioButton();
        jPanel31 = new javax.swing.JPanel();
        Out1 = new javax.swing.JRadioButton();
        Out9 = new javax.swing.JRadioButton();
        Out17 = new javax.swing.JRadioButton();
        Out25 = new javax.swing.JRadioButton();
        jPanel34 = new javax.swing.JPanel();
        Out5 = new javax.swing.JRadioButton();
        Out13 = new javax.swing.JRadioButton();
        Out21 = new javax.swing.JRadioButton();
        Out29 = new javax.swing.JRadioButton();
        jPanel46 = new javax.swing.JPanel();
        Out4 = new javax.swing.JRadioButton();
        Out12 = new javax.swing.JRadioButton();
        Out20 = new javax.swing.JRadioButton();
        Out28 = new javax.swing.JRadioButton();
        jPanel47 = new javax.swing.JPanel();
        Out3 = new javax.swing.JRadioButton();
        Out11 = new javax.swing.JRadioButton();
        Out19 = new javax.swing.JRadioButton();
        Out27 = new javax.swing.JRadioButton();
        jPanel48 = new javax.swing.JPanel();
        Out2 = new javax.swing.JRadioButton();
        Out10 = new javax.swing.JRadioButton();
        Out18 = new javax.swing.JRadioButton();
        Out26 = new javax.swing.JRadioButton();
        jPanel30 = new javax.swing.JPanel();
        Out7 = new javax.swing.JRadioButton();
        Out15 = new javax.swing.JRadioButton();
        Out23 = new javax.swing.JRadioButton();
        Out31 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        Facilities_List.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Facilities_List.setText("Facilities");
        Facilities_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Facilities_ListActionPerformed(evt);
            }
        });

        rule_list.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        rule_list.setText("Price");
        rule_list.setBorder(null);
        rule_list.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rule_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rule_listActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hotel Reservation");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        Booking.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Booking.setText("Booking");
        Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingActionPerformed(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\login.png")); // NOI18N
        jLabel20.setText("Admin Only Page");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Booking)
                .addGap(71, 71, 71)
                .addComponent(Facilities_List)
                .addGap(76, 76, 76)
                .addComponent(rule_list, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rule_list, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Facilities_List, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel20))
                .addContainerGap())
        );

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));
        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Lao Poet Hotel");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(76, 76, 76))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        jPanel6.setBackground(new java.awt.Color(255, 204, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("See only all Family Room:");

        jButton2.setText("Available Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\queen-size-bed-pngrepo-com (1).png")); // NOI18N
        jLabel14.setText("Family Room");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\queen-size-bed-pngrepo-com (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("Available Room");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("See only all 2 Twins Bed Room:");

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\twin (1).png")); // NOI18N
        jLabel17.setText("Twins Bed Room");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 204, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("See only all 1 Queen Bed Room:");

        jButton5.setText("Available Room");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\queen-size-bed-pngrepo-com (1).png")); // NOI18N
        jLabel16.setText("1 Queen Bed Room");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("See all available room :");

        jButton1.setText("Available Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jLabel9.setText("and a very nice view of Vientaine");

        jLabel8.setText("Is located in the middle of Vientaine Capital City of lao, has one roof top swimming pool ");

        jLabel22.setText("133 reviews");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Very good");

        jPanel11.setBackground(new java.awt.Color(51, 51, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("8.4");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\Hotel1.png")); // NOI18N

        jSlider1.setMaximum(10);
        jSlider1.setValue(0);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Enter Email");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
        });

        jToggleButton1.setText("submit rating");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("0 to 10 =");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0/10");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jToggleButton1)
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addComponent(jSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jTextField1)))))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22))
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel19))
                        .addGap(7, 7, 7)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jToggleButton1))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Check in Data");
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 140));
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Check out Data");
        jLabel3.setToolTipText("");
        jLabel3.setMaximumSize(new java.awt.Dimension(40, 140));
        jLabel3.setName(""); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 80));

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("See Option");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ComInMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        ComInMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComInMonthMouseClicked(evt);
            }
        });
        ComInMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComInMonthActionPerformed(evt);
            }
        });

        ComOutMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        ComOutMonth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComOutMonthMouseClicked(evt);
            }
        });
        ComOutMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComOutMonthActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 51, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Booking");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 204, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel22.setBackground(new java.awt.Color(255, 204, 0));

        In8.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In8);
        In8.setText("8");
        In8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In8ActionPerformed(evt);
            }
        });

        In16.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In16);
        In16.setText("16");
        In16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In16ActionPerformed(evt);
            }
        });

        In24.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In24);
        In24.setText("24");
        In24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In24ActionPerformed(evt);
            }
        });

        In32.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In32);
        In32.setSelected(true);
        In32.setText("32");
        In32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(In24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(In32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(In16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(In8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(In8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(255, 204, 0));

        In6.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In6);
        In6.setText("6");
        In6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In6ActionPerformed(evt);
            }
        });

        In14.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In14);
        In14.setText("14");
        In14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In14ActionPerformed(evt);
            }
        });

        In22.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In22);
        In22.setText("22");
        In22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In22ActionPerformed(evt);
            }
        });

        In30.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In30);
        In30.setText("30");
        In30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(In22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(In6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In30)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(255, 204, 0));

        In1.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In1);
        In1.setText("1");
        In1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In1ActionPerformed(evt);
            }
        });

        In9.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In9);
        In9.setText("9");
        In9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In9ActionPerformed(evt);
            }
        });

        In17.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In17);
        In17.setText("17");
        In17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In17ActionPerformed(evt);
            }
        });

        In25.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In25);
        In25.setText("25");
        In25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(In25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(In1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In25))
        );

        jPanel33.setBackground(new java.awt.Color(255, 204, 0));

        In5.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In5);
        In5.setText("5");
        In5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In5ActionPerformed(evt);
            }
        });

        In13.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In13);
        In13.setText("13");
        In13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In13ActionPerformed(evt);
            }
        });

        In21.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In21);
        In21.setText("21");
        In21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In21ActionPerformed(evt);
            }
        });

        In29.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In29);
        In29.setText("29");
        In29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(In13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(In5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In29)
                .addGap(0, 0, 0))
        );

        jPanel43.setBackground(new java.awt.Color(255, 204, 0));

        In4.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In4);
        In4.setText("4");
        In4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In4ActionPerformed(evt);
            }
        });

        In12.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In12);
        In12.setText("12");
        In12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In12ActionPerformed(evt);
            }
        });

        In20.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In20);
        In20.setText("20");
        In20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In20ActionPerformed(evt);
            }
        });

        In28.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In28);
        In28.setText("28");
        In28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(In12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(In20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(In4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(In28))
                .addGap(1, 1, 1))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(In4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In28)
                .addContainerGap())
        );

        jPanel44.setBackground(new java.awt.Color(255, 204, 0));

        In3.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In3);
        In3.setText("3");
        In3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In3ActionPerformed(evt);
            }
        });

        In11.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In11);
        In11.setText("11");
        In11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In11ActionPerformed(evt);
            }
        });

        In19.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In19);
        In19.setText("19");
        In19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In19ActionPerformed(evt);
            }
        });

        In27.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In27);
        In27.setText("27");
        In27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(In11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(In3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In27)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel45.setBackground(new java.awt.Color(255, 204, 0));

        In2.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In2);
        In2.setText("2");
        In2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In2ActionPerformed(evt);
            }
        });

        In10.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In10);
        In10.setText("10");
        In10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In10ActionPerformed(evt);
            }
        });

        In18.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In18);
        In18.setText("18");
        In18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In18ActionPerformed(evt);
            }
        });

        In26.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In26);
        In26.setText("26");
        In26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(In18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(In10))
                .addGap(1, 1, 1))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(In2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In26)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 204, 0));

        In31.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In31);
        In31.setText("31");
        In31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In31ActionPerformed(evt);
            }
        });

        In23.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In23);
        In23.setText("23");
        In23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In23ActionPerformed(evt);
            }
        });

        In15.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In15);
        In15.setText("15");
        In15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In15ActionPerformed(evt);
            }
        });

        In7.setBackground(new java.awt.Color(255, 204, 51));
        GroupCID.add(In7);
        In7.setText("7");
        In7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(In31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(In23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(In15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(In7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(In7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(In31)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(255, 204, 0));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel25.setBackground(new java.awt.Color(255, 204, 0));

        Out8.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out8);
        Out8.setText("8");
        Out8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out8ActionPerformed(evt);
            }
        });

        Out16.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out16);
        Out16.setText("16");
        Out16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out16ActionPerformed(evt);
            }
        });

        Out24.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out24);
        Out24.setText("24");
        Out24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out24ActionPerformed(evt);
            }
        });

        Out32.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out32);
        Out32.setSelected(true);
        Out32.setText("32");
        Out32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out16)
                    .addComponent(Out32))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out24, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(Out8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(Out8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel26.setBackground(new java.awt.Color(255, 204, 0));

        Out6.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out6);
        Out6.setText("6");
        Out6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out6ActionPerformed(evt);
            }
        });

        Out14.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out14);
        Out14.setText("14");
        Out14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out14ActionPerformed(evt);
            }
        });

        Out22.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out22);
        Out22.setText("22");
        Out22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out22ActionPerformed(evt);
            }
        });

        Out30.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out30);
        Out30.setText("30");
        Out30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Out14)
                            .addComponent(Out22)
                            .addComponent(Out30))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(Out6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out30))
        );

        jPanel31.setBackground(new java.awt.Color(255, 204, 0));

        Out1.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out1);
        Out1.setText("1");
        Out1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out1ActionPerformed(evt);
            }
        });

        Out9.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out9);
        Out9.setText("9");
        Out9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out9ActionPerformed(evt);
            }
        });

        Out17.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out17);
        Out17.setText("17");
        Out17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out17ActionPerformed(evt);
            }
        });

        Out25.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out25);
        Out25.setText("25");
        Out25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Out1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Out17))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Out25, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(Out1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out25))
        );

        jPanel34.setBackground(new java.awt.Color(255, 204, 0));

        Out5.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out5);
        Out5.setText("5");
        Out5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out5ActionPerformed(evt);
            }
        });

        Out13.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out13);
        Out13.setText("13");
        Out13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out13ActionPerformed(evt);
            }
        });

        Out21.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out21);
        Out21.setText("21");
        Out21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out21ActionPerformed(evt);
            }
        });

        Out29.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out29);
        Out29.setText("29");
        Out29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Out13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Out21)
                    .addComponent(Out29))
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addComponent(Out5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out29))
        );

        jPanel46.setBackground(new java.awt.Color(255, 204, 0));

        Out4.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out4);
        Out4.setText("4");
        Out4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out4ActionPerformed(evt);
            }
        });

        Out12.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out12);
        Out12.setText("12");
        Out12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out12ActionPerformed(evt);
            }
        });

        Out20.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out20);
        Out20.setText("20");
        Out20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out20ActionPerformed(evt);
            }
        });

        Out28.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out28);
        Out28.setText("28");
        Out28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Out28, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Out12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Out20, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(Out4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out28))
        );

        jPanel47.setBackground(new java.awt.Color(255, 204, 0));

        Out3.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out3);
        Out3.setText("3");
        Out3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out3ActionPerformed(evt);
            }
        });

        Out11.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out11);
        Out11.setText("11");
        Out11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out11ActionPerformed(evt);
            }
        });

        Out19.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out19);
        Out19.setText("19");
        Out19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out19ActionPerformed(evt);
            }
        });

        Out27.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out27);
        Out27.setText("27");
        Out27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Out27, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Out11)
                                .addComponent(Out19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(2, 2, 2))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addComponent(Out3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out27)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel48.setBackground(new java.awt.Color(255, 204, 0));

        Out2.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out2);
        Out2.setText("2");
        Out2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out2ActionPerformed(evt);
            }
        });

        Out10.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out10);
        Out10.setText("10");
        Out10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out10ActionPerformed(evt);
            }
        });

        Out18.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out18);
        Out18.setText("18");
        Out18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out18ActionPerformed(evt);
            }
        });

        Out26.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out26);
        Out26.setText("26");
        Out26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Out26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Out18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Out2)
            .addComponent(Out10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addComponent(Out2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out26))
        );

        jPanel30.setBackground(new java.awt.Color(255, 204, 0));

        Out7.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out7);
        Out7.setText("7");
        Out7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out7ActionPerformed(evt);
            }
        });

        Out15.setBackground(new java.awt.Color(255, 204, 0));
        GroupCOD.add(Out15);
        Out15.setText("15");
        Out15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out15ActionPerformed(evt);
            }
        });

        Out23.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out23);
        Out23.setText("23");
        Out23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out23ActionPerformed(evt);
            }
        });

        Out31.setBackground(new java.awt.Color(255, 204, 51));
        GroupCOD.add(Out31);
        Out31.setText("31");
        Out31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Out15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Out23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Out31, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(Out7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Out23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Out31))
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComOutMonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComInMonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComInMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComOutMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void Facilities_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Facilities_ListActionPerformed
a = 1;
        new Lao_Poet_Hotel_Page1(a).setVisible(true);
 
    
   this.setVisible(false);
         
     
    }//GEN-LAST:event_Facilities_ListActionPerformed

    private void BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingActionPerformed

      
    }//GEN-LAST:event_BookingActionPerformed

    private void rule_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rule_listActionPerformed
     a = 2;
       new Lao_Poet_Hotel_Page1(a).setVisible(true);
 
    
   this.setVisible(false);
         
    }//GEN-LAST:event_rule_listActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         new Lao_Poet_Hotel_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (Out32.isSelected() || In32.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select Date first");
        }
        else if(dataOut == date){

            JOptionPane.showMessageDialog(null, "Date must not be in the same date");

        }
        else{
            if(dataOut < date){
                dataOut = dataOut + 365;
            }
            activate();
            NextPage = 1;

        }
    }//GEN-LAST:event_jButton4ActionPerformed

     private void activate(){
            
            
       reset_date();
 
  
    
        try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
   String sql1 = "SELECT * FROM customer_stay_detail WHERE Check_For_Customer = 1;";
   ResultSet rs1 = myStat.executeQuery(sql1);
   while(rs1.next()){
       String SDID = String.valueOf(rs1.getInt("Customer_stay_Detail_ID"));
        CIDChecker = rs1.getInt("Check_In_Date");
        CODChecker = rs1.getInt("Check_Out_Date");
        RID = rs1.getInt("Hotel_Room_Type_ID");
  String cs = String.valueOf(c);
 CheckForAvaible();
   }
}catch(Exception e){
  
}            
        save = 0;

    }       
     
     
     private void CheckForAvaible(){
        String CIDS = String.valueOf(date);
        int InCID = Integer.valueOf(CIDS);
        String CODS = String.valueOf(dataOut);
        int InCOD = Integer.valueOf(CODS);
       
             if( (InCID <= CIDChecker && InCOD >= CIDChecker) || (InCID <= CODChecker && InCOD >= CODChecker) || ( CIDChecker <= InCID &&  CODChecker>= InCID ) || ( CIDChecker <= InCOD &&  CODChecker>= InCOD )) {
                
                 try{
                     Class.forName("com.mysql.jdbc.Driver");
                     Connection con1 =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
                     Statement myStat2 = con1.createStatement();
                     String sql1 = "SELECT * FROM hotel_room_type WHERE Hotel_Room_Type_ID = "+RID+";";
                     ResultSet rs3 = myStat2.executeQuery(sql1);
                     while (rs3.next()){
                          FL = rs3.getInt("Hotel_Floor_Room_Level");
                          RN = rs3.getString("Hotel_Room_Name");
             
               
                       roomLock();
                         
                     }
      
              
                     
                 }catch(Exception e){
         
                 }           } else {
                 roomLock();
                  
             }
                
        
       // }
       //  JOptionPane.showMessageDialog(null, " end For ");
        save = 0;
   // JOptionPane.showMessageDialog(null, save);
    }
     private void reset_date(){
 
R1A1= 0;
R1A2= 0;
R1A3= 0;
R1A4= 0;
R1B1= 0;
R1B2= 0;
R1B3= 0;
R1B4= 0;
R1C1= 0;
R1C2= 0;
R1C3= 0;
R1C4= 0;
R2A1= 0;
R2A2= 0;
R2A3= 0;
R2A4= 0;
R2B1= 0;
R2B2= 0;
R2B3= 0;
R2B4= 0;
R2C1= 0;
R2C2= 0;
R2C3= 0;
R2C4= 0;
R3A1= 0;
R3A2= 0;
R3A3= 0;
R3A4= 0;
R3B1= 0;
R3B2= 0;
R3B3= 0;
R3B4= 0;
R3C1= 0;
R3C2= 0;
R3C3= 0;
R3C4= 0;
R4A1= 0;
R4A2= 0;
R4A3= 0;
R4A4= 0;
R4B1= 0;
R4B2= 0;
R4B3= 0;
R4B4= 0;
R4C1= 0;
R4C2= 0;
R4C3= 0;
R4C4= 0;
R5A1= 0;
R5A2= 0;
R5A3= 0;
R5A4= 0;
R5B1= 0;
R5B2= 0;
R5B3= 0;
R5B4= 0;
R5C1= 0;
R5C2= 0;
R5C3= 0;
R5C4= 0;
R6A1= 0;
R6A2= 0;
R6A3= 0;
R6A4= 0;
R6B1= 0;
R6B2= 0;
R6B3= 0;
R6B4= 0;
R6C1= 0;
R6C2= 0;
R6C3= 0;
R6C4= 0;
R7A1= 0;
R7A2= 0;
R7A3= 0;
R7A4= 0;
R7B1= 0;
R7B2= 0;
R7B3= 0;
R7B4= 0;
R7C1= 0;
R7C2= 0;
R7C3= 0;
R7C4= 0;
R8A1= 0;
R8A2= 0;
R8A3= 0;
R8A4= 0;
R8B1= 0;
R8B2= 0;
R8B3= 0;
R8B4= 0;
R8C1= 0;
R8C2= 0;
R8C3= 0;
R8C4= 0;
R9A1= 0;
R9A2= 0;
R9A3= 0;
R9A4= 0;
R9B1= 0;
R9B2= 0;
R9B3= 0;
R9B4= 0;
R9C1= 0;
R9C2= 0;
R9C3= 0;
R9C4= 0;
R10A1= 0;
R10A2= 0;
R10A3= 0;
R10A4= 0;
R10B1= 0;
R10B2= 0;
R10B3= 0;
R10B4= 0;
R10C1= 0;
R10C2= 0;
R10C3= 0;
R10C4= 0;


    }
     public void roomLock(){
     
            roomlock1();
           checkroom();
     
     }
     
     public void checkroom(){
     int AR = 0;
     int BR = 0;
     int CR = 0;
         if(R1A1 == 1 && R1A2 == 1 && R1A3 == 1 && R1A4 == 1 && 
R2A1 == 1 && R2A2 == 1 && R2A3 == 1 && R2A4 == 1 && 
R3A1 == 1 && R3A2 == 1 && R3A3 == 1 && R3A4 == 1 && 
R4A1 == 1 && R4A2 == 1 && R4A3 == 1 && R4A4 == 1 && 
R5A1 == 1 && R5A2 == 1 && R5A3 == 1 && R5A4 == 1 && 
R6A1 == 1 && R6A2 == 1 && R6A3 == 1 && R6A4 == 1 && 
R7A1 == 1 && R7A2 == 1 && R7A3 == 1 && R7A4 == 1 && 
R8A1 == 1 && R8A2 == 1 && R8A3 == 1 && R8A4 == 1 && 
R9A1 == 1 && R9A2 == 1 && R9A3 == 1 && R9A4 == 1 && 
R10A1 == 1 && R10A2 == 1 && R10A3 == 1 && R10A4 == 1){
          jButton2.setEnabled(false);
          jButton2.setText("No room are avalable in the time you have selected");
         }
         else{    jButton2.setEnabled(true);
         jButton2.setText("Available Room");
         }
                  if(R1B1 == 1 && R1B2 == 1 && R1B3 == 1 && R1B4 == 1 && 
R2B1 == 1 && R2B2 == 1 && R2B3 == 1 && R2B4 == 1 && 
R3B1 == 1 && R3B2 == 1 && R3B3 == 1 && R3B4 == 1 && 
R4B1 == 1 && R4B2 == 1 && R4B3 == 1 && R4B4 == 1 && 
R5B1 == 1 && R5B2 == 1 && R5B3 == 1 && R5B4 == 1 && 
R6B1 == 1 && R6B2 == 1 && R6B3 == 1 && R6B4 == 1 && 
R7B1 == 1 && R7B2 == 1 && R7B3 == 1 && R7B4 == 1 && 
R8B1 == 1 && R8B2 == 1 && R8B3 == 1 && R8B4 == 1 && 
R9B1 == 1 && R9B2 == 1 && R9B3 == 1 && R9B4 == 1 && 
R10B1 == 1 && R10B2 == 1 && R10B3 == 1 && R10B4 == 1){
          jButton3.setEnabled(false);
          jButton3.setText("No room are avalable in the time you have selected");
         }
         else{    jButton3.setEnabled(true);
         jButton3.setText("Available Room");
         }
            if(R1C1 == 1 && R1C2 == 1 && R1C3 == 1 && R1C4 == 1 && 
R2C1 == 1 && R2C2 == 1 && R2C3 == 1 && R2C4 == 1 && 
R3C1 == 1 && R3C2 == 1 && R3C3 == 1 && R3C4 == 1 && 
R4C1 == 1 && R4C2 == 1 && R4C3 == 1 && R4C4 == 1 && 
R5C1 == 1 && R5C2 == 1 && R5C3 == 1 && R5C4 == 1 && 
R6C1 == 1 && R6C2 == 1 && R6C3 == 1 && R6C4 == 1 && 
R7C1 == 1 && R7C2 == 1 && R7C3 == 1 && R7C4 == 1 && 
R8C1 == 1 && R8C2 == 1 && R8C3 == 1 && R8C4 == 1 && 
R9C1 == 1 && R9C2 == 1 && R9C3 == 1 && R9C4 == 1 && 
R10C1 == 1 && R10C2 == 1 && R10C3 == 1 && R10C4 == 1){
          jButton5.setEnabled(false);
          jButton5.setText("No room are avalable in the time you have selected");
         }
         else{    jButton5.setEnabled(true);
         jButton5.setText("Available Room");
         
         }
          
           if(AR == 1 && BR == 1 && CR == 1){
                  jButton5.setEnabled(false);
          jButton5.setText("No room are avalable in the time you have selected");
            
            }
           else{
             jButton5.setEnabled(true);
         jButton5.setText("Available Room");
         
           }
         
     }
     
     
      public void roomlock1(){
        String flandrn = FL + RN;
     // JOptionPane.showMessageDialog(null, flandrn);
if (flandrn.equals("1A1")){R1A1 = 1;}
else if (flandrn.equals("1A2")){R1A2 = 1;}
else if (flandrn.equals("1A3")){R1A3 = 1;}
else if (flandrn.equals("1A4")){R1A4 = 1;}
else if (flandrn.equals("1B1")){R1B1 = 1;}
else if (flandrn.equals("1B2")){R1B2 = 1;}
else if (flandrn.equals("1B3")){R1B3 = 1;}
else if (flandrn.equals("1B4")){R1B4 = 1;}
else if (flandrn.equals("1C1")){R1C1 = 1;}
else if (flandrn.equals("1C2")){R1C2 = 1;}
else if (flandrn.equals("1C3")){R1C3 = 1;}
else if (flandrn.equals("1C4")){R1C4 = 1;}
else if (flandrn.equals("2A1")){R2A1 = 1;}
else if (flandrn.equals("2A2")){R2A2 = 1;}
else if (flandrn.equals("2A3")){R2A3 = 1;}
else if (flandrn.equals("2A4")){R2A4 = 1;}
else if (flandrn.equals("2B1")){R2B1 = 1;}
else if (flandrn.equals("2B2")){R2B2 = 1;}
else if (flandrn.equals("2B3")){R2B3 = 1;}
else if (flandrn.equals("2B4")){R2B4 = 1;}
else if (flandrn.equals("2C1")){R2C1 = 1;}
else if (flandrn.equals("2C2")){R2C2 = 1;}
else if (flandrn.equals("2C3")){R2C3 = 1;}
else if (flandrn.equals("2C4")){R2C4 = 1;}
else if (flandrn.equals("3A1")){R3A1 = 1;}
else if (flandrn.equals("3A2")){R3A2 = 1;}
else if (flandrn.equals("3A3")){R3A3 = 1;}
else if (flandrn.equals("3A4")){R3A4 = 1;}
else if (flandrn.equals("3B1")){R3B1 = 1;}
else if (flandrn.equals("3B2")){R3B2 = 1;}
else if (flandrn.equals("3B3")){R3B3 = 1;}
else if (flandrn.equals("3B4")){R3B4 = 1;}
else if (flandrn.equals("3C1")){R3C1 = 1;}
else if (flandrn.equals("3C2")){R3C2 = 1;}
else if (flandrn.equals("3C3")){R3C3 = 1;}
else if (flandrn.equals("3C4")){R3C4 = 1;}
else if (flandrn.equals("4A1")){R4A1 = 1;}
else if (flandrn.equals("4A2")){R4A2 = 1;}
else if (flandrn.equals("4A3")){R4A3 = 1;}
else if (flandrn.equals("4A4")){R4A4 = 1;}
else if (flandrn.equals("4B1")){R4B1 = 1;}
else if (flandrn.equals("4B2")){R4B2 = 1;}
else if (flandrn.equals("4B3")){R4B3 = 1;}
else if (flandrn.equals("4B4")){R4B4 = 1;}
else if (flandrn.equals("4C1")){R4C1 = 1;}
else if (flandrn.equals("4C2")){R4C2 = 1;}
else if (flandrn.equals("4C3")){R4C3 = 1;}
else if (flandrn.equals("4C4")){R4C4 = 1;}
else if (flandrn.equals("5A1")){R5A1 = 1;}
else if (flandrn.equals("5A2")){R5A2 = 1;}
else if (flandrn.equals("5A3")){R5A3 = 1;}
else if (flandrn.equals("5A4")){R5A4 = 1;}
else if (flandrn.equals("5B1")){R5B1 = 1;}
else if (flandrn.equals("5B2")){R5B2 = 1;}
else if (flandrn.equals("5B3")){R5B3 = 1;}
else if (flandrn.equals("5B4")){R5B4 = 1;}
else if (flandrn.equals("5C1")){R5C1 = 1;}
else if (flandrn.equals("5C2")){R5C2 = 1;}
else if (flandrn.equals("5C3")){R5C3 = 1;}
else if (flandrn.equals("5C4")){R5C4 = 1;}
else if (flandrn.equals("6A1")){R6A1 = 1;}
else if (flandrn.equals("6A2")){R6A2 = 1;}
else if (flandrn.equals("6A3")){R6A3 = 1;}
else if (flandrn.equals("6A4")){R6A4 = 1;}
else if (flandrn.equals("6B1")){R6B1 = 1;}
else if (flandrn.equals("6B2")){R6B2 = 1;}
else if (flandrn.equals("6B3")){R6B3 = 1;}
else if (flandrn.equals("6B4")){R6B4 = 1;}
else if (flandrn.equals("6C1")){R6C1 = 1;}
else if (flandrn.equals("6C2")){R6C2 = 1;}
else if (flandrn.equals("6C3")){R6C3 = 1;}
else if (flandrn.equals("6C4")){R6C4 = 1;}
else if (flandrn.equals("7A1")){R7A1 = 1;}
else if (flandrn.equals("7A2")){R7A2 = 1;}
else if (flandrn.equals("7A3")){R7A3 = 1;}
else if (flandrn.equals("7A4")){R7A4 = 1;}
else if (flandrn.equals("7B1")){R7B1 = 1;}
else if (flandrn.equals("7B2")){R7B2 = 1;}
else if (flandrn.equals("7B3")){R7B3 = 1;}
else if (flandrn.equals("7B4")){R7B4 = 1;}
else if (flandrn.equals("7C1")){R7C1 = 1;}
else if (flandrn.equals("7C2")){R7C2 = 1;}
else if (flandrn.equals("7C3")){R7C3 = 1;}
else if (flandrn.equals("7C4")){R7C4 = 1;}
else if (flandrn.equals("8A1")){R8A1 = 1;}
else if (flandrn.equals("8A2")){R8A2 = 1;}
else if (flandrn.equals("8A3")){R8A3 = 1;}
else if (flandrn.equals("8A4")){R8A4 = 1;}
else if (flandrn.equals("8B1")){R8B1 = 1;}
else if (flandrn.equals("8B2")){R8B2 = 1;}
else if (flandrn.equals("8B3")){R8B3 = 1;}
else if (flandrn.equals("8B4")){R8B4 = 1;}
else if (flandrn.equals("8C1")){R8C1 = 1;}
else if (flandrn.equals("8C2")){R8C2 = 1;}
else if (flandrn.equals("8C3")){R8C3 = 1;}
else if (flandrn.equals("8C4")){R8C4 = 1;}
else if (flandrn.equals("9A1")){R9A1 = 1;}
else if (flandrn.equals("9A2")){R9A2 = 1;}
else if (flandrn.equals("9A3")){R9A3 = 1;}
else if (flandrn.equals("9A4")){R9A4 = 1;}
else if (flandrn.equals("9B1")){R9B1 = 1;}
else if (flandrn.equals("9B2")){R9B2 = 1;}
else if (flandrn.equals("9B3")){R9B3 = 1;}
else if (flandrn.equals("9B4")){R9B4 = 1;}
else if (flandrn.equals("9C1")){R9C1 = 1;}
else if (flandrn.equals("9C2")){R9C2 = 1;}
else if (flandrn.equals("9C3")){R9C3 = 1;}
else if (flandrn.equals("9C4")){R9C4 = 1;}
else if (flandrn.equals("10A1")){R10A1 = 1;}
else if (flandrn.equals("10A2")){R10A2 = 1;}
else if (flandrn.equals("10A3")){R10A3 = 1;}
else if (flandrn.equals("10A4")){R10A4 = 1;}
else if (flandrn.equals("10B1")){R10B1 = 1;}
else if (flandrn.equals("10B2")){R10B2 = 1;}
else if (flandrn.equals("10B3")){R10B3 = 1;}
else if (flandrn.equals("10B4")){R10B4 = 1;}
else if (flandrn.equals("10C1")){R10C1 = 1;}
else if (flandrn.equals("10C2")){R10C2 = 1;}
else if (flandrn.equals("10C3")){R10C3 = 1;}
else if (flandrn.equals("10C4")){R10C4 = 1;}

    }
     
    private void ComInMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComInMonthMouseClicked

    }//GEN-LAST:event_ComInMonthMouseClicked

    private void ComInMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComInMonthActionPerformed

        date = 0;

        In32.setSelected(true);
        Out32.setSelected(true);

        Object ComInMonth1 = ComInMonth. getSelectedItem();
        String ComInMonth2=ComInMonth1.toString();

        if ( ComInMonth2.equals(J1) ){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 0;
            monthIn = 1;
            MDFCIDS= 0;
        }
        else if( ComInMonth2.equals(F1)){
            In31.setVisible(false);
            In30.setVisible(false);
            In29.setVisible(false);
            date = 31;
            monthIn = 2;
            MDFCIDS= 31;
        }
        else if( ComInMonth2.equals(Mr1)){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 59;
            monthIn = 3;
            MDFCIDS= 59;
        }
        else if( ComInMonth2.equals(A1)){
            In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 90;
            monthIn = 4;
            MDFCIDS= 90;
        }
        else if( ComInMonth2.equals(My1)){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 120;
            monthIn = 5;
            MDFCIDS= 120;
        }
        else if( ComInMonth2.equals(Jn1)){
            In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 151;
            monthIn = 6;
            MDFCIDS= 151;
        }
        else if( ComInMonth2.equals(Jl1)){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 181;
            monthIn = 7;
            MDFCIDS= 181;
        }
        else if( ComInMonth2.equals(Ag1)){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 212;
            monthIn = 8;
            MDFCIDS= 212;
        }
        else if( ComInMonth2.equals(S1)){
            In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 243;
            monthIn = 9;
            MDFCIDS= 243;
        }
        else if( ComInMonth2.equals(Otb1)){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 273;
            monthIn = 10;
            MDFCIDS= 273;
        }
        else if( ComInMonth2.equals(Nvb1)){
            In31.setVisible(false);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 304;
            monthIn = 11;
            MDFCIDS= 304;
        }
        else if( ComInMonth2.equals(Dcb1)){
            In31.setVisible(true);
            In30.setVisible(true);
            In29.setVisible(true);
            date = 334;
            monthIn = 12;
            MDFCIDS= 334;
        }
        else{}
    }//GEN-LAST:event_ComInMonthActionPerformed

    private void ComOutMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComOutMonthMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ComOutMonthMouseClicked

    private void ComOutMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComOutMonthActionPerformed

        dataOut = 0;

        Out32.setSelected(true);
        Object ComOutMonth1 = ComOutMonth. getSelectedItem();
        String ComOutMonth2=ComOutMonth1.toString();

        if ( ComOutMonth2.equals(J1) ){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 0;
            monthOut = 1;
            MDFCIDS1 = 0;
        }
        else if( ComOutMonth2.equals(F1)){
            Out31.setVisible(false);
            Out30.setVisible(false);
            Out29.setVisible(false);
            dataOut = 31;
            monthOut = 2;
            MDFCIDS1 = 31;
        }
        else if( ComOutMonth2.equals(Mr1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 59;
            monthOut = 3;
            MDFCIDS1 = 59;
        }
        else if( ComOutMonth2.equals(A1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 90;
            monthOut = 4;
            MDFCIDS1 = 90;
        }
        else if( ComOutMonth2.equals(My1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 120;
            monthOut = 5;
            MDFCIDS1=120;
        }
        else if( ComOutMonth2.equals(Jn1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 151;
            monthOut = 6;
            MDFCIDS1=151;
        }
        else if( ComOutMonth2.equals(Jl1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 181;
            monthOut = 7;
            MDFCIDS1=181;
        }
        else if( ComOutMonth2.equals(Ag1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 212;
            monthOut = 8;
            MDFCIDS1=212;
        }
        else if( ComOutMonth2.equals(S1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 243;
            monthOut = 9;
            MDFCIDS1=243;
        }
        else if( ComOutMonth2.equals(Otb1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 273;
            monthOut = 10;
            MDFCIDS1=273;
        }
        else if( ComOutMonth2.equals(Nvb1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 304;
            monthOut = 11;
            MDFCIDS1=304;
        }
        else if( ComOutMonth2.equals(Dcb1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 334;
            monthOut = 12;
            MDFCIDS1=334;
        }
    }//GEN-LAST:event_ComOutMonthActionPerformed

    private void In8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In8ActionPerformed
        getmonth();
        date += 8;
    }//GEN-LAST:event_In8ActionPerformed

    private void In16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In16ActionPerformed
        getmonth();
        date += 16;
    }//GEN-LAST:event_In16ActionPerformed

    private void In24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In24ActionPerformed
        getmonth();
        date += 24;
    }//GEN-LAST:event_In24ActionPerformed

    private void In32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In32ActionPerformed

    private void In6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In6ActionPerformed
        getmonth();
        date += 6;
    }//GEN-LAST:event_In6ActionPerformed

    private void In14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In14ActionPerformed
        getmonth();
        date += 14;
    }//GEN-LAST:event_In14ActionPerformed

    private void In22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In22ActionPerformed
        getmonth();
        date += 22;
    }//GEN-LAST:event_In22ActionPerformed

    private void In30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In30ActionPerformed
        getmonth();
        date += 30;
    }//GEN-LAST:event_In30ActionPerformed

    private void In1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In1ActionPerformed
        getmonth();
        date += 1;
    }//GEN-LAST:event_In1ActionPerformed

    private void In9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In9ActionPerformed
        getmonth();
        date += 9;
    }//GEN-LAST:event_In9ActionPerformed

    private void In17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In17ActionPerformed
        getmonth();
        date += 17;
    }//GEN-LAST:event_In17ActionPerformed

    private void In25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In25ActionPerformed
        getmonth();
        date += 25;
    }//GEN-LAST:event_In25ActionPerformed

    private void In5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In5ActionPerformed
        getmonth();
        date += 5;
    }//GEN-LAST:event_In5ActionPerformed

    private void In13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In13ActionPerformed
        getmonth();
        date += 13;
    }//GEN-LAST:event_In13ActionPerformed

    private void In21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In21ActionPerformed
        getmonth();
        date += 21;
    }//GEN-LAST:event_In21ActionPerformed

    private void In29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In29ActionPerformed
        getmonth();
        date += 29;
    }//GEN-LAST:event_In29ActionPerformed

    private void In4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In4ActionPerformed
        getmonth();
        date += 4;
    }//GEN-LAST:event_In4ActionPerformed

    private void In12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In12ActionPerformed
        getmonth();
        date += 12;
    }//GEN-LAST:event_In12ActionPerformed

    private void In20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In20ActionPerformed
        getmonth();
        date += 20;
    }//GEN-LAST:event_In20ActionPerformed

    private void In28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In28ActionPerformed
        getmonth();
        date += 28;
    }//GEN-LAST:event_In28ActionPerformed

    private void In3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In3ActionPerformed
        getmonth();
        date += 3;
    }//GEN-LAST:event_In3ActionPerformed

    private void In11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In11ActionPerformed
        getmonth();
        date += 11;
    }//GEN-LAST:event_In11ActionPerformed

    private void In19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In19ActionPerformed
        getmonth();
        date += 19;
    }//GEN-LAST:event_In19ActionPerformed

    private void In27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In27ActionPerformed
        getmonth();
        date += 27;
    }//GEN-LAST:event_In27ActionPerformed

    private void In2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In2ActionPerformed
        getmonth();
        date += 2;
    }//GEN-LAST:event_In2ActionPerformed

    private void In10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In10ActionPerformed
        getmonth();
        date += 10;
    }//GEN-LAST:event_In10ActionPerformed

    private void In18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In18ActionPerformed
        getmonth();
        date += 18;
    }//GEN-LAST:event_In18ActionPerformed

    private void In26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In26ActionPerformed
        getmonth();
        date += 26;
    }//GEN-LAST:event_In26ActionPerformed

    private void In31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In31ActionPerformed
        getmonth();
        date += 31;
    }//GEN-LAST:event_In31ActionPerformed

    private void In23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In23ActionPerformed
        getmonth();
        date += 23;
    }//GEN-LAST:event_In23ActionPerformed

    private void In15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In15ActionPerformed
        getmonth();
        date += 15;
    }//GEN-LAST:event_In15ActionPerformed

    private void In7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In7ActionPerformed
        getmonth();
        date += 7;
    }//GEN-LAST:event_In7ActionPerformed

    private void Out8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out8ActionPerformed
        MonthOut();
        dataOut += 8;
    }//GEN-LAST:event_Out8ActionPerformed

    private void Out16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out16ActionPerformed
        MonthOut();
        dataOut += 16;
    }//GEN-LAST:event_Out16ActionPerformed

    private void Out24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out24ActionPerformed
        MonthOut();
        dataOut +=24;
    }//GEN-LAST:event_Out24ActionPerformed

    private void Out32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Out32ActionPerformed

    private void Out6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out6ActionPerformed
        MonthOut();
        dataOut += 6;
    }//GEN-LAST:event_Out6ActionPerformed

    private void Out14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out14ActionPerformed
        MonthOut();
        dataOut +=14;
    }//GEN-LAST:event_Out14ActionPerformed

    private void Out22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out22ActionPerformed
        MonthOut();
        dataOut +=22;
    }//GEN-LAST:event_Out22ActionPerformed

    private void Out30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out30ActionPerformed
        MonthOut();
        dataOut +=30;
    }//GEN-LAST:event_Out30ActionPerformed

    private void Out1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out1ActionPerformed
        MonthOut();
        dataOut += 1;
    }//GEN-LAST:event_Out1ActionPerformed

    private void Out9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out9ActionPerformed
        MonthOut();
        dataOut +=9;
    }//GEN-LAST:event_Out9ActionPerformed

    private void Out17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out17ActionPerformed
        MonthOut();
        dataOut +=17;
    }//GEN-LAST:event_Out17ActionPerformed

    private void Out25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out25ActionPerformed
        MonthOut();
        dataOut +=25;
    }//GEN-LAST:event_Out25ActionPerformed

    private void Out5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out5ActionPerformed
        MonthOut();
        dataOut += 5;
    }//GEN-LAST:event_Out5ActionPerformed

    private void Out13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out13ActionPerformed
        MonthOut();
        dataOut +=11;
    }//GEN-LAST:event_Out13ActionPerformed

    private void Out21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out21ActionPerformed
        MonthOut();
        dataOut +=21;
    }//GEN-LAST:event_Out21ActionPerformed

    private void Out29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out29ActionPerformed
        MonthOut();
        dataOut +=29;
    }//GEN-LAST:event_Out29ActionPerformed

    private void Out4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out4ActionPerformed
        MonthOut();
        dataOut += 4;
    }//GEN-LAST:event_Out4ActionPerformed

    private void Out12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out12ActionPerformed
        MonthOut();
        dataOut +=12;
    }//GEN-LAST:event_Out12ActionPerformed

    private void Out20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out20ActionPerformed
        MonthOut();
        dataOut +=20;
    }//GEN-LAST:event_Out20ActionPerformed

    private void Out28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out28ActionPerformed
        MonthOut();
        dataOut +=28;
    }//GEN-LAST:event_Out28ActionPerformed

    private void Out3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out3ActionPerformed
        MonthOut();
        dataOut += 3;
    }//GEN-LAST:event_Out3ActionPerformed

    private void Out11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out11ActionPerformed
        MonthOut();
        dataOut +=11;
    }//GEN-LAST:event_Out11ActionPerformed

    private void Out19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out19ActionPerformed
        MonthOut();
        dataOut +=19;
    }//GEN-LAST:event_Out19ActionPerformed

    private void Out27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out27ActionPerformed
        MonthOut();
        dataOut +=27;
    }//GEN-LAST:event_Out27ActionPerformed

    private void Out2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out2ActionPerformed
        MonthOut();
        dataOut += 2;
    }//GEN-LAST:event_Out2ActionPerformed

    private void Out10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out10ActionPerformed
        MonthOut();
        dataOut +=10;
    }//GEN-LAST:event_Out10ActionPerformed

    private void Out18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out18ActionPerformed
        MonthOut();
        dataOut +=18;
    }//GEN-LAST:event_Out18ActionPerformed

    private void Out26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out26ActionPerformed
        MonthOut();
        dataOut +=26;
    }//GEN-LAST:event_Out26ActionPerformed

    private void Out7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out7ActionPerformed
        MonthOut();
        dataOut += 7 ;
    }//GEN-LAST:event_Out7ActionPerformed

    private void Out15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out15ActionPerformed
        MonthOut();
        dataOut +=15;
    }//GEN-LAST:event_Out15ActionPerformed

    private void Out23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out23ActionPerformed
        MonthOut();
        dataOut +=23;
    }//GEN-LAST:event_Out23ActionPerformed

    private void Out31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out31ActionPerformed
        MonthOut();
        dataOut +=31;
    }//GEN-LAST:event_Out31ActionPerformed

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       jLabel2.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       jLabel2.setForeground(Color.white);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      NextPage1 = 4;
        nextpage();
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       NextPage1 = 1;
        nextpage();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      NextPage1 = 2;
        nextpage();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    NextPage1 = 3;
        nextpage();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
      int rating = jSlider1.getValue();
      String showrating= rating + "/10";
      jLabel19.setText(showrating);
    }//GEN-LAST:event_jSlider1StateChanged

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
       String getEmail = jTextField1.getText();
        if(getEmail.equals("Enter Email")){
        jTextField1.setText("");}
        
    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
         String getEmail = jTextField1.getText();
        if(getEmail.equals("Enter Email") || getEmail.equals("")){
        jTextField1.setText("Enter Email");}
    }//GEN-LAST:event_jTextField1MouseExited

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
         String getEmail = jTextField1.getText();
        
         int getrating = jSlider1.getValue();
         
        if(getEmail.equals("Enter Email") || getEmail.equals("")){
        JOptionPane.showMessageDialog(null, "Please enter your email");}
        
        else if(getEmailrepeat.equals(getEmail)){
        JOptionPane.showMessageDialog(null, "This Email Has been use already");}
        
        else{
            int CHECKFOREM = 0;
        int CHECKFORMEMBOOK = 0;
             try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
 
      String sql2 = "SELECT * FROM hotel.admin_account;"; 
   PreparedStatement st2 = con.prepareStatement(sql2); 
   ResultSet st12 = st2.executeQuery();
     while(st12.next()){
       String  CHECKEMrepeat = st12.getString("Admin_Email");  
         if(CHECKEMrepeat.equals(getEmail)){
         CHECKFOREM = 1;
         }
      }
     
       String sql3 = "SELECT * FROM hotel.customer_detial;"; 
   PreparedStatement st3 = con.prepareStatement(sql3); 
   ResultSet st13 = st3.executeQuery();
     while(st13.next()){
       String  CHECKEMrepeat = st13.getString("Customer_Email");  
         if(CHECKEMrepeat.equals(getEmail)){
         CHECKFORMEMBOOK = 1;
         }
      }
     
     
   if(CHECKFOREM == 0 && CHECKFORMEMBOOK == 1){
   String sql = "SELECT MAX(Rating_ID) AS Rating_ID FROM hotel.rating;"; 
  PreparedStatement st1 = con.prepareStatement(sql);
   ResultSet st11 = st1.executeQuery();
    while(st11.next()){
     Rating_ID = st11.getInt("Rating_ID") + 1;
 
    }
   
   
   
PreparedStatement st = con.prepareStatement("INSERT INTO hotel.rating(Rating_ID, Hotel_ID, Rating_Value,Customer_Email) VALUE (?,?,?,?);");

     st.setInt(1, Rating_ID);
     st.setInt(2, 1);
     st.setInt(3, getrating);
   st.setString(4, getEmail);
int test = st.executeUpdate();
if(test>0){ JOptionPane.showMessageDialog(null, "Thank you for your rating");
}
  show_rating();  
  getEmailrepeat = getEmail;
}
   else if(CHECKFOREM == 1 && CHECKFORMEMBOOK == 0){
   JOptionPane.showMessageDialog(null, "This Email Has been use already");
   }
    else if(CHECKFORMEMBOOK == 0){
   JOptionPane.showMessageDialog(null, "This Email has not been use for booking this hotel");
   }
             
             }
             catch(Exception e){
JOptionPane.showMessageDialog(null, "not Connected");
}
            
        }
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        show_rating();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
      new Admin_Login_page().setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
       jLabel20.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
       jLabel20.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel20MouseExited

    private void show_rating(){
    int rating_value = 0;
    float RV_calculated = 0;
    int ID = 0;
    try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
   
   String sql = "SELECT * FROM hotel.rating"; 
  PreparedStatement st1 = con.prepareStatement(sql);
   ResultSet st11 = st1.executeQuery();
    while(st11.next()){
      ID = st11.getInt("Rating_ID");
     int Rating_Value_Raw = st11.getInt("Rating_Value");
      rating_value = rating_value + Rating_Value_Raw;
 
    }
    
    RV_calculated = rating_value/ID;
    
    jLabel10.setText(String.valueOf(RV_calculated));
    jLabel22.setText(String.valueOf(ID) + " reviews");
    }
        
                catch(Exception e){
JOptionPane.showMessageDialog(null, "not Connected");
}
        
    }
    
    
    private void nextpage(){
    
          if(NextPage == 0){
      new Lao_Poet_Hotel_Check_Room().setVisible(true);
      this.setVisible(false);
        }
          else if(NextPage == 1){
              new Lao_Poet_Hotel_Check_Room(NextPage1, date, dataOut).setVisible(true);
      this.setVisible(false);
              
          }
    
    }
    
    
       private void MonthOut(){
             Object ComOutMonth1 = ComOutMonth. getSelectedItem();
      String ComOutMonth2=ComOutMonth1.toString();
       if ( ComOutMonth2.equals(J1) ){
           
           dataOut = 0;
        }
        else if( ComOutMonth2.equals(F1)){
            
           dataOut = 31;
        }
        else if( ComOutMonth2.equals(Mr1)){
             
           dataOut = 59;
        }
        else if( ComOutMonth2.equals(A1)){
              
          dataOut = 90;
        }
        else if( ComOutMonth2.equals(My1)){
             
          dataOut = 120;
        }
        else if( ComOutMonth2.equals(Jn1)){
        
          dataOut = 151;
        }
        else if( ComOutMonth2.equals(Jl1)){
             
        dataOut = 181;
        }
        else if( ComOutMonth2.equals(Ag1)){
             
           dataOut = 212;
        }
        else if( ComOutMonth2.equals(S1)){
             
        dataOut = 243;
        }
        else if( ComOutMonth2.equals(Otb1)){
            
          dataOut = 273;
        }
        else if( ComOutMonth2.equals(Nvb1)){
             
      dataOut = 304;
        }
        else if( ComOutMonth2.equals(Dcb1)){
           
      dataOut = 334;
        }  
       
       } 
       
       
       
    
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
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lao_Poet_Hotel_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booking;
    private javax.swing.JComboBox<String> ComInMonth;
    private javax.swing.JComboBox<String> ComOutMonth;
    private javax.swing.JButton Facilities_List;
    private javax.swing.ButtonGroup GroupCID;
    private javax.swing.ButtonGroup GroupCOD;
    private javax.swing.JRadioButton In1;
    private javax.swing.JRadioButton In10;
    private javax.swing.JRadioButton In11;
    private javax.swing.JRadioButton In12;
    private javax.swing.JRadioButton In13;
    private javax.swing.JRadioButton In14;
    private javax.swing.JRadioButton In15;
    private javax.swing.JRadioButton In16;
    private javax.swing.JRadioButton In17;
    private javax.swing.JRadioButton In18;
    private javax.swing.JRadioButton In19;
    private javax.swing.JRadioButton In2;
    private javax.swing.JRadioButton In20;
    private javax.swing.JRadioButton In21;
    private javax.swing.JRadioButton In22;
    private javax.swing.JRadioButton In23;
    private javax.swing.JRadioButton In24;
    private javax.swing.JRadioButton In25;
    private javax.swing.JRadioButton In26;
    private javax.swing.JRadioButton In27;
    private javax.swing.JRadioButton In28;
    private javax.swing.JRadioButton In29;
    private javax.swing.JRadioButton In3;
    private javax.swing.JRadioButton In30;
    private javax.swing.JRadioButton In31;
    private javax.swing.JRadioButton In32;
    private javax.swing.JRadioButton In4;
    private javax.swing.JRadioButton In5;
    private javax.swing.JRadioButton In6;
    private javax.swing.JRadioButton In7;
    private javax.swing.JRadioButton In8;
    private javax.swing.JRadioButton In9;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JRadioButton Out1;
    private javax.swing.JRadioButton Out10;
    private javax.swing.JRadioButton Out11;
    private javax.swing.JRadioButton Out12;
    private javax.swing.JRadioButton Out13;
    private javax.swing.JRadioButton Out14;
    private javax.swing.JRadioButton Out15;
    private javax.swing.JRadioButton Out16;
    private javax.swing.JRadioButton Out17;
    private javax.swing.JRadioButton Out18;
    private javax.swing.JRadioButton Out19;
    private javax.swing.JRadioButton Out2;
    private javax.swing.JRadioButton Out20;
    private javax.swing.JRadioButton Out21;
    private javax.swing.JRadioButton Out22;
    private javax.swing.JRadioButton Out23;
    private javax.swing.JRadioButton Out24;
    private javax.swing.JRadioButton Out25;
    private javax.swing.JRadioButton Out26;
    private javax.swing.JRadioButton Out27;
    private javax.swing.JRadioButton Out28;
    private javax.swing.JRadioButton Out29;
    private javax.swing.JRadioButton Out3;
    private javax.swing.JRadioButton Out30;
    private javax.swing.JRadioButton Out31;
    private javax.swing.JRadioButton Out32;
    private javax.swing.JRadioButton Out4;
    private javax.swing.JRadioButton Out5;
    private javax.swing.JRadioButton Out6;
    private javax.swing.JRadioButton Out7;
    private javax.swing.JRadioButton Out8;
    private javax.swing.JRadioButton Out9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton rule_list;
    // End of variables declaration//GEN-END:variables

    Lao_Poet_Hotel_Page a() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

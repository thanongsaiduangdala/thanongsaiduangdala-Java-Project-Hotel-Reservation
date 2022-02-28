/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author sunny
 */
public class Lao_Poet_Hotel_Page1 extends javax.swing.JFrame {
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
        
    /**
     * Creates new form NewJFrame
     */
    public Lao_Poet_Hotel_Page1() {
        initComponents();
            In32.setVisible(false);
        Out32.setVisible(false);    
    }
       public Lao_Poet_Hotel_Page1(int para){
    
    initComponents();
    
    
    if (para == 1){
    Page_Facilities_Hotel1 rgt = new Page_Facilities_Hotel1();
        jpanelloader.JPanelLoader(MainPanel, rgt);
    }
    else if(para == 2){
    Lao_Poet_Hotel_Price_D rgt = new Lao_Poet_Hotel_Price_D();
        jpanelloader.JPanelLoader(MainPanel, rgt);
    }
    
     
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Mainpage1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Facilities_List = new javax.swing.JButton();
        rule_list = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Booking = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        In1 = new javax.swing.JRadioButton();
        In2 = new javax.swing.JRadioButton();
        In3 = new javax.swing.JRadioButton();
        In4 = new javax.swing.JRadioButton();
        In5 = new javax.swing.JRadioButton();
        In6 = new javax.swing.JRadioButton();
        In7 = new javax.swing.JRadioButton();
        In8 = new javax.swing.JRadioButton();
        In16 = new javax.swing.JRadioButton();
        In14 = new javax.swing.JRadioButton();
        In13 = new javax.swing.JRadioButton();
        In12 = new javax.swing.JRadioButton();
        In15 = new javax.swing.JRadioButton();
        In11 = new javax.swing.JRadioButton();
        In10 = new javax.swing.JRadioButton();
        In9 = new javax.swing.JRadioButton();
        In17 = new javax.swing.JRadioButton();
        In19 = new javax.swing.JRadioButton();
        In18 = new javax.swing.JRadioButton();
        In20 = new javax.swing.JRadioButton();
        In21 = new javax.swing.JRadioButton();
        In22 = new javax.swing.JRadioButton();
        In23 = new javax.swing.JRadioButton();
        In24 = new javax.swing.JRadioButton();
        In25 = new javax.swing.JRadioButton();
        In26 = new javax.swing.JRadioButton();
        In27 = new javax.swing.JRadioButton();
        In28 = new javax.swing.JRadioButton();
        In29 = new javax.swing.JRadioButton();
        In30 = new javax.swing.JRadioButton();
        In31 = new javax.swing.JRadioButton();
        ComInMonth = new javax.swing.JComboBox<>();
        Out1 = new javax.swing.JRadioButton();
        Out2 = new javax.swing.JRadioButton();
        Out3 = new javax.swing.JRadioButton();
        Out4 = new javax.swing.JRadioButton();
        Out5 = new javax.swing.JRadioButton();
        Out6 = new javax.swing.JRadioButton();
        Out7 = new javax.swing.JRadioButton();
        Out8 = new javax.swing.JRadioButton();
        Out16 = new javax.swing.JRadioButton();
        Out14 = new javax.swing.JRadioButton();
        Out13 = new javax.swing.JRadioButton();
        Out12 = new javax.swing.JRadioButton();
        Out15 = new javax.swing.JRadioButton();
        Out11 = new javax.swing.JRadioButton();
        Out10 = new javax.swing.JRadioButton();
        Out9 = new javax.swing.JRadioButton();
        Out17 = new javax.swing.JRadioButton();
        Out19 = new javax.swing.JRadioButton();
        Out18 = new javax.swing.JRadioButton();
        Out20 = new javax.swing.JRadioButton();
        Out21 = new javax.swing.JRadioButton();
        Out22 = new javax.swing.JRadioButton();
        Out23 = new javax.swing.JRadioButton();
        Out24 = new javax.swing.JRadioButton();
        Out25 = new javax.swing.JRadioButton();
        Out26 = new javax.swing.JRadioButton();
        Out27 = new javax.swing.JRadioButton();
        Out28 = new javax.swing.JRadioButton();
        Out29 = new javax.swing.JRadioButton();
        Out30 = new javax.swing.JRadioButton();
        Out31 = new javax.swing.JRadioButton();
        ComOutMonth = new javax.swing.JComboBox<>();
        In32 = new javax.swing.JRadioButton();
        Out32 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();

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

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hotel Reservation");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        Booking.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        Booking.setText("Booking");
        Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 335, Short.MAX_VALUE)
                .addComponent(Booking)
                .addGap(30, 30, 30)
                .addComponent(Facilities_List)
                .addGap(33, 33, 33)
                .addComponent(rule_list, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
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

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 queen sizes bed", "2 Twins sizes bed", "1 queen sized bed" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Room Type");
        jLabel4.setToolTipText("");
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 140));
        jLabel4.setName(""); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 80));

        In1.setBackground(new java.awt.Color(255, 204, 51));
        In1.setText("1");
        In1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In1ActionPerformed(evt);
            }
        });

        In2.setBackground(new java.awt.Color(255, 204, 51));
        In2.setText("2");
        In2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In2ActionPerformed(evt);
            }
        });

        In3.setBackground(new java.awt.Color(255, 204, 51));
        In3.setText("3");
        In3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In3ActionPerformed(evt);
            }
        });

        In4.setBackground(new java.awt.Color(255, 204, 51));
        In4.setText("4");
        In4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In4ActionPerformed(evt);
            }
        });

        In5.setBackground(new java.awt.Color(255, 204, 51));
        In5.setText("5");
        In5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In5ActionPerformed(evt);
            }
        });

        In6.setBackground(new java.awt.Color(255, 204, 51));
        In6.setText("6");
        In6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In6ActionPerformed(evt);
            }
        });

        In7.setBackground(new java.awt.Color(255, 204, 51));
        In7.setText("7");
        In7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In7ActionPerformed(evt);
            }
        });

        In8.setBackground(new java.awt.Color(255, 204, 51));
        In8.setText("8");
        In8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In8ActionPerformed(evt);
            }
        });

        In16.setBackground(new java.awt.Color(255, 204, 51));
        In16.setText("16");
        In16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In16ActionPerformed(evt);
            }
        });

        In14.setBackground(new java.awt.Color(255, 204, 51));
        In14.setText("14");
        In14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In14ActionPerformed(evt);
            }
        });

        In13.setBackground(new java.awt.Color(255, 204, 51));
        In13.setText("13");
        In13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In13ActionPerformed(evt);
            }
        });

        In12.setBackground(new java.awt.Color(255, 204, 51));
        In12.setText("12");
        In12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In12ActionPerformed(evt);
            }
        });

        In15.setBackground(new java.awt.Color(255, 204, 51));
        In15.setText("15");
        In15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In15ActionPerformed(evt);
            }
        });

        In11.setBackground(new java.awt.Color(255, 204, 51));
        In11.setText("11");
        In11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In11ActionPerformed(evt);
            }
        });

        In10.setBackground(new java.awt.Color(255, 204, 51));
        In10.setText("10");
        In10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In10ActionPerformed(evt);
            }
        });

        In9.setBackground(new java.awt.Color(255, 204, 51));
        In9.setText("9");
        In9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In9ActionPerformed(evt);
            }
        });

        In17.setBackground(new java.awt.Color(255, 204, 51));
        In17.setText("17");
        In17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In17ActionPerformed(evt);
            }
        });

        In19.setBackground(new java.awt.Color(255, 204, 51));
        In19.setText("19");
        In19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In19ActionPerformed(evt);
            }
        });

        In18.setBackground(new java.awt.Color(255, 204, 51));
        In18.setText("18");
        In18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In18ActionPerformed(evt);
            }
        });

        In20.setBackground(new java.awt.Color(255, 204, 51));
        In20.setText("20");
        In20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In20ActionPerformed(evt);
            }
        });

        In21.setBackground(new java.awt.Color(255, 204, 51));
        In21.setText("21");
        In21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In21ActionPerformed(evt);
            }
        });

        In22.setBackground(new java.awt.Color(255, 204, 51));
        In22.setText("22");
        In22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In22ActionPerformed(evt);
            }
        });

        In23.setBackground(new java.awt.Color(255, 204, 51));
        In23.setText("23");
        In23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In23ActionPerformed(evt);
            }
        });

        In24.setBackground(new java.awt.Color(255, 204, 51));
        In24.setText("24");
        In24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In24ActionPerformed(evt);
            }
        });

        In25.setBackground(new java.awt.Color(255, 204, 51));
        In25.setText("25");
        In25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In25ActionPerformed(evt);
            }
        });

        In26.setBackground(new java.awt.Color(255, 204, 51));
        In26.setText("26");
        In26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In26ActionPerformed(evt);
            }
        });

        In27.setBackground(new java.awt.Color(255, 204, 51));
        In27.setText("27");
        In27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In27ActionPerformed(evt);
            }
        });

        In28.setBackground(new java.awt.Color(255, 204, 51));
        In28.setText("28");
        In28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In28ActionPerformed(evt);
            }
        });

        In29.setBackground(new java.awt.Color(255, 204, 51));
        In29.setText("29");
        In29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In29ActionPerformed(evt);
            }
        });

        In30.setBackground(new java.awt.Color(255, 204, 51));
        In30.setText("30");
        In30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In30ActionPerformed(evt);
            }
        });

        In31.setBackground(new java.awt.Color(255, 204, 51));
        In31.setText("31");
        In31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In31ActionPerformed(evt);
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

        Out1.setBackground(new java.awt.Color(255, 204, 51));
        Out1.setText("1");
        Out1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out1ActionPerformed(evt);
            }
        });

        Out2.setBackground(new java.awt.Color(255, 204, 51));
        Out2.setText("2");
        Out2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out2ActionPerformed(evt);
            }
        });

        Out3.setBackground(new java.awt.Color(255, 204, 51));
        Out3.setText("3");
        Out3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out3ActionPerformed(evt);
            }
        });

        Out4.setBackground(new java.awt.Color(255, 204, 51));
        Out4.setText("4");
        Out4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out4ActionPerformed(evt);
            }
        });

        Out5.setBackground(new java.awt.Color(255, 204, 51));
        Out5.setText("5");
        Out5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out5ActionPerformed(evt);
            }
        });

        Out6.setBackground(new java.awt.Color(255, 204, 51));
        Out6.setText("6");
        Out6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out6ActionPerformed(evt);
            }
        });

        Out7.setBackground(new java.awt.Color(255, 204, 51));
        Out7.setText("7");
        Out7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out7ActionPerformed(evt);
            }
        });

        Out8.setBackground(new java.awt.Color(255, 204, 51));
        Out8.setText("8");
        Out8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out8ActionPerformed(evt);
            }
        });

        Out16.setBackground(new java.awt.Color(255, 204, 51));
        Out16.setText("16");
        Out16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out16ActionPerformed(evt);
            }
        });

        Out14.setBackground(new java.awt.Color(255, 204, 51));
        Out14.setText("14");
        Out14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out14ActionPerformed(evt);
            }
        });

        Out13.setBackground(new java.awt.Color(255, 204, 51));
        Out13.setText("13");
        Out13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out13ActionPerformed(evt);
            }
        });

        Out12.setBackground(new java.awt.Color(255, 204, 51));
        Out12.setText("12");
        Out12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out12ActionPerformed(evt);
            }
        });

        Out15.setBackground(new java.awt.Color(255, 204, 51));
        Out15.setText("15");
        Out15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out15ActionPerformed(evt);
            }
        });

        Out11.setBackground(new java.awt.Color(255, 204, 51));
        Out11.setText("11");
        Out11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out11ActionPerformed(evt);
            }
        });

        Out10.setBackground(new java.awt.Color(255, 204, 51));
        Out10.setText("10");
        Out10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out10ActionPerformed(evt);
            }
        });

        Out9.setBackground(new java.awt.Color(255, 204, 51));
        Out9.setText("9");
        Out9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out9ActionPerformed(evt);
            }
        });

        Out17.setBackground(new java.awt.Color(255, 204, 51));
        Out17.setText("17");
        Out17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out17ActionPerformed(evt);
            }
        });

        Out19.setBackground(new java.awt.Color(255, 204, 51));
        Out19.setText("19");
        Out19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out19ActionPerformed(evt);
            }
        });

        Out18.setBackground(new java.awt.Color(255, 204, 51));
        Out18.setText("18");
        Out18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out18ActionPerformed(evt);
            }
        });

        Out20.setBackground(new java.awt.Color(255, 204, 51));
        Out20.setText("20");
        Out20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out20ActionPerformed(evt);
            }
        });

        Out21.setBackground(new java.awt.Color(255, 204, 51));
        Out21.setText("21");
        Out21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out21ActionPerformed(evt);
            }
        });

        Out22.setBackground(new java.awt.Color(255, 204, 51));
        Out22.setText("22");
        Out22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out22ActionPerformed(evt);
            }
        });

        Out23.setBackground(new java.awt.Color(255, 204, 51));
        Out23.setText("23");
        Out23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out23ActionPerformed(evt);
            }
        });

        Out24.setBackground(new java.awt.Color(255, 204, 51));
        Out24.setText("24");
        Out24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out24ActionPerformed(evt);
            }
        });

        Out25.setBackground(new java.awt.Color(255, 204, 51));
        Out25.setText("25");
        Out25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out25ActionPerformed(evt);
            }
        });

        Out26.setBackground(new java.awt.Color(255, 204, 51));
        Out26.setText("26");
        Out26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out26ActionPerformed(evt);
            }
        });

        Out27.setBackground(new java.awt.Color(255, 204, 51));
        Out27.setText("27");
        Out27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out27ActionPerformed(evt);
            }
        });

        Out28.setBackground(new java.awt.Color(255, 204, 51));
        Out28.setText("28");
        Out28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out28ActionPerformed(evt);
            }
        });

        Out29.setBackground(new java.awt.Color(255, 204, 51));
        Out29.setText("29");
        Out29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out29ActionPerformed(evt);
            }
        });

        Out30.setBackground(new java.awt.Color(255, 204, 51));
        Out30.setText("30");
        Out30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out30ActionPerformed(evt);
            }
        });

        Out31.setBackground(new java.awt.Color(255, 204, 51));
        Out31.setText("31");
        Out31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out31ActionPerformed(evt);
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

        In32.setBackground(new java.awt.Color(255, 204, 51));
        In32.setSelected(true);
        In32.setText("32");
        In32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In32ActionPerformed(evt);
            }
        });

        Out32.setBackground(new java.awt.Color(255, 204, 51));
        Out32.setSelected(true);
        Out32.setText("32");
        Out32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out32ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 51, 255));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Out9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Out1, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(Out17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Out10)
                                                    .addComponent(Out18))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(Out11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Out12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Out13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Out14))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(Out19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Out20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Out21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(Out22))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(Out2)
                                                .addGap(6, 6, 6)
                                                .addComponent(Out3)
                                                .addGap(6, 6, 6)
                                                .addComponent(Out4)
                                                .addGap(6, 6, 6)
                                                .addComponent(Out5)
                                                .addGap(6, 6, 6)
                                                .addComponent(Out6))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Out25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Out26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Out27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(Out28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Out29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Out30)))))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Out31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Out32))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Out7)
                                            .addComponent(Out15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Out8)
                                            .addComponent(Out16)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Out23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Out24))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComInMonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComOutMonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(In9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(In1, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(In17))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(In10)
                                                    .addComponent(In18))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(In11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(In12)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(In13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(In14))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(In19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(In20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(In21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(In22))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(In2)
                                                .addGap(6, 6, 6)
                                                .addComponent(In3)
                                                .addGap(6, 6, 6)
                                                .addComponent(In4)
                                                .addGap(6, 6, 6)
                                                .addComponent(In5)
                                                .addGap(6, 6, 6)
                                                .addComponent(In6))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(In25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(In26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(In27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(In28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(In29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(In30)))))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(In31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(In32))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(In7)
                                            .addComponent(In15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(In8)
                                            .addComponent(In16)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(In23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(In24))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(In1)
                    .addComponent(In2)
                    .addComponent(In3)
                    .addComponent(In4)
                    .addComponent(In5)
                    .addComponent(In6)
                    .addComponent(In7)
                    .addComponent(In8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(In9)
                    .addComponent(In10)
                    .addComponent(In11)
                    .addComponent(In12)
                    .addComponent(In13)
                    .addComponent(In14)
                    .addComponent(In15)
                    .addComponent(In16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(In17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(In19)
                        .addComponent(In18)
                        .addComponent(In20)
                        .addComponent(In21)
                        .addComponent(In22)
                        .addComponent(In23)
                        .addComponent(In24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(In25)
                    .addComponent(In26)
                    .addComponent(In27)
                    .addComponent(In28)
                    .addComponent(In29)
                    .addComponent(In30)
                    .addComponent(In31)
                    .addComponent(In32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComOutMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Out1)
                    .addComponent(Out2)
                    .addComponent(Out3)
                    .addComponent(Out4)
                    .addComponent(Out5)
                    .addComponent(Out6)
                    .addComponent(Out7)
                    .addComponent(Out8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Out9)
                    .addComponent(Out10)
                    .addComponent(Out11)
                    .addComponent(Out12)
                    .addComponent(Out13)
                    .addComponent(Out14)
                    .addComponent(Out15)
                    .addComponent(Out16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Out17)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Out19)
                        .addComponent(Out18)
                        .addComponent(Out20)
                        .addComponent(Out21)
                        .addComponent(Out22)
                        .addComponent(Out23)
                        .addComponent(Out24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Out25)
                    .addComponent(Out26)
                    .addComponent(Out27)
                    .addComponent(Out28)
                    .addComponent(Out29)
                    .addComponent(Out30)
                    .addComponent(Out31)
                    .addComponent(Out32))
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout Mainpage1Layout = new javax.swing.GroupLayout(Mainpage1);
        Mainpage1.setLayout(Mainpage1Layout);
        Mainpage1Layout.setHorizontalGroup(
            Mainpage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Mainpage1Layout.setVerticalGroup(
            Mainpage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mainpage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Facilities_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Facilities_ListActionPerformed

        Page_Facilities_Hotel1 rgt = new Page_Facilities_Hotel1();
        jpanelloader.JPanelLoader(MainPanel, rgt);
    }//GEN-LAST:event_Facilities_ListActionPerformed

    private void BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingActionPerformed
  new Lao_Poet_Hotel_Page().setVisible(true);
 
    
   this.setVisible(false);
         
    }//GEN-LAST:event_BookingActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Out32.isSelected() || In32.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select Date first");
           

        }
        else{
            JOptionPane.showMessageDialog(null, "In" + date);
            JOptionPane.showMessageDialog(null, "Out" + dataOut);
            /*
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
                PreparedStatement st = con.prepareStatement("insert into testingin(ID,inc) values (?, ?)");
                st.setInt(1, 2);
                st.setInt(2, date);
                int a = st.executeUpdate();
                if(a>0){ JOptionPane.showMessageDialog(null, "Save");
                }

                JOptionPane.showMessageDialog(null, "Connected");

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "not Connected");
            }

            */

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void In1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In1ActionPerformed
        getmonth();
        date += 1;
    }//GEN-LAST:event_In1ActionPerformed

    private void In2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In2ActionPerformed
        getmonth();
        date += 2;
    }//GEN-LAST:event_In2ActionPerformed

    private void In3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In3ActionPerformed
        getmonth();
        date += 3;
    }//GEN-LAST:event_In3ActionPerformed

    private void In4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In4ActionPerformed
        getmonth();
        date += 4;
    }//GEN-LAST:event_In4ActionPerformed

    private void In5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In5ActionPerformed
        getmonth();
        date += 5;
    }//GEN-LAST:event_In5ActionPerformed

    private void In6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In6ActionPerformed
        getmonth();
        date += 6;
    }//GEN-LAST:event_In6ActionPerformed

    private void In7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In7ActionPerformed
        getmonth();
        date += 7;
    }//GEN-LAST:event_In7ActionPerformed

    private void In8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In8ActionPerformed
        getmonth();
        date += 8;
    }//GEN-LAST:event_In8ActionPerformed

    private void In16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In16ActionPerformed
        getmonth();
        date += 16;
    }//GEN-LAST:event_In16ActionPerformed

    private void In14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In14ActionPerformed
        getmonth();
        date += 14;
    }//GEN-LAST:event_In14ActionPerformed

    private void In13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In13ActionPerformed
        getmonth();
        date += 13;
    }//GEN-LAST:event_In13ActionPerformed

    private void In12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In12ActionPerformed
        getmonth();
        date += 12;
    }//GEN-LAST:event_In12ActionPerformed

    private void In15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In15ActionPerformed
        getmonth();
        date += 15;
    }//GEN-LAST:event_In15ActionPerformed

    private void In11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In11ActionPerformed
        getmonth();
        date += 11;
    }//GEN-LAST:event_In11ActionPerformed

    private void In10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In10ActionPerformed
        getmonth();
        date += 10;
    }//GEN-LAST:event_In10ActionPerformed

    private void In9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In9ActionPerformed
        getmonth();
        date += 9;
    }//GEN-LAST:event_In9ActionPerformed

    private void In17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In17ActionPerformed
        getmonth();
        date += 17;
    }//GEN-LAST:event_In17ActionPerformed

    private void In19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In19ActionPerformed
        getmonth();
        date += 19;
    }//GEN-LAST:event_In19ActionPerformed

    private void In18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In18ActionPerformed
        getmonth();
        date += 18;
    }//GEN-LAST:event_In18ActionPerformed

    private void In20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In20ActionPerformed
        getmonth();
        date += 20;
    }//GEN-LAST:event_In20ActionPerformed

    private void In21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In21ActionPerformed
        getmonth();
        date += 21;
    }//GEN-LAST:event_In21ActionPerformed

    private void In22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In22ActionPerformed
        getmonth();
        date += 22;
    }//GEN-LAST:event_In22ActionPerformed

    private void In23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In23ActionPerformed
        getmonth();
        date += 23;
    }//GEN-LAST:event_In23ActionPerformed

    private void In24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In24ActionPerformed
        getmonth();
        date += 24;
    }//GEN-LAST:event_In24ActionPerformed

    private void In25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In25ActionPerformed
        getmonth();
        date += 25;
    }//GEN-LAST:event_In25ActionPerformed

    private void In26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In26ActionPerformed
        getmonth();
        date += 26;
    }//GEN-LAST:event_In26ActionPerformed

    private void In27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In27ActionPerformed
        getmonth();
        date += 27;
    }//GEN-LAST:event_In27ActionPerformed

    private void In28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In28ActionPerformed
        getmonth();
        date += 28;
    }//GEN-LAST:event_In28ActionPerformed

    private void In29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In29ActionPerformed
        getmonth();
        date += 29;
    }//GEN-LAST:event_In29ActionPerformed

    private void In30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In30ActionPerformed
        getmonth();
        date += 30;
    }//GEN-LAST:event_In30ActionPerformed

    private void In31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In31ActionPerformed
        getmonth();
        date += 31;
    }//GEN-LAST:event_In31ActionPerformed

    private void ComInMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComInMonthMouseClicked

    }//GEN-LAST:event_ComInMonthMouseClicked

    private void ComInMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComInMonthActionPerformed

        In32.setSelected(true);
        Out32.setSelected(true);

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
        else{}
    }//GEN-LAST:event_ComInMonthActionPerformed

    private void Out1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out1ActionPerformed
        MonthOut();
        dataOut += 1;
    }//GEN-LAST:event_Out1ActionPerformed

    private void Out2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out2ActionPerformed
        MonthOut();
        dataOut += 2;
    }//GEN-LAST:event_Out2ActionPerformed

    private void Out3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out3ActionPerformed
        MonthOut();
        dataOut += 3;
    }//GEN-LAST:event_Out3ActionPerformed

    private void Out4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out4ActionPerformed
        MonthOut();
        dataOut += 4;
    }//GEN-LAST:event_Out4ActionPerformed

    private void Out5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out5ActionPerformed
        MonthOut();
        dataOut += 5;
    }//GEN-LAST:event_Out5ActionPerformed

    private void Out6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out6ActionPerformed
        MonthOut();
        dataOut += 6;
    }//GEN-LAST:event_Out6ActionPerformed

    private void Out7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out7ActionPerformed
        MonthOut();
        dataOut += 7 ;
    }//GEN-LAST:event_Out7ActionPerformed

    private void Out8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out8ActionPerformed
        MonthOut();
        dataOut += 8;
    }//GEN-LAST:event_Out8ActionPerformed

    private void Out16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out16ActionPerformed
        MonthOut();
        dataOut += 16;
    }//GEN-LAST:event_Out16ActionPerformed

    private void Out14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out14ActionPerformed
        MonthOut();
        dataOut +=14;
    }//GEN-LAST:event_Out14ActionPerformed

    private void Out13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out13ActionPerformed
        MonthOut();
        dataOut +=11;
    }//GEN-LAST:event_Out13ActionPerformed

    private void Out12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out12ActionPerformed
        MonthOut();
        dataOut +=12;
    }//GEN-LAST:event_Out12ActionPerformed

    private void Out15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out15ActionPerformed
        MonthOut();
        dataOut +=15;
    }//GEN-LAST:event_Out15ActionPerformed

    private void Out11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out11ActionPerformed
        MonthOut();
        dataOut +=11;
    }//GEN-LAST:event_Out11ActionPerformed

    private void Out10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out10ActionPerformed
        MonthOut();
        dataOut +=10;
    }//GEN-LAST:event_Out10ActionPerformed

    private void Out9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out9ActionPerformed
        MonthOut();
        dataOut +=9;
    }//GEN-LAST:event_Out9ActionPerformed

    private void Out17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out17ActionPerformed
        MonthOut();
        dataOut +=17;
    }//GEN-LAST:event_Out17ActionPerformed

    private void Out19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out19ActionPerformed
        MonthOut();
        dataOut +=19;
    }//GEN-LAST:event_Out19ActionPerformed

    private void Out18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out18ActionPerformed
        MonthOut();
        dataOut +=18;
    }//GEN-LAST:event_Out18ActionPerformed

    private void Out20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out20ActionPerformed
        MonthOut();
        dataOut +=20;
    }//GEN-LAST:event_Out20ActionPerformed

    private void Out21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out21ActionPerformed
        MonthOut();
        dataOut +=21;
    }//GEN-LAST:event_Out21ActionPerformed

    private void Out22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out22ActionPerformed
        MonthOut();
        dataOut +=22;
    }//GEN-LAST:event_Out22ActionPerformed

    private void Out23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out23ActionPerformed
        MonthOut();
        dataOut +=23;
    }//GEN-LAST:event_Out23ActionPerformed

    private void Out24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out24ActionPerformed
        MonthOut();
        dataOut +=24;
    }//GEN-LAST:event_Out24ActionPerformed

    private void Out25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out25ActionPerformed
        MonthOut();
        dataOut +=25;
    }//GEN-LAST:event_Out25ActionPerformed

    private void Out26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out26ActionPerformed
        MonthOut();
        dataOut +=26;
    }//GEN-LAST:event_Out26ActionPerformed

    private void Out27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out27ActionPerformed
        MonthOut();
        dataOut +=27;
    }//GEN-LAST:event_Out27ActionPerformed

    private void Out28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out28ActionPerformed
        MonthOut();
        dataOut +=28;
    }//GEN-LAST:event_Out28ActionPerformed

    private void Out29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out29ActionPerformed
        MonthOut();
        dataOut +=29;
    }//GEN-LAST:event_Out29ActionPerformed

    private void Out30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out30ActionPerformed
        MonthOut();
        dataOut +=30;
    }//GEN-LAST:event_Out30ActionPerformed

    private void Out31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out31ActionPerformed
        MonthOut();
        dataOut +=31;
    }//GEN-LAST:event_Out31ActionPerformed

    private void ComOutMonthMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComOutMonthMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ComOutMonthMouseClicked

    private void ComOutMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComOutMonthActionPerformed
        Out32.setSelected(true);
        Object ComOutMonth1 = ComOutMonth. getSelectedItem();
        String ComOutMonth2=ComOutMonth1.toString();

        if ( ComOutMonth2.equals(J1) ){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 0;
        }
        else if( ComOutMonth2.equals(F1)){
            Out31.setVisible(false);
            Out30.setVisible(false);
            Out29.setVisible(false);
            dataOut = 31;
        }
        else if( ComOutMonth2.equals(Mr1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 59;
        }
        else if( ComOutMonth2.equals(A1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 90;
        }
        else if( ComOutMonth2.equals(My1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 120;
        }
        else if( ComOutMonth2.equals(Jn1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 151;
        }
        else if( ComOutMonth2.equals(Jl1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 181;
        }
        else if( ComOutMonth2.equals(Ag1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 212;
        }
        else if( ComOutMonth2.equals(S1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 243;
        }
        else if( ComOutMonth2.equals(Otb1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 273;
        }
        else if( ComOutMonth2.equals(Nvb1)){
            Out31.setVisible(false);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 304;
        }
        else if( ComOutMonth2.equals(Dcb1)){
            Out31.setVisible(true);
            Out30.setVisible(true);
            Out29.setVisible(true);
            dataOut = 334;
        }
    }//GEN-LAST:event_ComOutMonthActionPerformed

    private void In32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In32ActionPerformed

    private void Out32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Out32ActionPerformed

    private void rule_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rule_listActionPerformed
  Lao_Poet_Hotel_Price_D rgt = new Lao_Poet_Hotel_Price_D();
        jpanelloader.JPanelLoader(MainPanel, rgt);       
    }//GEN-LAST:event_rule_listActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
           new Lao_Poet_Hotel_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lao_Poet_Hotel_Page1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lao_Poet_Hotel_Page1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Booking;
    private javax.swing.JComboBox<String> ComInMonth;
    private javax.swing.JComboBox<String> ComOutMonth;
    private javax.swing.JButton Facilities_List;
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
    public javax.swing.JPanel Mainpage1;
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
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton rule_list;
    // End of variables declaration//GEN-END:variables
}

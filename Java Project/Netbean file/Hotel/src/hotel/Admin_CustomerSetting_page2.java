/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sunny
 */
public class Admin_CustomerSetting_page2 extends javax.swing.JFrame {

  String J1 = "January";
            String F1 = "February";
        String Mr1 = "March";
        String A11 = "April";
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
        int monthIn = 0;
        int monthOut = 0;
        int RoomIDGot;
        int getroomprice = 0;
        int Next1 = 0;
        int DateIn;
        int DateOut;
        int back = 0;
        int IDuser = 1;
        int customerID = 1;
        int OGCID;
        int OGCOD;
        int OGRID;
        
        
     int a;
    int d = 1;
    int b = 0;
    int c = 0;
    int L = 1;
    int arrayI;
    int level = 1 ;
    int FL;
    String RN;
    int save = 0;
    int MDFCIDS= 0;
    int MDFCIDS1=0;
    int checkforuse = 0;
       
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

        int IDAdmin;
        
        String getRoomName = "0";
        int CFD = 0;
        
        
        
        
    public Admin_CustomerSetting_page2() {
        initComponents();
        get_info();
        jLabel16.setVisible(false); 
        
        In32.setVisible(false);
        Out32.setVisible(false);
        
        Level_IO.setText("1");
        
 
        RNC.setVisible(false);
        jPanel13.setVisible(false);
        YRTL1.setVisible(true);
        
        HWL.setText("1");
        
        disable_Room_Select();
        
        YRTL2.setVisible(false);
YRTL3.setVisible(false);
YRTL4.setVisible(false);
YRTL5.setVisible(false);
YRTL6.setVisible(false);
YRTL7.setVisible(false);
YRTL8.setVisible(false);
YRTL9.setVisible(false);
YRTL10.setVisible(false);
        
jLabel17.setForeground(Color.LIGHT_GRAY);

       changeCLG(); 
        
    }
    int IDtrue;
    public Admin_CustomerSetting_page2(int ID){
    initComponents();
    get_info();
        IDuser = ID;
     
        jLabel16.setVisible(true);
        
        IDtrue = 1;
        IDAdmin = ID;
      
        
     
        
        In32.setVisible(false);
        Out32.setVisible(false);
        
        Level_IO.setText("1");
        
 
        RNC.setVisible(false);
        jPanel13.setVisible(false);
        YRTL1.setVisible(true);
        
        HWL.setText("1");
        
        disable_Room_Select();
        
        YRTL2.setVisible(false);
YRTL3.setVisible(false);
YRTL4.setVisible(false);
YRTL5.setVisible(false);
YRTL6.setVisible(false);
YRTL7.setVisible(false);
YRTL8.setVisible(false);
YRTL9.setVisible(false);
YRTL10.setVisible(false);
        
       changeCLG(); 
   jLabel17.setForeground(Color.LIGHT_GRAY);     
        
    }
    
    public Admin_CustomerSetting_page2(int Room, int CID, int COD, int ID2, int cID1, int checkforuse1){
     initComponents();
     get_info();
     OGRID = Room;
     OGCID = CID;
     OGCOD = COD;
     
     IDuser = ID2;
     checkforuse =checkforuse1;
     customerID = cID1;
     jLabel17.setForeground(Color.WHITE);
    jLabel16.setVisible(false);
          In32.setVisible(false);
        Out32.setVisible(false);
        back = 1;
        Level_IO.setText("1");
        
 
        RNC.setVisible(false);
        jPanel13.setVisible(false);
        YRTL1.setVisible(true);
        
        HWL.setText("1");
        FLS.setText(String.valueOf(level));
        disable_Room_Select();
        
        YRTL2.setVisible(false);
YRTL3.setVisible(false);
YRTL4.setVisible(false);
YRTL5.setVisible(false);
YRTL6.setVisible(false);
YRTL7.setVisible(false);
YRTL8.setVisible(false);
YRTL9.setVisible(false);
YRTL10.setVisible(false);
         
In1.setSelected(true);
Out2.setSelected(true);

        d = Room;
        date = CID;
        dataOut = COD;
       
        selectdate();
        
               d = Room;
        date = CID;
        dataOut = COD;


 if(dataOut < date){
            dataOut = dataOut + 365;
            }
            
           String Monthin =  (String) ComInMonth.getSelectedItem();
        String Monthout =  (String) ComOutMonth.getSelectedItem();
        
        int DCID = DateIn;
        int DCID1 = DateOut;
      
        if(DCID1 >= 365){
     
             DCID1 = DCID1 - 365;
            String showDateCID = Monthin + " of " + DCID;
            String showDateCOD = Monthout + " of " + DCID1;
            CidS.setText(showDateCID);
            CodS.setText(showDateCOD);
            
            }
        else{
            String showDateCID = Monthin + " of " + DCID;
            String showDateCOD = Monthout + " of " + DCID1;
            CidS.setText(showDateCID);
            CodS.setText(showDateCOD);
        }
            enable_Room_Select();
            disable_Date_Select();
        //    JOptionPane.showMessageDialog(null,"Check out ="+ dataOut + "  || check in ="+date);
            
    Object bt = jComboBox3.getSelectedItem();
      String a1 = bt.toString();

        if(d == 1){
       jComboBox3.setSelectedItem("2 queen sizes bed");
            bedselect2.setSelectedItem("2 queen sizes bed");
        }
        else if(d == 2){
       jComboBox3.setSelectedItem("Twins sizes bed");
            bedselect2.setSelectedItem("Twins sizes bed");
        }
        else if(d == 3){
    jComboBox3.setSelectedItem("1 queen sized bed");
             bedselect2.setSelectedItem("1 queen sized bed");
        }
      
                else if(d == 4){
          jComboBox3.setSelectedItem("Look at all room");
            bedselect2.setSelectedItem("Look at all room");
        }
       
            activate();
            
     Next1 = 1;
changeCW(); 
autoselectroom(Room);
    }
    
    
    
    
  
    private void checkfordatemonth(){
       
    if(date>= 0 && date <=31){
        
    monthIn = 1;
    DateIn = date;
    
    }
    else if(date>= 32 && date <=59){
    monthIn = 2;
    DateIn = date - 31;
  
    }
    else if(date>= 60 && date <=90){
    monthIn = 3;
    DateIn = date - 59;
    }
       else if(date>= 91 && date <=120){
    monthIn = 4;
    DateIn = date - 90;
    
    }
       else if(date>= 121 && date <=151){
    monthIn = 5;
    DateIn = date - 120;
    
    }
       else if(date>= 152 && date <=181){
    monthIn = 6;
    DateIn = date - 151;
    }
       else if(date>= 182 && date <=212){
    monthIn = 7;
    DateIn = date - 181;
    }
        else if(date>= 213 && date <=243){
    monthIn = 8;
    DateIn = date - 212;
    }
        else if(date>= 244 && date <=273){
    monthIn = 9;
    DateIn = date - 243;
    }
        else if(date>= 274 && date <=304){
    monthIn = 10;
    DateIn = date - 273;
    }
         else if(date>= 305 && date <=334){
    monthIn = 11;
    DateIn = date - 181;
    }else if(date>= 335 && date <=365){
    monthIn = 12;
    DateIn = date - 334;
    }
    else{monthIn = 1;
    DateIn = 32;
    }
    
  
    
       if(dataOut>= 0 && dataOut <=31){
    monthOut = 1;
    DateOut = dataOut;
    }
    else if(dataOut>= 32 && dataOut <=59){
    monthOut = 2;
    DateOut = dataOut - 31;
    }
    else if(dataOut>= 60 && dataOut <=90){
    monthOut = 3;
    DateOut = dataOut - 59;
    }
       else if(dataOut>= 91 && dataOut <=120){
    monthOut = 4;
    DateOut = dataOut - 90;
    }
       else if(dataOut>= 121 && dataOut <=151){
    monthOut = 5;
    DateOut = dataOut - 120;
    }
       else if(dataOut>= 152 && dataOut <=181){
    monthOut = 6;
    DateOut = dataOut - 151;
    }
       else if(dataOut>= 182 && dataOut <=212){
    monthOut = 7;
    DateOut = dataOut - 181;
    }
        else if(dataOut>= 213 && dataOut <=243){
    monthOut = 8;
    DateOut = dataOut - 212;
    }
        else if(dataOut>= 244 && dataOut <=273){
    monthOut = 9;
    DateOut = dataOut - 243;
    }
        else if(dataOut>= 274 && dataOut <=304){
    monthOut = 10;
    DateOut = dataOut - 273;
    }
         else if(dataOut>= 305 && dataOut <=334){
    monthOut = 11;
    DateOut = date - 181;
    }else if(dataOut>= 335 && dataOut <=365){
    monthOut = 12;
    DateOut = dataOut - 334;
    }
    else{monthOut = 1;
    DateOut = 32;
    }
    
      
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
    
private void selectdate(){
    int DateInBU = date;
    int DateOutBU = dataOut;
 
        checkfordatemonth();
 
     
      
       if(monthIn == 1){ComInMonth.setSelectedItem("January");}
else if(monthIn == 2){ComInMonth.setSelectedItem("February");}
else if(monthIn == 3){ComInMonth.setSelectedItem("March");}
else if(monthIn == 4){ComInMonth.setSelectedItem("April");}
else if(monthIn == 5){ComInMonth.setSelectedItem("May");}
else if(monthIn == 6){ComInMonth.setSelectedItem("June");}
else if(monthIn == 7){ComInMonth.setSelectedItem("July");}
else if(monthIn == 8){ComInMonth.setSelectedItem("August");}
else if(monthIn == 9){ComInMonth.setSelectedItem("September");}
else if(monthIn == 10){ComInMonth.setSelectedItem("October");}
else if(monthIn == 11){ComInMonth.setSelectedItem("November");}
else if(monthIn == 12){ComInMonth.setSelectedItem("December");}
else{ComInMonth.setSelectedItem("January");}       
       
     if(monthOut == 1){ComOutMonth.setSelectedItem("January");}
else if(monthOut == 2){ComOutMonth.setSelectedItem("February");}
else if(monthOut == 3){ComOutMonth.setSelectedItem("March");}
else if(monthOut == 4){ComOutMonth.setSelectedItem("April");}
else if(monthOut == 5){ComOutMonth.setSelectedItem("May");}
else if(monthOut == 6){ComOutMonth.setSelectedItem("June");}
else if(monthOut == 7){ComOutMonth.setSelectedItem("July");}
else if(monthOut == 8){ComOutMonth.setSelectedItem("August");}
else if(monthOut == 9){ComOutMonth.setSelectedItem("September");}
else if(monthOut == 10){ComOutMonth.setSelectedItem("October");}
else if(monthOut == 11){ComOutMonth.setSelectedItem("November");}
else if(monthOut == 12){ComOutMonth.setSelectedItem("December");}
else{ComOutMonth.setSelectedItem("January");}   
     
     
     if(DateIn == 1){In1.setSelected(true);}
else if(DateIn == 2){In2.setSelected(true);}
else if(DateIn == 3){In3.setSelected(true);}
else if(DateIn == 4){In4.setSelected(true);}
else if(DateIn == 5){In5.setSelected(true);}
else if(DateIn == 6){In6.setSelected(true);}
else if(DateIn == 7){In7.setSelected(true);}
else if(DateIn == 8){In8.setSelected(true);}
else if(DateIn == 9){In9.setSelected(true);}
else if(DateIn == 10){In10.setSelected(true);}
else if(DateIn == 11){In11.setSelected(true);}
else if(DateIn == 12){In12.setSelected(true);}
else if(DateIn == 13){In13.setSelected(true);}
else if(DateIn == 14){In14.setSelected(true);}
else if(DateIn == 15){In15.setSelected(true);}
else if(DateIn == 16){In16.setSelected(true);}
else if(DateIn == 17){In17.setSelected(true);}
else if(DateIn == 18){In18.setSelected(true);}
else if(DateIn == 19){In19.setSelected(true);}
else if(DateIn == 20){In20.setSelected(true);}
else if(DateIn == 21){In21.setSelected(true);}
else if(DateIn == 22){In22.setSelected(true);}
else if(DateIn == 23){In23.setSelected(true);}
else if(DateIn == 24){In24.setSelected(true);}
else if(DateIn == 25){In25.setSelected(true);}
else if(DateIn == 26){In26.setSelected(true);}
else if(DateIn == 27){In27.setSelected(true);}
else if(DateIn == 28){In28.setSelected(true);}
else if(DateIn == 29){In29.setSelected(true);}
else if(DateIn == 30){In30.setSelected(true);}
else if(DateIn == 31){In31.setSelected(true);}
else {In32.setSelected(true);}     
        
        
     if(DateOut == 1){Out1.setSelected(true);}
else if(DateOut == 2){Out2.setSelected(true);}
else if(DateOut == 3){Out3.setSelected(true);}
else if(DateOut == 4){Out4.setSelected(true);}
else if(DateOut == 5){Out5.setSelected(true);}
else if(DateOut == 6){Out6.setSelected(true);}
else if(DateOut == 7){Out7.setSelected(true);}
else if(DateOut == 8){Out8.setSelected(true);}
else if(DateOut == 9){Out9.setSelected(true);}
else if(DateOut == 10){Out10.setSelected(true);}
else if(DateOut == 11){Out11.setSelected(true);}
else if(DateOut == 12){Out12.setSelected(true);}
else if(DateOut == 13){Out13.setSelected(true);}
else if(DateOut == 14){Out14.setSelected(true);}
else if(DateOut == 15){Out15.setSelected(true);}
else if(DateOut == 16){Out16.setSelected(true);}
else if(DateOut == 17){Out17.setSelected(true);}
else if(DateOut == 18){Out18.setSelected(true);}
else if(DateOut == 19){Out19.setSelected(true);}
else if(DateOut == 20){Out20.setSelected(true);}
else if(DateOut == 21){Out21.setSelected(true);}
else if(DateOut == 22){Out22.setSelected(true);}
else if(DateOut == 23){Out23.setSelected(true);}
else if(DateOut == 24){Out24.setSelected(true);}
else if(DateOut == 25){Out25.setSelected(true);}
else if(DateOut == 26){Out26.setSelected(true);}
else if(DateOut == 27){Out27.setSelected(true);}
else if(DateOut == 28){Out28.setSelected(true);}
else if(DateOut == 29){Out29.setSelected(true);}
else if(DateOut == 30){Out30.setSelected(true);}
else if(DateOut == 31){Out31.setSelected(true);}
else{Out32.setSelected(true);}  
     
            
 date = DateInBU;
     dataOut = DateOutBU;
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CIDGroup = new javax.swing.ButtonGroup();
        CODGroup = new javax.swing.ButtonGroup();
        RoomCheck = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        YRTL10 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        YRTL9 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        YRTL8 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        YRTL7 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        YRTL6 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        YRTL5 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        YRTL4 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        YRTL3 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        YRTL2 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        YRTL1 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        RNC = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Level_IO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bedselect2 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        HWL = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        A4 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        A22 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        C4 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Setting1 = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        showName = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CidS = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CodS = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        FLS = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        RNS = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Priceshow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 queen sizes bed", "Twins sizes bed", "1 queen sized bed", "Look at all room" }));
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
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(255, 204, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel22.setBackground(new java.awt.Color(255, 204, 0));

        In8.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In8);
        In8.setText("8");
        In8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In8ActionPerformed(evt);
            }
        });

        In16.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In16);
        In16.setText("16");
        In16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In16ActionPerformed(evt);
            }
        });

        In24.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In24);
        In24.setText("24");
        In24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In24ActionPerformed(evt);
            }
        });

        In32.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In32);
        In32.setText("32");
        In32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(In24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(In32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(In16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(In8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        CIDGroup.add(In6);
        In6.setText("6");
        In6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In6ActionPerformed(evt);
            }
        });

        In14.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In14);
        In14.setText("14");
        In14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In14ActionPerformed(evt);
            }
        });

        In22.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In22);
        In22.setText("22");
        In22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In22ActionPerformed(evt);
            }
        });

        In30.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In30);
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
        CIDGroup.add(In1);
        In1.setText("1");
        In1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In1ActionPerformed(evt);
            }
        });

        In9.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In9);
        In9.setText("9");
        In9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In9ActionPerformed(evt);
            }
        });

        In17.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In17);
        In17.setText("17");
        In17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In17ActionPerformed(evt);
            }
        });

        In25.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In25);
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
        CIDGroup.add(In5);
        In5.setText("5");
        In5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In5ActionPerformed(evt);
            }
        });

        In13.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In13);
        In13.setText("13");
        In13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In13ActionPerformed(evt);
            }
        });

        In21.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In21);
        In21.setText("21");
        In21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In21ActionPerformed(evt);
            }
        });

        In29.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In29);
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
        CIDGroup.add(In4);
        In4.setText("4");
        In4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In4ActionPerformed(evt);
            }
        });

        In12.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In12);
        In12.setText("12");
        In12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In12ActionPerformed(evt);
            }
        });

        In20.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In20);
        In20.setText("20");
        In20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In20ActionPerformed(evt);
            }
        });

        In28.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In28);
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
        CIDGroup.add(In3);
        In3.setText("3");
        In3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In3ActionPerformed(evt);
            }
        });

        In11.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In11);
        In11.setText("11");
        In11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In11ActionPerformed(evt);
            }
        });

        In19.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In19);
        In19.setText("19");
        In19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In19ActionPerformed(evt);
            }
        });

        In27.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In27);
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
        CIDGroup.add(In2);
        In2.setText("2");
        In2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In2ActionPerformed(evt);
            }
        });

        In10.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In10);
        In10.setText("10");
        In10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In10ActionPerformed(evt);
            }
        });

        In18.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In18);
        In18.setText("18");
        In18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In18ActionPerformed(evt);
            }
        });

        In26.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In26);
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
        CIDGroup.add(In31);
        In31.setText("31");
        In31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In31ActionPerformed(evt);
            }
        });

        In23.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In23);
        In23.setText("23");
        In23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In23ActionPerformed(evt);
            }
        });

        In15.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In15);
        In15.setText("15");
        In15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In15ActionPerformed(evt);
            }
        });

        In7.setBackground(new java.awt.Color(255, 204, 51));
        CIDGroup.add(In7);
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
        CODGroup.add(Out8);
        Out8.setText("8");
        Out8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out8ActionPerformed(evt);
            }
        });

        Out16.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out16);
        Out16.setText("16");
        Out16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out16ActionPerformed(evt);
            }
        });

        Out24.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out24);
        Out24.setText("24");
        Out24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out24ActionPerformed(evt);
            }
        });

        Out32.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out32);
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
        CODGroup.add(Out6);
        Out6.setText("6");
        Out6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out6ActionPerformed(evt);
            }
        });

        Out14.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out14);
        Out14.setText("14");
        Out14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out14ActionPerformed(evt);
            }
        });

        Out22.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out22);
        Out22.setText("22");
        Out22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out22ActionPerformed(evt);
            }
        });

        Out30.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out30);
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
        CODGroup.add(Out1);
        Out1.setText("1");
        Out1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out1ActionPerformed(evt);
            }
        });

        Out9.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out9);
        Out9.setText("9");
        Out9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out9ActionPerformed(evt);
            }
        });

        Out17.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out17);
        Out17.setText("17");
        Out17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out17ActionPerformed(evt);
            }
        });

        Out25.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out25);
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
        CODGroup.add(Out5);
        Out5.setText("5");
        Out5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out5ActionPerformed(evt);
            }
        });

        Out13.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out13);
        Out13.setText("13");
        Out13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out13ActionPerformed(evt);
            }
        });

        Out21.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out21);
        Out21.setText("21");
        Out21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out21ActionPerformed(evt);
            }
        });

        Out29.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out29);
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
        CODGroup.add(Out4);
        Out4.setText("4");
        Out4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out4ActionPerformed(evt);
            }
        });

        Out12.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out12);
        Out12.setText("12");
        Out12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out12ActionPerformed(evt);
            }
        });

        Out20.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out20);
        Out20.setText("20");
        Out20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out20ActionPerformed(evt);
            }
        });

        Out28.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out28);
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
        CODGroup.add(Out3);
        Out3.setText("3");
        Out3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out3ActionPerformed(evt);
            }
        });

        Out11.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out11);
        Out11.setText("11");
        Out11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out11ActionPerformed(evt);
            }
        });

        Out19.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out19);
        Out19.setText("19");
        Out19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out19ActionPerformed(evt);
            }
        });

        Out27.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out27);
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
        CODGroup.add(Out2);
        Out2.setText("2");
        Out2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out2ActionPerformed(evt);
            }
        });

        Out10.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out10);
        Out10.setText("10");
        Out10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out10ActionPerformed(evt);
            }
        });

        Out18.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out18);
        Out18.setText("18");
        Out18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out18ActionPerformed(evt);
            }
        });

        Out26.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out26);
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
        CODGroup.add(Out7);
        Out7.setText("7");
        Out7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out7ActionPerformed(evt);
            }
        });

        Out15.setBackground(new java.awt.Color(255, 204, 0));
        CODGroup.add(Out15);
        Out15.setText("15");
        Out15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out15ActionPerformed(evt);
            }
        });

        Out23.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out23);
        Out23.setText("23");
        Out23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Out23ActionPerformed(evt);
            }
        });

        Out31.setBackground(new java.awt.Color(255, 204, 51));
        CODGroup.add(Out31);
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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\arrow left.png")); // NOI18N
        jLabel17.setText("Back to Selecting Date");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel17MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });

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
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComOutMonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(5, 5, 5)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        jLabel8.setText("Level : 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel19MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel19MouseEntered(evt);
            }
        });

        jLabel38.setText("Level : 2");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel35.setBackground(new java.awt.Color(255, 255, 255));
        jPanel35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel35MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel35MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel35MouseEntered(evt);
            }
        });

        jLabel41.setText("Level : 3");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel36.setBackground(new java.awt.Color(255, 255, 255));
        jPanel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel36MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel36MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel36MouseEntered(evt);
            }
        });

        jLabel42.setText("Level : 4");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel37MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel37MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel37MouseEntered(evt);
            }
        });

        jLabel43.setText("Level : 5");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel43, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel38.setBackground(java.awt.Color.white);
        jPanel38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel38MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel38MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel38MouseEntered(evt);
            }
        });

        jLabel44.setText("Level : 10");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel39MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel39MouseEntered(evt);
            }
        });

        jLabel45.setText("Level : 9");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel45, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel40MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel40MouseEntered(evt);
            }
        });

        jLabel46.setText("Level : 8");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel41MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel41MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel41MouseEntered(evt);
            }
        });

        jLabel47.setText("Level : 7");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel42MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel42MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel42MouseEntered(evt);
            }
        });

        jLabel48.setText("Level : 6");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel58.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL10Layout = new javax.swing.GroupLayout(YRTL10);
        YRTL10.setLayout(YRTL10Layout);
        YRTL10Layout.setHorizontalGroup(
            YRTL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL10Layout.setVerticalGroup(
            YRTL10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel57.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL9Layout = new javax.swing.GroupLayout(YRTL9);
        YRTL9.setLayout(YRTL9Layout);
        YRTL9Layout.setHorizontalGroup(
            YRTL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL9Layout.setVerticalGroup(
            YRTL9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel53.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL8Layout = new javax.swing.GroupLayout(YRTL8);
        YRTL8.setLayout(YRTL8Layout);
        YRTL8Layout.setHorizontalGroup(
            YRTL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL8Layout.setVerticalGroup(
            YRTL8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel54.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL7Layout = new javax.swing.GroupLayout(YRTL7);
        YRTL7.setLayout(YRTL7Layout);
        YRTL7Layout.setHorizontalGroup(
            YRTL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL7Layout.setVerticalGroup(
            YRTL7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel55.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL6Layout = new javax.swing.GroupLayout(YRTL6);
        YRTL6.setLayout(YRTL6Layout);
        YRTL6Layout.setHorizontalGroup(
            YRTL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL6Layout.setVerticalGroup(
            YRTL6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel56.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL5Layout = new javax.swing.GroupLayout(YRTL5);
        YRTL5.setLayout(YRTL5Layout);
        YRTL5Layout.setHorizontalGroup(
            YRTL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL5Layout.setVerticalGroup(
            YRTL5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel51.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL4Layout = new javax.swing.GroupLayout(YRTL4);
        YRTL4.setLayout(YRTL4Layout);
        YRTL4Layout.setHorizontalGroup(
            YRTL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL4Layout.setVerticalGroup(
            YRTL4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel52.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL3Layout = new javax.swing.GroupLayout(YRTL3);
        YRTL3.setLayout(YRTL3Layout);
        YRTL3Layout.setHorizontalGroup(
            YRTL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL3Layout.setVerticalGroup(
            YRTL3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL2Layout = new javax.swing.GroupLayout(YRTL2);
        YRTL2.setLayout(YRTL2Layout);
        YRTL2Layout.setHorizontalGroup(
            YRTL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL2Layout.setVerticalGroup(
            YRTL2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        YRTL1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setText("<-You Are At Level");

        javax.swing.GroupLayout YRTL1Layout = new javax.swing.GroupLayout(YRTL1);
        YRTL1.setLayout(YRTL1Layout);
        YRTL1Layout.setHorizontalGroup(
            YRTL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YRTL1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        YRTL1Layout.setVerticalGroup(
            YRTL1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YRTL9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(YRTL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YRTL10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YRTL9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YRTL8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(YRTL7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YRTL6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YRTL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YRTL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(YRTL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YRTL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YRTL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        RoomCheck.add(RNC);
        RNC.setSelected(true);
        RNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RNCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(0, 768, Short.MAX_VALUE)
                .addComponent(RNC))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(RNC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\arrow up.png")); // NOI18N
        jButton2.setText("Up    ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\arrow down.png")); // NOI18N
        jButton3.setText("down");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Level_IO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Level_IO.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Level =");

        bedselect2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bedselect2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 queen sizes bed", "Twins sizes bed", "1 queen sized bed", "Look at all room" }));
        bedselect2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bedselect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedselect2ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Room Type");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Level_IO))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bedselect2, 0, 391, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(159, 159, 159))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Level_IO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(bedselect2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Hallway Level ");

        HWL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HWL.setText("1");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HWL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(HWL))
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\stair.png")); // NOI18N

        jLabel59.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\elevator.png")); // NOI18N

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel59)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Select your room here");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        A4.setBackground(new java.awt.Color(255, 255, 255));
        A4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\2DoubleBeds.png")); // NOI18N
        A4.setText("A4");
        A4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(255, 255, 255));
        A3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\2DoubleBeds.png")); // NOI18N
        A3.setText("A3");
        A3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A22.setBackground(new java.awt.Color(255, 255, 255));
        A22.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\2DoubleBeds.png")); // NOI18N
        A22.setText("A2");
        A22.setToolTipText("");
        A22.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        A22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A22ActionPerformed(evt);
            }
        });

        A1.setBackground(new java.awt.Color(255, 255, 255));
        A1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\2DoubleBeds.png")); // NOI18N
        A1.setText("A1");
        A1.setToolTipText("");
        A1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\twin (1).png")); // NOI18N
        B4.setText("B4");
        B4.setToolTipText("");
        B4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\twin (1).png")); // NOI18N
        B3.setText("B3");
        B3.setToolTipText("");
        B3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(255, 255, 255));
        B2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\twin (1).png")); // NOI18N
        B2.setText("B2");
        B2.setToolTipText("");
        B2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\twin (1).png")); // NOI18N
        B1.setText("B1");
        B1.setToolTipText("");
        B1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(255, 255, 255));
        C1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\queen-size-bed-pngrepo-com (1).png")); // NOI18N
        C1.setText("C1");
        C1.setToolTipText("");
        C1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(255, 255, 255));
        C2.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\queen-size-bed-pngrepo-com (1).png")); // NOI18N
        C2.setText("C2");
        C2.setToolTipText("");
        C2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(255, 255, 255));
        C3.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\queen-size-bed-pngrepo-com (1).png")); // NOI18N
        C3.setText("C3");
        C3.setToolTipText("");
        C3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(255, 255, 255));
        C4.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\queen-size-bed-pngrepo-com (1).png")); // NOI18N
        C4.setText("C4");
        C4.setToolTipText("");
        C4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A22, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(C4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(C2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(C4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(B4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(A1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(B3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(51, 51, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hotel Reservation");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Back to Admin Page");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\customer-icon-small.png")); // NOI18N
        jLabel18.setText("Customer Setting");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Customer Setting");

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\newadminicon.png")); // NOI18N
        jLabel22.setText("Create new admin account");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
        });

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\newcustomersmall.png")); // NOI18N
        jLabel23.setText("Add new customer");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
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

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        showName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        showName.setText("jLabel1");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showName, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(showName)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel22)))
                .addGap(151, 151, 151)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Setting1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(376, 376, 376)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(32, 32, 32)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel22))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Logout)
                                .addComponent(Setting1)
                                .addComponent(jLabel23)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14)
                        .addContainerGap())))
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("If the room is disable meaning that the room is either occupied on the same date you have selected or check your room selection filter.");

        Next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Next.setIcon(new javax.swing.ImageIcon("C:\\Users\\sunny\\Desktop\\Hotel\\arrow right.png")); // NOI18N
        Next.setText("Next");
        Next.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Next.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        jPanel7.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Check in date =");

        CidS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CidS.setText("*");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CidS)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CidS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Check out date =");

        CodS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CodS.setText("*");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodS)
                .addGap(169, 169, 169))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(CodS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Floor Level =");

        FLS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FLS.setText("*");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FLS)
                .addGap(195, 195, 195))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(FLS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Room number =");

        RNS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RNS.setText("*");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RNS)
                .addGap(173, 173, 173))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(RNS))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Price");

        Priceshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Priceshow.setText("*");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Priceshow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Priceshow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel19)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(138, 138, 138)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Next, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
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
            
           String Monthin =  (String) ComInMonth.getSelectedItem();
        String Monthout =  (String) ComOutMonth.getSelectedItem();
        int DCID = date - MDFCIDS;
        int DCID1 = dataOut - MDFCIDS1;
      
        if(DCID1 >= 365){
     
             DCID1 = DCID1 - 365;
            String showDateCID = Monthin + " of " + DCID;
            String showDateCOD = Monthout + " of " + DCID1;
            CidS.setText(showDateCID);
            CodS.setText(showDateCOD);
            
            }
        else{
            String showDateCID = Monthin + " of " + DCID;
            String showDateCOD = Monthout + " of " + DCID1;
            CidS.setText(showDateCID);
            CodS.setText(showDateCOD);
        }
            enable_Room_Select();
            disable_Date_Select();
        //    JOptionPane.showMessageDialog(null,"Check out ="+ dataOut + "  || check in ="+date);
            
    Object bt = jComboBox3.getSelectedItem();
      String a1 = bt.toString();

        if(a1.equals("2 queen sizes bed")){
            d = 1;
            bedselect2.setSelectedItem("2 queen sizes bed");
        }
        else if(a1.equals("Twins sizes bed")){
            d= 2;
            bedselect2.setSelectedItem("Twins sizes bed");
        }
        else if(a1.equals("1 queen sized bed")){
            d= 3;
             bedselect2.setSelectedItem("1 queen sized bed");
        }
      
                else if(a1.equals("Look at all room")){
            d= 4;
            bedselect2.setSelectedItem("Look at all room");
        }
        
            activate();
     Next1 = 1;
changeCW(); 
 jLabel17.setForeground(Color.BLACK);
 back = 1;
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
  /*  Object bt = jComboBox3.getSelectedItem();
      String a1 = bt.toString();

        if(a1.equals("2 queen sizes bed")){
            d = 1;
        }
        else if(a1.equals("2 small sizes bed")){
            d= 2;
        }
        else if(a1.equals("1 queen sized bed")){
            d= 3;
        }
      
                else if(a1.equals("Look at all room")){
            d= 4;
        }*/

    }//GEN-LAST:event_jComboBox3ActionPerformed
private void disable_Room_Select(){

    jButton2.setEnabled(false);
    jButton3.setEnabled(false);
    bedselect2.setEnabled(false);
    C4.setEnabled(false); C3.setEnabled(false); C2.setEnabled(false); C1.setEnabled(false);
    B4.setEnabled(false); B3.setEnabled(false); B2.setEnabled(false); B1.setEnabled(false);
    A4.setEnabled(false); A3.setEnabled(false); A22.setEnabled(false); A1.setEnabled(false);
    Next.setEnabled(false); 
   // BackToDate.setEnabled(false);
            
}

private void enable_Room_Select(){

    jButton2.setEnabled(true);
    jButton3.setEnabled(true);
    bedselect2.setEnabled(true);
    C4.setEnabled(true); C3.setEnabled(true); C2.setEnabled(true); C1.setEnabled(true);
    B4.setEnabled(true); B3.setEnabled(true); B2.setEnabled(true); B1.setEnabled(true);
    A4.setEnabled(true); A3.setEnabled(true); A22.setEnabled(true); A1.setEnabled(true);
    Next.setEnabled(true);
   //  BackToDate.setEnabled(true);
            
}
    
private void disable_Date_Select(){
In1.setEnabled(false);
Out1.setEnabled(false);
In2.setEnabled(false);
Out2.setEnabled(false);
In3.setEnabled(false);
Out3.setEnabled(false);
In4.setEnabled(false);
Out4.setEnabled(false);
In5.setEnabled(false);
Out5.setEnabled(false);
In6.setEnabled(false);
Out6.setEnabled(false);
In7.setEnabled(false);
Out7.setEnabled(false);
In8.setEnabled(false);
Out8.setEnabled(false);
In9.setEnabled(false);
Out9.setEnabled(false);
In10.setEnabled(false);
Out10.setEnabled(false);
In11.setEnabled(false);
Out11.setEnabled(false);
In12.setEnabled(false);
Out12.setEnabled(false);
In13.setEnabled(false);
Out13.setEnabled(false);
In14.setEnabled(false);
Out14.setEnabled(false);
In15.setEnabled(false);
Out15.setEnabled(false);
In16.setEnabled(false);
Out16.setEnabled(false);
In17.setEnabled(false);
Out17.setEnabled(false);
In18.setEnabled(false);
Out18.setEnabled(false);
In19.setEnabled(false);
Out19.setEnabled(false);
In20.setEnabled(false);
Out20.setEnabled(false);
In21.setEnabled(false);
Out21.setEnabled(false);
In22.setEnabled(false);
Out22.setEnabled(false);
In23.setEnabled(false);
Out23.setEnabled(false);
In24.setEnabled(false);
Out24.setEnabled(false);
In25.setEnabled(false);
Out25.setEnabled(false);
In26.setEnabled(false);
Out26.setEnabled(false);
In27.setEnabled(false);
Out27.setEnabled(false);
In28.setEnabled(false);
Out28.setEnabled(false);
In29.setEnabled(false);
Out29.setEnabled(false);
In30.setEnabled(false);
Out30.setEnabled(false);
In31.setEnabled(false);
Out31.setEnabled(false);
In32.setEnabled(false);
Out32.setEnabled(false);

ComInMonth.setEnabled(false);
ComOutMonth.setEnabled(false);
jComboBox3.setEnabled(false);
jButton4.setEnabled(false);
}
    
private void enable_Date_Select(){
In1.setEnabled(true);
Out1.setEnabled(true);
In2.setEnabled(true);
Out2.setEnabled(true);
In3.setEnabled(true);
Out3.setEnabled(true);
In4.setEnabled(true);
Out4.setEnabled(true);
In5.setEnabled(true);
Out5.setEnabled(true);
In6.setEnabled(true);
Out6.setEnabled(true);
In7.setEnabled(true);
Out7.setEnabled(true);
In8.setEnabled(true);
Out8.setEnabled(true);
In9.setEnabled(true);
Out9.setEnabled(true);
In10.setEnabled(true);
Out10.setEnabled(true);
In11.setEnabled(true);
Out11.setEnabled(true);
In12.setEnabled(true);
Out12.setEnabled(true);
In13.setEnabled(true);
Out13.setEnabled(true);
In14.setEnabled(true);
Out14.setEnabled(true);
In15.setEnabled(true);
Out15.setEnabled(true);
In16.setEnabled(true);
Out16.setEnabled(true);
In17.setEnabled(true);
Out17.setEnabled(true);
In18.setEnabled(true);
Out18.setEnabled(true);
In19.setEnabled(true);
Out19.setEnabled(true);
In20.setEnabled(true);
Out20.setEnabled(true);
In21.setEnabled(true);
Out21.setEnabled(true);
In22.setEnabled(true);
Out22.setEnabled(true);
In23.setEnabled(true);
Out23.setEnabled(true);
In24.setEnabled(true);
Out24.setEnabled(true);
In25.setEnabled(true);
Out25.setEnabled(true);
In26.setEnabled(true);
Out26.setEnabled(true);
In27.setEnabled(true);
Out27.setEnabled(true);
In28.setEnabled(true);
Out28.setEnabled(true);
In29.setEnabled(true);
Out29.setEnabled(true);
In30.setEnabled(true);
Out30.setEnabled(true);
In31.setEnabled(true);
Out31.setEnabled(true);
In32.setEnabled(true);

ComInMonth.setEnabled(true);
ComOutMonth.setEnabled(true);
jComboBox3.setEnabled(true);
jButton4.setEnabled(true);

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
        else if( ComInMonth2.equals(A11)){
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
        else if( ComOutMonth2.equals(A11)){
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

    private void Out32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Out32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Out32ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   if (Out32.isSelected() || In32.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select Date first");
        }
   else{
        if(level == 1)
        {
            level = 1;
        }

        else{
            level--;
            FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
             SRL();
        }
   }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   if (Out32.isSelected() || In32.isSelected()){
            JOptionPane.showMessageDialog(null, "Please select Date first");
        }
   else{
        if(level == 10)
        {
            level = 10;
        }

        else{
          
            level++;
             FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clearcolor(){
      C1.setBackground(Color.white );
        C2.setBackground(Color.white);
        C3.setBackground(Color.white );
        C4.setBackground(Color.white);
        B1.setBackground(Color.white );
        B2.setBackground(Color.white);
        B3.setBackground(Color.white );
        B4.setBackground(Color.white);
        A1.setBackground(Color.white );
        A22.setBackground(Color.white);
        A3.setBackground(Color.white );
        A4.setBackground(Color.white);
    }
    
    private void bedselect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedselect2ActionPerformed
if (Out32.isSelected() || In32.isSelected()){
            
    
    JOptionPane.showMessageDialog(null, "Please select Date first");
        }
        else{
       
    
        Object bt1 = bedselect2.getSelectedItem();
      String a12 = bt1.toString();

    
      
        if(a12.equals("2 queen sizes bed")){
            d = 1;
           jComboBox3.setSelectedItem("2 queen sizes bed");
            
        }
        else if(a12.equals("Twins sizes bed")){
            d= 2;
            jComboBox3.setSelectedItem("Twins sizes bed");
        }
        else if(a12.equals("1 queen sized bed")){
            d= 3;
            jComboBox3.setSelectedItem("1 queen sized bed");
        }
      
                else if(a12.equals("Look at all room")){
            d= 4;
            jComboBox3.setSelectedItem("Look at all room");
        }
  activate();
            SRL();
        
}   
    }//GEN-LAST:event_bedselect2ActionPerformed

    private void changeCLG(){
    jPanel38.setBackground(Color.LIGHT_GRAY);
    jPanel39.setBackground(Color.LIGHT_GRAY);       
    jPanel40.setBackground(Color.LIGHT_GRAY);
    jPanel41.setBackground(Color.LIGHT_GRAY);
    jPanel42.setBackground(Color.LIGHT_GRAY);
    jPanel37.setBackground(Color.LIGHT_GRAY);
    jPanel36.setBackground(Color.LIGHT_GRAY);
    jPanel35.setBackground(Color.LIGHT_GRAY);
    jPanel19.setBackground(Color.LIGHT_GRAY);
    jPanel1.setBackground(Color.LIGHT_GRAY);        
    }
    
      private void changeCW(){
    jPanel38.setBackground(Color.WHITE);
    jPanel39.setBackground(Color.WHITE);       
    jPanel40.setBackground(Color.WHITE);
    jPanel41.setBackground(Color.WHITE);
    jPanel42.setBackground(Color.WHITE);
    jPanel37.setBackground(Color.WHITE);
    jPanel36.setBackground(Color.WHITE);
    jPanel35.setBackground(Color.WHITE);
    jPanel19.setBackground(Color.WHITE);
    jPanel1.setBackground(Color.WHITE);        
    }
    
    
    private void In26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In26ActionPerformed
        getmonth();
        date += 26;
    }//GEN-LAST:event_In26ActionPerformed

    private void In18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In18ActionPerformed
        getmonth();
        date += 18;
    }//GEN-LAST:event_In18ActionPerformed

    private void In10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In10ActionPerformed
        getmonth();
        date += 10;
    }//GEN-LAST:event_In10ActionPerformed

    private void In2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In2ActionPerformed
        getmonth();
        date += 2;
    }//GEN-LAST:event_In2ActionPerformed

    private void In27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In27ActionPerformed
        getmonth();
        date += 27;
    }//GEN-LAST:event_In27ActionPerformed

    private void In19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In19ActionPerformed
        getmonth();
        date += 19;
    }//GEN-LAST:event_In19ActionPerformed

    private void In11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In11ActionPerformed
        getmonth();
        date += 11;
    }//GEN-LAST:event_In11ActionPerformed

    private void In3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In3ActionPerformed
        getmonth();
        date += 3;
    }//GEN-LAST:event_In3ActionPerformed

    private void In28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In28ActionPerformed
        getmonth();
        date += 28;
    }//GEN-LAST:event_In28ActionPerformed

    private void In20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In20ActionPerformed
        getmonth();
        date += 20;
    }//GEN-LAST:event_In20ActionPerformed

    private void In12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In12ActionPerformed
        getmonth();
        date += 12;
    }//GEN-LAST:event_In12ActionPerformed

    private void In4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In4ActionPerformed
        getmonth();
        date += 4;
    }//GEN-LAST:event_In4ActionPerformed

    private void In29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In29ActionPerformed
        getmonth();
        date += 29;
    }//GEN-LAST:event_In29ActionPerformed

    private void In21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In21ActionPerformed
        getmonth();
        date += 21;
    }//GEN-LAST:event_In21ActionPerformed

    private void In13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In13ActionPerformed
        getmonth();
        date += 13;
    }//GEN-LAST:event_In13ActionPerformed

    private void In5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In5ActionPerformed
        getmonth();
        date += 5;
    }//GEN-LAST:event_In5ActionPerformed

    private void In25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In25ActionPerformed
        getmonth();
        date += 25;
    }//GEN-LAST:event_In25ActionPerformed

    private void In17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In17ActionPerformed
        getmonth();
        date += 17;
    }//GEN-LAST:event_In17ActionPerformed

    private void In9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In9ActionPerformed
        getmonth();
        date += 9;
    }//GEN-LAST:event_In9ActionPerformed

    private void In1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In1ActionPerformed
        getmonth();
        date += 1;
    }//GEN-LAST:event_In1ActionPerformed

    private void In7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In7ActionPerformed
        getmonth();
        date += 7;
    }//GEN-LAST:event_In7ActionPerformed

    private void In15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In15ActionPerformed
        getmonth();
        date += 15;
    }//GEN-LAST:event_In15ActionPerformed

    private void In23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In23ActionPerformed
        getmonth();
        date += 23;
    }//GEN-LAST:event_In23ActionPerformed

    private void In31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In31ActionPerformed
        getmonth();
        date += 31;
    }//GEN-LAST:event_In31ActionPerformed

    private void In30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In30ActionPerformed
        getmonth();
        date += 30;
    }//GEN-LAST:event_In30ActionPerformed

    private void In22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In22ActionPerformed
        getmonth();
        date += 22;
    }//GEN-LAST:event_In22ActionPerformed

    private void In14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In14ActionPerformed
        getmonth();
        date += 14;
    }//GEN-LAST:event_In14ActionPerformed

    private void In6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In6ActionPerformed
        getmonth();
        date += 6;
    }//GEN-LAST:event_In6ActionPerformed

    private void In32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_In32ActionPerformed

    private void In24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In24ActionPerformed
        getmonth();
        date += 24;
    }//GEN-LAST:event_In24ActionPerformed

    private void In16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In16ActionPerformed
        getmonth();
        date += 16;
    }//GEN-LAST:event_In16ActionPerformed

    private void In8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In8ActionPerformed
        getmonth();
        date += 8;
    }//GEN-LAST:event_In8ActionPerformed

    private void autoselectroom(int roomID2){
    
        int roomlevelstart = 1 ;
        String roomnamestart = "";
        
   try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
   String sql;

    sql = "SELECT * FROM hotel.hotel_room_type WHERE Hotel_Room_Type_ID =? ";

   PreparedStatement sql1 = con.prepareStatement(sql);

   sql1.setInt(1,roomID2);
 
   ResultSet rs = sql1.executeQuery();        
   while(rs.next()){
   String HRT_ID = String.valueOf(rs.getInt("Hotel_Room_Type_ID"));
   String Hotel_ID = String.valueOf(rs.getInt("Hotel_ID"));
   String HFRL = String.valueOf(rs.getInt("Hotel_Floor_Room_Level"));
   String RP = String.valueOf(rs.getInt("Room_Price"));
   String HRN = rs.getString("Hotel_Room_Name");
   String AFH[] = {HRT_ID,Hotel_ID,HFRL,RP,HRN};
 // JOptionPane.showMessageDialog(null, AFH[0]);

 roomnamestart = HRN;
 roomlevelstart = rs.getInt("Hotel_Floor_Room_Level");
         
 RoomIDGot = Integer.valueOf(AFH[0]);
 getroomprice = Integer.valueOf(AFH[3]);
 
 
 FLS.setText(String.valueOf(level));
 Priceshow.setText(AFH[3] + "$");
 
RNS.setText(roomnamestart);    
 
   }
        }

catch(Exception e){
    JOptionPane.showMessageDialog(null, "not Connected");
}             
   Level_IO.setText(String.valueOf(roomlevelstart));
       level = roomlevelstart;
       HWL.setText(String.valueOf(roomlevelstart));
   SRL();
   
  
   if(roomnamestart.equals("A1")){
   A1.setBackground(Color.BLUE);
   } 
  else if(roomnamestart.equals("A2")){
   A22.setBackground(Color.BLUE);
   } 
  else if(roomnamestart.equals("A3")){
   A3.setBackground(Color.BLUE);
   } 
   else if(roomnamestart.equals("A4")){
   A4.setBackground(Color.BLUE);
   } 
    else if(roomnamestart.equals("B1")){
   B1.setBackground(Color.BLUE);
   }
   else if(roomnamestart.equals("B2")){
   B2.setBackground(Color.BLUE);
   }
    else if(roomnamestart.equals("B3")){
   B3.setBackground(Color.BLUE);
   }
   else if(roomnamestart.equals("B4")){
   B4.setBackground(Color.BLUE);
   }
   else if(roomnamestart.equals("C1")){
   C1.setBackground(Color.BLUE);
   }
    else if(roomnamestart.equals("C2")){
   C2.setBackground(Color.BLUE);
   }
    else if(roomnamestart.equals("C3")){
   C3.setBackground(Color.BLUE);
   }
    else if(roomnamestart.equals("C4")){
   C4.setBackground(Color.BLUE);
   }
   
   
    }
    
    
    
    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        clearcolor();
        getRoomName = "A1";
        A1.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_A1ActionPerformed

    private void A22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A22ActionPerformed
     clearcolor();
        getRoomName = "A2";
        A22.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_A22ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        clearcolor();
        getRoomName = "A3";
        A3.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        clearcolor();
        getRoomName = "A4";
        A4.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_A4ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        clearcolor();
        getRoomName = "B4";
        B4.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_B4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
         clearcolor();
        getRoomName = "B3";
        B3.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_B3ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
       clearcolor();
        getRoomName = "B2";
        B2.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_B2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        clearcolor();
        getRoomName = "B1";
        B1.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        clearcolor();
        getRoomName = "C1";
        C1.setBackground(Color.BLUE);
         getroomid();
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        clearcolor();
        getRoomName = "C2";
        C2.setBackground(Color.BLUE);
        getroomid();
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        clearcolor();
        getRoomName = "C3";
        C3.setBackground(Color.BLUE);
        getroomid();
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
         clearcolor();
        getRoomName = "C4";
        C4.setBackground(Color.BLUE);
        getroomid();
    }//GEN-LAST:event_C4ActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
 String Monthin =  (String) ComInMonth.getSelectedItem();
        String Monthout =  (String) ComOutMonth.getSelectedItem();
         int DCID = date - MDFCIDS;
        int DCID1 = dataOut - MDFCIDS1;
                  String showDateCID = Monthin + " of " + DCID;
            String showDateCOD = Monthout + " of " + DCID1;
            String GetBedSelect = (String) bedselect2.getSelectedItem();
        if(RoomIDGot == 0 || dataOut == 0 || date == 0){
        JOptionPane.showMessageDialog(null, "Please check if you have select the Room selection and the date selection");
        }
        else{
         int change = 1;  // JOptionPane.showMessageDialog(null, "RoomID = "+RoomIDGot + "date in = "+date+" dateout = "+dataOut+"IDAdmin = "+IDuser + "cID = " + customerID);
         if(OGCID == date || OGCOD == dataOut || OGRID == RoomIDGot){
         change = 0;
         
         }
           
           
            new Admin_CustomerSetting_Page(RoomIDGot, date, dataOut, IDuser, customerID, checkforuse, change).setVisible(true);
            this.setVisible(false);
        }

       
    }//GEN-LAST:event_NextActionPerformed

    private void jPanel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseClicked
if(Next1 == 1){
        level = 10;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel38MouseClicked

    private void jPanel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseEntered
     if(Next1 == 1){ jPanel38.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel38.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel38MouseEntered

    private void jPanel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseExited
     if(Next1 == 1){ jPanel38.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel38.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel38MouseExited

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
   if(Next1 == 1){
        level = 9;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel39MouseClicked

    private void jPanel39MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseEntered
     if(Next1 == 1){ jPanel39.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel39.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel39MouseEntered

    private void jPanel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseExited
      if(Next1 == 1){ jPanel39.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel39.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel39MouseExited

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
   if(Next1 == 1){
        level = 8;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel40MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseEntered
    if(Next1 == 1){ jPanel40.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel40.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel40MouseEntered

    private void jPanel40MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseExited
         if(Next1 == 1){ jPanel40.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel40.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel40MouseExited

    private void jPanel41MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseClicked
         if(Next1 == 1){
        level = 7;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel41MouseClicked

    private void jPanel41MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseEntered
        if(Next1 == 1){ jPanel41.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel41.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel41MouseEntered

    private void jPanel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel41MouseExited
          if(Next1 == 1){ jPanel41.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel41.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel41MouseExited

    private void jPanel42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseClicked
     if(Next1 == 1){
        level = 6;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel42MouseClicked

    private void jPanel42MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseEntered
            if(Next1 == 1){ jPanel42.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel42.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel42MouseEntered

    private void jPanel42MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel42MouseExited
      if(Next1 == 1){ jPanel42.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel42.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel42MouseExited

    private void jPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseClicked
        if(Next1 == 1){
        level = 5;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel37MouseClicked

    private void jPanel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseEntered
            if(Next1 == 1){ jPanel37.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel37.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel37MouseEntered

    private void jPanel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseExited
       if(Next1 == 1){ jPanel37.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel37.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel37MouseExited

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseClicked
        if(Next1 == 1){
        level = 4;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel36MouseClicked

    private void jPanel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseEntered
        if(Next1 == 1){ jPanel36.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel36.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel36MouseEntered

    private void jPanel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseExited
          if(Next1 == 1){ jPanel36.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel36.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel36MouseExited
 
    private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseClicked
    if(Next1 == 1){
        level = 3;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel35MouseClicked

    private void jPanel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseEntered
       if(Next1 == 1){ jPanel35.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel35.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel35MouseEntered

    private void jPanel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseExited
         if(Next1 == 1){ jPanel35.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel35.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel35MouseExited

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
    if(Next1 == 1){
        level = 2;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel19MouseClicked

    private void jPanel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseEntered
       if(Next1 == 1){ jPanel19.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel19.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel19MouseEntered

    private void jPanel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseExited
        if(Next1 == 1){ jPanel19.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel19.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel19MouseExited

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
       if(Next1 == 1){
        level = 1;       
 FLS.setText(String.valueOf(level));
            // JOptionPane.showMessageDialog(null, level);
            Level_IO.setText(String.valueOf(level));
            activate();
            SRL();}
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
      if(Next1 == 1){ jPanel1.setBackground(Color.GRAY);}
     else if(Next1 == 0){ jPanel1.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
         if(Next1 == 1){ jPanel1.setBackground(Color.WHITE);}
     else if(Next1 == 0){ jPanel1.setBackground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jPanel1MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        new Lao_Poet_Hotel_Page().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setForeground(Color.white);
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        jLabel14.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked

        new Admin_main_page(IDAdmin).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
        jLabel16.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
        jLabel16.setForeground(Color.GRAY);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void RNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RNCActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

        if(back == 1){
        back = 0;
        
        disable_Room_Select();
   
       enable_Date_Select();
     
        changeCLG(); 
       
        selectdate();
        jLabel17.setForeground(Color.LIGHT_GRAY);
        }
        else{jLabel17.setForeground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered

        if(back == 1){
      jLabel17.setForeground(Color.WHITE);
        }
        else{jLabel17.setForeground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseExited
if(back == 1){
      jLabel17.setForeground(Color.BLACK);
        }
        else{jLabel17.setForeground(Color.LIGHT_GRAY);}
    }//GEN-LAST:event_jLabel17MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        new Admin_CustomerSetting_Page(IDuser).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
        jLabel18.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
        jLabel18.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        new Admin_CreatNewAdmin_Page(IDuser).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jLabel22.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jLabel22.setForeground(Color.white);
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked

        new Lao_Poet_Hotel_Check_Room(IDuser).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        jLabel23.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        jLabel23.setForeground(Color.white);
    }//GEN-LAST:event_jLabel23MouseEntered

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

    private void setallred(){
    
         C1.setBackground(Color.white );
        C2.setBackground(Color.white);
        C3.setBackground(Color.white );
        C4.setBackground(Color.white);
        B1.setBackground(Color.white );
        B2.setBackground(Color.white);
        B3.setBackground(Color.white );
        B4.setBackground(Color.white);
        A1.setBackground(Color.white );
        A22.setBackground(Color.white);
        A3.setBackground(Color.white );
        A4.setBackground(Color.white);}
    private void SRL(){
    YRTL1.setVisible(false);
YRTL2.setVisible(false);
YRTL3.setVisible(false);
YRTL4.setVisible(false);
YRTL5.setVisible(false);
YRTL6.setVisible(false);
YRTL7.setVisible(false);
YRTL8.setVisible(false);
YRTL9.setVisible(false);
YRTL10.setVisible(false);
    if (level == 1){
YRTL1.setVisible(true);
 HWL.setText("1");
    }
    else if (level == 2){
YRTL2.setVisible(true);
 HWL.setText("2");
    }
        if (level == 3){
YRTL3.setVisible(true);
 HWL.setText("3");
    }
    else if (level == 4){
YRTL4.setVisible(true);
 HWL.setText("4");
    }    if (level == 5){
YRTL5.setVisible(true);
 HWL.setText("5");
    }
    else if (level == 6){
YRTL6.setVisible(true);
 HWL.setText("6");
    }    if (level == 7){
YRTL7.setVisible(true);
 HWL.setText("7");
    }
    else if (level == 8){
YRTL8.setVisible(true);
 HWL.setText("8");
    }    if (level == 9){
YRTL9.setVisible(true);
 HWL.setText("9");
    }
    else if (level == 10){
YRTL10.setVisible(true);
 HWL.setText("10");
    }
    
    
    
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

    String SDID; 
     int   CID ;
       int COD ;
    int    RID ;
        private void activate(){
            
            
            RNC.setSelected(true);
            
            reset_date();
            getRoomName = "0";

        try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
  
   String sql1 = "SELECT * FROM customer_stay_detail WHERE Check_For_Customer = 1;";
   ResultSet rs1 = myStat.executeQuery(sql1);
   while(rs1.next()){
  
        SDID = String.valueOf(rs1.getInt("Customer_stay_Detail_ID"));
        CID = rs1.getInt("Check_In_Date");
        COD = rs1.getInt("Check_Out_Date");
        RID = rs1.getInt("Hotel_Room_Type_ID");


  String cs = String.valueOf(c);
   CheckForAvaible();
   }
   
}catch(Exception e){
    //JOptionPane.showMessageDialog(null, "not Connected");
}              //JOptionPane.showMessageDialog(null, " end For ");
        save = 0;
    //JOptionPane.showMessageDialog(null, save);
    }                                  

        private void getroomid(){
           
        try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
   String sql;

    sql = "SELECT * FROM hotel.hotel_room_type WHERE Hotel_Floor_Room_Level = ? AND Hotel_Room_Name = ? AND Hotel_Room_Type_ID LIKE  '1%'; ";

   PreparedStatement sql1 = con.prepareStatement(sql);

   sql1.setInt(1,level);

   sql1.setString(2, getRoomName);
 
   ResultSet rs = sql1.executeQuery();        
   while(rs.next()){
   String HRT_ID = String.valueOf(rs.getInt("Hotel_Room_Type_ID"));
   String Hotel_ID = String.valueOf(rs.getInt("Hotel_ID"));
   String HFRL = String.valueOf(rs.getInt("Hotel_Floor_Room_Level"));
   String RP = String.valueOf(rs.getInt("Room_Price"));
   String HRN = rs.getString("Hotel_Room_Name");
   String AFH[] = {HRT_ID,Hotel_ID,HFRL,RP,HRN};
 // JOptionPane.showMessageDialog(null, AFH[0]);

 
 RoomIDGot = Integer.valueOf(AFH[0]);
 getroomprice = Integer.valueOf(AFH[3]);
 
 
 FLS.setText(String.valueOf(level));
 Priceshow.setText(AFH[3] + "$");
 
RNS.setText(getRoomName);    
 
   }
        }

catch(Exception e){
    JOptionPane.showMessageDialog(null, "not Connected");
}             
        }
        
    private void CheckForAvaible(){
        String CIDS = String.valueOf(date);
        int InCID = Integer.valueOf(CIDS);
        String CODS = String.valueOf(dataOut);
        int InCOD = Integer.valueOf(CODS);
      
        
         // JOptionPane.showMessageDialog(null, GVOD);
          //  JOptionPane.showMessageDialog(null, GVID);
       //  JOptionPane.showMessageDialog(null, GVRIDI);
    //   jLabel3.setText(String.valueOf(GVIDI));
             if( (InCID <= CID && InCOD >= CID) || (InCID <= COD && InCOD >= CID) || ( CID <= InCID &&  COD>= InCID ) || ( CID <= InCOD &&  COD>= InCOD )) {
              
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
                
        
        
       //  JOptionPane.showMessageDialog(null, " end For ");
        save = 0;
   // JOptionPane.showMessageDialog(null, save);
    }
    public void roomLock(){
      //  JOptionPane.showConfirmDialog(null, "Floor level array = "+ FL[arrayI]);
    // JOptionPane.showMessageDialog(null, FL + RN);
          clearroom();
            roomlock1();
            roomlock2();
           //JOptionPane.showMessageDialog(null, "save = "+ save);
        // JOptionPane.showConfirmDialog(null, "array = "+arrayI);
    }
    public void roomlock2(){
    if(d == 1){ 

       B1.setEnabled(false);
       B2.setEnabled(false);
       B3.setEnabled(false);
       B4.setEnabled(false);
       C1.setEnabled(false);
       C2.setEnabled(false);
       C3.setEnabled(false);
       C4.setEnabled(false);
    }
    else if(d == 2){
        A1.setBackground(Color.red);
 A22.setBackground(Color.red);
 A3.setBackground(Color.red);
 A4.setBackground(Color.red);
 C1.setBackground(Color.red);
 C2.setBackground(Color.red);
 C3.setBackground(Color.red);
 C4.setBackground(Color.red);
        
        
       A22.setEnabled(false);
       A1.setEnabled(false);
       A3.setEnabled(false);
       A4.setEnabled(false);
       C1.setEnabled(false);
       C2.setEnabled(false);
       C3.setEnabled(false);
       C4.setEnabled(false);
    }
    else if(d == 3){
        A1.setBackground(Color.red);
 A22.setBackground(Color.red);
 A3.setBackground(Color.red);
 A4.setBackground(Color.red);
 B1.setBackground(Color.red);
 B2.setBackground(Color.red);
 B3.setBackground(Color.red);
 B4.setBackground(Color.red);
        
        
          A22.setEnabled(false);
       A1.setEnabled(false);
       A3.setEnabled(false);
       A4.setEnabled(false);
       B1.setEnabled(false);
       B2.setEnabled(false);
       B3.setEnabled(false);
       B4.setEnabled(false);
    }
     else if(d == 4){

     }
    }
    public void clearroom(){
 A1.setBackground(Color.white);
 A22.setBackground(Color.white);
 A3.setBackground(Color.white);
 A4.setBackground(Color.white);
 B1.setBackground(Color.white);
 B2.setBackground(Color.white);
 B3.setBackground(Color.white);
 B4.setBackground(Color.white);
 C1.setBackground(Color.white);
 C2.setBackground(Color.white);
 C3.setBackground(Color.white);
 C4.setBackground(Color.white);
        
       A22.setEnabled(true);
       A1.setEnabled(true);
       A3.setEnabled(true);
       A4.setEnabled(true);
       B1.setEnabled(true);
       B2.setEnabled(true);
       B3.setEnabled(true);
       B4.setEnabled(true);
       C1.setEnabled(true);
       C2.setEnabled(true);
       C3.setEnabled(true);
       C4.setEnabled(true);
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
lockroom();

    }
    
    private void lockroom(){
     
   


if(level == 1){
 if (R1A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R1A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R1A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R1A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R1B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R1B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R1B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R1B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R1C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R1C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R1C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R1C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 2){
 if (R2A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R2A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R2A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R2A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R2B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R2B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R2B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R2B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R2C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R2C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R2C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R2C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 3){
 if (R3A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R3A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R3A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R3A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R3B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R3B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R3B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R3B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R3C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R3C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R3C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R3C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 4){
 if (R4A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R4A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R4A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R4A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R4B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R4B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R4B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R4B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R4C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R4C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R4C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R4C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 5){
 if (R5A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R5A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R5A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R5A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R5B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R5B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R5B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R5B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R5C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R5C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R5C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R5C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 6){
 if (R6A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R6A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R6A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R6A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R6B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R6B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R6B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R6B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R6C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R6C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R6C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R6C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 7){
 if (R7A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R7A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R7A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R7A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R7B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R7B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R7B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R7B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R7C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R7C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R7C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R7C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 8){
 if (R8A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R8A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R8A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R8A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R8B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R8B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R8B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R8B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R8C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R8C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R8C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R8C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 9){
 if (R9A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R9A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R9A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R9A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R9B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R9B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R9B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R9B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R9C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R9C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R9C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R9C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
}
else if(level == 10){
 if (R10A1== 1){ A1.setBackground(Color.red);A1.setEnabled(false);}
 if (R10A2== 1){ A22.setBackground(Color.red);A22.setEnabled(false);}
 if (R10A3== 1){ A3.setBackground(Color.red);A3.setEnabled(false);}
 if (R10A4== 1){ A4.setBackground(Color.red);A4.setEnabled(false);}
 if (R10B1== 1){ B1.setBackground(Color.red);B1.setEnabled(false);}
 if (R10B2== 1){ B2.setBackground(Color.red);B2.setEnabled(false);}
 if (R10B3== 1){ B3.setBackground(Color.red);B3.setEnabled(false);}
 if (R10B4== 1){ B4.setBackground(Color.red);B4.setEnabled(false);}
 if (R10C1== 1){ C1.setBackground(Color.red);C1.setEnabled(false);}
 if (R10C2== 1){ C2.setBackground(Color.red);C2.setEnabled(false);}
 if (R10C3== 1){ C3.setBackground(Color.red);C3.setEnabled(false);}
 if (R10C4== 1){ C4.setBackground(Color.red);C4.setEnabled(false);}
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
            java.util.logging.Logger.getLogger(Admin_CustomerSetting_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_CustomerSetting_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_CustomerSetting_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_CustomerSetting_page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_CustomerSetting_page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A22;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.ButtonGroup CIDGroup;
    private javax.swing.ButtonGroup CODGroup;
    private javax.swing.JLabel CidS;
    private javax.swing.JLabel CodS;
    private javax.swing.JComboBox<String> ComInMonth;
    private javax.swing.JComboBox<String> ComOutMonth;
    private javax.swing.JLabel FLS;
    private javax.swing.JLabel HWL;
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
    private javax.swing.JTextField Level_IO;
    private javax.swing.JLabel Logout;
    private javax.swing.JButton Next;
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
    private javax.swing.JLabel Priceshow;
    private javax.swing.JRadioButton RNC;
    private javax.swing.JLabel RNS;
    private javax.swing.ButtonGroup RoomCheck;
    private javax.swing.JLabel Setting1;
    private javax.swing.JPanel YRTL1;
    private javax.swing.JPanel YRTL10;
    private javax.swing.JPanel YRTL2;
    private javax.swing.JPanel YRTL3;
    private javax.swing.JPanel YRTL4;
    private javax.swing.JPanel YRTL5;
    private javax.swing.JPanel YRTL6;
    private javax.swing.JPanel YRTL7;
    private javax.swing.JPanel YRTL8;
    private javax.swing.JPanel YRTL9;
    private javax.swing.JComboBox<String> bedselect2;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
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
    private javax.swing.JLabel showName;
    // End of variables declaration//GEN-END:variables
}

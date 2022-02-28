/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel;

import java.sql.Connection;
import java.sql.*;
import java.awt.*;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
 import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import static java.time.Clock.system;
import javax.swing.GroupLayout;
import jdk.jfr.internal.tool.Main;
import java.sql.Date;  
import javafx.scene.chart.PieChart.Data;

/**
 *
 * @author sunny
 */
public class Room_ID_Generator {
   
    
     public static void main(String[] args)
    {
     
       int p = 0;
  
                 for(int i = 1; i<=10; i++ ){
        //System.out.print(i);
        int b = 0;
        for(int a = 1; a<=12; a++){
         
   
       if(a>=1 && a<=4){
               if (b == 5){
       b = 1;
       String Name = "A" + b ;
       String Room_ID = "1"+i+""+a+"1";
       int Room_ID_New=Integer.parseInt(Room_ID);  
           int e = Price( i , 1 );    
            Enter( Room_ID_New , 1, i , e ,Name,a );
   
       }
               else{
                   b++;
         String Name = "A" + b ;
       String Room_ID = "1"+i+""+a+"1";
       int Room_ID_New=Integer.parseInt(Room_ID);  
           int e = Price( i , 1 );    
            Enter( Room_ID_New , 1, i , e ,Name,a );
               }
       }
       else if (a>=5 && a<=8){
               if (b == 4){
       b = 1;
       String Name = "B" + b ;
       String Room_ID = "1"+i+""+a+"2";
       int Room_ID_New=Integer.parseInt(Room_ID);  
           int e = Price( i , 2 );    
            Enter( Room_ID_New , 1, i , e ,Name,a );
       }
               else{
                   b++;
             String Name = "B" + b ;
       String Room_ID = "1"+i+""+a+"2";
       int Room_ID_New=Integer.parseInt(Room_ID);  
           int e = Price( i , 2 );    
            Enter( Room_ID_New , 1, i , e ,Name,a );
               }
       }
       else if (a>=9 && a<=12){
               if (b == 4){
       b = 1;
          String Name = "C" + b ;
       String Room_ID = "1"+i+""+a+"3";
       int Room_ID_New=Integer.parseInt(Room_ID);  
           int e = Price( i , 3 );    
            Enter( Room_ID_New , 1, i , e ,Name,a );
       }
               else{
                   b++;
              String Name = "C" + b ;
       String Room_ID = "1"+i+""+a+"3";
       int Room_ID_New=Integer.parseInt(Room_ID);  
           int e = Price( i , 3 );    
            Enter( Room_ID_New , 1, i , e ,Name,a );
               }
               
       } p ++;
   
        }
        }
    System.out.print(p);
    }

     static void cal(){
       for(int i = 1; i<=10; i++ ){
        //System.out.print(i);
        int b = 0;
        for(int a = 1; a<=12; a++){
            System.out.print("Hotel ID = 1 ||");
   
   
       if(a>=1 && a<=4){
               if (b == 5){
       b = 1;
       System.out.print("Room Level = " + i+ " ||");
        System.out.print("Hotel Name = "+ "A" + b+" ||");
           int e = Price( i , 1 );       
            System.out.print("Hotel Price = " + e + " ||"); 
        System.out.print("Room ID = "+ i + a + 1+"\n");
       }
               else{
                   b++;
                   System.out.print("Room Level = " + i+ " ||");
            System.out.print("Hotel Name = "+ "A" + b+" ||");
               int e = Price( i , 1 );       
            System.out.print("Hotel Price = " + e + " ||"); 
        System.out.print("Room ID = "+ i + a + 1+"\n");
               }
       }
       else if (a>=5 && a<=8){
               if (b == 4){
       b = 1;
       System.out.print("Room Level = " + i+ " ||");
                System.out.print("Hotel Name = "+ "B" + b+" ||");
                   int e = Price( i , 2 );       
            System.out.print("Hotel Price = " + e + " ||"); 
        System.out.print("Room ID = "+ i + a + 2+"\n");
       }
               else{
                   b++;
                   System.out.print("Room Level = " + i+ " ||");
          System.out.print("Hotel Name = "+ "B" + b+" ||");
             int e = Price( i , 2 );       
            System.out.print("Hotel Price = " + e + " ||"); 
        System.out.print("Room ID = "+ i + a + 2+"\n");
               }
       }
       else if (a>=9 && a<=12){
               if (b == 4){
       b = 1;
       System.out.print("Room Level = " + i+ " ||");
         System.out.print("Hotel Name = "+ "C" + b+" ||");
            int e = Price( i , 3 );       
            System.out.print("Hotel Price = " + e + " ||"); 
        System.out.print("Room ID = "+ i + a + 3+"\n");
       }
               else{
                   b++;
                   System.out.print("Room Level = " + i+ " ||");
          System.out.print("Hotel Name = "+ "C" + b+" ||");
           int e = Price( i , 3 );       
            System.out.print("Hotel Price = " + e + " ||"); 
        System.out.print("Room ID = "+ i + a + 3+"\n");
               }
               
       } 
        }
        }
     
     }
     
     
    
     static int Price(int b, int a){
 
         int c = 0;
         int e = 0;
         int d = 0;
         
     if(b == 1){
        c = 0;
        d = room_price(a);
    }
    else if(b >=2 && b <= 3 ){
    c = 10;
     d = room_price(a);
    }
    else if(b >=4 && b<= 7){
    c = 20;
     d = room_price(a);
    }
    else if( b >=8 && b <=10){
    c = 30;
     d = room_price(a);
    }
    e = c+d;
    return e;
     }
   
     static int room_price(int a){
     int d = 0;
         if(a == 1){
        d = 100;
        }
        else if(a == 2){
           d= 90;
        }
        else if(a == 3){
          d= 70;       
        }
            return d;
     }
        
        public static void Enter(int d, int a, int b, int c, String f, int ii){
        
            //System.out.println("room id = "+ d +" || Hotel ID = "+ a +" || Hotel Floor = "+ b + " || Room price = "+ c + " || Hotel Room Name = "+ f);
            // System.out.print("else if (flandrn.equals(\""+b+f+"\"))");
            // " else if (flandrn.equals(\"A2\"))"
        
           // System.out.println("{R"+b+f+" = 1;}");
         //  System.out.println("R"+b+f+"= 0;");
     // "System.out.print(\"if(level == 1)\");"
     
     System.out.println(" "+f+"P.setBackground(Color.white);");
          
        /*  if(ii  == 1){
              System.out.println("}\nelse if(level == "+b+"){");
               System.out.print(" if (R"+b+f+"== 1)");
             System.out.print("{ "+f+"P.setBackground(Color.red);");
        System.out.println(""+f+".setEnabled(false);}");}
          else{
               System.out.print(" if (R"+b+f+"== 1)");
                System.out.print("{ "+f+"P.setBackground(Color.red);");
        System.out.println(""+f+".setEnabled(false);}");
          }*/

           
       /*   try{

    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
   Statement myStat = con.createStatement();
 PreparedStatement st = con.prepareStatement("insert into hotel_room_type(Hotel_Room_Type_ID,Hotel_ID,Hotel_Floor_Room_Level,Room_Price,Hotel_Room_Name) values (?,?,?,?,?)");
    st.setInt(1, d);
    st.setInt(2, a);
    st.setInt(3, b);
    st.setInt(4, c);
    st.setString(5, f);
    int h = st.executeUpdate();
    if(h>0){ //JOptionPane.showMessageDialog(null, "Save");
}

    
    
    
    
   // JOptionPane.showMessageDialog(null, "Connected");

}catch(Exception e){
   // JOptionPane.showMessageDialog(null, "not Connected");
}
        }
        
/*    try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","Ilikeminecraft040610");
    PreparedStatement st = con.prepareStatement("insert into testingin(ID,inc) values (?, ?)");
    st.setInt(1, 2);
    st.setInt(2, 3);
    int a = st.executeUpdate();
    if(a>0){ JOptionPane.showMessageDialog(null, "Save");
}
    
    
    
    
    JOptionPane.showMessageDialog(null, "Connected");

}catch(Exception e){
    JOptionPane.showMessageDialog(null, "not Connected");
}*/
    }}


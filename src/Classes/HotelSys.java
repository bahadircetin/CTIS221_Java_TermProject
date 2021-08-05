/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author Bahadir Cetin
 */
public class HotelSys {
     public static ArrayList<Hotel> guestList= new ArrayList();
     
     
       public static void addStandardRoom(int numberOfRoom, String guestName, int checkInDate, int checkOutDate, int guestNumber, double price)
    {
         double sale=0.0;
         StandardRoom standard1 = new StandardRoom(numberOfRoom, guestName, checkInDate, checkOutDate, guestNumber, price);
         
         standard1.getSale();
         price=price-sale;
         standard1.setPrice(price);
         standard1.addKDV();
         guestList.add(standard1);
    }
    
    public static void addSuiteRoom(int numberOfBed, String guestName, int checkInDate, int checkOutDate, int guestNumber, double price)
    {
        double sale=0.0;
        SuitRoom sui2=new SuitRoom(numberOfBed, guestName, checkInDate, checkOutDate, guestNumber, price);
        
        sale=sui2.getSale();
        price=price-sale;
        sui2.setPrice(price);
        sui2.addKDV();
        guestList.add(sui2);
    }
    public static void addKingSuitRoom(String guestName, int checkInDate, int checkOutDate, int guestNumber, double price, String color, String furniture)
    {
        double sale=0.0;
        KingSuitRoom kng =  new KingSuitRoom(guestName, checkInDate, checkOutDate, guestNumber, price);
        
        sale=kng.getSale();
        price=price-sale;
        kng.setPrice(price);
        kng.addKDV();
        kng.getRoomDesign(color,furniture);
        guestList.add(kng);
    }
    
      public static boolean removeGuest(String name)
    {
        for (int i = 0; i < guestList.size(); i++) {
            String tempname = guestList.get(i).getGuestName();
            if(tempname.equalsIgnoreCase(name))
            {
                guestList.remove(i);  
                return true;
            }
        }
        return false;
    }
        public static String searchGuest(String roomType)
    {
        String output="";
        
        if(roomType.equalsIgnoreCase("king suite room"))
        {
            for(Hotel h:HotelSys.guestList)
            {
                if(h instanceof KingSuitRoom)
                    output+=h.toString();
            }
            
        }
        else if(roomType.equalsIgnoreCase("standard room"))
        {
            for(Hotel h:HotelSys.guestList)
            {
                if(h instanceof StandardRoom)
                    output+=h.toString();
            }
        }
        else{
             for(Hotel h:HotelSys.guestList)
            {
                if(h instanceof SuitRoom)
                    output+=h.toString();
            }
        }
        
        return output;
    }
         public static String display()
    {
        String output ="Guest List Content \n";
        for (int i = 0; i < guestList.size(); i++) {
               output += guestList.get(i).toString();
             
        }
        return output;
    }
}

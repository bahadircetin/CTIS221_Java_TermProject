/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Frames.KingSuiteRoom_Frame;
import Frames.StandardRoomFrame;
import Frames.SuiteRoomFrame;
/**
 *
 * @author Bahadir Cetin
 */
public abstract class Hotel {
   
    protected String guestName;
    protected int checkInDate;
    protected int checkOutDate;
    protected int guestNumber;   
    protected static int MAX_CAPACITY = 16;
    protected double price;


    public Hotel() {
    }

    public Hotel(String guestName, int checkInDate, int checkOutDate, int guestNumber, double price) {
        this.guestName = guestName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestNumber = guestNumber;
        this.price = price;
    }

    public static int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGuestName() {
        return guestName;
    }
    
    
    public abstract double getSale();

    @Override
    public String toString() {
        for(Hotel h:HotelSys.guestList)
            {
                if(h instanceof KingSuitRoom)
                    {
                        return "\nGuest Name Surname: " + guestName + "\nCheck-In Date: " + checkInDate+ "/" + KingSuiteRoom_Frame.inmonth +"/2019"+ "\nCheck-Out Date: " + checkOutDate+ "/" + KingSuiteRoom_Frame.outmonth + "/2019"+"\nGuest Number: " + guestNumber + "\nPrice: $" + price ;
            
                    }
             
     
                else if(h instanceof SuitRoom )
                    {
                        return "\nGuest Name Surname: " + guestName + "\nCheck-In Date: " + checkInDate+ "/" + SuiteRoomFrame.suinmonth +"/2019"+ "\nCheck-Out Date: " + checkOutDate+ "/" +SuiteRoomFrame.suoutmonth + "/2019"+"\nGuest Number: " + guestNumber + "\nPrice: $" + price ;
            
                    }
            
       
                else if(h instanceof StandardRoom)
                    {
                        return "\nGuest Name Surname: " + guestName + "\nCheck-In Date: " + checkInDate+ "/" + StandardRoomFrame.sdinmonth +"/2019"+ "\nCheck-Out Date: " + checkOutDate+ "/" + StandardRoomFrame.sdoutmonth+ "/2019"+"\nGuest Number: " + guestNumber + "\nPrice: $" + price ;
            
                    }
            } 
        return null;
        //return "\nGuest Name Surname: " + guestName + "\nCheck-In Date: " + checkInDate+ "/" + KingSuiteRoom_Frame.inmonth +"/2019"+ "\nCheck-Out Date: " + checkOutDate+ "/" + KingSuiteRoom_Frame.outmonth + "/2019"+"\nGuest Number: " + guestNumber + "\nPrice: $" + price ;
    }
    
    
    
    
    
}
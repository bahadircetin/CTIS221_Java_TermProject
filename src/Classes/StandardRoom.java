/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Bahadir Cetin
 */
public class StandardRoom extends Hotel{
    
    private int numberOfRoom;

    public StandardRoom() {
    }

    public StandardRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public static int getMAX_CAPACITY() {
        return MAX_CAPACITY;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public StandardRoom(int numberOfRoom, String guestName, int checkInDate, int checkOutDate, int guestNumber, double price) {
        super(guestName, checkInDate, checkOutDate, guestNumber, price);
        this.numberOfRoom = numberOfRoom;
        MAX_CAPACITY=getMAX_CAPACITY()-1;
    }

    @Override
    public double getSale() {
   
         if ((checkOutDate - checkInDate) >= 7) {

            return 200;
        } else if (0 > (checkOutDate - checkInDate) && (checkOutDate - checkInDate) > -24) {
            if ((checkInDate - checkOutDate) >= 7) {
                return 200;
            }

            return 0;
        } else {
            return 0;
        }
        
    }
    
    public void addKDV()
    {
        price += price * 0.18;
    }

    @Override
    public String toString() {
        return "\n\nStandard Room" + super.toString() +"\nNumber of Rooms: " + numberOfRoom ;
    }
  
}
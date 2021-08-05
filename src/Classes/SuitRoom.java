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
public class SuitRoom extends Hotel {

    private int numberOfBed;

    public SuitRoom() {
    }

    public SuitRoom(int numberOfBed, String guestName, int checkInDate, int checkOutDate, int guestNumber, double price) {
        super(guestName, checkInDate, checkOutDate, guestNumber, price);
        this.numberOfBed = numberOfBed;
        MAX_CAPACITY = getMAX_CAPACITY() - 1;
    }

    @Override
    public double getSale() {

        if ((checkOutDate - checkInDate) >= 5) {

            return 150;
        } else if (0 > (checkOutDate - checkInDate) && (checkOutDate - checkInDate) > -26) {
            if ((checkInDate - checkOutDate) >= 5) {
                return 150;
            }

            return 0;
        } else {
            return 0;
        }
    }



    public void setPrice(double price) {
        this.price = price;
    }

    public void addKDV() {
        price += price * 0.18;
    }

    @Override
    public String toString() {
        return "\n\nSuite Room " + super.toString() + "\nNumber Of Beds: " + numberOfBed;
    }

}

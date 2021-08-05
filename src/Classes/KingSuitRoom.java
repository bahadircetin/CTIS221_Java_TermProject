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
public class KingSuitRoom extends Hotel {

    private ArrayList<RoomDesign> list = new ArrayList();

    public KingSuitRoom() {
    }

    public KingSuitRoom(String guestName, int checkInDate, int checkOutDate, int guestNumber, double price) {
        super(guestName, checkInDate, checkOutDate, guestNumber, price);
        MAX_CAPACITY = getMAX_CAPACITY() - 1;
    }

    public void getRoomDesign(String color, String furniture) {
        RoomDesign des = new RoomDesign(color, furniture);
        list.add(des);
    }

    @Override
    public double getSale() {
        if ((checkOutDate - checkInDate) >= 3) {

            return 350;
        } else if (0 > (checkOutDate - checkInDate) && (checkOutDate - checkInDate) > -28) {
            if ((checkInDate - checkOutDate) >= 3) {
                return 350;
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
        return "\n\nKing Suite Room " + super.toString() + list.toString();
    }

}

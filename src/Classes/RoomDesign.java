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
public class RoomDesign {
    private String color;
    private String furniture;

    public RoomDesign() {
    }

    public RoomDesign(String color, String furniture) {
        this.color = color;
        this.furniture = furniture;
    }

    @Override
    public String toString() {
        return "\n\nRoom Design Preferences " + "\nRoom Color: " + color + "\nFurrniture Type: " + furniture ;
    }
    
    
    
    
    
    
}
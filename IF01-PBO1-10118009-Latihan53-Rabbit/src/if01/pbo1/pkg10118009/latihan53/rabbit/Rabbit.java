/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan53.rabbit;

/**
 *
 * @author LENOVO
 */
public class Rabbit extends Animal{
    public String color;
    public String nama;

    public Rabbit(String nama, boolean veg, String food, int legs ,String color) {
        super(veg,food,legs);
        this.nama = nama;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getNama() {
        return nama;
    }
    
    
}

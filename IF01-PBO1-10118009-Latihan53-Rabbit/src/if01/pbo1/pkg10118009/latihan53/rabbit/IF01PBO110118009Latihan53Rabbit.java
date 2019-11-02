/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pbo1.pkg10118009.latihan53.rabbit;

/**
 * Nama = Tassyakur Pasya
 * Kelas = IF01
 * NIM = 10118009
 * Deskripsi Program = RAbbit
 * @author LENOVO
 */
public class IF01PBO110118009Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "Grass", 4, "Grey");
        System.out.println("Hello, His name is "+rabbit.getNama());
        System.out.println(rabbit.getNama()+" is vegetarian?"+rabbit.isVegetarian());
        System.out.println(rabbit.getNama()+" eats "+rabbit.getEats());
        System.out.println(rabbit.getNama()+" has "+rabbit.getNoOfLegs()+"  legs");
        System.out.println(rabbit.getNama()+" color is "+rabbit.getColor());
    }
    
}

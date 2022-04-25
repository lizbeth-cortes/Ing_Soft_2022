/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronFactory;

import java.util.Scanner;

/**
 *
 * @author Lyzz
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;
        
        System.out.println("Seleccione un artículo para ver más detalles.");
        System.out.println(Patron.L_HP + ") Laptop HP 15-DY2050LA");
        System.out.println(Patron.L_DELL + ") Laptop Dell 5406");
        System.out.println(Patron.L_HUAWEI + ") Laptop Huawei Matebook");
        System.out.println(Patron.S_APPLE + ") Celular Apple iPhone 12");
        System.out.println(Patron.S_MOTOROLA + ") Celular Motorola Edge 20 Pro");
        System.out.println(Patron.S_XIAOMI + ") Celular Xiaomi 11 Lite");
        System.out.println(Patron.T_SAMSUNG + ") Tablet Samsung Galaxy Tab A7");
        System.out.println(Patron.T_HUAWEI + ") Tablet Huawei Matepad Pro");
        System.out.println(Patron.T_HYUNDAI + ") Tablet Hyundai Hytab Plus");
        
        try {
            System.out.print("Elige el número: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un número.");
        }
        
        Patron p = PatronFactory.createPatron(eleccion);
        System.out.println(p.toString());
        
    }
}

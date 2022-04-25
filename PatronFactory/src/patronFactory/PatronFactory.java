/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronFactory;

import Articulos.Computadora;
import Articulos.Smartphone;
import Articulos.Tablet;

/**
 *
 * @author Lyzz
 */
public class PatronFactory {
    public static Patron createPatron(int tipo){
        switch (tipo) {
            case Patron.L_HP:
                    return new Computadora("HP", "15-DY2050LA", "Windows", "Intel Core i3", 8, 11);
            case Patron.L_DELL:
                    return new Computadora("Dell", "L5406VL I3T8256SW10S", "Windows", "Intel Core i3", 8, 10);
            case Patron.L_HUAWEI:
                    return new Computadora("Huawei", "Matebook 14 CI7 16 G", "Windows", "Intel Core i7", 16, 8);
            case Patron.S_APPLE:
                    return new Smartphone("Apple","iPhone 12", "iOS", 128, false, 3);
            case Patron.S_MOTOROLA:
                    return new Smartphone("Motorola", "Edge 20 Pro", "Android", 256, true, 4);
            case Patron.S_XIAOMI:
                    return new Smartphone("Xiaomi", "11 Lite", "Android", 128, true, 4);
            case Patron.T_SAMSUNG:
                    return new Tablet("Samsung", "TAB A7", "Gris", "Android", 8.7f, "HD");
            case Patron.T_HUAWEI:
                    return new Tablet("Huawei", "Matepad Pro", "Gris", "HarmonyOS 2", 12.6f, "HD");
            case Patron.T_HYUNDAI:
                    return new Tablet("Hyundai", "HT10LC2MBKLTM", "Azul", "Android", 10.1f, "HD");     
            default:
                throw new AssertionError();
        }
    }
}

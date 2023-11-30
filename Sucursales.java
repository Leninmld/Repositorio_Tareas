/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

import java.util.Scanner;

public class Sucursales {
    public static void main(String[] args) {

        String[][] PinSucur = {
                {"Piña ", "Papaya", "Melon"},
                {"Carne", "Pollo", "Pescado"},
                {"Tallarín", "Pan", "Galleta"}
        };

        Scanner scanner = new Scanner(System.in);
        int numSucursal;

        System.out.print("Ingrese el número de la sucursal [1-3]: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next();
        }
        numSucursal = scanner.nextInt();

        switch (numSucursal) {
            case 1:
            case 2:
            case 3:
                
                System.out.println("Productos disponibles en la Sucursal " + numSucursal + ":");
                for (int i = 0; i < PinSucur[numSucursal - 1].length; i++) {
                    System.out.println((i + 1) + ". " + PinSucur[numSucursal - 1][i]);
                }

                int numProducto;
                do {
                    System.out.print("Ingrese el número del producto (1-3): ");
                    while (!scanner.hasNextInt()) {
                        System.out.println("Por favor, ingrese un número válido.");
                        scanner.next();
                    }
                    numProducto = scanner.nextInt();

                    if (numProducto < 1 || numProducto > 3) {
                        System.out.println("No válido. Ingresar un número entre 1 y 3.");
                    }

                } while (numProducto < 1 || numProducto > 3);

            
                String Selecproduc = PinSucur[numSucursal - 1][numProducto - 1];
                System.out.println("Ha seleccionado el Producto: " + Selecproduc + " en la Sucursal " + numSucursal);
                break;
            default:
                System.out.println("No válido. Ingresar un número entre 1 y 3.");
        }
    }
}
package ParqueAcuatico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParqueAcuatico parque = new ParqueAcuatico();

        System.out.println("-------PARQUE ACUATICO ITCH------");
        System.out.println("---------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio de la comida buffet: ");
        double precioComidaBuffet = scanner.nextDouble();

        System.out.println("Ingrese el precio del espectáculo nocturno: ");
        double precioEspectaculoNocturno = scanner.nextDouble();

        System.out.println("Ingrese el tipo de interacción de nado con delfines (sencilla/extra): ");
        String tipoNadoDelfines = scanner.next();

        scanner.close();

        // Ejemplo de compra: solo entrada
        double totalCompra = parque.calcularTotalCompra();
        System.out.println("Precio total de compra: con solo Entrada");
        System.out.println("Total a pagar: $" + totalCompra);
        System.out.println();

        // Ejemplo de compra: entrada + comida buffet
        totalCompra = parque.calcularTotalCompra(precioComidaBuffet);
        System.out.println("Precio total de compra: Entrada + Comida buffet");
        System.out.println("Total a pagar: $" + totalCompra);
        System.out.println();

        // Ejemplo de compra: entrada + comida buffet + espectáculo nocturno
        totalCompra = parque.calcularTotalCompra(precioComidaBuffet, precioEspectaculoNocturno);
        System.out.println("Precio total de compra: Entrada + Comida buffet + Espectáculo nocturno");
        System.out.println("Total a pagar: $" + totalCompra);
        System.out.println();

        // Ejemplo de compra: entrada + comida buffet + espectáculo nocturno + nado con delfines
        totalCompra = parque.calcularTotalCompra(precioComidaBuffet, precioEspectaculoNocturno, tipoNadoDelfines);
        System.out.println("Precio total de compra: Entrada + Comida buffet + Espectáculo nocturno + Nado con delfines (" + tipoNadoDelfines + ")");
        System.out.println("Total a pagar: $" + totalCompra);
        System.out.println("-------PARQUE ACUATICO ITCH------");
        System.out.println("---------------------------------");
        System.out.println("-------GRACIAS POR SU COMPRA------");
    }



}


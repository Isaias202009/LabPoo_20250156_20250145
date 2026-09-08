package LabFinal_POO;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Clientes cli = new Clientes();
        int opcion=0;
        String nombre = "";

        do {
        System.out.println("1. Ingrese cliente normal");
        System.out.println("2. Ingrese cliente VIP");
        System.out.println("3. Atender al siguiente cliente");
        System.out.println("4. Salir");
        System.out.printf("Seleccione una opcion: \n");
        opcion = Integer.parseInt(scan.nextLine());


    switch (opcion){

        case(1):
            System.out.println("Agrega un cliente normal");
            System.out.println("Ingrese el nombre del cliente normal");
            nombre = scan.nextLine();
            cli.agregarClienteNormal(nombre);
            break;
        case(2):
            System.out.println("Agrega un cliente VIP");
            System.out.println("Ingrese el nombre del cliente VIP");
            nombre = scan.nextLine();
            cli.agregarClienteVIP(nombre);

            break;
        case(3):
            System.out.println("\n Atendiendo al siguiente cliente");
            cli.atenderSiguienteCliente();
            System.out.println("\n El cliente fue atendido exitosamente");
            break;
        case(4):
            System.out.println("\n Saliendo");
            break;
        default:
            System.out.println("\n Opcion fuera de rango");
            break;
    }
}while (opcion!=4);

    }
}
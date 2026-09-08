package LabFinal_POO;

import java.util.LinkedList;
import java.util.Scanner;

public class Clientes {

    Scanner scan = new Scanner(System.in);
    private LinkedList<String> ListaClientes = new LinkedList<>();

    //Metodo Historial lista
    public void HistorialLista(){
        System.out.println("Lista: "+ListaClientes);

    }

    //Metodo agregar Cliente VIP
    public void agregarClienteVIP(String nombre){
        ListaClientes.addFirst(nombre);
    }

    //Metodo agregar Cliente normal
    public void agregarClienteNormal(String nombre){
        ListaClientes.addLast(nombre);
    }

    //Metodo atender siguiente cliente (elimina al primer cliente con pollFrist)
    public void atenderSiguienteCliente(){
        if(!ListaClientes.isEmpty()){
            String cliente = ListaClientes.pollFirst();
            System.out.println("Cliente:"+cliente+" atendido \n");
            System.out.println("Siguiente en la lista " + ListaClientes.peekFirst());
        }else{
            System.out.println("La lista esta vacia \n");
        }
    }

}

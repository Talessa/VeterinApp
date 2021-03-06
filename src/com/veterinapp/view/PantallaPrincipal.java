package com.veterinapp.view;

import com.veterinapp.view.widget.Dog;
import com.veterinapp.view.widget.Title;

import java.util.Scanner;

public class PantallaPrincipal {

    public void iniciar(){

        Title title = new Title();
        Scanner scanner = new Scanner(System.in);
        boolean salir=false;
        do {

            //doy la bienvenida al usuario y le muestro el menu
            new Dog().iniciar();
            title.show("Bienvenido a veterinApp");
            System.out.println("Seleccione que desea hacer");
            System.out.println();
            System.out.println("1-Registrar veterinario/tienda.");
            System.out.println("2-Buscar veterinario/tienda.");
            System.out.println("3-Puntuar");
            System.out.println("4-Administrar");
            System.out.println("5-Contacto");
            System.out.println("6-Salir.");


            // guardo en una variable la opcion seleccionada por el usuario
            String opcion = scanner.nextLine();

            //compruevo que a seleccionado el usuario
            if (opcion.equals("1")) {
                // si la opcion es registrar un veterianario o tienda generare
                // una pantalla de registro y la iniciare
                new PantallaRegistrar().iniciar();
            } else if (opcion.equals("2")) {
                //si la opcion es buscar creare una pantalla busqueda y la iniciare
                new PantallaBuscar().iniciar();
            }  else if (opcion.equals("3")) {
                //si la opcion es buscar creare una pantalla puntuar y la iniciare
                new PantallaPuntuar().iniciar();
            } else if (opcion.equals("4")) {
                //si la opcion es buscar creare una pantallaadministrar y la iniciare
                new PantallaAdministrar().iniciar();
            } else if (opcion.equals("5")) {
                //si la opcion es buscar creare una pantallacontacto y la iniciare
                new PantallaContacto().iniciar();
            }else if (opcion.equals("6")){
                System.out.println("Gracias por usar VeteriApp");
                System.exit(0);
            }else{
                System.out.println("Opcion incorrecta");
                System.out.println("Seleccione otra vez");
            }
        }while (!salir);

    }
}

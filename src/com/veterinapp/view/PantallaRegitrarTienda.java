package com.veterinapp.view;

import com.veterinapp.manager.ManagerTiendas;
import com.veterinapp.view.widget.EditText;
import com.veterinapp.view.widget.Menu;
import com.veterinapp.view.widget.Message;
import com.veterinapp.view.widget.Title;

import java.util.Scanner;

public class PantallaRegitrarTienda {

    public void iniciar (){

        String web="";
        String especializacion="";
        String pelu ="";

        Scanner scanner = new Scanner(System.in);
        Title title = new Title();
        Message message = new Message();
        EditText editText = new EditText();
        Menu menu = new Menu();

        boolean esValido = false;


        title.show("Registro de tiendas");


        String nombre = editText.read("Nombre de la tienda:");
        String direccion = editText.read("Introduzca la direccion:");
        int telefono = editText.readInt("Introduzca el numero de telefono:");
        String horario = editText.read("Introduzca el horario:");


        while (!esValido) {


        System.out.println("Introduzca su web:");
         web = scanner.nextLine();


            if (web.length() > 201) {
                System.out.println("Maximo de 200");
                esValido = false;
            } else {
                esValido = true;
            }


            // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

            if (web.isEmpty()) {
                System.out.println("Valor no valido,Introduzca de nuevo la web");
                esValido = false;
            } else {
                esValido = true;

            }
        }

        esValido = false;


            while (!esValido) {

        System.out.println("Introduzca su especializacion:");
         especializacion = scanner.nextLine();


                // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

                if (especializacion.length() > 21) {
                    System.out.println("Maximo de 20");
                    esValido = false;
                } else {
                    esValido = true;
                }


                // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

                if (especializacion.isEmpty()) {
                    System.out.println("Valor no valido,Introduzca de nuevo la especialización");
                    esValido = false;
                } else {
                    esValido = true;

                }
            }

        esValido = false;



                while (!esValido) {

        System.out.println("Tiene servicio de peluqueria:(conteste si/no)");
         pelu = scanner.nextLine();
        System.out.println();


                    if (pelu.length() > 3) {
                        System.out.println("Maximo de 2");
                        esValido = false;
                    } else {
                        esValido = true;
                    }

                    // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

                    if (pelu.isEmpty() || pelu != "si" || pelu != "no") {
                        System.out.println("Valor no valido,Introduzca de nuevo el Servicio de peluqueria");
                        esValido = false;
                    } else {
                        esValido = true;

                    }

                }

        esValido = false;





        // como peluqueria se trata como un volean creo la variable la inicio en
        // false si el usuario a contestado si la camvio a true
        boolean peluqueria = false;

        if (pelu.equals("si")){
            peluqueria = true;
        }
        //Inicio el manager de tiendas y creo una tienda nueva.
        ManagerTiendas.crearTienda(nombre,direccion,telefono,horario,web,especializacion,peluqueria);


        message.showOk("Su tienda se a registrado de forma correcta");


        // una vez echo esto preguntaremos al usuario que desea hacer

        boolean salir=false;
        do {
            String opcion = menu.show("Que desea hacer a continuacion:",
                    "Registrar otra tienda o veterinario",
                    "Ir al menu principal",
                    "Buscar tienda o veterinario",
                    "Salir de la aplicacion");

            //compruevo que a seleccionado el usuario
            if (opcion.equals("1")) {
                // si la opcion es registrar un veterianario o tienda generare
                // una pantalla de registro y la iniciare
                new PantallaRegistrar().iniciar();
            }else if (opcion.equals("2")) {
                //si el usuario a dedicido ir al menu principal creo una nueva pantalla principal y la inicio
                new PantallaPrincipal().iniciar();
            }else if (opcion.equals("3")) {
                //si la opcion es buscar creare una pantalla busqueda y la iniciare
                new PantallaBuscar().iniciar();
            } else if (opcion.equals("4")){
                System.out.println("Gracias por usar VeteriApp");
                System.exit(0);
            }else{
                message.showError("Opcion incorrecta");
                System.out.println("Seleccione otra vez");
            }
        }while (!salir);
    }
}

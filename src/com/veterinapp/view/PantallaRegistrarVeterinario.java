package com.veterinapp.view;

import com.veterinapp.manager.ManagerVeterianarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PantallaRegistrarVeterinario {

    public void iniciar(){

        Scanner scanner = new Scanner(System.in);
        List<Double> precios = new ArrayList<>();


        //Aqui Declaramos variables//

        String nombre="";
        String direccion="";
        int telefono=0;
        String horario="";
        String web="";
        String especializacion="";
        Boolean urgencias24 = false;
        String urg="";
        double visita_N=0;
        double visita_U=0;
        double vacuna=0;
        double chipado=0;



        boolean esValido = false;

        System.out.println("Registro de Veterinarios");
        System.out.println();

        while (!esValido) {

        System.out.println("Nombre del veterinario:");
         nombre = scanner.nextLine();


        // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

        if (nombre.length() > 101) {
            System.out.println("Maximo de 100");
            esValido = false;
        } else {
            esValido = true;
        }

        // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//


        if (nombre.isEmpty()) {
            System.out.println("Valor no valido,Introduzca de nuevo el Nombre");
            esValido = false;
        } else {
            esValido = true;

        }

    }

    esValido = false;

    while (!esValido) {
        System.out.println("Introduzca la direccion:");
        direccion = scanner.nextLine();

        // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

        if (direccion.length() > 201) {
            System.out.println("Maximo de 200");
            esValido = false;
        } else {
            esValido = true;
        }



        // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

        if (direccion.isEmpty()) {
            System.out.println("Valor no valido,Introduzca de nuevo la dirección");
                esValido = false;
        } else {
                esValido = true;

            }

        }

        esValido = false;


            while (!esValido) {


        System.out.println("Introduzca el numero de telefono:");
         telefono = scanner.nextInt();
        scanner.nextLine();

                while (!esValido) {




                    if (telefono !=int){
                        System.out.println("Introduce un valor correcto");
                        esValido = false;
                    }
        else if (telefono ==){
                        if (telefono > 13) {
                            System.out.println("Maximo de 12");
                            esValido = false;
                        } else {
                        }
                    }
                }




                // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//
                if (telefono.Empty()) {
                    System.out.println("Valor no valido,Introduzca de nuevo el telefono");
                    esValido = false;
                } else {
                    esValido = true;

                }

                while (!esValido) {

         System.out.println("Introduzca el horario:");
         horario = scanner.nextLine();

                    while (!esValido) {
                        if (horario.length() > 101) {
                            System.out.println("Maximo de 101");
                            esValido = false;
                        } else {
                            esValido = true;
                        }


                    }

                    if (horario.isEmpty()) {
                        System.out.println("Valor no valido,Introduzca de nuevo el horario");
                        esValido = false;
                    } else {
                        esValido = true;

                    }
                }

                esValido = false;

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

                            while (!esValido) {


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


                            System.out.println("Introduzca el precios de visita estandar:");
         visita_N=scanner.nextDouble();
        scanner.nextLine();

                                while (!esValido) {


                                    if (visita_N !=double){
                                        System.out.println("Introduce un valor correcto");
                                        esValido = false;
                                    }
        else if (visita_N ==double)


                                    // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//
                                    if (visita_N.Empty()) {
                                        System.out.println("Valor no valido,Introduzca de nuevo el telefono");
                                        esValido = false;
                                    } else {
                                        esValido = true;

                                    }
                                }
                                    esValido=false;

        System.out.println("Introduzca el precio de la visita de urgencias:");
         visita_U=scanner.nextDouble();
        scanner.nextLine();

                                    while (!esValido) {


                                        if (visita_U !=double){
                                            System.out.println("Introduce un valor correcto");
                                            esValido = false;
                                        }else if (visita_U ==double)

                                    }

                                        if (visita_U.Empty()) {
                                            System.out.println("Valor no valido,Introduzca de nuevo el telefono");
                                            esValido = false;
                                        } else {
                                            esValido = true;

                                        }
                                    }

                                  esValido=false;


        System.out.println("Introduzca precio vacunacion:");
         vacuna=scanner.nextDouble();
        scanner.nextLine();


                                        while (!esValido) {


                                            if (vacuna !=double){
                                                System.out.println("Introduce un valor correcto");
                                                esValido = false;
                                            }else if (vacuna ==double)

                                        }

        if (vacuna.Empty()) {
            System.out.println("Valor no valido,Introduzca de nuevo el telefono");
            esValido = false;
        } else {
            esValido = true;

        }


    esValido=false;




        System.out.println("Introduzca el precio de implantacion microchip:");
         chipado=scanner.nextDouble();
        scanner.nextLine();

                                            while (!esValido) {


                                                if (chipado !=double){
                                                    System.out.println("Introduce un valor correcto");
                                                    esValido = false;
                                                }else if (chipado ==double)

                                            }

        if (chipado.Empty()) {
            System.out.println("Valor no valido,Introduzca de nuevo el telefono");
            esValido = false;
        } else {
            esValido = true;

        }


        esValido=false;


        System.out.println("Tiene servicio de urgencias 24 horas:(conteste si/no)");
         urg = scanner.nextLine();


                                                if (urg.length() > 3) {
                                                    System.out.println("Maximo de 2");
                                                    esValido = false;
                                                } else {
                                                    esValido = true;
                                                }



                                                // Control de errores que si esta vacio el campo,nos pida volver a introducirlo hasta que este completo//

                                                if (urg.isEmpty() || urg != "si" || urg != "no") {
                                                    System.out.println("Valor no valido,Introduzca de nuevo el Servicio de peluqueria");
                                                    esValido = false;
                                                } else {
                                                    esValido = true;

                                                }

                                            }

                                            esValido = false;




                                            // como urgencias se trata como un volean creo la variable la inicio en
        // false si el usuario a contestado si la cambio a true
         urgencias24 = false;

        if (urg.equals("si")){
            urgencias24 = true;
        }

        ManagerVeterianarios.crearVeterinario(nombre,direccion,telefono,horario,web,especializacion,visita_N,visita_U,
                vacuna,chipado,urgencias24);

        System.out.println("Su Veterinario se a registrado de forma correcta");
        System.out.println();

        boolean salir=false;
        do {
            System.out.println("Que desea hacer a continuacion:");
            System.out.println();
            System.out.println("1-Registrar otra tienda o veterinario.");
            System.out.println("2-Ir al menu principal.");
            System.out.println("3-Buscar tienda o veterinario");
            System.out.println("4-Salir de la aplicacion");

            // guardo en una variable la opcion seleccionada por el usuario
            String opcion = scanner.nextLine();

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
                System.out.println("Opcion incorrecta");
                System.out.println("Seleccione otra vez");
            }
        }while (!salir);
    }
}

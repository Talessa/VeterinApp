package com.veterinapp.view;

import com.veterinapp.Database;
import com.veterinapp.manager.ManagerTiendas;
import com.veterinapp.model.Tienda;

import java.util.List;
import java.util.Scanner;

public class PantallaPuntuarTienda {
    public static void iniciar() {
        Scanner scanner = new Scanner(System.in);

        Boolean salir = false;

        do {

            System.out.println("¿Qué tienda quieres puntuar?");
            String tien = scanner.nextLine();

            List <Tienda> tiendas = new ManagerTiendas().buscarNombreTienda(tien);


            for (Tienda tienda : tiendas) {
                String pelu = "no";
                if (tienda.peluqueria) {
                    pelu = "si";
                }

                System.out.println
                        (" | " + String.format("%-10s", tienda.nombre)
                                + " | " + String.format("%-10s", tienda.direccion)
                                + " | " + String.format("%-10s", tienda.telefono)
                                + " | " + String.format("%-10s", tienda.horario)
                                + " | " + String.format("%-10s", tienda.web)
                                + " | " + String.format("%-10s", tienda.especializacion)
                                + " | " + String.format("%-4s", pelu)
                                + " | " + String.format("%-4s", tienda.puntuacion));

                System.out.println("¿Quieres puntuar esta tienda?");

                String respuesta = scanner.nextLine();

                boolean esValido = false;

                while (!esValido) {

                    if (respuesta.equals("si")){

                        System.out.println("¿Qué puntuación quieres darle?(1 - 5)");
                        int puntuacion = scanner.nextInt();
                        scanner.nextLine();

                        // Control de errores que si no cumple este requisito el campo,nos pedira volver a introducirlo//

                        if (puntuacion > 5) {
                            System.out.println("Maximo 5 puntos");
                            esValido = false;
                        } else {
                            esValido = true;
                        }

                        if (puntuacion <=1 ){
                            System.out.println("De 1 a 5");
                        }
                        int punt = puntuacion + tienda.puntuacion;

                        Boolean comp  = Database.añadirPuntuacionTienda(punt,tienda.codigo);

                        if (comp) {

                            System.out.println("Tu puntuación se registró correctamente.");


                        }else {
                            System.out.println("Su puntuación no se ha podido registrar. Por favor intentelo más tarde.");

                        }
                    }

                }

            }

            salir = true;
        }while (!salir);

        new PantallaPrincipal().iniciar();
    }
}

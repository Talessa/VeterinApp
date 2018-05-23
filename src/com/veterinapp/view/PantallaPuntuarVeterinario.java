package com.veterinapp.view;

import com.veterinapp.Database;
import com.veterinapp.manager.ManagerVeterianarios;
import com.veterinapp.model.Veterinario;

import java.util.List;
import java.util.Scanner;

public class PantallaPuntuarVeterinario {
    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        Boolean salir = false;

        do {

            System.out.println("¿Qué veterinario quieres puntuar?");
            String vet = scanner.nextLine();


            List<Veterinario> veterinarios = new ManagerVeterianarios().buscarNombreVeterianrio(vet);

            for (Veterinario veterinario : veterinarios) {

                String urg = "no";

                if (veterinario.urgencias24 == true) {
                    urg = "si";
                }

                System.out.println
                        (" | " + String.format("%-10s", veterinario.nombre)
                                + " | " + String.format("%-10s", veterinario.direccion)
                                + " | " + String.format("%-10s", veterinario.telefono)
                                + " | " + String.format("%-10s", veterinario.horario)
                                + " | " + String.format("%-10s", veterinario.web)
                                + " | " + String.format("%-10s", veterinario.especializacion)
                                + " | " + String.format("%-6s", veterinario.visita_N) + "€"
                                + " | " + String.format("%-6s", veterinario.visita_U) + "€"
                                + " | " + String.format("%-6s", veterinario.vacuna) + "€"
                                + " | " + String.format("%-6s", veterinario.chipado) + "€"
                                + " | " + String.format("%-3s", urg)
                                + " | " + String.format("%-4s", veterinario.puntuacion)
                                + " | ");
                System.out.println("¿Quieres puntuar este veterinario?");

                String respuesta = scanner.nextLine();

                boolean esValido = false;

                while (!esValido){

                    if (respuesta.equals("si")) {

                        System.out.println("¿Qué puntuación quieres darle?(1 - 5)");
                        int puntuacion = scanner.nextInt();
                        scanner.nextLine();

                        //Control de errores

                        if (puntuacion > 5 || puntuacion < 0) {
                            System.out.println("La puntuación solo puede ser de 1 a 5");
                            esValido = false;
                        } else {
                            esValido = true;
                        }

                        int punt = puntuacion + veterinario.puntuacion;

                        Boolean comp = Database.añadirPuntuacionVeterinario(punt, veterinario.codigo);

                        if (comp) {

                            System.out.println("Tu puntuación se registró correctamente.");


                        } else {
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

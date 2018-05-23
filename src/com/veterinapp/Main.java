package com.veterinapp;


import com.veterinapp.view.PantallaPrincipal;

public class Main {

    public static void main(String[] args) {
        Database.get();
        new PantallaPrincipal().iniciar();
    }
}

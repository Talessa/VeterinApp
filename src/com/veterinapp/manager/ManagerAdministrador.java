package com.veterinapp.manager;

import com.veterinapp.Database;
import com.veterinapp.model.Administrador;

import java.util.List;

public class ManagerAdministrador {

    public static boolean login(String usuario,String contraseña){
        Boolean login= false;
        List<Administrador> administradores= Database.get().selectAllAdministradores();

        for (Administrador administrador : administradores) {

            if (administrador.usuario.equals(usuario) && administrador.contraseña.equals(contraseña)){
                    login=true;
                    return login;
            }

        }
        return login;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplo.SpringBoot.Security.Controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mensaje {
    private String mensaje;

    //constuctor vacio
    public Mensaje() {
    }
    //constructor con parametros
    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

   

    
    
}

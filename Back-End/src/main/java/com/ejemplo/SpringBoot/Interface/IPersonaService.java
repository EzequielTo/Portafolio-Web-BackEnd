/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ejemplo.SpringBoot.Interface;

import com.ejemplo.SpringBoot.Entity.Persona;
import java.util.List;

/**
 *
 * @author Ezequiel
 */
public interface IPersonaService {
    public  List<Persona> getPersona();
    
    public void savepersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}

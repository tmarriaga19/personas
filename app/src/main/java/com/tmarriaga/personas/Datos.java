package com.tmarriaga.personas;

import java.util.ArrayList;

/**
 * Created by android on 09/04/2018.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList();

    public static void guardar(Persona p){
        personas.add(p);
    }

    public  static  ArrayList<Persona> obtener(){
        return personas;
    }
}

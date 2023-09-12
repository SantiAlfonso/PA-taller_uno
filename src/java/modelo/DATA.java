/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago199
 */
public class DATA {
     public static List<Aspirante> aspirantes = new ArrayList();
     public static List<Curso> cursos = new ArrayList();
     
     public static void info_cursos(){
         
     cursos.add(new Curso(1,"Calculo Integral",3));
     cursos.add(new Curso(2,"Programación Avanzada",3));
     cursos.add(new Curso(3,"Bases de datos avanzada",3));
     
     }
}

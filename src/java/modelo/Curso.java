/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class Curso {
    
    public int id;
    public String curso;
    public double valor;
    public ArrayList listac=new ArrayList();  

    public Curso(int id, String curso, double valor) {
        this.id = id;
        this.curso = curso;
        this.valor = valor;
    }

    public Curso() {
    }
    

    
}

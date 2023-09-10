/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Aspirante {
    public ArrayList listaA = new ArrayList();
    private String nombre;
    private String correo;
    private String telefono;
    public String cursos_int;
    public LocalDate fecha;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Aspirante(String nombre, String correo, String telefono, String cursos_int, LocalDate fecha) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.cursos_int = cursos_int;
        this.fecha = fecha;
    }

    
}

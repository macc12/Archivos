/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author JHOHAN
 */
public class Estudiante {
        Scanner tc = new Scanner(System.in);
    private String nombre;
    private int cedula;
    private int edad;

    public Estudiante(){
        System.out.println("cedula");
        this.cedula=tc.nextInt();
        System.out.println("edad");
        this.edad=tc.nextInt();
        System.out.println("nombre");
        this.nombre=tc.nextLine();
        this.nombre=tc.nextLine();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
 
    
}

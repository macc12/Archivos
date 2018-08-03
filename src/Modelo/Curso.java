/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author Marco
 */
public class Curso {
    private int codigo;
    private String nombre;
  Scanner tc = new Scanner(System.in);
    public Curso() {
        System.out.println("nombre");
        this.nombre = tc.nextLine();
        System.out.println("codigo");
        this.codigo = tc.nextInt();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    
    
}

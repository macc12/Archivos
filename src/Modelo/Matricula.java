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
public class Matricula {
    private int id;
    private int codigo;
          Scanner tc = new Scanner(System.in);

    public Matricula(){
          System.out.println("id");
          this.id=tc.nextInt();
          System.out.println("codigo");
          this.codigo=tc.nextInt();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}

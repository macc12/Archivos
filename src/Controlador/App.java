/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.Matricula;
import java.util.Scanner;

/**
 *
 * @author marco
 */
import java.io.*;
public class App {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        Estudiante estudiante;
        Matricula matricula;
        try{
            
        
         RandomAccessFile raf = new RandomAccessFile("Estudiantes.txt", "rw");
         RandomAccessFile raf1 = new RandomAccessFile("Materias.txt", "rw");
         RandomAccessFile raf2= new RandomAccessFile("cursos.txt", "rw");
         
        }catch(Exception e){
            System.out.println("fallo en los archivos");
        }
        int op=0;
        do{
            System.out.println("1. Garegar estudiante\n2. Agregar Curso\n3. Agregar Materia\4.salir");
            
        }while();
               
    }
    public void agregarEstudiantes(){
        
    }
}

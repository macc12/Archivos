/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Curso;
import Modelo.Estudiante;
import Modelo.Matricula;
import java.util.Scanner;

/**
 *
 * @author marco
 */
import java.io.*;
public class App {
    static RandomAccessFile raf;
    static RandomAccessFile raf1;
    static RandomAccessFile raf2;
    static App app =new App();
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        Estudiante estudiante;
        Matricula matricula;
        Curso curso;
        try{            
        
         raf = new RandomAccessFile("Estudiantes.txt", "rw");
         raf1 = new RandomAccessFile("Matricula.txt", "rw");
         RandomAccessFile raf2= new RandomAccessFile("cursos.txt", "rw");
         int op=0;
            do{
                System.out.println("1. Garegar estudiante\n2. Agregar Curso\n3. Agregar Materia\4.salir");
                op=tc.nextInt();
                switch (op) {
                    case 1:
                        estudiante = new Estudiante();
                        app.agregarEstudiantes(estudiante);
                        break;
                    case 2:
                        curso= new Curso();
                        app.agregarCursos(curso);
                        break;
                    case 3: 
                        System.out.println("codigo del estudiante:");
                        int n=tc.nextInt();
                       app.agregarMatricula(n);
                        
                        break;
                    default:
                        break;
                }
              
            }while(op!=4);
        }catch(Exception e){
            e.printStackTrace();
        }
                 
    }
    public void agregarEstudiantes(Estudiante estu){       
        try {
            raf.seek(raf.length());
            raf.writeInt(estu.getCedula()); raf.writeUTF(estu.getNombre()); raf.writeInt(estu.getEdad());
        } catch (Exception e) {
        }
    }
    public void agregarCursos(Curso cur){       
        try {
            raf2.seek(raf2.length());
            raf2.writeInt(cur.getCodigo()); raf2.writeUTF(cur.getNombre());
        } catch (Exception e) {
        }
    }
    public void listarCursos(){
           int cadena=0;
        try {
            raf2.seek(0);
            for (int i = 0; i < raf2.length(); i++) {
                cadena = raf2.readInt();
                raf2.skipBytes(22);
                i=(int) raf2.getFilePointer();
            }
        } catch (Exception e) {
        }    
        System.out.println(cadena);
    }
    public void agregarMatricula(int estu){  
        listarCursos();
        try {
            Scanner s=new Scanner(System.in);
            raf2.seek(raf.length());
            
            raf2.writeInt(estu); 
            System.out.println("ingrese erl codigo del curso");
            raf2.writeInt(s.nextInt());
        } catch (Exception e) {
        }
    }
}

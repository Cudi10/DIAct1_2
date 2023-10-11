/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1_2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author jesusfd
 */
public class Principal {
     public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
    public static void main(String args[]) {
     ExpedienteAlumno expediente = new ExpedienteAlumno();
     expediente.setVisible(true);
     Alumno alumnos = new Alumno();
    }
    
    public static void agregarlumno(Alumno alumnos){
        listaAlumnos.add(alumnos);
    }
}

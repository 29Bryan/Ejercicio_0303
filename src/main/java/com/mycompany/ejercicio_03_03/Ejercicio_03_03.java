/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_03_03;

import vista.AsignaturaVentana;
import vista.CalificacionVentana;
import vista.EstudianteVentana;

/**
 *
 * @author PCG
 */
public class Ejercicio_03_03 {

    public static void main(String[] args) {
        var ventanaEstudiante= new EstudianteVentana("Panel Principal");
        ventanaEstudiante.setVisible(true);
        
        var ventanaAsignatura= new AsignaturaVentana("Panel Principal");
        ventanaAsignatura.setVisible(true);
        
        var ventanaCalificacion= new CalificacionVentana("Panel Principal");
        ventanaCalificacion.setVisible(true);
    }
}

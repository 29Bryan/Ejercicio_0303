/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Estudiante;
import servicio.EstudianteServicio;

/**
 *
 * @author PCG
 */
public class EstudianteControl {
    
    private final EstudianteServicio estudianteServicio = new EstudianteServicio(); 
    
    public Estudiante crear(String [] params){
        var estudiante = new Estudiante(params[0],Integer.valueOf(params[1]),
                                        Integer.valueOf(params[2]), params[3], 
                                        params[4]); 
        this.estudianteServicio.crear(estudiante);
        return estudiante;
    }
    
    public List<Estudiante> listar()
    {
        return this.estudianteServicio.listar();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Asignatura;
import servicio.AsignaturaServicio;

/**
 *
 * @author PCG
 */
public class AsignaturaControl {
    private final AsignaturaServicio asignaturaServicio = new AsignaturaServicio(); 
    
    public Asignatura crear(String [] params){
        var estudiante = new Asignatura(params[0],Integer.valueOf(params[1]),
                                        Integer.valueOf(params[2]), params[3]); 
        this.asignaturaServicio.crear(estudiante);
        return estudiante;
    }
    
    public List<Asignatura> listar()
    {
        return this.asignaturaServicio.listar();
    }
}

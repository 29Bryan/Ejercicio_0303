/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Calificacion;
import servicio.CalificacionServicio;

/**
 *
 * @author PCG
 */
public class CalificacionControl {
    private final CalificacionServicio calificacionServicio = new CalificacionServicio(); 
    
    public Calificacion crear(String [] params){
        var calificacion = new Calificacion(Integer.valueOf(params[0])); 
        this.calificacionServicio.crear(calificacion);
        return calificacion;
    }
    
    public List<Calificacion> listar()
    {
        return this.calificacionServicio.listar();
    }
}

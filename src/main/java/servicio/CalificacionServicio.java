/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Calificacion;

/**
 *
 * @author PCG
 */
public class CalificacionServicio implements ICalificacionServicio{
    private final List<Calificacion> calificacionList= new ArrayList<>();
    
    @Override
    public Calificacion crear(Calificacion calificacion) {
        this.calificacionList.add(calificacion); 
        return calificacion; 
    }
    
    @Override
    public List<Calificacion> listar() {
        return this.calificacionList; 
    }
    
}

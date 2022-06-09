/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Asignatura;

/**
 *
 * @author PCG
 */
public class AsignaturaServicio implements IAsignaturaServicio {
    private final List<Asignatura> asignaturaList= new ArrayList<>();
    
    @Override
    public Asignatura crear(Asignatura asignatura) {
        this.asignaturaList.add(asignatura); 
        return asignatura; 
    }
    
    @Override
    public List<Asignatura> listar() {
        return this.asignaturaList; 
    }

}

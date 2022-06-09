/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Calificacion;

/**
 *
 * @author PCG
 */
public interface ICalificacionServicio {
    public Calificacion crear(Calificacion calificacion);
    public List<Calificacion>listar();
}

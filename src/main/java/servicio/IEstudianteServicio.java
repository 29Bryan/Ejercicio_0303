/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Estudiante;

/**
 *
 * @author PCG
 */
public interface IEstudianteServicio {
    public Estudiante crear(Estudiante estudiante);
    public List<Estudiante>listar();
}

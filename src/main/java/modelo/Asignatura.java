/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PCG
 */
public class Asignatura {
    private String nombre; 
    private int numeroHoras; 
    private int costoHora; 
    private String codigo; 

    public Asignatura(String nombre, int numeroHoras, int costoHora, String codigo) {
        this.nombre = nombre;
        this.numeroHoras = numeroHoras;
        this.costoHora = costoHora;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public int getCostoHora() {
        return costoHora;
    }

    public void setCostoHora(int costoHora) {
        this.costoHora = costoHora;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", numeroHoras=" + numeroHoras + ", costoHora=" + costoHora + ", codigo=" + codigo + '}';
    }
    
}

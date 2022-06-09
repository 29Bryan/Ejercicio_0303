/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PCG
 */
public class Estudiante {
    private String nombre; 
    private int edad; 
    private int numeroCedula; 
    private String grado; 
    private String lugarNacimiento; 

    public Estudiante(String nombre, int edad, int numeroCedula, String grado, String lugarNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroCedula = numeroCedula;
        this.grado = grado;
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(int numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", numeroCedula=" + numeroCedula + ", grado=" + grado + ", lugarNacimiento=" + lugarNacimiento + '}';
    }
}

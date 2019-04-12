/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personas;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class Persona {
    private String dni;
    private String nombre;
    private String edad;
    private boolean asistido;
    private boolean pagado;
    private boolean salir;
  

    public Persona(String dni, String nombre, String edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.asistido = false;
        this.pagado = false;
        this.salir = false;
    }

    @Override
    public String toString() {
        return 
            "Nombre: "+getNombre()+
            "\nDNI: "+getDni()+
            "\nEdad: "+getEdad()+
            "\nAsistido?: "+isAsistido()+
            "\nPagado: "+isPagado();
    }
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the asistido
     */
    public boolean isAsistido() {
        return asistido;
    }

    /**
     * @param asistido the asistido to set
     */
    public void setAsistido(boolean asistido) {
        this.asistido = asistido;
    }

    /**
     * @return the pagado
     */
    public boolean isPagado() {
        return pagado;
    }

    /**
     * @param pagado the pagado to set
     */
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    /**
     * @return the salir
     */
    public boolean isSalir() {
        return salir;
    }

    /**
     * @param salir the salir to set
     */
    public void setSalir(boolean salir) {
        this.salir = salir;
    }
    
    
}

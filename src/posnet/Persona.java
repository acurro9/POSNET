/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author 1daw
 */
public class Persona {

    private String DNI;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String mail;
    
    public Persona(String DNI, String nombre, String apellidos, String telefono, String mail){
        this.DNI=DNI;
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.mail=mail;
    }
    /**
     * @param DNI
     * @return String con el DNI
     */

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
     /**
     * @param nombre
     * @return String con el nombre
     * 
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     /**
     * @param apellidos
     * @return String con los apellidos
     * 
     */
    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
     /**
     * @param telefono
     * @return String con el telefono
     * 
     */
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
     /**
     * @param mail
     * @return String con el mail
     * 
     */
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
     /**
     * @param nombre
     * @param apellidos
     * @return String con el nombre y apellidos
     */
    public String nombreCompleto() {
        return nombre+" "+apellidos;

    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Aaron
 */
public class Ticket {
    private String nombreApellido;
    private double montoTotal;
    private double montoPorCuota;

    Ticket(String nomApe, double montoTotal, double montoPorCuota) {
        this.nombreApellido=nomApe;
        this.montoTotal=montoTotal;
        this.montoPorCuota=montoPorCuota;
    }
    /**
     * 
     * @param nombreApellido  
     * @param montoTotal
     * @param montoPorCuota
     */

    public void setNombreApellidos(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public void setMontoPagar(double montoPagar) {
        this.montoTotal = montoPagar;
    }

    public void setMontoCuota(double montoCuota) {
        this.montoPorCuota = montoCuota;
    }

    
    
    
    
}

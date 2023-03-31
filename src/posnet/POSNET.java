/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Aaron
 */
public class POSNET {
    public static final double RECARGOCUOTA=0.03;
    public static final int MINCUOTAS=1;
    public static final int MAXCUOTAS=6;
    
        /**
        *@param tarjeta
        *@param montoAAbonar
        *@param cantCuotas
        * @return Ticket ticket
        */
        
    public Ticket efectuarPago(TarjetaDeCredito tarjeta, double montoAAbonar, int cantCuotas){

        Ticket ticket=null;
        
        if (datosValidos(tarjeta, montoAAbonar, cantCuotas)){
            double montoFinal=montoAAbonar+recargoSegunCuotas(cantCuotas);
            if (tarjeta.tieneSadoDisponible(montoFinal)){
                tarjeta.descontar(montoFinal);
                String nomApe= tarjeta.nombreCompletoDelTitular();
                double montoPorCuota=montoFinal/cantCuotas;
                ticket = new Ticket (nomApe, montoFinal, montoPorCuota);
            }
        }
        
        return ticket;
    }
    /**
     * 
     * @param tarjeta
     * @param monto
     * @param cant
     * @return boolean true si la tarjeta es valida, el monto es valido y las cantidades de cuotas son correctas
     */
    private boolean datosValidos(TarjetaDeCredito tarjeta, double monto, 
            int cant){
        boolean esTarjetaValida= tarjeta != null;
        boolean esMontoValido = monto > 0;
        boolean cantCuotaValida = cant >= MINCUOTAS && cant <= MAXCUOTAS;
        return esTarjetaValida && esMontoValido && cantCuotaValida;
    }
    /**
     * 
     * @param cantCuotas
     * @return double de cantCuotas-1 multiplicado por RecargoCuota
     */
    
    private double recargoSegunCuotas (int cantCuotas){
        return (cantCuotas-1)*RECARGOCUOTA;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posnet;

/**
 *
 * @author Aaron
 */
public class TarjetaDeCredito {

    private String entidadBancaria;
    private String numero;
    private double saldo;
    private EntidadFinanciera entidadFinanciera;
    private Persona titular;
    
    public TarjetaDeCredito (String entidadBancaria, String numero, double saldo, 
            EntidadFinanciera entidadFinanciera, Persona titular){
        this.entidadBancaria=entidadBancaria;
        this.numero=numero;
        this.saldo=saldo;
        this.entidadFinanciera=entidadFinanciera;
        this.titular=titular;
    }
    /**
     * @param entidadBancaria
     * @param numero
     * @param saldo
     * @param entidadFinanciera
     * @param titular
     * @return String con entidadBancaria, número, saldo, entidadFinanciera y titular de la tarjeta
     */

    public String toString() {
        return "TarjetaDeCredito{" + "entidadBancaria= " + entidadBancaria + ", numero= " + numero + ", saldo= " + saldo + ", entidadFinanciera= " + entidadFinanciera + ", titular= " + titular + '}';
    }

     /**
     * @param saldo
     * @return boolean true si saldo es mayor o igual que montoFinal
     */
    public boolean tieneSadoDisponible(double montoFinal) {
      return saldo>=montoFinal;
    }
    
    public void descontar(double monto){
        saldo = saldo-monto;
    }
    /**
     * @param titular
     * @return el nombre y apellidos del titular
     */
    public String nombreCompletoDelTitular() {
        return titular.nombreCompleto();
    }
}

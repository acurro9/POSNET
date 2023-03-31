package posnet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Aaron
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        POSNET posnet = new POSNET();
        Persona p = new Persona("36545689", "Pepe", "Gomez", "698547856", "pepe@gmail.com");
        TarjetaDeCredito t = new TarjetaDeCredito ("FakeBank", "123465789987", 1500, 
                EntidadFinanciera.BIRZA, p);
        
        System.out.print("Tarjeta antes del pago: ");
        System.out.println(t);
        
        Ticket  ticketGenerado = posnet.efectuarPago(t, 10000, 5);
        
        System.out.print("Ticket generado: ");
        System.out.println(ticketGenerado);
        
        System.out.print("Tarjeta despues del pago: ");
        System.out.println(t);
        
    }
    
    
}

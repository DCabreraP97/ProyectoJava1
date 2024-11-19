/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Reclamante;
import Controlador.entregaObjetoControlador;

/**
 *
 * @author Invitado1
 */
public class testRegistrarEntrega {
    
    public static void main(String[] args) {
    entregaObjetoControlador controlador = new entregaObjetoControlador();
    Reclamante reclamante = new Reclamante();
    reclamante.setNombre("Juan");
    reclamante.setApellido("Pérez");
    reclamante.setTelefono("1234567890");
    reclamante.setEmail("juan@example.com");

    boolean exito = controlador.registrarEntrega(1, reclamante); // Usar un ID válido de tu base de datos
    if (exito) {
        System.out.println("Entrega registrada con éxito.");
    } else {
        System.out.println("Error al registrar la entrega.");
    }
}

    
}

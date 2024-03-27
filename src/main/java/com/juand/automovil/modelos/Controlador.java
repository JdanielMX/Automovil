/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juand.automovil.modelos;

import com.juand.automovil.controladores.ControladorJPA;
import java.util.List;

/**
 *
 * @author JDANIEL
 */
public class Controlador {

    ControladorJPA controladorJPA = new ControladorJPA();

    public void guardaAutomovil(Automovil auto) {

        controladorJPA.guardaAutomovil(auto);

        
    }

    public List<Automovil> mostrarAutos() {


        return controladorJPA.mostrarAutos();

    }

    public void eliminarDatos(int indice) {


        controladorJPA.eliminarDatos(indice);

        
        
    }

    public Automovil buscarAuto(int indice) {

       return controladorJPA.buscarAuto(indice);


    }

    public void actualizarAuto(Automovil auto, String modelo, String marca, String motor, String placas, int cantidadPuertas) {

        
        auto.setCantidadPuertas(cantidadPuertas);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPlacas(placas);
        auto.setModelo(modelo);

controladorJPA.actualizarAuto(auto);


    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.juand.automovil.controladores;

import com.juand.automovil.controladores.exceptions.NonexistentEntityException;
import com.juand.automovil.modelos.Automovil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JDANIEL
 */
public class ControladorJPA {

    AutomovilJpaController controller = new AutomovilJpaController();

    public  void eliminarDatos(int indice) {

        try {
            controller.destroy(indice);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardaAutomovil(Automovil auto) {

        controller.create(auto);

    }

    public List<Automovil> mostrarAutos() {

        return controller.findAutomovilEntities();

    }

    public Automovil buscarAuto(int indice) {


        return  controller.findAutomovil(indice);

    }

    public void actualizarAuto(Automovil auto) {


        try {
            controller.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladorJPA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil{
    double numLitros;
    double costoLitros;
    double descuentoLitros;
    
    
    //establecer
    public void setCostoLitro(double costoLitro) {
        this.costoLitros = costoLitro;
    }
    public void setDescuentoLitros(double descuentoLitros) {
        this.descuentoLitros = numLitros * 0.05;
    }
     public void setNumLitros(double numLitros) {
        this.numLitros = numLitros;
    }
    
    //obtener
    public double getDescuentoLitros() {
        return descuentoLitros;
    }
    public double getNumLitros() {
        return numLitros;
    }
    public double getCostoLitro() {
        return costoLitros;
    }
    public double getcalcularValorCancelar(){
        return valorCancelar;
    }
    
    @Override
    public void calcularValorCancelar(){
        valorCancelar = costoLitros *(numLitros - descuentoLitros);
    }
    
    
}

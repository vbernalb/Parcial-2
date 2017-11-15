/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Universidad {
    
    private ArrayList <Sede> sedes;

    public Universidad() {
        this.sedes = new ArrayList();
    }
    
    public void addSede(Sede sede){
        sedes.add(sede);
    }
    
    
    
}

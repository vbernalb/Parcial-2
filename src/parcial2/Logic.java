/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import parcial2.Sede;

/**
 *
 * @author ESTUDIANTE
 */
public class Logic {
    
    private Sede sede;
    private Universidad un;

    public Logic() {
        this.un = new Universidad();
    }
    
    

    public void loadFile(String path) throws FileNotFoundException {
      File read = new File(path);
      Scanner flow = new Scanner(read);
      flow.useDelimiter(",");
      String type = null;
      String Nombre = null;
      String Direccion = null;
      int Telefono = 0;
      double Area = 0;
      
      int PAC = 0; //PARA PROFESIONAL
      int NE = 0; //PARA TECOLOGICA
      String CP = null; //PARA ECONTINUADA
      
      while (flow.hasNextLine()) {              
         type = flow.next();
         if(type.equals("P")){
             Nombre = flow.next();
             Direccion = flow.next();
             Telefono = flow.nextInt();
             Area = flow.nextDouble();
             PAC = flow.nextInt();
             sede = new Profesional(Nombre, Direccion, Telefono, Area, PAC);
             un.addSede(sede);
             
             
         }
         if(type.equals("T")){
             Nombre = flow.next();
             Direccion = flow.next();
             Telefono = flow.nextInt();
             Area = flow.nextDouble();
             NE = flow.nextInt();
             sede = new Tecnologica(Nombre, Direccion, Telefono, Area, NE);
             un.addSede(sede);
         }
         if(type.equals("E")){
             Nombre = flow.next();
             Direccion = flow.next();
             Telefono = flow.nextInt();
             Area = flow.nextDouble();
             CP = flow.next();
             sede = new EContinuada(Nombre, Direccion, Telefono, Area, CP);
             un.addSede(sede);
         }
         //Procesar y Crear Objetos
          System.out.println(type);
       }
    }
    
    
    public void listar (String path) throws FileNotFoundException{ //PERMITE LISTAR TODOS LOS ELEMENTOS DEL ARCHIVO, Y POR TANTO, DE TODAS LAS SEDES
        Scanner leer = new Scanner(path);
        String dato = null;
        while(leer.hasNextLine()){
            dato = leer.nextLine();
            System.out.println(dato);
        }
    }
    
}

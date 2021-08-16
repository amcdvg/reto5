package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Transformar_Nombre;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Suma_Salario;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1(){
        //System.out.println("Retorna el nombre y apellidos de los lideres con apellido 'Perez'");
        System.out.println("Nombre Apellidos Salarios");
        try {
            ArrayList<Lider> resultado = controlador.consultarRequerimiento1();
            for (Lider lider:resultado){
                System.out.print(lider.getNombre()+" ");
                System.out.print(lider.getPrimer_Apellido()+" ");
                System.out.print(lider.getSegundo_Apellido()+" ");
                System.out.println(lider.getSalario());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

   public static void requerimiento2(){
    System.out.println("Nombre");
        try {
            ArrayList<Transformar_Nombre> resultado = controlador.consultarRequerimiento2();
            for (Transformar_Nombre transformar:resultado){
                System.out.println(transformar.getTransformar());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }



    public static void requerimiento3(){
        System.out.println("Ciudad_Residencia Suma");
        try {
            ArrayList<Suma_Salario> resultado = controlador.consultarRequerimiento3();
            for (Suma_Salario Suma:resultado){
                System.out.print(Suma.getCiudad()+" ");
                System.out.println(Suma.getSumaSalario());
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    
}

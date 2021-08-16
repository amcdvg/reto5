package utp.misiontic2022.c2.p47.reto4.App;

import utp.misiontic2022.c2.p47.reto4.vista.vistaRequerimientosReto4;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App{
    public static void main( String[] args )
    {
        System.out.println("Conocer el nombre, apellidos y salarios de los lideres cuyo segundo apellido sea ‘Ortiz’");
        vistaRequerimientosReto4.requerimiento1();

        System.out.println("\nTransformar y obtener el nombre de los lideres donde la primera letra sea en minúscula y las demás en mayúscula");
        vistaRequerimientosReto4.requerimiento2();

        System.out.println("\nSaber la suma de los salarios de todos los lideres por su ciudad de residencia.");
        vistaRequerimientosReto4.requerimiento3();

        System.out.println("\nAgrupar los lideres por su cargo y retornar solos los grupos cuyo promedio de salarios supere 500000");
        vistaRequerimientosReto4.requerimiento4();
        
    }
}

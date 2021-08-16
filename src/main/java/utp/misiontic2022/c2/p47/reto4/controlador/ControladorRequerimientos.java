package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.LiderDao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Transformar_Nombre;
import utp.misiontic2022.c2.p47.reto4.vista.PrimeraConsulta;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.TransformarDao;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Suma_Salario;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.SumaSalarioDao;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Cargo_Salario;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.CargoDao;


public class ControladorRequerimientos {
    
   // LiderDao dao = new LiderDao();
   // TransformarDao dao = new TransformarDao();
    
    public PrimeraConsulta consultarRequerimiento1(String sql1) throws SQLException {
        LiderDao dao = new LiderDao();
        return dao.requerimiento1(sql1);
    }

   /* public ArrayList<Transformar_Nombre> consultarRequerimiento2(String sql1) throws SQLException {
        TransformarDao dao = new TransformarDao();
        return dao.requerimiento2(sql1);
    }

    public ArrayList<Suma_Salario> consultarRequerimiento3(String sql1) throws SQLException {
        SumaSalarioDao dao = new SumaSalarioDao();
        return dao.requerimiento3(sql1);
    }

    public ArrayList<Cargo_Salario> consultarRequerimiento4(String sql1) throws SQLException {
        CargoDao dao = new CargoDao();
        return dao.requerimiento4(sql1);
    }*/
}

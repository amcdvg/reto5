package utp.misiontic2022.c2.p47.reto4.modelo.dao; 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Cargo_Salario;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class CargoDao {
    
    Connection conexion;

    public CargoDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Cargo_Salario> requerimiento4(String sql1) throws SQLException {
        ArrayList<Cargo_Salario> lista = new ArrayList<>();
        String sql = sql1;
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Cargo_Salario CSalario = new Cargo_Salario();
            CSalario.setCargo(resultados.getString("Cargo"));
            CSalario.setSalario(resultados.getDouble("avg(Salario)"));
            lista.add(CSalario);
        }
        return lista;
    }
    
}

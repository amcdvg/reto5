package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Suma_Salario;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class SumaSalarioDao {
    
    Connection conexion;

    public SumaSalarioDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Suma_Salario> requerimiento3(String sql1) throws SQLException {
        ArrayList<Suma_Salario> lista = new ArrayList<>();
        String sql = sql1;
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Suma_Salario SumaSalario = new Suma_Salario();
            SumaSalario.setCiudad(resultados.getString("Ciudad_Residencia"));
            SumaSalario.setSumaSalario(resultados.getInt("sum(Salario)"));
            lista.add(SumaSalario);
        }
        return lista;
    }
    
}

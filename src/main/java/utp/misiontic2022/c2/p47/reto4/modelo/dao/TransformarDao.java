package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Transformar_Nombre;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class TransformarDao {
    Connection conexion;

    public TransformarDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public ArrayList<Transformar_Nombre> requerimiento2() throws SQLException {
        ArrayList<Transformar_Nombre> lista = new ArrayList<>();
        String sql = "select LOWER(SUBSTR(Nombre,1,1)) || UPPER(SUBSTR(Nombre,2,LENGTH(Nombre))) as Transformar from Lider;";
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Transformar_Nombre tranformar = new Transformar_Nombre();
            tranformar.setTransformar(resultados.getString("Transformar"));
            lista.add(tranformar);
        }
        return lista;
    }
    
}

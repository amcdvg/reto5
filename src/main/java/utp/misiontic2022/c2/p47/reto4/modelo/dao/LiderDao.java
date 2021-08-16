package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Lider;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;
import utp.misiontic2022.c2.p47.reto4.vista.PrimeraConsulta;


public class LiderDao {

    Connection conexion;

    public LiderDao(){
        try {
            conexion = JDBCUtilities.getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public PrimeraConsulta requerimiento1(String sql1) throws SQLException {
        PrimeraConsulta modelo = new PrimeraConsulta();
        ArrayList<Lider> lista = new ArrayList<>();
        String sql = sql1;
        Statement pstm = conexion.createStatement();
        ResultSet resultados = pstm.executeQuery(sql);
        while(resultados.next()){
            Lider lider = new Lider();
            lider.setNombre(resultados.getString("Nombre"));
            lider.setPrimer_Apellido(resultados.getString("Primer_Apellido"));
            lider.setSegundo_Apellido(resultados.getString("Segundo_Apellido"));
            lider.setSalario(resultados.getFloat("Salario"));
            lista.add(lider);
        }
        Object [][] lis= new Object[lista.size()][4];
            for(int i = 0; i < lista.size();i++){
                lis[i][0]=lista.get(i).getNombre();
                lis[i][1]=lista.get(i).getPrimer_Apellido();
                lis[i][2]=lista.get(i).getSegundo_Apellido();
                lis[i][3]=lista.get(i).getSalario();
            }
            
        modelo.Tabla1 = lis;
        
        
        return modelo;
    }
}
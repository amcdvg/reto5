package utp.misiontic2022.c2.p47.reto4.modelo.vo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Cargo_Salario {
    private String Cargo;
    private Double Salario;
    
    public Cargo_Salario() {
    }

    public String getCargo() {
        return Cargo;
    }
    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getSalario() {
        DecimalFormatSymbols separadoresPersonalizados = new DecimalFormatSymbols();
        separadoresPersonalizados.setDecimalSeparator('.');
        DecimalFormat formato1 = new DecimalFormat("#.000000",separadoresPersonalizados);
        String Salario1 = formato1.format(Salario);
        return Salario1; 
    }
    public void setSalario(Double salario) {
        Salario = salario;
    }
    
}

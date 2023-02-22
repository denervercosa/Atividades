package atividade2;

import java.util.Locale;

public class TestarFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Funcionario funcionario1 = new Funcionario("Dener","75000",
                "Desenvolvedor FullStack Junior",4199.00,00);

        Funcionario funcionario2 = new Funcionario("Oscar","75001",
                "Desenvolvedor FullStack Pleno",8199.00,00);

        funcionario1.visulizar();
        funcionario2.visulizar();
    }
}
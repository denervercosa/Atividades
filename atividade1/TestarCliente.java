package atividade1;

public class TestarCliente {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jessica", "(11)9958325987", "166.999.333-44",
                "jess@gmail.com", "R das Primas - 69 - JD Elite");

        Cliente cliente2 = new Cliente("Dener", "(11)9840663681", "546.859.123-01",
                "dnr@gmail.com", "R Abilio Diniz - 25A - JD Macedonia");

        cliente1.visualizar();
        cliente2.visualizar();
    }
}
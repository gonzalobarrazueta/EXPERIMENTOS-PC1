public class Cuenta {
    private int saldo;
    private String contra;

    public Cuenta(int saldoini, String cc) {     //constructor
        saldo = saldoini;
        contra = cc;
    }

    public int deposita(int q) {//receptor de dinero
        saldo += q;
        return saldo;
    }

    // q: cantidad que quiero retirar
    // cc: contraseña
    // retira si la contraseña coincide y hay fondos if (contra.equals(cc))
    public int retira(int q, String cc) {

        if (saldo >= q) {
                return q;
            } else {
            return saldo;
        }
    }

    // verifica saldo
    public int dimeSaldo() {
        return saldo;
    }

    // verifica contraseña
    public String dimeContra() {
        return contra;
    }
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CuentaTest {

    @Test
    void depositarDinero() {
        Cuenta cuenta = new Cuenta(500, "password");
        int saldo = cuenta.deposita(100);

        Assertions.assertEquals(600, saldo);
    }

    @Test
    void retiraDinero() {
        int saldo_actual = 1200;
        int monto_retiro = 800;

        Cuenta cuenta = new Cuenta(saldo_actual, "password");

        int saldo_restante = saldo_actual - cuenta.retira(monto_retiro, "password");
        Assertions.assertEquals(400, saldo_restante);
    }

    @Test
    void dimeSaldo() {
        Cuenta cuenta = new Cuenta(700, "password");

        int saldo = cuenta.dimeSaldo();

        Assertions.assertEquals(700, saldo);
    }

    @Test
    void dimeContra() {
        Cuenta cuenta = new Cuenta(700, "password");

        String contra = cuenta.dimeContra();

        Assertions.assertEquals("password", contra);
    }

    // Pruebas integrales
    @Test
    void depositarYRetirarDinero() {
        Cuenta cuenta = new Cuenta(500, "password");

        String pass = cuenta.dimeContra();
        Assertions.assertEquals("password", pass);

        int nuevo_saldo = cuenta.deposita(100);
        Assertions.assertEquals(600, nuevo_saldo);

        int saldo_actual = cuenta.dimeSaldo();
        Assertions.assertEquals(600, saldo_actual);

        int saldo_restante = saldo_actual - cuenta.retira(350, "password");
        Assertions.assertEquals(250, saldo_restante);
    }
}
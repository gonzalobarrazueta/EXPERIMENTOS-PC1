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
        Cuenta cuenta = new Cuenta(700, "password");

        int saldo_restante = cuenta.retira(100, "password");

        Assertions.assertEquals(100, saldo_restante);
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
}
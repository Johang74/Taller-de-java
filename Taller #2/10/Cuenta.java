public class Cuenta {
    String idCliente;
    float saldo;

    public Cuenta(String idCliente, float saldo) {
        this.idCliente = idCliente;
        this.saldo = saldo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float monto) {
        this.saldo = monto;

    }
}

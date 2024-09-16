class EntityCajero
{
    //atributos 
    private Double saldo;
    private String titular;
    private int numeroCuenta;

    // constructor
    public EntityCajero(Double saldo, String titular, int numeroCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
    }


    //Getters y Setters
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

//Metodo toSring()
    @Override
    public String toString() {
        return "Cajero [saldo=" + saldo + ", titular=" + titular + ", numeroCuenta=" + numeroCuenta + "]";
    }



}
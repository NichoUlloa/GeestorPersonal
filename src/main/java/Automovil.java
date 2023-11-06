public class Automovil {
    private String marca;
    private String modelo;
    private int anioFabricacion;
    private double precio;
    private Motor motor;
    private Chasis chasis;

    public Automovil(String marca, String modelo, int anioFabricacion, double precio, Motor motor, Chasis chasis) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
        this.motor = motor;
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }
    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
}
public class Motor {
    private String numeroMotor;
    private int centimetrosCubicos;

    public Motor(String numeroMotor, int centimetrosCubicos) {
        this.numeroMotor = numeroMotor;
        this.centimetrosCubicos = centimetrosCubicos;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }
    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public int getCentimetrosCubicos() {
        return centimetrosCubicos;
    }
    public void setCentimetrosCubicos(int centimetrosCubicos) {
        this.centimetrosCubicos = centimetrosCubicos;
    }
}

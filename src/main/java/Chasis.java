public class Chasis {
    private String numeroChasis;
    private String tipoMaterial;

    public Chasis(String numeroChasis, String tipoMaterial) {
        this.numeroChasis = numeroChasis;
        this.tipoMaterial = tipoMaterial;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }
    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }
    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
}
public class Auto1 {
    private double cilindrata;
    private String targa;
    private String marca;
    private String modelo;

    public Auto1 (double cilindrata,String targa,String marca,String modelo){
        this.cilindrata= cilindrata;
        this.targa=targa;
        this.marca=marca;
        this.modelo=modelo;
    }
    @Override
    public String toString() {
        return "Auto1{" +
                "cilindrata=" + cilindrata +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public double getCilindrata(){
        return cilindrata;
    }
    public void setCilindrata(){
        this.cilindrata=cilindrata;
    }
    public String getTarga(){
        return targa;
    }
    public void setTarga(){
        this.targa=targa;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(){
        this.marca=marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(){
        this.modelo=modelo;
    }

}


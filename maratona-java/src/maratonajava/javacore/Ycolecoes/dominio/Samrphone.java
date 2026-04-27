package maratonajava.javacore.Ycolecoes.dominio;

public class Samrphone {

    private String serialNumber;
    private String marca;

    public Samrphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == null) return  false;

        if (this == obj) return  true;

        if (this.getClass() != obj.getClass()) return false;

        Samrphone samrphone = (Samrphone) obj;
        return serialNumber != null && serialNumber.equals(samrphone.serialNumber);
    }

    @Override
    public int hashCode() {

        return  serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    @Override
    public String toString() {
        return "Samrphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

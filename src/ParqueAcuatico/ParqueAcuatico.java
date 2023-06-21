package ParqueAcuatico;

public class ParqueAcuatico {
    private double precioEntrada = 100.00; //Precio fijo de entrada al parque
    private double precioComidaBuffet;
    private double precioEspectaculoNocturno;
    private double precioNadoDelfinesSencillo = 350.00; //precio fijo del nado con delifines sencillo
    private double precioNadoDelfinesExtra = 500.00; //precio fijo del nado con delfines extra

    //Sobrecargas

    public double calcularTotalCompra() {
        return precioEntrada;
    }

    public double calcularTotalCompra(double precioComidaBuffet) {
        return calcularTotalCompra() + precioComidaBuffet;
    }

    public double calcularTotalCompra(double precioComidaBuffet, double precioEspectaculoNocturno) {
        return calcularTotalCompra(precioComidaBuffet) + precioEspectaculoNocturno;
    }

    public double calcularTotalCompra(double precioComidaBuffet, double precioEspectaculoNocturno, String tipoNadoDelfines) {
        double totalCompra = calcularTotalCompra(precioComidaBuffet, precioEspectaculoNocturno);

        if (tipoNadoDelfines.equalsIgnoreCase("sencilla")) {
            totalCompra += precioNadoDelfinesSencillo;
        } else if (tipoNadoDelfines.equalsIgnoreCase("extra")) {
            totalCompra += precioNadoDelfinesExtra;
        }

        return totalCompra;
    }


    // Getters y setters
    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public double getPrecioComidaBuffet() {
        return precioComidaBuffet;
    }

    public void setPrecioComidaBuffet(double precioComidaBuffet) {
        this.precioComidaBuffet = precioComidaBuffet;
    }

    public double getPrecioEspectaculoNocturno() {
        return precioEspectaculoNocturno;
    }

    public void setPrecioEspectaculoNocturno(double precioEspectaculoNocturno) {
        this.precioEspectaculoNocturno = precioEspectaculoNocturno;
    }

    public double getPrecioNadoDelfinesSencillo() {
        return precioNadoDelfinesSencillo;
    }

    public void setPrecioNadoDelfinesSencillo(double precioNadoDelfinesSencillo) {
        this.precioNadoDelfinesSencillo = precioNadoDelfinesSencillo;
    }

    public double getPrecioNadoDelfinesExtra() {
        return precioNadoDelfinesExtra;
    }

    public void setPrecioNadoDelfinesExtra(double precioNadoDelfinesExtra) {
        this.precioNadoDelfinesExtra = precioNadoDelfinesExtra;
    }
}

package proyecto;

/**
 *
 * @author seckond
 */
class AceleracionConstante extends ProblemasFisica {

    public double aceleracion;
    public double velocidadI;
    public double velocidadF;
    public double tiempo;
    public double distancia;

    public AceleracionConstante() {
    }

    public AceleracionConstante(double aceleracion, double velocidadI, 
            double velocidadF, double tiempo, double distancia, String descripcion) {
        super(descripcion);
        this.aceleracion = aceleracion;
        this.velocidadI = velocidadI;
        this.velocidadF = velocidadF;
        this.tiempo = tiempo;
        this.distancia = distancia;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public void setVelocidadI(double velocidadI) {
        this.velocidadI = velocidadI;
    }

    public void setVelocidadF(double velocidadF) {
        this.velocidadF = velocidadF;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void calcularAceleracionD() {
        this.aceleracion = (velocidadF - velocidadI) / tiempo;
    }

    public void calcularAceleracionT() {
        this.aceleracion = ((double) Math.pow(velocidadF, 2) - (double) Math.pow(velocidadI, 2)) / (2 * distancia);
    }

    public void calcularAceleracionVI() {
        this.aceleracion = (distancia - (velocidadF * tiempo)) / -(0.5 * (double) Math.pow(tiempo, 2));
    }

    public void calcularAceleracionVF() {
        this.aceleracion = (distancia - (velocidadI * tiempo)) / 0.5 * (double) Math.pow(tiempo, 2);
    }

    public void calcularVelocidadID() {
        this.velocidadI = velocidadF - (aceleracion * tiempo);
    }

    public void calcularVelocidadIT() {
        this.velocidadI = (double) Math.sqrt((double) Math.pow(velocidadF, 2) - (2 * aceleracion * distancia));
    }

    public void calcularVelocidadIVF() {
        this.velocidadI =(distancia-0.5*aceleracion*(double)Math.pow(tiempo, 2))/tiempo;
    }

    public void calcularVelocidadFD() {
        this.velocidadF = velocidadI + (aceleracion * tiempo);
    }

    public void calcularVelocidadFT() {
        this.velocidadF = (double) Math.sqrt((double) Math.pow(velocidadI, 2) + (2 * aceleracion * distancia));
    }

    public void calcularTiempoD() {
        this.tiempo = (velocidadF - velocidadI) / aceleracion;
    }

    public void calcularTiempoA() {
        this.tiempo = distancia / ((velocidadI + velocidadF) / 2);
    }

    public void calcularDistaciaT() {
        this.distancia = ((double) Math.pow(velocidadF, 2) - (double) Math.pow(velocidadI, 2)) / (2 * aceleracion);
    }

    public void calcularDistaciaA() {
        this.distancia = ((velocidadI + velocidadF) / 2) * tiempo;
    }

    @Override
    public String respuesta() {
        return String.format("%s \nAceleracion: %.2f \nVelocidad Inicial: %.2f \nVelocidad Final: %.2f "
                + "\nTiempo: %.2f \nDistancia: %.2f", super.respuesta(), aceleracion, velocidadI, velocidadF, tiempo, distancia);
    }

}

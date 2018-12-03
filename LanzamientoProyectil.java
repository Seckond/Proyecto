package proyecto;

/**
 *
 * @author seckond
 */
class LanzamientoProyectil extends ProblemasFisica {

    public double velocidadI;
    public double velocidadIx;
    public double velocidadIy;
    public double gravedad;
    public double tiempo;
    public double velocidadF;
    public double velocidadFx;
    public double velocidadFy;
    public double anguloLanzamiento;
    public double distanciaFy;
    public double distanciaFx;
    public double alturaMaxima;

    public LanzamientoProyectil() {
    }

    public LanzamientoProyectil(double velocidadI, double velocidadIx, double velocidadIy, 
            double gravedad, double tiempo, double velocidadF, double velocidadFx, 
            double velocidadFy, double anguloLanzamiento, double distanciaFy, double distanciaFx, 
            double alturaMaxima, String descripcion) {
        super(descripcion);
        this.velocidadI = velocidadI;
        this.velocidadIx = velocidadIx;
        this.velocidadIy = velocidadIy;
        this.gravedad = gravedad;
        this.tiempo = tiempo;
        this.velocidadF = velocidadF;
        this.velocidadFx = velocidadFx;
        this.velocidadFy = velocidadFy;
        this.anguloLanzamiento = anguloLanzamiento;
        this.distanciaFy = distanciaFy;
        this.distanciaFx = distanciaFx;
        this.alturaMaxima = alturaMaxima;
    }

    public void setGravedad() {
        this.gravedad = -9.8;
    }

    public void setVelocidadI(double velocidadI) {
        this.velocidadI = velocidadI;
    }

    public void setVelocidadIx(double velocidadIx) {
        this.velocidadIx = velocidadIx;
    }

    public void setVelocidadIy(double velocidadIy) {
        this.velocidadIy = velocidadIy;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void setVelocidadF(double velocidadF) {
        this.velocidadF = velocidadF;
    }

    public void setVelocidadFx(double velocidadFx) {
        this.velocidadFx = velocidadFx;
    }

    public void setVelocidadFy(double velocidadFy) {
        this.velocidadFy = velocidadFy;
    }

    public void setAnguloLanzamiento(double anguloLanzamiento) {
        this.anguloLanzamiento = anguloLanzamiento;
    }

    public void setDistanciaF(double distanciaF) {
        this.distanciaFx = distanciaF;
    }

    public void setDistanciaFy(double distanciaFy) {
        this.distanciaFy = distanciaFy;
    }

    public void setDistanciaFx(double distanciaFx) {
        this.distanciaFx = distanciaFx;
    }

    public void setAlturaMaxima(double alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public void calVelocidadIx() {
        double aux = Math.toRadians(anguloLanzamiento);
        this.velocidadIx = velocidadI * Math.cos(aux);
    }

    public void calVelocidadIy() {
        double aux = Math.toRadians(anguloLanzamiento);
        this.velocidadIy = velocidadI * Math.sin(aux);
    }

    public void calDistanciaFx() {
        double aux = Math.toRadians(anguloLanzamiento);
        this.distanciaFx = ((double) Math.pow(velocidadI, 2) * Math.sin(aux)) / -gravedad;
    }

    public void calDistanciaFy() {
        double aux = Math.toRadians(anguloLanzamiento);
        this.distanciaFx = velocidadI * Math.sin(aux) * tiempo - 0.5 * gravedad * (double) Math.pow(tiempo, 2);
    }

    public void calVelocidadFy() {
        this.velocidadFy = velocidadIy + (gravedad * tiempo);
    }

    public void calVelocidadFx() {
        this.velocidadFx = velocidadIx;
    }

    public void calAlturaMax() {
        double aux = Math.toRadians(anguloLanzamiento);
        aux = Math.sin(aux);
        this.alturaMaxima = ((double) Math.pow(velocidadI, 2) * (double) Math.pow(aux, 2))
                / (2 * -gravedad);
    }

    public void calVelocidadF() {
        this.velocidadF = (double) Math.sqrt((double) Math.pow(velocidadFx, 2) + 
                (double) Math.pow(velocidadFy, 2));
    }

    public void calTiempoVX() {
        this.tiempo = distanciaFx / velocidadIx;
    }

    /**
     *
     */
    public void calTiempoFG() {
        this.tiempo = (-(velocidadIy) + (double) Math.sqrt((double) Math.pow(velocidadIy, 2) 
                - (4 * (0.5 * gravedad) * velocidadFy))) / (2 * (0.5 * gravedad));
        if (tiempo < 0) {
            this.tiempo = (-(velocidadIy) - (double) Math.sqrt((double) Math.pow(velocidadIy, 2) 
                    - (4 * (0.5 * gravedad) * velocidadFy))) / (2 * (0.5 * gravedad));
        }
    }

    @Override
    public String respuesta() {
        return String.format("%s \nTiempo: %.2f \nVelocidad Inicial: %.2f \nVelocidad inicial en X y Y: (%.2f) (%.2f) "
                + "\nVelocidad Final: %.2f \nAngulo: %.2f \nDistancia final en X y Y: (%.2f) (%.2f) "
                + "\nAtura Maxima: %.2f", super.respuesta(), tiempo, velocidadI, velocidadIx, velocidadIy, 
                velocidadF, anguloLanzamiento, distanciaFx, distanciaFy, alturaMaxima);
    }
}

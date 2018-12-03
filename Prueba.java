package proyecto;

import java.util.Scanner;

/**
 *
 * @author seckond
 */
class Prueba {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int casos = 0, aceleracionProyectiles = 0;
        AceleracionConstante problema1 = new AceleracionConstante();
        LanzamientoProyectil problema2 = new LanzamientoProyectil();
        problema2.setGravedad();
        System.out.println("desea resolver problemas de Aceleracion constante(1) "
                + "o de Lanzamiento de Proyectiles(2)");
        aceleracionProyectiles = teclado.nextInt();
        System.out.println("escriba la descripcion del problema");
        problema1.setDescripcion(teclado.next());
        if (aceleracionProyectiles == 1) {
            do {
                System.out.println("Que datos le faltan (dos maximo) \naceleracion(1) "
                        + "\nvelocidad inicial(2) \nvelocidad final(3) \ntiempo(4) \ndistancia(5) "
                        + "\nDado el caso que sean dos los datos faltantes escriba los numeros "
                        + "juntos priorizando el de menor cantidad primero por ejemplo: "
                        + "\nMe falta distancia y velociadad inicial(25):");
                casos = teclado.nextInt();
                if (casos == 1) {
                    casos += 11;
                } else if (casos > 1 && casos < 6) {
                    casos += 10;
                }
            } while (casos < 12 || casos > 45 || casos > 15 && casos < 23 || 
                    casos > 25 && casos < 34 || casos > 35 && casos < 45);
            System.out.println("escriba los datos que se le pide:");
            switch (casos) {
                case 12:
                    System.out.println("velocidad final:");
                    problema1.setVelocidadF(teclado.nextDouble());
                    System.out.println("tiempo:");
                    problema1.setTiempo(teclado.nextDouble());
                    System.out.println("distancia");
                    problema1.setDistancia(teclado.nextDouble());
                    problema1.calcularAceleracionVI();
                    problema1.calcularVelocidadID();
                    break;
                case 13:
                    System.out.println("velocidad inicial");
                    problema1.setVelocidadI(teclado.nextDouble());
                    System.out.println("tiempo:");
                    problema1.setTiempo(teclado.nextDouble());
                    System.out.println("distancia");
                    problema1.setDistancia(teclado.nextDouble());
                    problema1.calcularAceleracionVF();
                    problema1.calcularVelocidadFD();
                    break;
                case 14:
                    System.out.println("velocidad inicial");
                    problema1.setVelocidadI(teclado.nextDouble());
                    System.out.println("velocidad final:");
                    problema1.setVelocidadF(teclado.nextDouble());
                    System.out.println("distancia");
                    problema1.setDistancia(teclado.nextDouble());
                    problema1.calcularAceleracionT();
                    problema1.calcularTiempoD();
                    break;
                case 15:
                    System.out.println("velocidad inicial");
                    problema1.setVelocidadI(teclado.nextDouble());
                    System.out.println("velocidad final:");
                    problema1.setVelocidadF(teclado.nextDouble());
                    System.out.println("tiempo:");
                    problema1.setTiempo(teclado.nextDouble());
                    problema1.calcularAceleracionD();
                    problema1.calcularDistaciaA();
                    break;
                case 23:
                    System.out.println("aceleracion");
                    problema1.setAceleracion(teclado.nextDouble());
                    System.out.println("tiempo:");
                    problema1.setTiempo(teclado.nextDouble());
                    System.out.println("distancia");
                    problema1.setDistancia(teclado.nextDouble());
                    problema1.calcularVelocidadIVF();
                    problema1.calcularVelocidadFD();
                    break;
                case 24:
                    System.out.println("aceleracion");
                    problema1.setAceleracion(teclado.nextDouble());
                    System.out.println("velocidad final:");
                    problema1.setVelocidadF(teclado.nextDouble());
                    System.out.println("distancia");
                    problema1.setDistancia(teclado.nextDouble());
                    problema1.calcularVelocidadIT();
                    problema1.calcularTiempoD();
                    break;
                case 25:
                    System.out.println("aceleracion");
                    problema1.setAceleracion(teclado.nextDouble());
                    System.out.println("velocidad final:");
                    problema1.setVelocidadF(teclado.nextDouble());
                    System.out.println("tiempo:");
                    problema1.setTiempo(teclado.nextDouble());
                    problema1.calcularVelocidadID();
                    problema1.calcularDistaciaA();
                    break;
                case 34:
                    System.out.println("aceleracion");
                    problema1.setAceleracion(teclado.nextDouble());
                    System.out.println("velocidad inicial");
                    problema1.setVelocidadI(teclado.nextDouble());
                    System.out.println("distancia");
                    problema1.setDistancia(teclado.nextDouble());
                    problema1.calcularVelocidadFT();
                    problema1.calcularTiempoA();
                    break;
                case 35:
                    System.out.println("aceleracion");
                    problema1.setAceleracion(teclado.nextDouble());
                    System.out.println("velocidad inicial");
                    problema1.setVelocidadI(teclado.nextDouble());
                    System.out.println("tiempo:");
                    problema1.setTiempo(teclado.nextDouble());
                    problema1.calcularVelocidadFD();
                    problema1.calcularDistaciaA();
                    break;
                case 45:
                    System.out.println("aceleracion");
                    problema1.setAceleracion(teclado.nextDouble());
                    System.out.println("velocidad inicial");
                    problema1.setVelocidadI(teclado.nextDouble());
                    System.out.println("velocidad final:");
                    problema1.setVelocidadF(teclado.nextDouble());
                    problema1.calcularTiempoD();
                    problema1.calcularDistaciaA();
                    break;
            }
            System.out.println("\nAceleracion Constante\n==================\n" + problema1.respuesta());
        } while(aceleracionProyectiles == 2) {
            System.out.println("que desea encontrar? \nVelocidad inicial en X y Y(1) "
                    + "\nvelocidad final en X y Y(2) \nCalcular velocidad Final(3) "
                    + "\nCalcular disctancia final de Y(4) \n"
                    + "Calcular distancia final de X(5) \nCalcular altura maxima(6) "
                    + "\ncalcular tiempo en base al eje X(7) \nCalcular el tiempo en base al eje Y(8)");
            casos = teclado.nextInt();
            System.out.println("introdusca el dato que se pide");
            switch (casos) {
                case 1:
                    System.out.println("angulo");
                    problema2.setAnguloLanzamiento(teclado.nextDouble());
                    System.out.println("velocidad inicial");
                    problema2.setVelocidadI(teclado.nextDouble());
                    problema2.calVelocidadIx();
                    problema2.calVelocidadIy();
                    break;
                case 2:
                    System.out.println("angulo");
                    problema2.setAnguloLanzamiento(teclado.nextDouble());
                    System.out.println("velocidad inicial");
                    problema2.setVelocidadI(teclado.nextDouble());
                    problema2.calDistanciaFx();
                    break;
                case 3:
                    System.out.println("velocidad inicial");
                    problema2.setVelocidadI(teclado.nextDouble());
                    System.out.println("angulo");
                    problema2.setAnguloLanzamiento(teclado.nextDouble());
                    System.out.println("tiempo");
                    problema2.setTiempo(teclado.nextDouble());
                    problema2.calDistanciaFy();
                    break;
                case 4:
                    System.out.println("velocidad inicial en y");
                    problema2.setVelocidadIy(teclado.nextDouble());
                    System.out.println("tiempo");
                    problema2.setTiempo(teclado.nextDouble());
                    problema2.calVelocidadFy();
                    System.out.println("velocidad inicial en x");
                    problema2.setVelocidadIx(teclado.nextDouble());
                    problema2.calVelocidadFy();
                    problema2.calVelocidadFx();
                    break;
                case 5:
                    System.out.println("angulo");
                    problema2.setAnguloLanzamiento(teclado.nextDouble());
                    System.out.println("velocidad inicial");
                    problema2.setVelocidadI(teclado.nextDouble());
                    problema2.calAlturaMax();
                    break;
                case 6:
                    System.out.println("velocidad final en x");
                    problema2.setVelocidadFx(teclado.nextDouble());
                    System.out.println("velocidad final en y");
                    problema2.setVelocidadFy(teclado.nextDouble());
                    problema2.calVelocidadF();
                    break;
                case 7:
                    System.out.println("distancia");
                    problema2.setDistanciaF(teclado.nextDouble());
                    System.out.println("velocidad inicial en x");
                    problema2.setVelocidadIx(teclado.nextDouble());
                    problema2.calTiempoVX();
                    break;
                case 8:
                   System.out.println("velocidad inicial en y");
                    problema2.setVelocidadIy(teclado.nextDouble()); 
                    System.out.println("velocidad final en y");
                    problema2.setVelocidadFy(teclado.nextDouble());
                    problema2.calTiempoFG();
                    break;
            }
            System.out.println("\nLanzamiento de proyectiles\n==================\n" + problema1.respuesta());
            System.out.println("desea calcular otro dato? no(1) si(2)");
            aceleracionProyectiles=teclado.nextInt();
        }
    }
}

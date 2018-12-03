package proyecto;

/**Problema: resolver problemas de fisica en dos temas especificos que son
 * aceleracion constante y lanzamiento de proyectiles
 * @author seckond
 */
public class ProblemasFisica {

    public String descripcion;

    public ProblemasFisica() {
    }

    public ProblemasFisica(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/**
 * creamos polimorfismo de un metodo que los usan todas las subclases
 * @return 
 */
    public String respuesta() {
        return String.format("Problema: %s \n", descripcion);
    }
}

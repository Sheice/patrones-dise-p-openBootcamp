package patronesDeDiseño;

import Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
/*
* patrones creacionales: crean una instancia o un objeto mas simple
*
* - Singleton: solo crea una instancia compartida de una clase, poniendo en privado el constructor
* y cada ves que quieras instanciar se usa un metodo. Se usa para compartir conexiones a base de datos.
*
* - Factory: crea jerarquia de clase y se usa de forma transparente; creamos una clase factory
* ocultando el constructor sin parametro, instanciamos una clase padre para usar a sus hijos,
* dependiendo el parámetro que nos pase en el constructor. Se usa por ejemplo para ver el precio de algo
* dependiendo el país.
*
* - Builder: cre objetos mas complejos paso a paso, estilo vector con .function();, haces una clase builder
* creas una variale de una clase padre y un metodo uilder que returna dicha variable, luego creas setters
* modificando la clase padre y retornas un this.
*
*- Protoype: es para clonarse a si mismo, este hereda su clon y sus estados.
* haces un método clon, instancias el clon y haces los setters adentro del método y returnas el clon
*  o usas la clase Cloneable. Ejemplo tienes muchos autos con las mismas propiedades pero tiene puertas diferentes
*
* patrones estructurales:
*
* - decorador: añade funcionalidad a una clase existente sin modificar dicha clase.
* por ejemplo notificaciones en diferentes plataformas.
*
* - Adapter: crea una clase que permite que clases con su implementación y sin su implementación
* funcionen choerentemente.
* por ejemplo en una lireria vieja de tercero se implementa un adapter.
*
* - Facade: envoltorio que simplifica algo que es complejo por detras.
* cuando tienes muchas clases, crea un facade que lo hace mas sencillo.
*
* */

    }
}
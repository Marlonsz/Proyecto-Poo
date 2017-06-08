import Vehículos.Automovil;

import java.util.ArrayList;


/**
 * Created by piero512 on 02/06/17.
 */
public class ProyectoPoo {
    public static void main(String[] args) {
        //TODO: Terminar el main.
        Patio p_automotor = new Patio(15);
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("automovil");
        tipos.add("camiones");
        tipos.add("camionetas");
        tipos.add("otros");
        boolean menuPrincipal = true;
        while (menuPrincipal) {
            int respuesta = UI.imprimirMenuPrincipal();
            switch (respuesta) {
                case 1:
                    UI.imprimirMenuIngresoVehicular();
                    String tipo = UI.ingresarTipoVehiculo(tipos);
                    switch (tipo) {
                        case "automovil":
                            ArrayList<Object> datos_comunes = UI.ingresoDatos();
                            Automovil vh = UI.imprimirMenuIngresoAutomovil(datos_comunes);
                            // Preguntar si quiere ingresar otro carro, sino regresa a menu principal.
                            break;
                        case "camionetas":
                            // Terminar el menu de camionetas
                            break;
                        case "otros":
                            // Terminar el menu para otros vehiculos
                            break;
                        default:
                            // Asi vemos si las validaciones sirven.
                            throw new IllegalArgumentException();
                    }
                    break;
                case 2:
                    // TODO: Añadir el ingreso de clientes
                    break;
                case 3:
                    // TODO: Añadir el ingreso de vendedores
                    break;
                case 4:
                    // TODO: Añadir la salida de autos del patio
                    break;
                case 5:
                    System.out.println("Gracias por confiar en nuestro sistema!");
                    menuPrincipal = false;
                default:
                    // En el imposible caso de que salga un número diferente (que ya validamos) sabremos porqué.
                    throw new IllegalArgumentException();
            }

        }
    }
}

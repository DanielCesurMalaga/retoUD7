import vehiculo.Asientos;
import vehiculo.Autobus;
import vehiculo.Particular;
import vehiculo.Taxi;
import vehiculo.Vehiculo;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("total de vehículos funcionando INICIALMENTE: " +Vehiculo.getCantidadVehículosFuncionando());

        Taxi taxi1 = new Taxi("Seat", "Ibiza", "0123456789abcdef@", 5, Asientos.RECLINABLES, 256000, 5.6);
        Taxi taxi2 = new Taxi("Seat", "Leon", "0123456789abcdef€", 3, Asientos.CALEFACCION, 1000, 7.2);
        System.out.println("total de vehículos funcionando con los dos TAXIS: " +taxi1.getCantidadVehículosFuncionando());

        Particular particular1 = new Particular("Seat", "Ibiza", "0123456789abcdef?", 5, Asientos.RECLINABLES, "Daniel",
                true);
        Particular particular2 = new Particular("Seat", "Ibiza", "0123456789abcdef¿", 3, Asientos.RECLINABLES, "Daniel",
                false);

        Autobus autobus = new Autobus("Iveco", "JXY", "0123456789abcdef#", 3, 60, 26);

        System.out.println(taxi1.toString());
        System.out.println(taxi2);

        System.out.println(particular1.toString());
        System.out.println(particular2);

        System.out.println(autobus);

        System.out.println("total de vehículos funcionando: " +Vehiculo.getCantidadVehículosFuncionando());

        taxi1.reiniciarContador(25000);

        System.out.println("El coste de trayecto del taxi con bastidor: "+ taxi1.getBastidor()+
        "es de: "+taxi1.calcularCosteTrayecto());

        System.out.println(taxi1.toString());


    }
}

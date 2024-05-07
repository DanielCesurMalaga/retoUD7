package vehiculo;

public class Taxi extends Turismo implements Calculable, Iniciable, Comparable {
   // attibutes
   private static final double IMPORTE_INICIO = 2;
   private double kmRecorridos;
   private double importeKm;

   public Taxi(String marca, String modelo, String bastidor, int puertas, Asientos tipoAsiento,
         double kmRecorridos, double importeKm) {

      super(marca, modelo, bastidor, puertas, tipoAsiento);

      this.kmRecorridos = kmRecorridos;
      this.importeKm = importeKm;
   }

   public static double getImporteInicio() {
      return IMPORTE_INICIO;
   }

   public double getKmRecorridos() {
      return kmRecorridos;
   }

   public void setKmRecorridos(double kmRecorridos) {
      this.kmRecorridos = kmRecorridos;
   }

   public double getImporteKm() {
      return importeKm;
   }

   public void setImporteKm(double importeKm) {
      this.importeKm = importeKm;
   }

   @Override
   public String toString() {
      return super.toString()+
      "; Importe inicio:"+ IMPORTE_INICIO +
      "; Importe Km:"+this.importeKm +
      "; KmRecorridos:"+this.kmRecorridos+
      "; Coste del trayecto:"+ this.calcularCosteTrayecto();
   }

   @Override
   public double calcularCosteTrayecto() {
      return (IMPORTE_INICIO+(this.kmRecorridos*this.importeKm));
   }

   @Override
   public void reiniciarContador(double kilometros) {
      this.kmRecorridos=kilometros;
      System.out.println("El Taxi tiene acumulados un total de "+this.kmRecorridos+" km");     
   }

   @Override
   public double calcularPrecioAlquiler(int numDias) {    
      return (50*numDias);
   }

   @Override
   public int getMaxVelocidad() {
      
      return 200;
   }

   @Override
   public int compareTo(Object o) {
      if (this.importeKm > ((Taxi) o).importeKm){
         return 1;
      } else if (this.importeKm == ((Taxi) o).importeKm){
         return 0;
      } else {
         return -1;
      }
   }
   
}

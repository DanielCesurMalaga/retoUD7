package vehiculo;

public class Particular extends Turismo implements Iniciable, Comparable {
   private String propietario;
   private boolean conAireAcondicionado;

   public Particular(String marca, String modelo, String bastidor, int puertas, Asientos tipoAsiento,
         String propietario, boolean conAireAcondicionado) {
      super(marca, modelo, bastidor, puertas, tipoAsiento);
      this.propietario = propietario;
      this.conAireAcondicionado = conAireAcondicionado;
   }

   public String getPropietario() {
      return propietario;
   }

   public void setPropietario(String propietario) {
      this.propietario = propietario;
   }

   public boolean isConAireAcondicionado() {
      return conAireAcondicionado;
   }

   public void setConAireAcondicionado(boolean conAireAcondicionado) {
      this.conAireAcondicionado = conAireAcondicionado;
   }

   @Override
   public String toString() {
      return super.toString() +
            "; Propietario: " + this.propietario +
            "; Aire acondicionado: " + this.conAireAcondicionado;
   }

   @Override
   public double calcularPrecioAlquiler(int numDias) {
      return (30 * numDias);
   }

   @Override
   public int getMaxVelocidad() {
      return 220;
   }

   @Override
   public void reiniciarContador(double kilometros) {
      System.out.println("El Particular tiene acumulados un total de " + kilometros + " km");
   }

   @Override
   public int compareTo(Object o) {
      if (o.getClass() == Particular.class) {
         if (this.conAireAcondicionado && !((Particular) o).isConAireAcondicionado()) {
            return 1;
         } else if (this.conAireAcondicionado && ((Particular) o).isConAireAcondicionado()) {
            return 0;
         } else {
            return -1;
         }
      } else {
         if (o instanceof Turismo) {
            return super.compareTo(o);
         } else {
            return 1;
         }
      }
   }
}

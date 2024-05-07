package vehiculo;

public class Particular extends Turismo implements Iniciable {
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
      return (30*numDias);
   }

   @Override
   public int getMaxVelocidad() {
      return 220;
   }

   @Override
   public void reiniciarContador(double kilometros) {
      System.out.println("El Particular tiene acumulados un total de "+ kilometros +" km");      
   }

}

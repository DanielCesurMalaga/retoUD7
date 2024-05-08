package vehiculo;

public abstract class Turismo extends Vehiculo implements Comparable {
   private Asientos tiposAsiento;

   public Turismo(String marca, String modelo, String bastidor, int puertas, Asientos tipoAsiento) {
      super(marca, modelo, bastidor, puertas);
      this.tiposAsiento = tipoAsiento;
   }

   public Asientos getTiposAsiento() {
      return tiposAsiento;
   }

   public void setTiposAsiento(Asientos tiposAsiento) {
      this.tiposAsiento = tiposAsiento;
   }

   @Override
   public String toString() {
      return super.toString() + "; TipoAsiento:" + tiposAsiento;
   }

   @Override
   public int compareTo(Object o) {
      if (o instanceof Turismo) {
         if ((this.getTiposAsiento() == Asientos.CALEFACCION)
               && (((Turismo) o).getTiposAsiento() != Asientos.CALEFACCION)) {
            return 1;
         } else if ((this.getTiposAsiento() == Asientos.CUERO)
               && (((Turismo) o).getTiposAsiento() == Asientos.CALEFACCION)) {
            return -1;
         } else if ((this.getTiposAsiento() == Asientos.CUERO)
               && (((Turismo) o).getTiposAsiento() != Asientos.RECLINABLES)) {
            return 1;
         } else if ((this.getTiposAsiento() == Asientos.RECLINABLES)
               && (((Turismo) o).getTiposAsiento() != Asientos.RECLINABLES)) {
            return -1;
         } else {
            return 0;
         }

      } else return super.compareTo(o);
   }

   public abstract double calcularPrecioAlquiler(int numDias);

   public abstract int getMaxVelocidad();

}

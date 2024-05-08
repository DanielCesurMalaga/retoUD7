package vehiculo;

public abstract class Vehiculo implements Comparable {
   // attributes
   private String marca;
   private String modelo;
   private String bastidor;
   private int puertas;
   private static int CantidadVehículosFuncionando = 0;

   // constructor
   public Vehiculo(String marca, String modelo, String bastidor, int puertas) {
      this.marca = marca;
      this.modelo = modelo;
      if (bastidor.length() == 17) {
         this.bastidor = bastidor;
      } else {
         this.bastidor = null;
      }
      this.puertas = puertas;
      CantidadVehículosFuncionando++;
   }

   // getters and setters
   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getModelo() {
      return modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public String getBastidor() {
      return bastidor;
   }

   public void setBastidor(String bastidor) {
      if (bastidor.length() == 17) {
         this.bastidor = bastidor;
      }
   }

   public int getPuertas() {
      return puertas;
   }

   public void setPuertas(int puertas) {
      this.puertas = puertas;
   }

   public static int getCantidadVehículosFuncionando() {
      return CantidadVehículosFuncionando;
   }

   @Override
   public String toString() {
      return "Marca:" + marca + "; Modelo:" + modelo + "; NBastidor:" + bastidor + "; NPuertas:" + puertas;
   }

   @Override
   public int compareTo(Object o) {
      if (o instanceof Vehiculo) {
         return ( this.getBastidor().compareTo(((Vehiculo) o).getBastidor()) );
      } else return 1;

   }
}

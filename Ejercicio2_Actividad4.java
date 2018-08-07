import java.util.Scanner;

public class Ejercicio2_Actividad4
{
 public static void main(String[] args) {
   
  Scanner entrada = new Scanner (System.in);
 
  double peso_por_carga;
  double Capacidad_camion;
  double galonesxKl;
  double N_Viajes;
  double Cantidad_gasolina;
  double Recorrido;
     
  System.out.println("Calcula el número de viajes y la cantidad de gasolina en la ruta Bogotá-Sasaima que consta de 80.2 Km");
  System.out.println("Cuanto pesa la carga?");
  peso_por_carga = entrada.nextDouble();
  System.out.println("cual es la capacidad del camion?");
  Capacidad_camion = entrada.nextDouble();
  System.out.println("Cuanta gasolina consume el camion por Km");
  galonesxKl = entrada.nextDouble();
  
  
  N_Viajes = Math.ceil(peso_por_carga/Capacidad_camion);
  Recorrido = 160.4*N_Viajes;
  Cantidad_gasolina = (160.4*N_Viajes)*galonesxKl;
  System.out.println("El camión para transportar la carga de "+ peso_por_carga +" kg");
  System.out.println("Necesita "+ N_Viajes +" viaje ida y vuelta");
  System.out.println("La distacia que recorrera son " + Recorrido + " km"); 
  System.out.println("Y el consumo es de "+ Cantidad_gasolina +" galones.");   
    }
}

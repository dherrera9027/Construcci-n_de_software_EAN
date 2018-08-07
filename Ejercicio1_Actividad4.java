import java.util.Scanner;

public class Ejercicio1_Actividad4
{
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
 
  double inferior;
  double superior;
  double lateral;
  double area;
  double volumen;
  double altura;
  double ap;
  double inferiormenossuperior;
  double areainferior;
  double areasuperior;
   
  System.out.println("Calcula el área y el volumen del tronco de pirámide en (cm).");
  System.out.println("Recuerde que la dimensión del cuadrado inferior debe ser mayor a la del cuadrado inferiror");
 
  boolean correcto = false;

    do{
        System.out.println("Dimensión cuadrado inferior: ");
        inferior = entrada.nextDouble();
        System.out.println("Dimensión cuadrado superior: ");
        superior = entrada.nextDouble();
        System.out.println("Escriba la dimensión de la lateral");
        lateral= entrada.nextDouble();
        
        
    if (inferior>superior) {
            correcto=true;
            inferiormenossuperior = Math.pow((inferior/2)-(superior/2),2);
            areainferior = Math.pow(inferior,2);
            areasuperior = Math.pow(superior,2);
            ap = Math.sqrt(Math.pow(lateral,2)-inferiormenossuperior);
            altura = Math.sqrt(Math.pow(ap,2)-inferiormenossuperior);
            area = areainferior+areasuperior+(ap*(((inferior*4)+(superior*4))/2));
            volumen = (altura/3)*(areainferior+areasuperior+(Math.sqrt(areainferior*areasuperior)));
     System.out.println("El área del tronco de pirámide es " + area +" cm cuadrados"); 
     System.out.println("El volumen es " + volumen +" cm cubicos");
    }

    }while(correcto==false);
 }
}

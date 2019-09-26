package ejemplo1;

// Calcula cuántos primos hay hasta 10.000.000 y muestra el tiempo que tarda en calcularlo
import java.util.*;
public class CuantosPrimos1 {
    public static void main(String[] x){
           long t0 = (new Date()).getTime(); //t0=instante de inicio de los cálculos
           Primos p1 = new Primos(1,2000000);
           Primos p2 = new Primos(2000001,4000000);
           Primos p3 = new Primos(4000001,6000000);
           Primos p4 = new Primos(6000001,8000000);
           Primos p5 = new Primos(8000001,10000000);
           p1.calcular();
            long tp1 = (new Date()).getTime(); //
           p2.calcular();
             long tp2 = (new Date()).getTime(); //
           p3.calcular();
           long tp3 = (new Date()).getTime(); //
           p4.calcular();
           long tp4 = (new Date()).getTime(); //
           p5.calcular();
           long tp5 = (new Date()).getTime(); //
           int n = p1.cuantos() + p2.cuantos() + p3.cuantos() + p4.cuantos() + p5.cuantos();
           long t1 = (new Date()).getTime(); //t1=instante de final de los cálculos
     
           System.out.println("Número de primos menores que 10.000.000: "+ n +" calculado en "+ (t1-t0) +" miliseg.");
           System.out.println("Número de primos menores que 2000000: "+ n +" calculado en "+ (tp1-t0) +" miliseg.");
           System.out.println("Número de primos menores que 4000000:  calculado en "+ (tp2-t0) +" miliseg.");
                 System.out.println("Número de primos menores que 6000000: calculado en "+ (tp3-t0) +" miliseg.");
           System.out.println("Número de primos menores que 8000000:  calculado en "+ (tp4-t0) +" miliseg.");
           System.out.println("Número de primos menores que 10000000: calculado en "+ (tp5-t0) +" miliseg.");
      //      System.out.println("La suma de los tiempos es: "+ ((tp1-t0)+(tp2-t0)+(tp3-t0)+(tp4-t0)+(tp5-t0)) +" miliseg."+"y el tp es: "+(t1-t0));
    }
}

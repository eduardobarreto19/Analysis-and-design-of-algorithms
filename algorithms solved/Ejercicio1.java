package ejemplo1;
import java.util.Scanner;


public class Ejercicio1 {

	public static void main(String[] args) {

		   
        Scanner lectura = new Scanner(System.in);
        final int segundos=lectura.nextInt();
        
        //SOLUCION 1
        int horas= (segundos/3600);
        int minutos= ((segundos-horas*3600)/60);
        int seg= segundos-(horas*3600+minutos*60);
        
        System.out.println(horas+":"+minutos+":"+seg);

         //solucion 2
        //System.out.printf("%d:%d:%d\n" , segundos/3600 , (segundos-(segundos/3600)*3600)/60, segundos%60);

	}

}





  
   
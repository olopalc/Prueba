import java.util.Scanner;
import java.util.teclado;
import java.util.InputMismatchException;


public class ejercicio45{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int usuario=0, n=0;
        boolean valido=false;
        do{
            try{
                System.out.println("Introduzca un número para ver su tabla de multiplicar");
                usuario=teclado.nextInt();
                valido=true;
            }
            catch(InputMismatchException ex){
                System.out.println("Error, número entero no válido");
                usuario=teclado.nextInt();
            }
        }
        while(!valido || usuario==0 || usuario>12);
        
        for(n=1;n<=10;n++){
            System.out.println(usuario +" * "+ n +" = "+ usuario*n);
        }

    }
}
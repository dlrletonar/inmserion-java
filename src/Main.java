import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la Semana Tech de Alura.");
        System.out.println(".......................................");

        String pelicula = "Matrix";
        int fechaLanzamiento = 1999;
        double puntuacionPelicula = 0;
        boolean incluidoPlanBasico = true;
        String sinopsis = """
                El programador informático Thomas Anderson, más conocido en el mundo de los
                \"hacker\" como Neo, está en el punto de mira del temible agente Smith. Otros 
                dos piratas informáticos, Trinity y Morfeo, se ponen en contacto con Neo para 
                ayudarlo a escapar. Matrix te posee. Sigue al conejo blanco.""";

        System.out.println("pelicula = " + pelicula);
        System.out.println("Año de lanzamiento = " + fechaLanzamiento);
        System.out.println("Plan Básico = " + incluidoPlanBasico);
        System.out.println("sinopsis = " + sinopsis);

        if(fechaLanzamiento <= 2023){
            System.out.println("pelicula retro, vale la pena verla.");
        }else{
            System.out.println("pelicula actual popular.");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la puntuación a la pelicula: ");
            double notaPelicula = teclado.nextDouble();
            puntuacionPelicula = puntuacionPelicula + notaPelicula;
        }
        System.out.println("Puntuacion de la Pelicula = " + pelicula +" "+
                puntuacionPelicula/3);
    }

}

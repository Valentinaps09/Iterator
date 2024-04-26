package co.edu.uniquindio.poo;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<String> listOfStrings = List.of("oslo", "madam", "car", "deed", "wow", "test");
        PalindromeIterator palindromeIterator = new PalindromeIterator(listOfStrings);
        int count = 0;
        while(palindromeIterator.hasNext()) {
            palindromeIterator.next();
            count++;
        }
        System.out.println("Número de palíndromos: " + count);

        // Ejemplo de uso de CustomMovieIterator
        List<Movie> movies = List.of(
            new Movie("The Shawshank Redemption", "Frank Darabont", 9.3f),
            new Movie("The Godfather", "Francis Ford Coppola", 9.2f),
            new Movie("The Dark Knight", "Christopher Nolan", 9.0f),
            new Movie("Pulp Fiction", "Quentin Tarantino", 8.9f),
            new Movie("The Lord of the Rings: The Return of the King", "Peter Jackson", 8.9f)
        );
        CustomMovieIterator movieIterator = new CustomMovieIterator(movies);
        count = 0;
        while (movieIterator.hasNext()) {
            movieIterator.next();
            count++;
        }
        System.out.println("Número de películas con una calificación de 8 o superior: " + count);
    }
}

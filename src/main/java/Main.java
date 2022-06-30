import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        // HashSet<String> cars = new HashSet<>();
        // cars.add("Volvo");
        // cars.add("Ford");
        // System.out.println(cars);

        // Create a Set for Movie Genre List 
        HashMap<String, String> lookUp = new HashMap<>();
        HashSet<String> genre = new HashSet<>();
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Title of book? ");
            String bookName = obj.nextLine();
            System.out.println("Genre of book? ");
            String bookGenre = obj.next();
            genre.add(bookGenre);
            lookUp.put(bookGenre,bookName);

            // Check to see books by Genre 
            System.out.println("Do you want to search for books by genre? ");
            String answer = obj.next();
            if(answer.equalsIgnoreCase("yes")) {
                System.out.print("Type in Genre name. ");
                String genreType = obj.next();
                if(bookGenre.contains(genreType)) {
                    String response = lookUp.get(bookGenre);
                    System.out.print("Books found! " + response);
                }
            }
        }
        catch(Exception e) {
            System.out.print("Something went wrong");
        }


}
}
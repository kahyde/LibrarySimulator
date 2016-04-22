package librarysimulator;

import java.util.ArrayList;

/**
 * @author kelseyhyde
 */
public class LibrarySimulator extends Thread{

    public static void main(String[] args) throws InterruptedException {
        ArrayList<SortableBook> library = new ArrayList<>();
        ArrayList<Integer> newDeweys = new ArrayList<>();
        
        SortableBook book1 = new SortableBook("Chinese", "Words", "2013", "Letters", 20.34, 700);
        SortableBook book2 = new SortableBook("Plants", "Nature", "200BC", "Earth", 40.50, 200);
        SortableBook book3 = new SortableBook("Computers", "Robot", "2100", "World Domination", 500.99, 355);
        
        System.out.println("The main thread is sorting the books");
        book1.sort();
        book2.sort();
        book3.sort();
        
        library.add(book1);
        library.add(book2);
        library.add(book3);
        
        System.out.println("The books have been sorted incorrectly! And customers are coming! Assistant to the rescue!");
        System.out.println();
        
        Customer customer = new Customer(library, 1);
        Customer customer2 = new Customer(library, 2);
        Assistant assistant = new Assistant(library, newDeweys);

        newDeweys.add(410);
        newDeweys.add(580);
        newDeweys.add(005);
        
        customer.start();
        assistant.start();
        customer2.start();
        

    }
    
}

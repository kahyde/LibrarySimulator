package librarysimulator;

import java.util.ArrayList;

/**
 * @author kelseyhyde
 */
public class Customer extends Thread {
    private ArrayList<SortableBook> library;
    private int id;
    
    public Customer(ArrayList<SortableBook> library, int id){
        this.library = library;
        this.id = id;
    }
    
    @Override
    public void run(){
        
        for (SortableBook book : library) {
            synchronized (book) {
                System.out.println("Customer " + id + " now reading dewey for book: " + book.getTitle());
                System.out.println("Customer " + id + ": Dewey for book " + book.getTitle() + " is: " + book.getDeweyDecimal());
            }
        }
    }
}

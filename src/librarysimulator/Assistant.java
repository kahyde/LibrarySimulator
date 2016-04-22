package librarysimulator;

import java.util.ArrayList;

/**
 * @author kelseyhyde
 */
public class Assistant extends Thread {
    ArrayList<SortableBook> library;
    ArrayList<Integer> newDeweys;
    
    public Assistant(ArrayList<SortableBook> library, ArrayList<Integer> newDeweys){
        this.library = library;
        this.newDeweys = newDeweys;
    }
    
    public void run(){
        for (int i = 0; i < library.size(); i++) {
            SortableBook book = library.get(i);
            synchronized (book) {
            System.out.println("Assistant setting dewey and resorting for book: " + book.getTitle());
            book.setDeweyDecimal(newDeweys.get(i));
            book.reSort();
            System.out.println("Assistant finished sorting book: " + book.getTitle() + ". Dewey is now: " + book.getDeweyDecimal());
            }
        }
        
    }
}

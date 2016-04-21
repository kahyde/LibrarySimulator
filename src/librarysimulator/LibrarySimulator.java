package librarysimulator;

/**
 * @author kelseyhyde
 */
public class LibrarySimulator extends Thread{

    public static void main(String[] args) throws InterruptedException {
        SortableBook book = new SortableBook("hello", "hello", "hello", "hello", 12.34, 300);
        
        ReaderThread r = new ReaderThread(book);
        ReaderThread r2 = new ReaderThread(book);
        WriterThread w = new WriterThread(book, 600);
        
        System.out.println("Main thread has sorting book.");
        book.sort();
        System.out.println("Main thread finished sorting. Dewey is: " + book.getDeweyDecimal() + ", Count is: " + SortableBook.getSortedCount());
        
        r.start();
        w.start();
        r2.start();
        sleep(1000);
        
        System.out.println("Main thread checking dewey. Dewey is: " + book.getDeweyDecimal());
        System.out.println("Main: sorted count is: " + SortableBook.getSortedCount());
    }
    
}

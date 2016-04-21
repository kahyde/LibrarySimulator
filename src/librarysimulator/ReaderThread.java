package librarysimulator;

/**
 * @author kelseyhyde
 */
class ReaderThread extends Thread {
    SortableBook book;
    
    ReaderThread(SortableBook book){
        this.book = book;
    }
    
    @Override
    public void run(){
        synchronized(book){
            System.out.println("ReaderThread now reading dewey");
            System.out.println("Reader: Dewey is: " + book.getDeweyDecimal());
        }
    }
}

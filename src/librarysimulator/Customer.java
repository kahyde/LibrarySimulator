package librarysimulator;

/**
 * @author kelseyhyde
 */
class Customer extends Thread {
    SortableBook book;
    
    Customer(SortableBook book){
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

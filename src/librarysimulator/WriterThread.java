package librarysimulator;

/**
 * @author kelseyhyde
 */
class WriterThread extends Thread {
    SortableBook book;
    int newDewey;
    WriterThread(SortableBook book, int newDewey){
        this.book = book;
        this.newDewey = newDewey;
    }
    
    public void run(){
        synchronized(book){
            System.out.println("WriterThread setting dewey and resorting:");
            book.setDeweyDecimal(newDewey);
            book.sort();
            System.out.println("Writer thread finished sorting. Dewey is now: " + book.getDeweyDecimal());
        }
    }
}

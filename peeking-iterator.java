import java.util.NoSuchElementException;
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    Integer whatsnext, thisisnext;
    boolean noElement;
    
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iterator = iterator;
        moveForward();
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return whatsnext;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if (noElement)
            throw new NoSuchElementException();
        thisisnext = whatsnext;
        moveForward();
        return thisisnext;
	}

	@Override
	public boolean hasNext() {
        return !noElement;
	}
    
    private void moveForward(){
        if(iterator.hasNext()){
            whatsnext = iterator.next();
        } else {
            noElement = true;
        }
    }
}

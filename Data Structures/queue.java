public class queue<T> implements Iterable<T> {

    private java.util.LinkedList<T> list=new java.util.LinkedList<T>();

    public queue(){}

    public queue(T firstElem){
        offer(firstElem);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size()==0;
    }

    public T peek(){
        if (isEmpty()) {
        throw new RuntimeException("Queue Empty");
        }
        return list.peekFirst();
    }

    public T poll(){
        if (isEmpty()) {
            throw new RuntimeException("Queue Empty");
        }
        return list.removeFirst();

    }

    public void offer(T elem){
        list.addLast(elem);
    }

    @Override
    public java.util.Iterator<T> iterator(){
        return list.iterator();
    }
    
}

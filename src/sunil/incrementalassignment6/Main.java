package sunil.incrementalassignment6;

/**
 * @author Sunil Bhagat
 */

/**
 * Link class for creating new objects.
 * @param <E>
 */
class Link <E>{
    E data;
    Link<E> next;
    Link(E data){
        this.data = data;
        this.next = null;
    }
}

/**
 * Slist class for creating a new list.
 * @param <E>
 */
class SList<E>{
    Link <E>  head = new Link<E>(null);
    public String toString(){
        if(head.next==null){
            return "Empty List.";

        }
        SListIterator i = this.iterator();
        String result = "";
        while(i.hasNext()){
            result+=i.next()+" ";
        }
        return result;

    }
    SListIterator<E> iterator() {
        return new SListIterator<E>(head);
    }



}

/**
 * iterator class for iterating the singly linked list.
 * @param <E>
 */
class SListIterator<E> {

    Link<E> current,head;
    SListIterator(Link<E> head) {
        current = head;
        this.head=head;
    }
    //check if there exists a next element.
    public boolean hasNext() {
        return current.next!=null;
    }
    //insert new element at the end of the list.
    public void insert(E data) {
        Link<E> node  = new Link<>(data);
        current.next = node;
        current = current.next;
    }
    //remove the current element from the list and sends the iterator to previous element.
    public void remove() {
        Link<E> temp = head;
        if(temp.next == null){
            System.out.println("List is already Empty.");
            return;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        current = temp;
        System.out.println(temp.next.data + " Deleted");
        temp.next = null;

    }
    //returns the next element in the list.
    public E next(){
        current = current.next;
        return current.data;
    }
}

public class Main {
    public static void main(String[] args){
        SList<Integer> list = new SList<>();
        SListIterator iterator = list.iterator();
        iterator.insert(1);
        iterator.insert(2);
        iterator.insert(3);
        iterator.remove();

        System.out.println(list);
    }
}

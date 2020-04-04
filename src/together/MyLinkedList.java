package together;

public class MyLinkedList<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    public void add(E e) {
        Node node = new Node<>();
        if (this.first==null) {
            node.prev = null;
            node.next = null;
            first = node;
        } else {
            node.prev = last;
            last.next = node;
        }
        //最后都要给节点对象赋值，节点中存放的数据对象和链表尾部，也就是最后一个节点
        node.e = e;
        last = node;
        size++;
    }

    public int length() {
        return size;
    }

    //拿到第一个节点后，循环取下一个节点，一直取到最后一个
    public Object get(int index) {
        Node node = null;
        if(first!=null) {
            node = first;
            for (int i = 0;i<index; i++) {
                  node = node.next;
            }
        }
        return node.e;
    }

    public boolean remove(int index) {
        Node node = getNode(index);
        Node prevnode = node.prev;
        Node nextnode = node.next;
        if(prevnode==null) {
            first = nextnode;
        } else {
            prevnode.next = nextnode;
        }
        if(nextnode==null) {
            last = prevnode;
        } else {
            nextnode.prev = prevnode;
        }
        size--;
        return  true;
    }

    public Node getNode(int index) {
        Node node = null;
        if(first!=null) {
            node = first;
            for (int i = 0;i<index; i++) {
                node = node.next;
            }
        }
        return node;
    }

    //内部类节点类
    private static class Node<E> {
        E e;
        Node<E> prev;
        Node<E> next;
        Node() {

        }
        Node(E e,Node<E> prev,Node<E> next) {
             this.e = e;
             this.prev = prev;
             this.next = next;
        }
    }
}

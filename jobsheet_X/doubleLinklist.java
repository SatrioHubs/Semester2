package jobsheet_X;

public class doubleLinklist {
    Node head;
    int size;

    public doubleLinklist(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }
    void addFirst(int item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else{
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }
    
    void add(int item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai Melebihi Batas");
        } else{
            Node current = head;
            int i =0;
            while (i<index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else{
                Node newNode = new Node(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    int size(){
        return size;
    }

    void clear(){
        head = null;
        size = 0;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data+ "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        } else{
            System.out.println("Link List Kosong");
        }
    }


}





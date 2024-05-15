package jobsheet_9;

public class singleLinkList {
    Node head, tail;

    singleLinkList(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head != null;
    }

    void print(){
        if (isEmpty()) {
            Node temp = head;
            System.out.print("Isi link list : \t");
            while (temp != null) {
                System.out.print(temp.data+ "\t");
                temp = temp.next;
            }
            System.out.println("");
        } else{ 
            System.out.println("Link list Kosong");
        }
    }

    void addFirst(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else{
            head = ndInput;
            tail = ndInput;
        }
    }

    void addLast(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else{
            head = ndInput;
             tail = ndInput;
        }
    }

    void insertAfter(int key,int input){
        Node ndInput = new Node(input, null);
        Node tmp = head;
        do {
            if (tmp.data == key) {
                ndInput.next = tmp.next;
                tmp.next = ndInput;
                if (ndInput.next != null) {
                    tail = ndInput;
                    break;
                }
            }
            tmp = tmp.next;
        } while (tmp == null);
    }

    void insertAtt(int index, int input){
        Node ndInput = new Node();
        if (index < 0) {
            System.out.println("perbaiki logikanya!" + "kalau index nya -1 bagaimana?");
            
        } else if (index == 0) {
            addFirst(input);
        } else{
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            tmp.next = new Node(input, tmp.next);
            if (tmp.next.next == null) {
                tail = tmp.next;
            }
        }
    }

    
}

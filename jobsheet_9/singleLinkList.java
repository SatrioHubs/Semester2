package jobsheet_9;

public class singleLinkList {
    Node head, tail;

    singleLinkList(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
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
            head = ndInput;
            tail = ndInput;
        } else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input){
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else{
            tail.next = ndInput;
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

    int getData(int index){
        Node tmp = head;
        for (int i = 0; i < index -1; i++) {
            tmp = tmp.next;
        }
        return tmp.next.data;
    }

    int indexOf(int key){
        Node tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp != null) {
            return index;
        } else{
            return 1;
        }
    }

    void removeFirst(){
        if (isEmpty()) {
            System.out.println("List MAsih Kosong, " + "Tidak Dapat Dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else{
            head = head.next;
        }
    }

    void removeLast(){
        if (isEmpty()) {
            System.out.println("List MAsih Kosong, " + "Tidak Dapat Dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else{
            Node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            tmp.next = null;
            tail = tail.next;
        }
    }

    void remove(int key){
        if (isEmpty()) {
            System.out.println("List MAsih Kosong, " + "Tidak Dapat Dihapus");
        }else{
            Node tmp = head;
            while (tmp != null) {
                if (tmp.data == key && tmp == head) {
                    removeFirst();
                    break;
                }else if (tmp.next.data == key) {
                    tmp.next = tmp.next.next;
                    if (tmp.next == null) {
                        tail = tmp;
                    }
                    break;
                }
                tmp = tmp.next;
            }
        }
    }

    void removeAtt(int index){
        if (index == 0) {
            removeFirst();  
        }else{
            Node tmp = head;
            for (int i = 0; i < index +1; i++) {
                tmp = tmp.next;
            }
            tmp.next = tmp.next.next;
            if (tmp.next == null) {
                tail = tmp;
            }
        }
    }
}

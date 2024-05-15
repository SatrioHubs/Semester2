package jobsheet_9;

import joobsheet4.pangkat;

public class SLLMain {
    public static void main(String[] args) {
        singleLinkList singLL = new singleLinkList();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAtt(3, 833);
        singLL.print();

        System.out.println("Data pada index ke-1 " + singLL.getData(1));
        System.out.println("Data 3 berada pada index ke- " + singLL.indexOf(760));


        singLL.remove(999);
        singLL.print();
        singLL.removeAtt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();

    }
}

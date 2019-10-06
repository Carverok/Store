package store;

public class BillNode {
    Bill bill;
    BillNode next;

    public BillNode() {
        this.bill = null;
        this.next = null;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public BillNode getNext() {
        return next;
    }

    public void setNext(BillNode next) {
        this.next = next;
    }
}

package store;

public class BillList {
    BillNode billNode;
    
    public BillList() {
        this.billNode = null;
    }
    
    public boolean isEmpty() {
        boolean response = true;
        if (this.billNode != null) {
            response = false;
        }
        
        return response;
    }
    
    public void add(BillNode billNode) {
        if (isEmpty()){
            billNode = billNode;
        } else {
            billNode.setNext(billNode);
        }
    }
}

package store;

import java.util.ArrayList;
import java.util.List;
import model.Customer;
import model.Product;

public class Bill {
    private String date;    
    private String code;
    private Customer customer;
    private List<Product> product;
    private int items;
    private double total;        
    private String paymentMethod;

    public Bill() {
        this.date = "";
        this.code = "";
        this.customer = new Customer();
        this.product = new ArrayList<>();
        this.items = 0;
        this.total = 0;
        this.paymentMethod = "";
    }
    
    public Bill(String date, String code, Customer customer, List<Product> product, int items, double total, String paymentMethod) {
        this.date = date;
        this.code = code;
        this.customer = customer;
        this.product = product;
        this.items = items;
        this.total = total;
        this.paymentMethod = paymentMethod;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

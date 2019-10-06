package model;

public class Sale {
    private String date;
    private String customerId;
    private String productCode;
    private String paymentMethod;
    private int items;

    public Sale() {
        this.date = "";
        this.customerId = "";
        this.productCode = "";
        this.paymentMethod = "";
        this.items = 0;
    }

    public Sale(String date, String customerId, String productCode, String paymentMethod, int items) {
        this.date = date;
        this.customerId = customerId;
        this.productCode = productCode;
        this.paymentMethod = paymentMethod;
        this.items = items;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }
}

package management;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Customer;
import model.Product;
import model.Sale;

public class StoreFile {
    private BufferedReader customerBufferedReader;
    private BufferedReader productBufferedReader;
    private BufferedReader saleBufferedReader;
    
    private List<Customer> customerList;
    private List<Product> productList;
    private List<Sale> saleList;

    public StoreFile() {
        try {
            this.customerBufferedReader = new BufferedReader(new FileReader("C:\\Users\\Carverok\\Documents\\NetBeansProjects\\Store\\src\\data\\Customer.txt"));
            this.productBufferedReader = new BufferedReader(new FileReader("C:\\Users\\Carverok\\Documents\\NetBeansProjects\\Store\\src\\data\\Product.txt"));
            this.saleBufferedReader = new BufferedReader(new FileReader("C:\\Users\\Carverok\\Documents\\NetBeansProjects\\Store\\src\\data\\Sale.txt"));
        } catch (FileNotFoundException fileNotFoundException) {
            JOptionPane.showMessageDialog(null, fileNotFoundException.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        this.customerList = new ArrayList<>();
        this.productList = new ArrayList<>();
        this.saleList = new ArrayList<>();
    }

    public List<Customer> fillCustomerList() {
        List<Customer> customers = null;
        Customer customer = null;
        try {
            customers = new ArrayList();
            String fullLine = this.customerBufferedReader.readLine();
            while (fullLine != null) {
                String[] splitLine = fullLine.split(",");
                
                customer = new Customer();
                customer.setId(splitLine[0]);
                customer.setName(splitLine[1]);                
                customers.add(customer);
                
                fullLine = this.customerBufferedReader.readLine();
            }

        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(null, ioException.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }

        return customers;
    }

    public List<Product> fillProductList() {
        List<Product> products = null;
        Product product = null;
        try {
            products = new ArrayList<>();
            String fullLine = this.productBufferedReader.readLine();
            while (fullLine != null) {
                String[] splitLine = fullLine.split(",");
                
                product = new Product();
                product.setCode(splitLine[0]);
                product.setPrice(Double.parseDouble(splitLine[1]));
                product.setDescription(splitLine[2]);
                products.add(product);
                
                fullLine = this.productBufferedReader.readLine();
            }

        } catch (IOException ioException) {
            JOptionPane.showMessageDialog(null, ioException.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }

        return products;
    }
    
    public List<Sale> fillSaleList() {
        List<Sale> sales = null;
        Sale sale = null;
        try {
            sales = new ArrayList<>();
            String fullLine= this.saleBufferedReader.readLine();
            
            while (fullLine != null) {
                String[] splitLine = fullLine.split(",");
                
                sale = new Sale();
                sale.setDate(splitLine[0]);
                sale.setCustomerId(splitLine[1]);
                sale.setProductCode(splitLine[2]);
                sale.setPaymentMethod(splitLine[3]);
                sale.setItems(Integer.parseInt(splitLine[4]));
                sales.add(sale);
                
                fullLine = this.saleBufferedReader.readLine();
            }
        }catch(IOException ioException) {
            JOptionPane.showMessageDialog(null, ioException.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
        
        return sales;
    }
    
    public void fillLists() {
        this.customerList = this.fillCustomerList();
        this.productList = this.fillProductList();
        this.saleList = this.fillSaleList();
    }
    
    public Customer getCustomerById(String customerId) {
        Customer response = null;
        for (Customer customer : this.customerList) {
            if(customer.getId().equals(customerId)) {
                response = customer;
            }
        }
        
        return response;
    }
    
    public Product getProductById(String productId) {
        Product response = null;
        for (Product product : this.productList) {
            if(product.getCode().equals(productId)) {
                response = product;
            }
        }
        
        return response;
    }    
    
    public void printListInformation() {
        for (Sale sale : this.saleList) {
            Customer customer = new Customer();
            Product product = new Product();
            
            System.out.println(sale.getDate());
            customer = getCustomerById(sale.getCustomerId());
            System.out.println(customer.getId());
            System.out.println(customer.getName());
            
            product = getProductById(sale.getProductCode());
            System.out.println(product.getCode());
            System.out.println(product.getPrice());
            System.out.println(product.getDescription());
            
            System.out.println(sale.getPaymentMethod());
            System.out.println(sale.getItems());
            System.out.println("");
        }
    }
    
    public List<Product> getProductOfSalesBy(String customerId, String paymentMethod) {
        List<Product> response = null;
        Product product = null;
        
        for (Sale sale : this.saleList) {
            response = new ArrayList<>();
            
            if (sale.getCustomerId().equals(customerId) && sale.getPaymentMethod().equals(paymentMethod)) {
                product = new Product();
                product = getProductById(sale.getProductCode());
                
//                System.out.println(product.getCode());
//                System.out.println(product.getPrice());
//                System.out.println(product.getDescription());
//                System.out.println("");
                
                response.add(product);
                
//                for (Product x : response) {
//                    System.out.println(x.getCode());
//                    System.out.println(x.getPrice());
//                    System.out.println(x.getDescription());
//                    System.out.println("");
//                }
            }
        }
        
        return response;
    }
}

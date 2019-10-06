import java.util.ArrayList;
import java.util.List;
import management.StoreFile;
import model.Product;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StoreFile storeFile = new StoreFile();
        storeFile.fillLists();
        
        storeFile.getProductOfSalesBy("1069123456", "cash");
        storeFile.getProductOfSalesBy("1069123456", "credit");
        storeFile.getProductOfSalesBy("1069654321", "cash");
        storeFile.getProductOfSalesBy("1069654321", "credit");
        storeFile.getProductOfSalesBy("1069112233", "cash");
        storeFile.getProductOfSalesBy("1069112233", "credit");

        
//        List<Product> productList = storeFile.getProductOfSalesBy("1069654321", "cash");
//        System.out.println(productList.size());
//        for (Product product : productList) {
//                System.out.println(product.getCode());
//                System.out.println(product.getPrice());
//                System.out.println(product.getDescription());
//                System.out.println("");
//        }
    }
}

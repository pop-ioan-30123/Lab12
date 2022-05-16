package aut.utcluj.isp.ex1;

import aut.utcluj.isp.ex1.Product;
import java.util.ArrayList;

import java.util.List;
import java.util.Map;

/**
 * @author stefan
 */
public class StockController {
   
    
    /**
     * Add product to catalogue
     *
     * @param product  - product information
     * @param quantity - number of times the product should be added
     * @apiNote: if products with the same products id already exists, assume that @param product has the same data
     */
    
    ArrayList <Shop> shops=new ArrayList();
    ArrayList <Catalogue> catalogues=new ArrayList();

    
    public void addProductToCatalogue(final Product product, final int quantity) {
        Catalogue c1;
        c1=new Catalogue();
    }

    /**
     * Return catalogue information
     *
     * @return dictionary where the key is the product id and the value is an array of products with the same id
     */
    public Map<String, ArrayList<Product>> getCatalogue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Return all the products with particular id
     *
     * @param productId - unique product id
     * @return - list of existing products with same id or null if not found
     */
    public List<Product> getProductsWithSameId(final String productId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Get total number of products from catalogue
     *
     * @return
     */
    public int getTotalNumberOfProducts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove all products with same product id
     *
     * @param productId - unique product id
     * @return true if at least one product was deleted or false instead
     */
    public boolean removeAllProductsWitProductId(final String productId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Update the price for all the products with same product id
     *
     * @param productId - unique product id
     * @param price     - new price to be added
     * @return true if at least one product was updated or false instead
     */
    public boolean updateProductPriceByProductId(final String productId, final Double price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

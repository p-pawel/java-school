package org.example;

public class DefaultCartService implements CartService {

    private ProductRepository productRepository;
    private PriceService priceService;
    private int size;

    public DefaultCartService() {
    }

    public DefaultCartService(ProductRepository productRepository, PriceService priceService) {
        this.productRepository = productRepository;
        this.priceService = priceService;
        System.out.println("construct DefaultCartService(" + productRepository +")");
    }

    public DefaultCartService setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
        return this;
    }

    public DefaultCartService setPriceService(PriceService priceService) {
        this.priceService = priceService;
        return this;
    }


    public DefaultCartService setSize(int size) {
        this.size = size;
        return this;
    }
}

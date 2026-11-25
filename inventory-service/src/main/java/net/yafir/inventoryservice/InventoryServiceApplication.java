
package net.yafir.inventoryservice;

import net.yafir.inventoryservice.entities.Product;
import net.yafir.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder()
                    .name("Computer")
                    .price(34000)
                    .quantity(10)
                    .build());

            productRepository.save(Product.builder()
                    .name("Printer")
                    .price(12000)
                    .quantity(11)
                    .build());

            productRepository.save(Product.builder()
                    .name("Smartphone")
                    .price(12300)
                    .quantity(20)
                    .build());
        };
    }
}

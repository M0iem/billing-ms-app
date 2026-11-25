package net.yafir.customerservice;

import net.yafir.customerservice.entities.Customer;
import net.yafir.customerservice.respository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder()
                    .name("Merie").email("merie@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Zineb").email("Zineb@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Asmae").email("Asmae@gmail.com").build());
            customerRepository.save(Customer.builder()
                    .name("Mehdi").email("Mehdi@gmail.com").build());
        };
    }

}

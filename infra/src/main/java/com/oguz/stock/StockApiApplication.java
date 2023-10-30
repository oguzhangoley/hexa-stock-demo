package com.oguz.stock;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        info = @Info(
                title = "Employee Service REST APIs",
                description = "Employee Service REST APIs Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Oguzhan",
                        email = "oguzhanngoley@gmail.com",
                        url = "https://github.com/oguzhangoley"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "someUrl"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Employee-Service Doc",
                url="someUrl"
        )
)
@SpringBootApplication
public class StockApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockApiApplication.class,args);
    }
}

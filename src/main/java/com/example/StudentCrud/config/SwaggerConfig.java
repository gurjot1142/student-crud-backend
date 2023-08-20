package com.example.StudentCrud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Student Crud API",
                version = "1.0",
                description = "API documentation for Student Crud Operations",
                contact = @io.swagger.v3.oas.annotations.info.Contact(
                        name = "Gurjot Singh",
                        email = "gurjotloveparmar@gmail.com"
                )
        ),
        servers = {
                @Server(url = "http://localhost:8080", description = "Local Server")
        }
)
public class SwaggerConfig implements WebMvcConfigurer {

}

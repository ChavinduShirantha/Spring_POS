package lk.ijse.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Chavindu
 * created : 10/9/2023-3:34 PM
 **/

@Configuration
@Import({JPAConfig.class})
@ComponentScan(basePackages = "lk.ijse.spring.service")
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("WebRootConfig : Instantiated");
    }

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}

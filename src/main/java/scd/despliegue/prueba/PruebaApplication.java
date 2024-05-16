package scd.despliegue.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PruebaApplication {
        @GetMapping("/mensaje")
        
        public String mensaje(){
            return "Prueba de despliegue Azure";
        }

	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
	}

}

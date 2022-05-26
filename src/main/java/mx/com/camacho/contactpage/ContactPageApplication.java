package mx.com.camacho.contactpage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ContactPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactPageApplication.class, args);
	}

}

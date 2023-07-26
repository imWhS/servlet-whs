package hellowhs.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ServletWhsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletWhsApplication.class, args);
	}

}

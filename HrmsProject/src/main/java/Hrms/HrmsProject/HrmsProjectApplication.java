package Hrms.HrmsProject;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class HrmsProjectApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(HrmsProjectApplication.class, args);
		
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "drqh0qooh",
				"api_key", "249776973732487",
				"api_secret", "s79YGzXQzu-tuJLQ3OY4IcKYT9k",
				"secure", true));

		File file = new File("my_image.jpg");
		Map<?, ?> uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
		System.out.println(uploadResult.get("url"));
	}
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("Hrms.HrmsProject"))                                     
          .build();
	}
	
}

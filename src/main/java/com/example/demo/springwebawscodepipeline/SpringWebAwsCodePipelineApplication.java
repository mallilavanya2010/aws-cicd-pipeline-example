package com.example.demo.springwebawscodepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringWebAwsCodePipelineApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "Updated Version : AWS codepipeline example successfully running with tech stack springboot --> github --> aws code pipeline --> aws code build --> Elastic bean stack";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAwsCodePipelineApplication.class, args);
	}

}

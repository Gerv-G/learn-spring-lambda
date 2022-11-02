package io.gervg.learnawslambda;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

/**
 * Taken from the example in spring-cloud-function
 * see https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples/function-sample-aws
 */
@Slf4j
@SpringBootApplication
public class LearnAwsLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnAwsLambdaApplication.class, args);
	}

	/**
	 * Abstracted HTTP endpoint
	 *
	 * When ran locally, it should be accessible via GET http://localhost:8080/
	 *
	 * When in a Docker container, it should be accessible via
	 * GET http://localhost:9000/2015-03-31/functions/function/invocations
	 */
	// TODO: make this work in a container
	@Bean
	public Supplier<String> handleRequest() {
		log.info("Handling requests.");
		return () -> "hello world";
	}
}

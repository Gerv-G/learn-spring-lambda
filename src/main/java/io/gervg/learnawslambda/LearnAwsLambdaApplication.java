package io.gervg.learnawslambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

/**
 * Taken from the example in spring-cloud-function
 * see https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples/function-sample-aws
 */
@SpringBootApplication
public class LearnAwsLambdaApplication {

	public static void main(String[] args) {}

	@Bean
	public Function<String, String> upperCase() {
		return value -> {
			if (value.equals("exception")) {
				throw new RuntimeException("Intentional exception");
			}
			else {
				return value.toUpperCase();
			}
		};
	}

}

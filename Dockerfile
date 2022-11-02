FROM public.ecr.aws/lambda/java:11.2022.10.26.12

# Copy function code and runtime dependencies from Gradle layout
COPY build/classes/java/main ${LAMBDA_TASK_ROOT}
COPY build/dependency/* ${LAMBDA_TASK_ROOT}/lib/

# This is supposed to be Spring's adapter to AWS Lambda
# But I couldn't get it to work yet locally
# CMD [ "org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest" ]

# This is seemingly invoked but the string response is never received by the caller/client
CMD ["io.gervg.learnawslambda.LearnAwsLambdaApplication::handleRequest"]
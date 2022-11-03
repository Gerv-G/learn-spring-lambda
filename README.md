# learn-spring-lambda
Learning project for containerized Lambda-compatible Spring application 

## What is this?
I'm trying to figure out if I can bring a Spring application into a container and deploy it to AWS Lambda
_because why not?_

Kidding aside, I'm really just trying out AWS Lambda and thought maybe it's a good to ~~make things a little more complicated than they should be~~ learn it with a different tech stack than the one I'm currently using at my job.

## Build and Run
### Running locally
To run it the Spring app, simply run
```
gradle clean build bootRun
```
`clean build` tasks are optional

### Running locally in a container
> **Warning** - Work in Progress
> This still doesn't work yet

```
gradle clean build copyRuntimeDependencies
docker build -t spring-aws-lambda
docker run -p 9000:8000 spring-aws-lambda
```

## Invoking the function
If running via `bootRun`, do a `GET http://localhost:8080/`

If running in a container, do a `GET http://localhost:9000/2015-03-31/functions/function/invocations`

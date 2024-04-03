# RestfulAPI
this is a simple REST API with CRUD operations containerized using a dockerfile. The application models a friend saving system that hold the users real name, their username and their friend ID.


## Creation
Creating this Restful API was somewhat challenging as there were multiple implementations of this operation. I had struggled in finding a cohesive and comprehensive walkthrough of the process. This led to many trial and errors of this process and changes to my code. Eventually I landed on a video by [Thinking-Constructive](https://www.youtube.com/@ThinkConstructivehttps://www.youtube.com/@ThinkConstructive) . This greatly helped the process of understanding and developing a Restful API. Along that path I had also switched my project from maven to gradle after encountering problems uploading to my repo.


## Cloning Git repo
in the local terminal or in the terminal of your IDE clone the repository using this command line.
```
git clone https://github.com/KwadwoAK/RestfulAPI.git
```

## Building Gradle package
Build your jar file using this gradle command.
```
./gradlew build 
```
This will create the necessary jar for the Dockerfile. 

## Dockerization
This command will build a docker image using the Dockerfile in the current directory.
```
docker build -t myapp .
```

After the image is created run the docker container using this command.
```
docker run -d --name myrest -p 8080:8080 myapp
```

The application should now be running in the daemon in port 8080. Using the Swagger UI that has been implemented in the code you can now use the application by going to:

http://localhost:8080/swagger-ui/index.html 


## Running on Kubernetes
To run this Program on kubernetes apply the yaml files in the kubernetes file.
```
kubectl apply -f kubernetes
```
Alternative you can apply each individual yaml file.
```
kubectl apply -f config.yaml
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
```
Make sure you deployments and pods are running
```
kubectl get deployments,pods
```
After confirming that the deployments and pods are ready, the microservice will be running on port 31234. This can be checked with Swagger UI on your local browser

http://localhost:31234/swagger-ui/index.html#

If you would like to check through your local IDE you can test the fib map and config map.
```
 curl http://localhost:31234/friendvendor/config
```
## Installations
for this microservice Docker is required here is the install.
https://docs.docker.com/engine/install/


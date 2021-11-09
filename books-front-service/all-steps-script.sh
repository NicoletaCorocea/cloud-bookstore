### build the repository
mvn clean install

### build docker image and push it
docker build -f Dockerfile-k8s -t nicoletacoroceaendava/books-front-service:latest .
docker push nicoletacoroceaendava/books-front-service:latest

### delete and redeploy
kubectl delete -f books-front-service-k8s.yaml
kubectl apply -f books-front-service-k8s.yaml

/bin/bash
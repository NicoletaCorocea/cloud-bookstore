### build project
mvn clean install

### build docker image and push it
docker build -f Dockerfile-k8s -t nicoletacoroceaendava/books-reviews-service:latest .
docker push nicoletacoroceaendava/books-reviews-service:latest

### delete and redeploy
kubectl delete -f books-reviews-service-k8s.yaml
kubectl apply -f books-reviews-service-k8s.yaml

/bin/bash
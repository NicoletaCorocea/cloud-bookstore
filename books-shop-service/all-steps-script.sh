### build project
mvn clean install

### build docker image and push it
docker build -f Dockerfile-k8s -t nicoletacoroceaendava/books-shop-service:latest .
docker push nicoletacoroceaendava/books-shop-service:latest

### delete and redeploy
kubectl delete -f books-shop-service-k8s.yaml
kubectl apply -f books-shop-service-k8s.yaml

/bin/bash
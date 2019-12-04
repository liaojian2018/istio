#!/bin/bash
cd /root/istio

mvn clean package -DskipTests

cd /root/istio/user
mvn docker:build
kubectl apply -f Deployment.yaml

cd /root/istio/order
mvn docker:build
kubectl apply -f Deployment.yaml

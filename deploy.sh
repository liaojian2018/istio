#!/bin/bash
echo "begin to deploy......"

cd /root/istio/user
kubectl apply -f Deployment.yaml

cd /root/istio/order
kubectl apply -f Deployment.yaml

echo "end to deploy......"

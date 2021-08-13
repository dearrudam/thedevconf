#!/bin/bash
set -e

docker run --rm \
  --network="host" \
  -p 0.0.0.0:8181:8181 \
  -p 5005:5005 \
  -e JAVA_DEBUG=true \
  -e QUARKUS_DATASOURCE_JDBC_URL=$DATASOURCE_URL \
  -e QUARKUS_DATASOURCE_USERNAME=$DATASOURCE_USERNAME \
  -e QUARKUS_DATASOURCE_PASSWORD=$DATASOURCE_PASSWORD \
  -e QUARKUS_DATASOURCE_DB_KIND=$DATASOURCE_KIND \
  ${QUARKUS_CONTAINER_IMAGE_USERNAME}/tdc-api:latest
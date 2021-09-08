FROM adoptopenjdk:11-jre-hotspot as build
COPY ./target/*.jar /app/app.jar
WORKDIR /app

FROM nginx:alpine
COPY --from=build ./app /app
COPY nginx/default.conf.template /etc/nginx/templates/default.conf.template
RUN apk --no-cache add openjdk11-jre 

EXPOSE 80

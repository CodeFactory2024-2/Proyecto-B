FROM openjdk:23-jdk-slim
COPY target/artifacts/reserva_b.jar app.jar
EXPOSE 8080
COPY start.sh /start.sh
RUN chmod +x /start.sh
ENTRYPOINT ["/start.sh"]
CMD ["tail", "-f", "/dev/null"]
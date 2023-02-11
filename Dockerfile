FROM openjdk:8
RUN useradd -ms /bin/bash user
USER user
COPY . /hotlap
WORKDIR /hotlap
#RUN javac Main.java
#CMD ["java", "Main"]
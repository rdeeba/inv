FROM ubuntu:latest

# install JDK
RUN apt-get -q update &&\
    apt-get install openjdk-8-jdk-headless -y &&\
    apt-get -q autoremove &&\
    apt-get -q clean -y &&\
    rm -rf /var/lib/apt/lists/* &&\
    rm -f /var/cache/apt/*.bin

USER $NB_UID

VOLUME /tmp
COPY build/libs/deeba-hello-0.1.0.jar app.jargradle
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
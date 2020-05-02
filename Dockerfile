FROM ubuntu:16.04

ENV HOME /root

# Install system dependencies
RUN \
  apt-get update && \
  apt-get install -y \
    build-essential \
    software-properties-common \
    tar \
    curl \
    apt-transport-https \
    unzip \
    vim \
    maven \
    mysql-client \
    openssh-client && \
  apt-get clean

# Install Java and dependencies
ENV JAVA_HOME /usr/lib/jvm/java-8-openjdk-amd64
RUN apt-get -y install openjdk-8-jdk
ENV PATH $JAVA_HOME/bin:$PATH

ENV APP_HOME /var/www
WORKDIR $APP_HOME
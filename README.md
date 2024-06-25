# Cashbook Project

## 프로젝트 설명

이 프로젝트는 Spring Boot와 MariaDB를 사용하여 구현된 간단한 토이 프로젝트입니다.

## 사전 준비 사항

1. Docker 및 Docker Compose가 호스트 시스템에 설치되어 있어야 합니다. 아래 링크를 참조하여 설치하세요.
    - [Docker 설치하기](https://docs.docker.com/get-docker/)
    - [Docker Compose 설치하기](https://docs.docker.com/compose/install/)

## 실행 방법

1. 프로젝트 클론

    프로젝트를 원하는 디렉토리로 클론합니다.

    ```bash
    https://github.com/Legendary-Learning-Lab/cashbook-be.git
    ```

2. 프로젝트 디렉토리 이동

    클론한 프로젝트 디렉토리로 이동합니다.

    ```bash
    cd cashbook-be
    ```

3. 프로젝트를 클린 빌드

    ```bash
    ./gradlew clean build
    ```

4. Docker 컨테이너를 실행하여 애플리케이션과 데이터베이스를 시작

    ```bash
    docker-compose up -d --build
    ```

5. 웹 브라우저에서 http://localhost 에 접속하여 애플리케이션을 확인

### 이후에 프로젝트를 실행할 때

1. Docker 컨테이너를 시작하여 애플리케이션과 데이터베이스를 실행

    ```bash
    docker-compose up -d
    ```

2. 웹 브라우저에서 http://localhost 에 접속하여 애플리케이션을 확인

### Swagger API 문서 확인
    http://localhost/swagger-ui.html 에서 확인 가능

### 무중단 배포 전략
    Blue-Green Deployment 구현
        docker-compose.yml 파일에 Blue와 Green 인스턴스를 정의합니다.
        Nginx 설정을 통해 트래픽을 새로운 버전으로 전환


### 오류
- localhost 에서 Nginx가 실행되지 않는 경우, 도커에 Nginx가 실행되어 있는지 확인

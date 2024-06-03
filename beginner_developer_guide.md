# Beginner Developer Guide

## 📋 내용

- BE 공부를 함께 시작하는 동료들을 위해 작성되었습니다.
- mac OS 기준으로 작성되었습니다.

<br />

## 🔍 개발 환경 구축 가이드

### 1️⃣ IntelliJ 설치

- <a href="https://www.jetbrains.com/ko-kr/idea/download/?section=mac#:~:text=Ultimate">Ultimate 설치</a>
- <a href="https://www.jetbrains.com/ko-kr/idea/download/?section=mac#:~:text=Community,Edition">Community 설치</a>

<br />

### 2️⃣ Mysql 설치

- mac 내장 terminal 실행

```shell
# Homebrew 최신화
$ brew update

# mysql 설치
$ brew install mysql

# mysql 설치 확인을 위해 버전 확인
$ mysql --version

# mysql 설정을 위해 아래 중 하나의 명령어로 서버 실행

## 1️⃣ homebrew 활용 (권장)
$ brew services start mysql

## 2️⃣ 전역 변수 mysql 활용
$ mysql.server start

# 계정 정보 설정
$ mysql_secure_installation

# 순서
## 비밀번호 복잡도: Low 선택
## 비밀번호: 20240527 (application.properties 에서 확인 가능) 
## 나머지: Y

# 실행되어 있는 mysql 서버에 접속
## -u: 접속을 위한 사용자 정보 입력할게! 이번에는 "root"로 접속할꺼야!
## -p: 비밀번호도 입력할게!
$ mysql -u root -p

# ❗️참고
# 위에서 mysql server를 실행한 방식대로, 종료해주어야 합니다.
# "brew로 시작 -> mysql로 종료"하는 경우 Error!
## 1️⃣ homebrew 활용
$ brew services stop mysql

## 2️⃣ 전역 변수 mysql 활용
$ mysql.server stop
```

#### ❗️ 참고
- mysql 처음 설치하면, root 계정에 대한 에러가 종종 발생!
- 환경마다 root 계정에 대한 설정이 다른데
  - window: 설치 과정에서 root 계정의 초기 비밀번호 설정
  - mac: `mysql_secure_installation` 과정에서 설정

- 혹시나, root 계정으로 접근이 안된다면 아래 과정을 따라가보세요!

```shell
# sudo 권한으로 mysql 실행
$ sudo mysql;

# 계정 정보 재설정 query 작성
ALTER USER '계정'@'localhost' IDENTIFIED WITH mysql_native_password BY '새로운 비밀번호'; 
```

<br />

### 3️⃣ DB 관리 도구 설치

|            | 지원 환경                  | 비고                      |
|:-----------|:-----------------------|:------------------------|
| HeidiSQL   | Windows                |                         |
| Sequel Ace | Mac                    | 전 개인적으로, 이거 사용하긴 했는데 ㅎㅎ |
| DBeaver    | Windows, Mac, Linux... ||


<br />

<hr />

updated : 2024.06.03 (Mon)

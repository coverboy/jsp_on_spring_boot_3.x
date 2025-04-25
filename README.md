### JSP on Spring Boot 3.x

A simple demo of JSP running with Spring Boot 3.x.
 
### 이걸 만든 이유

구글에서 검색하면 Spring Boot 3.x 의 Dependency 가 다들 안 맞아서 실행이 잘 안되었다.
그래서, 되는 버전을 만듬.

### 실행
```bash
./grdlew bootRun
```

### tomcat 없이 단독으로 실행.  
```bash
./gradlew bootWar # war 파일을 만들고 이 파일을 서버에 올린 후에
java -jar jsp-0.0.1-SNAPSHOT.war # 명령어를 실행시킨다.
```

### 확인
```bash
curl http://localhost:8085/testJSP
```



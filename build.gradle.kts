plugins {
	java
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")

	//	jsp
	implementation("org.apache.tomcat.embed:tomcat-embed-jasper:11.0.4")
	implementation("jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:3.0.2")
	implementation("org.glassfish.web:jakarta.servlet.jsp.jstl:3.0.1")
	implementation("org.glassfish.expressly:expressly:6.0.0-M1")

	compileOnly("jakarta.servlet:jakarta.servlet-api:6.1.0")
	compileOnly("jakarta.servlet.jsp:jakarta.servlet.jsp-api:4.0.0")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

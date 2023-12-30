
@echo off
SET /A a = 5
SET /A b = 10
SET /A c = %a% + %b%
echo %c%

docker build -t spring-security .

docker run -p 9999:8080 -p 4080:4080 --name "spring-security" spring-security

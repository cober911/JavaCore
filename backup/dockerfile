FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./ ./src
RUN mkdir ./out
RUN javac -sourcepath ./src -d out ./src/Seminar1/sample/Main.java
CMD java -classpath ./out Seminar1.sample.Main 
RUN javadoc -d ./docs -sourcepath ./src -cp ./out -subpackages Seminar1 -locale ru_RU -encoding utf-8 -docencoding cp1251
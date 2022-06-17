rm -R ./bin
javac ./src/main/chess/*.java -d ./bin/main/
javac -cp .:junit-platform-console-standalone.jar:./bin/main/:./bin/test/ ./src/test/chess/*.java -d ./bin/test/
java -jar junit-platform-console-standalone.jar  --class-path ./bin/main/:./bin/test/ --scan-class-path --fail-if-no-tests --reports-dir=./report
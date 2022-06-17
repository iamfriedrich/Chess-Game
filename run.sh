#rm -R ./chess-project/bin
javac ./src/main/chess/*.java -d ./bin/main/
java --class-path ./bin/main/ chess.Game
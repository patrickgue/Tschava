PROG=target/tschava-0.0.1.jar target/tschava

all:$(PROG)



target/tschava:src/main/shell/tschava.sh
	cp src/main/shell/tschava.sh ./target/tschava
	chmod +x target/tschava

target/tschava-0.0.1.jar:
	mvn clean install


clean:
	mvn clean

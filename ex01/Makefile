WHITE ?= .
BLACK ?= 0

all: clean jar run

compile:
	javac  -d target  src/java/fr/school42/printer/app/Program.java  src/java/fr/school42/printer/logic/Logic.java

jar: compile 
	cp -r src/resources target/
	jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target .

run: 
	java -jar target/images-to-chars-printer.jar $(WHITE) $(BLACK)

clean:
	rm -rf target

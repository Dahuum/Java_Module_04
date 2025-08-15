WHITE ?= RED
BLACK ?= GREEN

all: clean jar run

# cp == class path

compile:
	javac -cp "jcommander-1.82.jar:JCDP-4.0.2.jar"  -d target  src/java/fr/school42/printer/app/Program.java  src/java/fr/school42/printer/logic/Logic.java

jar: compile 
	cp -r src/resources target/
	cd target && jar xf ../jcommander-1.82.jar && jar xf ../JCDP-4.0.2.jar
	jar cfm target/images-to-chars-printer.jar src/manifest.txt -C target .

run: 
	java -jar target/images-to-chars-printer.jar --white $(WHITE) --black $(BLACK)

clean:
	rm -rf target

test:
	make run WHITE=BLUE BLACK=RED

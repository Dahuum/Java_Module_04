IMAGE ?= it.bmp
WHITE ?= .
BLACK?= 0

all: clean compile run

compile:
	javac  -d target  src/java/fr/school42/printer/app/Program.java  src/java/fr/school42/printer/logic/Logic.java

run: 
	java -cp target fr.school42.printer.app.Program $(IMAGE) $(WHITE) $(BLACK)

clean:
	rm -rf target

# A simple Makefile for CPSC 231

# the source files to be built
SOURCES := *.java
# the classpath to find dependent jars and class files
CLASSP := .

all:
	javac -classpath $(CLASSP) $(SOURCES)

realclean:
	find . -type f -name "*.class" -exec rm '{}' \;

compressed:
	tar cvzf MarcusChong_6.tgz MarcusChong_6 
# this line required by make - don't delete

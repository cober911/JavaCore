SRC_DIR := src
OUT_DIR := out
DOCS_DIR := docs

JC := javac
JCFLAGS := -sourcepath .$(SRC_DIR)/ -d .$(OUT_DIR)
all:
	javac -sourcepath src/ -d out src/Seminar1/sample/Main.java
clean_out:
	rmdir /s /q $(OUT_DIR)
clean_docs:
	rmdir /s /q $(DOCS_DIR)
docs:
	javadoc -d docs -sourcepath src -cp out -subpackages Seminar1 -locale ru_RU -encoding utf-8 -docencoding cp1251

#!/bin/bash -ex

javac -d bin -Xlint src/main/java/cs2670/search/BST.java
javac -cp bin -d bin src/main/java/cs2670/test/BSTTester.java
java -cp bin cs2670.test.BSTTester

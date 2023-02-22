#!/bin/sh
rows=6
javac rectangle.java
java rectangle $rows 
python3 rectangle.py "$rows"
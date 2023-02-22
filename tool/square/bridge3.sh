#!/bin/sh
rows=6
javac square.java
java square $rows 
python3 square.py "$rows"
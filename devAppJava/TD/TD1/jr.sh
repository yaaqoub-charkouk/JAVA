#!/bin/zsh

javac -d . CreateDB.java Createtbstd.java Addsutds.java UpdtNote.java DelNoteNV.java ListeCR.java BestStd.java
java -cp .:$JDBC TD.TD1.CreateDB
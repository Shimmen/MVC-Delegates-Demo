#!/bin/bash

mkdir -p "out/"

pushd "src/"
javac *.java -d "../out/"
popd

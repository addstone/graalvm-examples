#!/bin/bash
set -e

./testWebApps.sh

cd fastr_javaui
./build.sh
./test.sh
cd ..

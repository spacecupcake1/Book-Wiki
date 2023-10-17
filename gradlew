#!/bin/bash
set -e
export TERM=dumb
SCRIPT_DIR=$(cd $(dirname $0); pwd)
$SCRIPT_DIR/gradlew.bat "$@"

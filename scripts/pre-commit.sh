#!/bin/bash

echo "Running git pre-commit hook"

./gradlew app:test --daemon

STATUS=$?

[ $STATUS -ne 0 ] && exit 1
exit 0

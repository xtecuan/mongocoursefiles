#!/bin/bash

if [ -f "$1" ]
then
    mongo < $1
else
    echo "Usage: executeMongoCommand.sh filename.js"
fi

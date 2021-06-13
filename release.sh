#!/usr/bin/env bash

cd strlib
sdk use java 11.0.2-open
mvn clean deploy -P release

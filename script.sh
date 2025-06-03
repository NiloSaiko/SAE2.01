#!/bin/bash

read -p "Entrer le message pour le commit " message
git pull
git add .
git commit -m "$message"
git push
$message = Read-Host "Entrer le message pour le commit"

git pull
git add .
git commit -m "$message"
git push

#!/bin/bash

git status
echo -e "Hi, please type the file name: \c "
read fil
git add $fil

echo -e "Hi, please type the message of the commit: \c "
read mess
git commit -m "$mess"

git remote add orgin https://github.com/skyrogue/ScholarshipSystem.git
git remote -v
git push

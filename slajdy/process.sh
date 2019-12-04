theme=blackschool

for file in *md; do
  name="${file:0:-3}"
  echo -ne "Creating ${name}.html... "
  pandoc -t revealjs -s "${name}.md" -o "${name}.html" --slide-level 3 -V theme="${theme}" --template=template.html
  echo " - done"
done

echo

inotifywait -m . -e modify -e close_write  |
    while read -r path action file; do
        # do something with the file

        if [ "${file: -3}" == ".md" ]
        then
            echo -e "\e[90mThe file '$file' appeared in directory '$path' via '$action'\e[39m"

           name="${file:0:-3}"

           echo -ne "Creating ${name}.html... "

          pandoc -t revealjs -s "${name}.md" -o "${name}.html" --slide-level 3 -V theme="${theme}" --template=template.html

           echo " - done"
#          pandoc -t revealjs -s collections.md -o collections.html --slide-level 2
#          pandoc -t revealjs -s inheritance.md -o inheritance.html --slide-level 3
        fi
    done

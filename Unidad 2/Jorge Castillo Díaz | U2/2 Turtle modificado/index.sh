javac -d bin -cp ../:./ Prueba.java

printf "\n%*s\n" $(((${#title}+$(tput cols))/2)) "Pruebas de Turtle"
printf "\nPruebas disponibles:\n"
printf "* tamaño\n"
printf "* escala\n\n"
read -p "Ingrese la prueba a ejecutar: " prueba
java -cp ../:bin Prueba $prueba
clear
javac -d bin -cp ../:./ Prueba.java

printf "\n%*s\n" $(((${#title}+$(tput cols))/2)) "Pruebas de Turtle"
printf "\nPruebas disponibles:\n"
printf "* girarDerecha\n"
printf "* girar180\n"
printf "* retroceder\n"
printf "* avanzarColores\n"
printf "* retrocederColores\n"
printf "* borrarPasos\n"
printf "* moverA\n\n"
read -p "Ingrese la prueba a ejecutar: " prueba

java -cp ../:bin Prueba $prueba
clear
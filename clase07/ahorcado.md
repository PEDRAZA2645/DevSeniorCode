# Ahorcado

![Ahorcado](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Hangman.svg/330px-Hangman.svg.png)  
_Tomado de [Ahorcado (juego)](https://es.wikipedia.org/wiki/Ahorcado_(juego)) en wikipedia_.

El ahorcado (también llamado colgado) es un juego de lápiz y papel para dos o más jugadores. Un jugador piensa en una palabra, frase u oración y el otro trata de adivinarla según lo que sugiere por letras o dentro de un cierto número de oportunidades.

## Reglas
Usando una fila de guiones, se representa la palabra a adivinar, dando el número de letras. Si el jugador adivinador sugiere una letra que aparece en la palabra, el otro jugador la escribe en todas sus posiciones correctas. Si la letra sugerida no ocurre en la palabra, el otro jugador saca un elemento de la figura de hombre palo ahorcado como una marca de conteo. 
 
El juego termina cuando:
1. El jugador adivinador completa la palabra, o adivina la palabra completa correctamente.
1. El otro jugador completa el dibujo del ahorcado.

Se dibuja la horca antes de jugar y dibujan las partes del cuerpo del hombre (tradicionalmente la cabeza, luego el torso, luego los brazos y las piernas de uno en uno).

## Descripción del Problema:

El objetivo es desarrollar un programa en Java que permita a un jugador jugar al Ahorcado en la consola. El juego debe cumplir con los siguientes requisitos:

1. **Palabra Secreta**: El programa debe seleccionar una palabra secreta que el jugador debe adivinar. Esta palabra puede ser elegida aleatoriamente de una lista predefinida de palabras.
1. **Mostrar Progreso**: El programa debe mostrar el progreso del jugador, es decir, las letras adivinadas correctamente y las posiciones de las letras aún no adivinadas representadas por guiones bajos (_).
1. **Adivinar Letras**: El jugador debe poder adivinar letras una por una. El programa debe verificar si la letra adivinada está en la palabra secreta y actualizar el progreso del jugador en consecuencia.
1. **Contar Intentos Fallidos**: El programa debe llevar un conteo de los intentos fallidos del jugador. Cada vez que el jugador adivina una letra incorrecta, se debe incrementar el conteo de intentos fallidos.
1. **Dibujar el Ahorcado**: El programa debe dibujar una figura de un ahorcado en la consola, añadiendo una parte del cuerpo por cada intento fallido. La figura completa del ahorcado debe constar de varias partes (por ejemplo, cabeza, cuerpo, brazos, y piernas).
1. **Detectar Fin del Juego**: El juego debe terminar cuando el jugador adivine todas las letras de la palabra secreta o cuando el número de intentos fallidos alcance un límite predefinido (por ejemplo, 6 intentos fallidos).
1. **Interacción con el Usuario**: El programa debe solicitar al jugador que ingrese sus adivinanzas y proporcionar retroalimentación sobre el estado del juego después de cada adivinanza.
1. **Mensajes de Fin del Juego**: Al finalizar el juego, el programa debe mostrar un mensaje indicando si el jugador ha ganado o perdido, y revelar la palabra secreta si el jugador no la adivinó.

## Ejemplo de tablero cuando pierde
```
Palabra a adivinar: A H _ _ _ A _ O
Letras intentadas: Z J L H A E I O S
   +------+
   |      |
   |      O
   |     \|/
   |      |
   |     / \
   |
+--+--+
|     |
```

## Evolución del dibujo
```
   +------+     +------+     +------+     +------+     +------+     +------+     +------+  
   |      |     |      |     |      |     |      |     |      |     |      |     |      |  
   |            |      O     |      O     |      O     |      O     |      O     |      O  
   |            |            |      |     |     \|     |     \|/    |     \|/    |     \|/ 
   |            |            |      |     |      |     |      |     |      |     |      |  
   |            |            |            |            |            |     /      |     / \ 
   |            |            |            |            |            |            |         
+--+--+      +--+--+      +--+--+      +--+--+      +--+--+      +--+--+      +--+--+      
|     |      |     |      |     |      |     |      |     |      |     |      |     |      

 Inicial      1 Fallo      2 Fallos     3 Fallos     4 Fallos     5 Fallos     6 Fallos / Perdida
```

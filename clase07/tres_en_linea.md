# Tres en línea (tic-tac-toe)

![Tres en línea](https://upload.wikimedia.org/wikipedia/commons/thumb/3/32/Tic_tac_toe.svg/783px-Tic_tac_toe.svg.png)  
_Tomado de [Tres en línea](https://es.wikipedia.org/wiki/Tres_en_l%C3%ADnea) en wikipedia_.

El tres en línea, también conocido como ceros y cruces, tres en raya (España, México, Ecuador y Bolivia), cerito cruz (en Cuba), michi (en Perú), triqui (en Colombia), cuadritos, juego del gato, gato (en Chile, Costa Rica y México), ta te tí (en Argentina, Paraguay y Uruguay), totito (en Guatemala), triqui traka, equis cero (en Honduras), o la vieja (en Venezuela) es un juego de lápiz y papel entre dos jugadores: **O** y **X**, que marcan los espacios de un tablero de 3×3 alternadamente.

## Reglas
Cada jugador solo debe colocar su símbolo una vez por turno y no debe ser sobre una casilla ya jugada. En caso de que el jugador haga trampa el ganador será el otro. Se debe conseguir realizar una línea recta o diagonal por símbolo.

## Descripción del Problema
El objetivo es desarrollar un programa en Java que permita a dos jugadores jugar al Tic Tac Toe en la consola. El juego debe cumplir con los siguientes requisitos:
1. **Tablero de Juego**: El tablero debe ser una matriz de 3x3 que puede contener los caracteres 'X', 'O' o un espacio vacío para indicar una celda vacía.
1. **Inicialización del Tablero**: Al iniciar el juego, el tablero debe estar vacío.
1. **Mostrar el Tablero**: El programa debe ser capaz de imprimir el tablero en la consola en cualquier momento, mostrando claramente las posiciones ocupadas por 'X' y 'O', así como las celdas vacías.
1. **Realizar Movimientos**: Los jugadores deben poder ingresar sus movimientos especificando la fila y la columna donde desean colocar su marca ('X' o 'O'). El programa debe verificar que el movimiento sea válido (es decir, que la celda esté vacía) antes de actualizar el tablero.
1. **Alternar Turnos**: El programa debe alternar entre los dos jugadores después de cada movimiento válido.
1. **Comprobar Ganador**: Después de cada movimiento, el programa debe verificar si el jugador actual ha ganado. Un jugador gana si tiene tres de sus marcas en una fila, columna o diagonal.
1. **Detectar Empate**: El programa debe detectar si el tablero está lleno y no hay un ganador, declarando un empate.
1. **Finalizar el Juego**: El juego debe terminar cuando haya un ganador o un empate, y debe mostrar un mensaje apropiado indicando el resultado.
1. **Interacción con el Usuario**: El programa debe solicitar a los jugadores que ingresen sus movimientos y proporcionar retroalimentación sobre el estado del juego después de cada movimiento.
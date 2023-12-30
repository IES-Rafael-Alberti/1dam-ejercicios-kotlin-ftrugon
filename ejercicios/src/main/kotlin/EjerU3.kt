/**
 * pregunta al usuario los números ganadores de la lotería primitiva,
 * los almacena en una lista y los muestra por pantalla ordenados de menor a mayor.
 * El reintegro aparece el ultimo
 */
fun listuplu3ej4() {
    try {
        println("Dime los numeros ganadores de la primitiva")
        val lista = mutableListOf<Int>()
        var estado = false
        while (!estado){
            print("Dime un numero: ")
            val num = readln().toInt()
            if (num > 50 || num < 0) {
                println("Numero no valido")
            }else if(num in lista){
                println("Numero repetido")
            } else{
                lista.add(num)
                if (lista.size == 6){
                    estado = true
                }
            }
        }
        lista.sort()
        print("Dime el reintegro: ")
        val reintegro = readln().toInt()
        if (reintegro > 10 || reintegro < 0) {
            println("Reintegro no valido")
        }else{
            lista.add(reintegro)
        }
        println(lista)
    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 *
 */
fun listuplu3ej6() {
    try {

        val listaasignaturas = listOf("Matematicas", "Fisica", "Quimica", "Historia", "Lengua")
        val nuevalista = mutableListOf<String>()
        for (asig in listaasignaturas) {
            print("Dime la nota que has sacado en $asig: ")
            val nota = readln().toFloat()
            if (nota < 5){
                nuevalista.add(asig)
            }
        }
        println(nuevalista)
    }catch (e:Exception){
        println("Error inesperado")
    }
}

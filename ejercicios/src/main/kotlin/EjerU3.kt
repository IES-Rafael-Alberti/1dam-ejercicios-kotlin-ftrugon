import kotlin.math.min

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
 * pregunte al usuario la nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas.
 * Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir
 */
fun listuplu3ej6() {
    try {

        val listaasignaturas = listOf("Matematicas", "Fisica", "Quimica", "Historia", "Lengua")
        val nuevalista = mutableListOf<String>()
        for (asig in listaasignaturas) {
            print("Dime la nota que has sacado en $asig: ")
            val nota = readln().toFloat()
            if (nota >= 5){
                //listaasignaturas.remove(asig)
                nuevalista.add(asig)
            }
        }
        println(listaasignaturas)
    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Ingresas una palabra y te dice si es o no un palindreomo
 */
fun listuplu3ej8() {
    try {
        print("Dime la palabra a comprobar: ")
        val pal = readln()
        val listapal = pal.split("")
        var comp = true
        for (i in 0 until listapal.size /2) {
            if (listapal[i] != listapal[listapal.size - i -1]) {
                comp = false
                break
            }
        }
        if (comp){
            println("Tu palabra es un palindromo")
        }else{
            println("Tu palabra no es un palindromo")
        }
    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Pide al usuario una palabra y muestra por pantalla el número
 * de veces que contiene cada vocal.
 */
fun listuplu3ej9(){
    print("Dime tu frase: ")
    val vocales = listOf('a','e','i','o','u')
    val frase = readLine() ?: ""
    val dividida = frase.lowercase().toList()
    for (vocal in vocales) {
        var cont = 0
        for (letra in dividida){
            if (letra == vocal) {
                cont ++
            }
        }
        println(" $vocal : $cont ")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * almacena en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8
 * y muestre por pantalla el menor y el mayor de los precios.
 */
fun listuplu3ej10() {
    val listaprecios = listOf(50, 75, 46, 22, 80, 65, 8)
    //No se si el enuncioado se referia mostrar el menor y el mayor o directamente mostrarlos ordenados
    //println(listaprecios.sorted())
    println("${listaprecios.min()}, ${listaprecios.max()}")
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Te da el resultado de 2 matrices
 */
fun listuplu3ej13() {
    val matriz1 = listOf(listOf(1,2), listOf(3,4), listOf(5,6))
    val matriz2 = listOf(listOf(-1,0), listOf(0,1), listOf(1,1))
    val matrizfila = mutableListOf<List<Int>>()

    for (i in matriz1.indices){
        val matrizcolumna = mutableListOf<Int>()

        for (x in 0 until   matriz1[0].size) {

            matrizcolumna.add(matriz1[i][x] * matriz2[i][x])
        }
        matrizfila.add(matrizcolumna)
    }
    println("$matriz1 * $matriz2 = $matrizfila")
}
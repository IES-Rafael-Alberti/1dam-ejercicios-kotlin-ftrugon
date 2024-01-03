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

        for (x in 0 until matriz1[0].size) {

            matrizcolumna.add(matriz1[i][x] * matriz2[i][x])
        }
        matrizfila.add(matrizcolumna)
    }
    println("$matriz1 * $matriz2 = $matrizfila")
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Guarda en un diccionario los precios de las frutas de la tabla, pregunta al usuario por una
 * fruta, un número de kilos y muestre por pantalla el precio de ese número de kilos de fruta. Si la fruta no está en
 * el diccionario muestra un mensaje informando de ello.
 */
fun dicciou3ej3(){
    try {
        val precios = mapOf(
            "platano" to 1.35,
            "manzana" to 0.80,
            "pera" to 0.85,
            "naranja" to 0.70
        )

        println("Platano -> 1.35")
        println("Manzana -> 0.80")
        println("Pera -> 0.85")
        println("Naranja -> 0.70")
        println("Todo es por Kg")

        print("Dime que fruta quieres: ")

        val elegir = readln().lowercase().trim()
        if (elegir in precios){
            print("Cuantos kilos quieres?: ")
            val cuantas = readln().toFloat()
            println("$cuantas Kg de $elegir -> ${String.format("%.2f",cuantas * precios[elegir]!!)}" )
        }else{
            println("La fruta no esta en el catalogo")
        }
    }catch (e:Exception){
        println("eror inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Tiene un diccionario con asignaturas y los creditos de cada asignatura, por cada asignatura
 * muestra sus creditos
 */
fun dicciou3ej5(){
    val diccio = mapOf(
        "matematicas" to 6,
        "Física" to 4,
        "Química" to 5
    )
    for ((asignatura, creditos) in diccio){
        println("En $asignatura tienes $creditos creditos")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Es un diccionario que se va rellenando con informacion que eliga el usuario
 */
fun dicciou3ej6(){
    try {
        val diccionariodepersona = mutableMapOf<String,String>()
        var estado = false
        while (!estado){
            print("Que llave quieres añadir(no pongas nada si quieres acabar): ")
            val cosaanadir = readln()
            if (cosaanadir == ""){
                estado = true
            }else{
                print("Dime el valor de $cosaanadir: ")
                val valor = readln()
                diccionariodepersona[cosaanadir] = valor
                println()
                for ((anadir, valo) in diccionariodepersona){
                    println("La clave |$anadir| tiene como valor |$valo|")
                }
            }
        }
    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Es una lista de la compra, le vas ntroduciendo el articulo y su precio y al final te da la lista y el total
 */
fun dicciou3ej7(){

    val listacompra = mutableMapOf<String,Float>()
    var estado = false
    var total = 0.0
    while (!estado){
        print("Que quieres añadir a la lista de la compra(no pongas nada si quieres acabar): ")
        val cosaanadir = readln()
        if (cosaanadir == ""){
            estado = true
        }else{
            print("Dime el precio de $cosaanadir: ")
            val valor = try {
                readln().toFloat()
            }catch (e:Exception){
                println("error, el coste de $cosaanadir sera 0")
                0.toFloat()
            }
            total += valor
            listacompra[cosaanadir] = valor
            println()
        }
    }
        for ((anadir, valo) in listacompra){
            println("$anadir -> $valo")
        }
    println("Por un total de $total")
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Crea un diccionario con las traducciones y la frase que tu metas cambia cada palabra por la que esta en el diccionario
 * si no esta en el diccionario es la palabra sin traducir la que se queda
 */
fun dicciou3ej8() {
    try {
        val diccio = mutableMapOf<String, String>()
        print("Dime la traduccion: ")
        val intro = readln()
        val separa = intro.split(",")
        for (trad in separa) {
            val massepara = trad.split(":")
            if (massepara.size == 2){
                diccio[massepara[0].trim()] = massepara[1].trim()
            }
        }
        println("Dime una frase con las palabras a traducir: ")
        val frase = readln()
        val listafrase = frase.split(" ")
        for (palabra in listafrase){
            val traduccion = diccio[palabra.trim()] ?: palabra.trim()
            print("$traduccion ")
        }
        println()
    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Es una agenda con clietnes
 */
fun dicciou3ej10(){
    val clientes = mutableMapOf<String,MutableMap<String,Any>>()
    var opcion: Int
    do {
        println("Menú:")
        println("1. Añadir cliente")
        println("2. Eliminar cliente")
        println("3. Mostrar cliente")
        println("4. Listar todos los clientes")
        println("5. Listar clientes preferentes")
        println("6. Terminar")
        print("Seleccione una opción: ")
        opcion = readln().toInt()?: 0
        when (opcion){
            1 -> {
                val cliente = mutableMapOf<String, Any>()
                print("Introduzca el NIF del cliente: ")
                val nif = readln()
                print("Nombre del cliente: ")
                val nombre = readln()
                print("Dirección del cliente: ")
                val direccion = readln()
                print("Teléfono del cliente: ")
                val telefono = readln()
                print("Correo del cliente: ")
                val correo = readln()
                print("¿Es cliente preferente? (s/n): ")
                val preferente = readln()
                var siono = false
                if (preferente == "s"){
                    siono = true
                }

                cliente["Nombre"] = nombre
                cliente["Dirección"] = direccion
                cliente["Teléfono"] = telefono
                cliente["Correo"] = correo
                cliente["Preferente"] = siono

                clientes[nif] = cliente
            }
            2 -> {
                print("Introduzca el NIF del cliente a eliminar: ")
                val nifEliminar = readln()
                if (nifEliminar in clientes.keys){
                    clientes.remove(nifEliminar)
                    println("se ha eliminado el cliente")
                }else{
                    println("El cliente no esta en la base de datos")
                }
            }
            3 -> {
                print("Introduzca el NIF del cliente a mostrar: ")
                val nifMostrar = readln()
                val clienteMostrado = clientes[nifMostrar]
                if (clienteMostrado != null) {
                    println("Datos del cliente con NIF $nifMostrar: $clienteMostrado")
                } else {
                    println("No se encontró ningún cliente con ese NIF.")
                }
            }
            4 -> {
                println("Mostrando todos los clientes: ")
                for ((cli,valor) in clientes){
                    println("$cli: $valor")
                }
            }
            5 -> {
                println("Lista de clientes preferentes:")
                for ((cli,valor) in clientes){
                    if (valor["Preferente"] == true){
                        println("$cli: $valor")
                    }
                }
            }
            6 -> println("saliendo del programa")
            else -> println("Opcion no valida")
        }
    }while (opcion != 6)
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Crea un diccionario de contactos a partir de un texto con saltos de linea
 */
fun dicciou3ej11(){
    val texto = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"

    val div = texto.split("\n")

    val campos = div[0].split(";")

    val clientes = mutableMapOf<String,MutableMap<String,Any>>()

    for (linea in div.subList(1,div.size)){

        if (linea.isNotEmpty()) {

            val valores = linea.split(";")
            val infocli = mutableMapOf<String,Any>()

            if (campos.size == valores.size){
                for (i in 1 until valores.size){
                    infocli[campos[i]] = valores [i]
                }
            }
            clientes[valores[0]] = infocli
        }
    }
    println(clientes)

}
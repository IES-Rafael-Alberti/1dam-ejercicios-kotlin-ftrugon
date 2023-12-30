/**
 * almacene la cadena de caracteres contraseña en una variable, pregunte al usuario por la contraseña e
 * imprima por pantalla si la contraseña introducida por el usuario coincide con la guardada en la variable
 */
fun condiu2ej2(){
    val contra = "contraseña"
    try {
        print("Dime la contraseña: ")
        val micontra = readln()
        if (micontra.lowercase() == contra.lowercase()) {
            print("Contraseña correcta, iniciando sesion")
        }else {
            print("constraseña incorrecta")
        }
    }catch (e:Exception) {
        print("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------

/**
 * Pide al usuario dos números y muestra por pantalla su división.
 * Si el divisor es cero el programa mostrara un error
 */

fun condiu2ej3() {
    try {
        println("Dime 2 numeros a dividir: ")
        print("Dividendo: ")
        val dividen = readln().toInt()
        print("Divisor: ")
        val divisor = readln().toInt()
        if (divisor == 0) {
            print("Imagínate que tienes cero galletas y la repartes entre cero amigos. ¿Cuántas galletas le tocan a \n" +
                    "cada amigo? No tiene sentido, ¿lo ves? Así que el Monstruo de las galletas está triste porque \n" +
                    "no tiene galletas y tu estás triste porque no tienes amigos")
        }else {
            println("${dividen / divisor}")
        }
    }catch (e:Exception) {
        print("Error Inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Te pide el sexo y el apellido, dependiendo de la respuesta estas en el grupo A B o en ninguno
 */
fun condiu2ej6 () {
    try {
        print("Dime el sexo(h,m): ")
        val sexo = readln()
        if (sexo.lowercase() == "h") {
            print("Dime tu apellido: ")
            val apellido = readln()
            if (apellido[0] >= 'm'){
                println("perteneces al grupo B")
            }else{
                println("no perteneces a ningun grupo")
            }
        }else if (sexo.lowercase() == "m") {
            print("Dime tu apellido: ")
            val apellido = readln()
            if (apellido[0] < 'm'){
                println("perteneces al grupo A")
            }else{
                println("no perteneces a ningun grupo")
            }
        }
    }catch (e:Exception) {
        print("En la puta me cago")
    }
}
// ------------------------------------------------------------------------------------------------------------------

/**
 * Pide al usuario su puntuacion y calcula el dinero correspondiente
 */
fun condiu2ej8(){
    try {

        println("Dime tu evaluacion: ")
        println("NIVEL -------- PUNTUACION")
        println("Inaceptable -- 0.0")
        println("Aceptable ---- 0.4")
        println("Meritorio ---- 0.6 o más")

        val ceroalgo = try {
            readln().toFloat()
        }catch (e:Exception) {
            println("Error de lectura, el numero sera 0.0")
            0.0f
        }

        val cobrado = ceroalgo * 2400f

        if (ceroalgo == 0.0f){
            println("Tu nivel es inaceptable,vas a recibir $cobrado€")
        }else if(ceroalgo == 0.4f){
            println("Tu nivel es aceptable, vas a recibir $cobrado€")
        }else if (ceroalgo > 0.6f) {
            println("Tu nivel es meritario, vas a recibir $cobrado€")
        }else{
            println("Numero no valido")
        }
    }catch (e:Exception) {
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Pide al usuario elegir una pizza y un ingrediente
 */
fun condiu2ej10(){
    println("Bienvenido a Bella Napoli")
    print("¿Quieres una pizza vegetariana? (S/N): ")
    val respuesta = readln().uppercase()
    when (respuesta) {
        "N" -> {
            println("los ingredientes no vegetarianos son los siguientes, elige 1:")
            println("1.Peperoni")
            println("2.Jamón")
            println("3.Salmón")
            val elige = try {
                readln().toInt()
            }catch (e:Exception){
                println("opcion no valida")
            }
            val elegido = when (elige)  {
                1 -> "Peperoni"
                2 -> "Jamon"
                3 -> "Salmon"
                else -> {"nada"}
            }
            println("Tu pizza no es vegetariana y ademas de el tomate y mozarella que tienen todas las pizzas, tiene $elegido")

        }
        "S" -> {
            println("los ingredientes vegetarianos son los siguientes, elige 1:")
            println("1.Pimiento")
            println("2.tofu")
            val elige = try {
                readln().toInt()
            }catch (e:Exception){
                println("opcion no valida")
            }
            val elegido = when (elige)  {
                1 -> "Pimiento"
                2 -> "tofu"
                else -> {"nada"}
            }
            println("Tu pizza es vegetariana y ademas de el tomate y mozarella que tienen todas las pizzas, tiene $elegido")
        }
        else -> {
            println("Opcion no valida")
        }
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Le pide al usuario su edad y si es valida cuenta desde el 1 hasta lo que ha introducido el usuario
 */
fun iteru2ej2(){
    print("Dime tu edad: ")
    val edad = try {
        readln().toInt()
    }catch (e:Exception) {
        println("Edad no valida, se contara como que tienes 100 años")
        100
    }
    if (edad < 0 ){
        println("Te estan haciendo o estas en el limbo?")
    } else if (edad > 125){
      println("Como estaban los dinosaurios?")
    }else{
        for (i in 1..edad) {
            println("año $i")
        }
    }

}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Pide un numero y hace una cadena de ese numero asta 0
 */
fun iteru2ej4() {
    print("Dime un numero entero positivo: ")
    val num = try {
        readln().toInt()
    }catch (e:Exception) {
        println("Numero no valido, se contara como 100")
        100
    }
    if (num<0){
        println("Numero no valido")
    }else{
        var linea = ""
        for (i in 0..num) {
            if (i == 0){
                linea += i
            }else{
                linea += ",$i"
            }
        }
        val invertida = linea.split(",").reversed().joinToString (",")
        println(invertida)
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Pide al usuario un numero y hace el numero de estrellas que le haya dicho
 */
fun iteru2ej6() {
    print("Dime el numero de estrellitas que quieras: ")
    val num = try {
        readln().toInt()
    }catch (e:Exception) {
        println("Numero no valido, se contara como 10")
        10
    }
    if (num<0){
        println("Numero no valido")
    }else{
        var linea = ""
        for (i in 1..num){
            linea += "*"
            println(linea)
        }
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Hace la tabla de multiplicar del 1 al 10
 */
fun iteru2ej7(){
    for (i in 1..10){
        println("\nTabla del $i")
        for (j in 1..10){
            println("$i x $j = ${i * j}")
        }
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Pide un numero y hace un triangulo hacia abajo de 2 + num
 */
fun iteru2ej8(){
    print("Dime el numero que quieras: ")
    val num = try {
        readln().toInt()
    }catch (e:Exception) {
        println("Numero no valido, se contara como 10")
        10
    }
    var nume = 1
    var linea = ""
    for (i in 1..num){

        linea = "$nume $linea"
        println(linea)
        nume += 2
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Puedes poner frases y cosas asta poner salir
 */
fun iteru2ej13(){
    try {
    println("Empieza a poner tus cosas, salir si quieres que el programa acabe")
    var estado = false
    while (!estado) {
        val frase = readln()
        if (frase == "salir"){
            estado = true
        }
    }
    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Lee números enteros de teclado, hasta que el usuario ingrese el 0 y muestra la sumatoria de todos los
 * números positivos ingresados.
 */
fun iteru2ej15() {
    try {
        println("Escribe numeros enteros, yo los sumo")
        var linea = ""
        var estado = false
        var sumado = 0
        while (!estado){
            print("Dime el numero a sumar, 0 si quieres acabar: ")
            val num = readln().toInt()
            if (num == 0){
                estado = true
            }else{
                sumado += num
                linea += "+$num"
            }
        }
        val lineasinelmas = linea.substring(1)
        println("$lineasinelmas = $sumado")
    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Solicita al usuario que ingrese números enteros positivos y, por cada uno, imprimir la suma de los dígitos que lo
 * componen. La condición de corte es que se ingrese el número -1. Al finalizar, muestra cuántos de los números
 * ingresados por el usuario fueron números pares.
 */
fun iteru2ej18() {
    try {
        println("Ingresa numeros positivos, -1 si quieres acabar")
        var estado = false
        var par = 0
        while (!estado) {
            print("Dime un numero: ")
            val num = readln().toInt()
            if (num == -1){
                estado = true
            }else if (num < -1){
                println("El numero tiene que ser positivo")
                estado = true
            }else{
                var numero = num
                var suma = 0
                while (numero != 0) {
                    val digi = numero % 10
                    suma += digi
                    numero /= 10
                }
                if (num % 2 == 0) {
                    par ++
                }
                println("La suma de los digitos de $num es: $suma")
            }
        }
        println("Hay $par numeros pares")

    }catch (e:Exception) {
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado, 3-finalizar programa. A continuación,
 * el usuario debe poder seleccionar una opción (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El
 * menú se debe volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si elige las opciones 1
 * ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá la impresión del menú y el programa finalizará.
 */
fun iteru2ej19() {
    var estado = false
    do {

        impopciones()
        print("Seleccione una opción: ")
        val opcion = try {
            readln().toInt()
        }catch (e:Exception){
            4
        }
        clearscreen()
        when (opcion){
            1 -> println("Has elegido la opcion 1")
            2 -> println("Has elegido la opcion 2")
            3 -> {
                println("Saliendo del programa")
                estado = true
            }
            else -> println("Opcion no valida")
        }

    }while (!estado)
}

fun impopciones(){
    println("1. Comenzar programa")
    println("2. Imprimir listado")
    println("3. Finalizar programa")
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Le pide al usuario una frase y devuelve un la palabra mas larga, el tamaño de la palabra y el numero de palabras
 * de la frase
 */
fun iteru2ej25(){
    print("Dime tu frase: ")
    val frase = readln()
    val separada = frase.split(" ")
    var maslarga = ""
    var contar = 0
    if (frase.isNotBlank()) {
        for (palabra in separada){
            if (palabra.length > maslarga.length){
                maslarga = palabra
            }
            contar ++
        }
        println("La palabra mas larga es: $maslarga con ${maslarga.length} letras")
        println("La frase tenia $contar palabras")
    }else{
        println("La frase introducida no es valida")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos
 * los números impares desde 1 hasta ese número separados por comas.
 */
fun exepu2ej2() {
    try {
        print("Dime el numero: ")
        val num = readln().toInt()
        var linea = ""
        for (i in 0..num){
            if (i % 2 == 1) {
                //if (i == 1){
                //    linea += "$i"
                //}else{
                //    linea += ", $i"
                //}
                linea += if (i == 1){
                    "$i"
                }else{
                    ", $i"
                }
            }
        }
        println(linea)
    }catch (e:Exception){
        println("Error inesperdo")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla la cuenta atrás
 * desde ese número hasta cero separados por comas. Deberá solicitar el número hasta introducir uno correcto.
 */
fun exepu2ej3() {
    try {
        print("Dime el numero: ")
        val num = readln().toInt()
        var linea = ""
        for (i in 0..num){
            //if (i == 0){
            //    linea = "$i"
            //}else{
            //    linea = "$i,$linea"
            //}
            linea = if (i == 0){
                "$i"
            }else{
                "$i,$linea"
            }
        }
        println(linea)

    }catch (e:Exception){
        println("Error inesperado")
    }
}
// ------------------------------------------------------------------------------------------------------------------
/**
 * un programa que pida al usuario un número entero, si la entrada no es correcta, mostrará el mensaje
 * "La entrada no es correcta" y lanzará la excepción capturada.
 */
fun exepu2ej4() {
    try {
        print("Dime un numero: ")
        val num = readln().toInt()
    }catch (e:Exception){
        println("La entrada no es valida")
    }
}
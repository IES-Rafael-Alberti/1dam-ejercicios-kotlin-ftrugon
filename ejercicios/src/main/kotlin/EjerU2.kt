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
                linea +="," + i
            }
        }
        val invertida = linea.split(",").reversed().joinToString (",")
        println(invertida)
    }
}

// ------------------------------------------------------------------------------------------------------------------

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
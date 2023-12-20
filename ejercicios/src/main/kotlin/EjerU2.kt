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
fun condiu2ej8(){
    try {

    }catch (e:Exception) {
        println("Error inesperado")
    }
}

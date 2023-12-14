 /**
  * Pide al usuario una temperatura en celsius y la combierte en farenheight
  */
 fun u1ej1(){
     print("Dime el numero a transformar: ")
     try {
         var num = readln().toFloat() * 9/5 +32

         println("La temperatura en Farenheight es $num")
     }catch (e:Exception){
         println("Numero introducido no valido")
     }
 }
// ------------------------------------------------------------------------------------------------------------------
 /**
  * Pide el importe final de un artículo, calcula e imprime por pantalla el IVA que se ha pagado y el importe sin IVA
  */

 fun u1ej6 () {
     try {
         print("Cual a sido el importe final del articulo: ")
         var pagado = readln().toFloat()
         var ivapagado = pagado *10/100
         var articulosiniva = pagado - ivapagado
         println("Has pagado $ivapagado€ de iva y el importe sin iva es $articulosiniva")
     }catch (e:Exception){
         println("Tienes que poner numeros")
     }
 }
// ------------------------------------------------------------------------------------------------------------------
 /**
  * Pide el peso y la estatura y calcula la masa corporal
  */
 fun u1ej12 () {
     try {
         print("Dime tu peso en Kg: ")
         val peso = readln().toFloat()
         print("Ahora tu altura en metros: ")
         val altura = readln().toFloat()
         val indicecorp = peso / (altura*altura)
         println("Tu indice de masa corporal es de $indicecorp")
     }catch (e:Exception){
         println("Los datos introducidos estan mal")
     }
 }
// ------------------------------------------------------------------------------------------------------------------
 /**
  * Calcula el interes del 0.04% de un valor que hayamos introducido
  */

 fun u1ej15 () {
     try {
         print("Cunato dinero vas a meter a la cuenta?: ")
         val ingre = readln().toFloat()
         val ano1 = (ingre * 1.04)
         val ano2 = (ano1 * 1.04)
         val ano3 = (ano2 * 1.04)
         println("El interes en el primer año sera de ${String.format("%.2f",ano1)} el del segundo año sera ${String.format("%.2f",ano2)} y el del tercero ${String.format("%.2f",ano3)}")
     }catch (e: Exception){
         println("Parametro incorrecto")
     }
 }
// ------------------------------------------------------------------------------------------------------------------
 /**
  * Te pide el nombre y lo pone en minusculas, mayusculas y en title
  */
 fun u1ej18 () {
    try {
        print("Dime tu nombre: ")
        val nombre = readln()
        println("Todo tu nombre en minusculas es ${nombre.lowercase()}")
        println("Todo tu nombre en mayusculas es ${nombre.uppercase()}")
        println("Todo tu nombre en formato titulo es $nombre")

    }catch (e: Exception){
        print("Parametro incorrecto")
    }
}
// ------------------------------------------------------------------------------------------------------------------
 /**
  * Te pide un numero con formato +34-123456789-01
  */
 fun u1ej20 () {
    try {
        print("Dime el numero de telefono con este formato +34-123456789-01: ")
        val telefono = readln()
        val separado = telefono.split("-")
        println("el numero de telefono sin el prefijo ni extension es ${separado[1]}")
    }catch (e:Exception) {
        println("Parametro incorrecto")
    }
}
// ------------------------------------------------------------------------------------------------------------------
 /**
  * Pide al usuario una frase y la invierte
  */
 fun u1ej21 (){
     print("Dime una frase y yo la invierto: ")
     val frase = readln()
     println("La frase invertida es:")
     println(frase.reversed())
 }
// ------------------------------------------------------------------------------------------------------------------
fun u1ej22 () {

    print("Dime una frase")
    val frase = readln()
    print("Ahora una vocal")
    val vocal = readln()
    val frasedereplace = frase.replace(vocal.lowercase(),vocal.uppercase())
    println(frasedereplace)
}
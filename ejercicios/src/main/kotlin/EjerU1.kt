fun u1ej1(){
    print("Dime el numero a transformar: ")
    var num = try {
        readln().toFloat()

    } catch (e: Exception) {
        println("Numero no valido")
        readln()
    }

    //val resultado: Int = (num * 9/5) +32
    //println("La temperatura introducida en grados Fahrenheit es de $resultado")
}
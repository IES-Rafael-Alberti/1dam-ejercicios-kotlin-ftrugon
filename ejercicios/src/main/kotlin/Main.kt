val impu1 = arrayOf("ej1","ej6","ej12", "ej15", "ej18", "ej20", "ej21", "ej22", "ej24", "ej25", "ej26", "ej27")
val impu2 = arrayOf("Condicionales","Sentencias Iterativas","Captura de excepciones")
val impu2condi = arrayOf("ej2", "ej3", "ej6", "ej8", "ej10")
val impu2iter = arrayOf("ej2", "ej4", "ej6", "ej7", "ej8", "ej13","ej15","ej18","ej19","ej25")
val impu2exce = arrayOf("ej2", "ej3", "ej4")
val impu3 = arrayOf("Listas y tuplas", "Diccionarios", "Conjuntos")
val impu3list = arrayOf("ej4", "ej6", "ej8", "ej9", "ej10", "ej13")
val impu3dicci = arrayOf("ej3", "ej5", "ej6", "ej7", "ej8", "ej10", "ej11")
val impu3conj = arrayOf("ej1", "ej2", "ej3", "ej4", "ej5", "ej6")

/**
 * Es un cls mal hecho
 */
fun clearscreen (){
    for (i in 1..100)
        println()
}

/**
 * Toda funcion que lleve imp delante es para imprimir un menu
 */
fun impunidades(){
    println("1. U1")
    println("2. U2")
    println("3. U3")
    println("4. Acabar programa")
}


fun inpu (ejercicios: Array<String>){
    var i = 1
    for (ejercicio in ejercicios){
        println("$i. $ejercicio")
        i++
    }
    println("$i. atras")
}

/**
 * @param min: La opcion minima del menu
 * @param max: La opcion maxima del menu
 * @return La opcion elegida
 */
fun elegir(min:Int,max:Int) :Int{
    print("Opcion: ")
    var opcion = try {
        readln().toInt()
    }catch (e:Exception){
        0
    }
    if (opcion < min || opcion> max ){
        opcion = 0
    }
    return opcion
}

/**
 * main tiene un menu en el que puedes elegir el ejercicio
 */
fun main() {

    do {
        impunidades()
        val opcion = elegir(1,4)
        when (opcion){
            1-> {
                println()
                inpu(impu1)
                val opcion2 = elegir(1,13)
                when (opcion2){
                    1->u1ej1()
                    2->u1ej6()
                    3->u1ej12()
                    4->u1ej15()
                    5->u1ej18()
                    6->u1ej20()
                    7->u1ej21()
                    8->u1ej22()
                    9->u1ej24()
                    10->u1ej25()
                    11->u1ej26()
                    12->u1ej27()
                    13-> continue
                    else-> println("Opcion no valida")
                }
            }
            2-> {
                println()
                inpu(impu2)
                val opcion2 = elegir(1,4)
                when (opcion2){
                    1-> {
                        println()
                        inpu(impu2condi)
                        val opcion3 = elegir(1,6)
                        when (opcion3) {
                            1->condiu2ej2()
                            2->condiu2ej3()
                            3->condiu2ej6()
                            4->condiu2ej8()
                            5->condiu2ej10()
                            6-> continue
                            else-> println("Opcion no valida")
                        }
                    }
                    2-> {
                        println()
                        inpu(impu2iter)
                        val opcion3 = elegir(1,11)
                        when (opcion3) {
                            1->iteru2ej2()
                            2->iteru2ej4()
                            3->iteru2ej6()
                            4->iteru2ej7()
                            5->iteru2ej8()
                            6->iteru2ej13()
                            7->iteru2ej15()
                            8->iteru2ej18()
                            9-> iteru2ej19()
                            10->iteru2ej25()
                            11-> continue
                            else-> println("Opcion no valida")
                        }
                    }
                    3-> {
                        println()
                        inpu(impu2exce)
                        val opcion3 = elegir(1,4)
                        when (opcion3) {
                            1->exepu2ej2()
                            2->exepu2ej3()
                            3->exepu2ej4()
                            4-> continue
                            else-> println("Opcion no valida")
                        }
                    }
                    4-> continue
                }
            }
            3->{
                println()
                inpu(impu3)
                val opcion2 = elegir(1,4)
                when(opcion2) {
                    1->{
                        println()
                        inpu(impu3list)
                        val opcion3 = elegir(1,7)
                        when(opcion3){
                            1-> listuplu3ej4()
                            2-> listuplu3ej6()
                            3-> listuplu3ej8()
                            4-> listuplu3ej9()
                            5-> listuplu3ej10()
                            6-> listuplu3ej13()
                            7-> continue
                            else-> println("Opcion no valida")
                        }
                    }
                    2->{
                        println()
                        inpu(impu3dicci)
                        val opcion3 = elegir(1,8)
                        when(opcion3){
                            1->dicciou3ej3()
                            2->dicciou3ej5()
                            3->dicciou3ej6()
                            4->dicciou3ej7()
                            5->dicciou3ej8()
                            6->dicciou3ej10()
                            7->dicciou3ej11()
                            8-> continue
                            else-> println("Opcion no valida")
                        }
                    }
                    3->{
                        println()
                        inpu(impu3conj)
                        val opcion3 = elegir(1,7)
                        when(opcion3){
                            1-> conju3ej1()
                            2-> conju3ej2()
                            3-> conju3ej3()
                            4-> conju3ej4()
                            5-> conju3ej5()
                            6-> conju3ej6()
                            7-> continue
                            else-> println("Opcion no valida")
                        }
                    }
                    4-> continue
                }
            }
            4-> println("Cerrando programa")
            else -> {println("Opcion no valida")}
        }
        println()
    }while (opcion != 4)
}
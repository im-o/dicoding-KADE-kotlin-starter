package learnclass

/**
 * created by Rivaldy on 11/1/2019
 */

val msg =  {println("Hello lambda!")}
val msg1 = {params : String -> println(params)}
val luas = {alas : Int, tinggi : Int -> alas * tinggi}

fun main() {
    msg()
    msg1("Hello lambda 1")
    println("Hasil : ${luas(20, 10)}")
}
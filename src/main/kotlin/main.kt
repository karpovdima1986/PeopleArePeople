package ru.netology


fun main() {
    val likes = readln()!!.toInt()
    val solution = if (likes % 10 == 1 && likes % 100 != 11) "Человеку" else "Людям"
    println(" Понравилось $likes $solution")
}










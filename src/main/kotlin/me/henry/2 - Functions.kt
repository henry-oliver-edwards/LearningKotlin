package me.henry

fun printHello(): Unit {
    println("Hello")
}

fun greetName(name: String): Unit {
    println("Greetings $name")
}

fun add(x: Int, y: Int = 1): Int {
    return x + y
}

fun main(args: Array<String>) {
    printHello()
    greetName("Henry")
    add(5)
    add(10, 20)
}

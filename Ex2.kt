package TP10

fun main() {
    val thread = Thread {
        for (i in 1..10) {
            println(i)
            Thread.sleep(1000)
        }
    }
    thread.start()
    Thread.sleep(5000)
    thread.interrupt()
    println("Comptage arrêté")
}
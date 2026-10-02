package TP10

class Alphabet : Runnable {
    override fun run() {
        for (c in 'A'..'Z') {
            println(c)
            Thread.sleep(500)
        }
    }
}

fun main() {
    val thread = Thread(Alphabet())
    thread.start()
}
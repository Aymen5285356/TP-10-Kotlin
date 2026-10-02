package TP10

class Personne {
    lateinit var name: String
    val description: String by lazy { "Nom: $name" }
}

fun main() {
    val p = Personne()
    p.name = "Aymen"
    println(p.description)
    println(p.description)
}
package TP10

fun addition(a: Int, b: Int, callback: (Int) -> Unit) {
    val resultat = a + b
    callback(resultat)
}

fun main() {
    addition(5, 3) { resultat ->
        println("Résultat : $resultat")
    }
}
/*
This exercise is getting the value in the map.
*/
fun main() {
    val number2word = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    val n = 2
    println("$n is spelt as '${number2word.get(n)}'")
    println("$n is spelt as '${number2word[n]}'") //alternative solution
}

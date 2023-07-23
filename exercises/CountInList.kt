/*
This exercise is for printing total number of elements in two different lists.
*/
fun main() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val count = greenNumbers.count() + redNumbers.count()
    println(count)
}

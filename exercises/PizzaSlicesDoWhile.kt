fun main() {
    var pizzaSlices = 0
    // Start refactoring here
    do {
        pizzaSlices++
    	println("There's only $pizzaSlices slice/s of pizza :(")
    } while(pizzaSlices < 7)
    pizzaSlices++
    // End refactoring here
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

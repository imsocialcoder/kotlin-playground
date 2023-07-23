fun main() {
    for(i in 1..100){
        if(i%15==0)
        	println("fizzbuzz")
        else if(i%3==0)
        	println("fizz")
        else if(i%5==0)
        	println("buzz")
        else
        	println(i)
    }

    for(i in 1..100){
       println(
         when{
           i%15==0 -> "fizzbuzz"
           i%3==0 -> "fizz"
           i%5==0 -> "buzz"
           else -> i
         }
      )
    }
}

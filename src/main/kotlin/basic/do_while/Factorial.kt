package basic.do_while

fun main(args:Array<String>){
    var number =6
    var fact =1
    do {
        fact = fact*number
        number--
        println("$number factorial is $fact*$number ="+fact)
    }while (number>0)
    println("factorial is $fact")

    var num=5
    var result =1
    while (num>0){
        result = result * num
        num--
        println("$num factorial is $result*$num ="+result)
    }
    println("factorial is:"+result)

}

/*Iteration Steps:
First Iteration:

fact = fact * number = 1 * 6 = 6
Decrement number: number = 5
Second Iteration:

fact = fact * number = 6 * 5 = 30
Decrement number: number = 4
Third Iteration:

fact = fact * number = 30 * 4 = 120
Decrement number: number = 3
Fourth Iteration:

fact = fact * number = 120 * 3 = 360
Decrement number: number = 2
Fifth Iteration:

fact = fact * number = 360 * 2 = 720
Decrement number: number = 1
Sixth Iteration:

fact = fact * number = 720 * 1 = 720
Decrement number: number = 0
*/
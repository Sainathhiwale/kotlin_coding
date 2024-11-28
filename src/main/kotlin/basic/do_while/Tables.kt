package basic.do_while

fun main(args:Array<String>){
    var index=1
    var result =0
    while(index<=10){
         result = index*2
         println("$index * $result = "+result)
         index++
    }
    println("=======do while=======")
    var num =1
    var sum =0
    do {
        sum = num*2
        println("$num * $sum = "+sum)
        num++
    }while (num<=10)

    var factorial =5
    var fact =1
    do {
        fact = fact*factorial
        factorial--
    }while (factorial>0)
    println(fact)
}
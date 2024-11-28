package basic.forlopp

fun main(args:Array<String>){

    for (i in 1..10){
        println(i)
    }
    println("=====step 3======")
    for (i in 1..10 step 3){
        println("$i")
    }
    println("Iterate through Range from top to down with using downTo")
    for (i in 5 downTo 1){
        println(i)
    }

    print("user assign value for iteration")
    var num =20
    for (i in 1..num step 2){
        println(i)
    }
    for (i in num  downTo(1)){
        println("Down To:" + i)
    }
    print("Iterate through Range from top to down with using downTo")

    for (i in 10 downTo 1 step (2)){
        println("downto and step: "+ i)
    }
}
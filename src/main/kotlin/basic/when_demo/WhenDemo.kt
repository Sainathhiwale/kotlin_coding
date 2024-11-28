package basic.when_demo

import java.util.Scanner

fun main(args:Array<String>){

    val scanner = Scanner(System.`in`)
    println("enter the name")
    var num = scanner.nextInt()
    when (num){
        1 -> {
            print(" number is $num")
        }
        2->{
            print("number is $num")
        }
        3->{
            print("number is $num")
        }
    }

}
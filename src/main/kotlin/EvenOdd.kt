import java.util.Scanner

fun main(args: Array<String>){
  val number1 = Scanner(System.`in`)
    print("enter an integer")
    var enteredNumber:Int = number1.nextInt()
    if (enteredNumber%2==0){
        println("given number is even: $enteredNumber")
    }else{
        println("given number is odd: $enteredNumber")
    }
}
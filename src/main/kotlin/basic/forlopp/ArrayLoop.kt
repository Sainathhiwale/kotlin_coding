package basic.forlopp

fun main(args:Array<String>){
    val name = arrayOf("ravi","mahesh","raju","rakesh","mukesh")
    for (i in name){
        println(i)
    }
    val number = arrayOf(1,2,3,4,5,6,7,8,9)
    for (i in number){
       if (i%2==0){
           println("this even number: $i")
       }else{
           println("this odd number: $i")
       }
    }
    var num =5
    for (i in 1..num){
        print(i)
    }

}
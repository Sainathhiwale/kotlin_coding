package basic.array_demo

fun main(args:Array<String>){
    val number = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for (num in number){
        if (num%2==0){
            println(num)
        }
    }
}
package Asked_Program.asked_block_code

fun main(args:Array<String>){

    val num = listOf(6,2,3,4,5,8)
    val filtered =  num.filter { it>2 }.filter { it<7 }
    println(filtered)
}
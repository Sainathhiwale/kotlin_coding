package basic.do_while

fun main(args:Array<String>){
    var index =0
    val name = arrayOf("Ravi","Raju","Rajkumar","Rajesh","Raveen")
    while (index<name.size){
        println(name[index])
        index++
    }
}
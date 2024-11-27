package basic.do_while

fun main(args:Array<String>){
    var index=0
    var name = arrayOf("ravi","Raju","Rajkumar","Rakesh","Rocky","Raju")
    do {
        println(name[index])
        index++

    }while (index<name.size)
}
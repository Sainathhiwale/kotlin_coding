package basic.scope_function

fun main(args:Array<String>){

    var name:String? = "sainath"
    val resultData = name?.let {
        println(it)
        it.length
    }
    println(resultData)
}
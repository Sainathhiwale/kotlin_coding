package oops

class CheckCast {
    val x:Any ="Sainath"
    val y:Any =1
    fun check():Boolean{
        if (x is String) {
            return true
        }

        return false
    }
    val message = if (y is Int) "true" else "false"
}

fun main(args:Array<String>) {
    val obj = CheckCast()
    println(obj.check())
    println(obj.message)
}
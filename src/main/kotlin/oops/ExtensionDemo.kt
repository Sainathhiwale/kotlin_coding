package oops

class ExtensionDemo {


}
// check even or odd
fun Int.isEven ():Boolean = this % 2 == 0

fun List<Int>.evenOdd():List<Int>{
    return this.filter { it % 2 == 0 }
}

fun Int.greater(y:Int):Int{
    if (this > y)
        return this
    else
        return y
}
fun main(args:Array<String>){
    val obj = ExceptionDemo()
    val x:Int =10
    val y:Int =20
    val max:Int = x.greater(y)
    println(max)
    val num =3
    val evenodd = num.isEven()
    println(evenodd)
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    println(numbers.evenOdd())
}
package basic.scope_function

fun main(args:Array<String>){

    val person = Person().apply {
        name ="sainath"
        age = 33
    }
    println(person)
}
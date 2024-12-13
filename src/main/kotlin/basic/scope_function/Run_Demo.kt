package basic.scope_function

fun main(args:Array<String>){
    val person = Person("sainath",33)
    val data = person.run {
        age>=18
    }
    println(data)
}
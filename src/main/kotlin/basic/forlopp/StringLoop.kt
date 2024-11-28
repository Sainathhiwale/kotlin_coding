package basic.forlopp

fun main(args:Array<String>){
    var name ="sainath"
    var lastName = "Hiwale"
    for (i in name){
        print(i)
    }
    println()
    for (alphabet in lastName.indices){
        println(lastName[alphabet]+"")
    }
    // convert string into char
    var address ="Pune"
    val ch = address.toCharArray()
    for (i in ch){
        println(i)
    }
}
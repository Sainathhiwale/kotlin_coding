package oops

class SeconderyConstructor constructor(name:String){
   var address:String =""
   var age:Int =0
    init {
        println("Primary constructor: the name of student is: $name")
    }

    constructor(name: String,address:String, age:Int):this(name){
        this.age=age
        this.address=address
    }

}

fun main(args:Array<String>){
   val obj = SeconderyConstructor("sainath","Pune",34)
    println(obj.address) // secondary constructor value
    println(obj.age)
}
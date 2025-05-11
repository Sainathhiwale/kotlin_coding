package oops

open class InheritanceDemo constructor(name:String) {
    var name:String=""
    var age:Int =0
    var address:String=""

    init {
        this.name=name
    }
    constructor(name:String, age:Int, address:String):this(name){
        this.age = age
        this.address =address
    }
    fun display(lastName: String){
        println("Super class $lastName")
    }
}

class Test(name: String) : InheritanceDemo(name) {

    constructor(name: String,age: Int,address: String) : this(name) {
        this.name=name
        this.address=address
        this.age=age
    }


}

fun main(args:Array<String>){
    val obj = Test("sainath",23,"pune")
    println(obj.age)
    println(obj.name)
    println(obj.address)
    obj.display("rohan")
}
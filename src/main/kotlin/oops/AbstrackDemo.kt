package oops

abstract class AbstrackDemo {
    val salary:Int = 32
    abstract var bouns:Int
    fun display(){
        println("Hello non-abstract method $salary")
    }
   abstract fun details()
}

class Employee : AbstrackDemo(){
    val name:String = "Sainath"
    override var bouns: Int = 20


    override fun details() {
        println("sub class method is called")
        println(bouns)
    }

}
fun main(args:Array<String>){

    val obj = Employee()
    obj.display()
    obj.details()
    println(obj.name)
}
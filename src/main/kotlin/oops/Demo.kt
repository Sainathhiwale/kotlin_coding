package oops

class Demo {
    val name: String =""
    val age: Int =0
    fun display(name:String,age:Int){
        println("I am $name and having $age years old")
    }

}
fun main(arg:Array<String>){
    val demo = Demo()
    demo.display("sainath",34)
}
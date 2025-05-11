package oops

interface  InterfaceDemo {
    val name:String
    fun display()
     fun info(){
         println("I am sainath")
     }

}
interface Salary{
    val salary:Int
    fun getSalary(){
        println(salary)
    }
}

class Details :InterfaceDemo, Salary{
    override val name: String ="sainath"


    override fun display() {
        println(name)
    }

    override val salary: Int =20000

}

fun main(args:Array<String>){
    val obj = Details()
    obj.display()
    obj.info()
    println(obj.salary)
}
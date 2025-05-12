package oops

object ObjectDemo {

    val salary =100
    fun emp(x:Int,y:Int):Int{
        return x*y
    }
    fun display(){
        println("this salary is $salary")
    }
}

 fun main(args:Array<String>){

     println(ObjectDemo.emp(100,100))
     ObjectDemo.display()
 }
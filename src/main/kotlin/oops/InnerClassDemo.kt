package oops

    class InnerClassDemo {
        val address:String ="Pune"
        val name:String=""
        val age:Int=0
        fun display(name:String,age:Int){
            println("I am $name and having $age years old")

        }

        inner class Test{
            fun getOuter() {
                println("Hello")
                println("address is $address")
            }
    }
}


fun main(args:Array<String>){
   val obj = InnerClassDemo().Test()
    obj.getOuter() // get access outer class member function and variable in to inner class through the inner keyword

}
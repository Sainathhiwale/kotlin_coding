package oops

class PrimaryConstructor constructor(name:String,age:Int) {
    var  name:String =""
    var age :Int =0
    init {
         this.age=age
         this.name=name  // we can use this keyword in init block to initalise value
    }
   /* init {
        println("the name of student is: $name")
        println("the age of student is: $age") // this second way to init
    }*/
}

fun main(args:Array<String>){
     val obj = PrimaryConstructor("sainath",33)
      println(obj.age)
      println(obj.name)

}
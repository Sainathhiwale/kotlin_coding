package oops

data class DataClassDemo(var name:String, var age:Int, var address:String, var salary: Double, var employeId:Int)

fun main(args:Array<String>){
    val obj = DataClassDemo("sainath",22,"pune",12000.00, 1394)
    println(obj)

    val copyObj = obj.copy()
    println("copied object value $copyObj")

    val obj2 = DataClassDemo("mahesh",24,"gujarat",13000.00, 1395)
    println(obj2)

}

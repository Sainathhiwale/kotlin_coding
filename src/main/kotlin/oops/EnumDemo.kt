package oops

enum class EnumDemo(var diameter:Int =30) {
    SMALL(10){
        fun prize(){
            println("small prize is 10")
        }
    },
    MEDIUM(20){
              fun prize(){
                  println("medium prize is 20")
              }
              },
    LARGE(30){
        fun prize(){
            println("large prize is 30")
        }
    },
}

fun main(args:Array<String>){
    println(EnumDemo.LARGE.diameter)
    println(EnumDemo.SMALL.diameter)
    println(EnumDemo.MEDIUM.diameter)
}
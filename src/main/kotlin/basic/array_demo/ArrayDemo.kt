package basic.array_demo

fun main(args:Array<String>){

    val number = arrayOf(1,2,3,4,5,6,7,8,9,10)
    number.shuffle()
    for (i in 0..number.size-1){
        println(number.joinToString())
    }
    val num = arrayOf(10,7,8,4,5,9,6,1,2,3)
    num.sort()
     for (i in 0..num.size-1){
         println(num[i])
     }

    println("============empty array==============")
    val name = arrayOf<String>("sainath","mahesh","ganesh")
    name.set(0,"bhramha")
    name.set(1,"vinshu")
    name.set(2,"mahesh")
    println(name.get(2))


}

/*
Function	Purpose
sorted()	Creates a new list in ascending order (immutable).
sort()	Sorts a mutable list in ascending order in-place.
sortedDescending()	Creates a new list in descending order (immutable).
sortDescending()	Sorts a mutable list in descending order in-place.
sortedBy {}	Creates a new list based on custom logic (ascending).
sortedByDescending {}	Creates a new list based on custom logic (descending).
sortBy {}	Sorts a mutable list based on custom logic (ascending).
sortByDescending {}	Sorts a mutable list based on custom logic (descending).
* */
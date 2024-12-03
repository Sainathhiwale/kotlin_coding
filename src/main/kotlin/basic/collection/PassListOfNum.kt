package basic.collection

fun main(args:Array<String>){

    val num = listOf(1,3,2,1,3,4,5,6,7,5,4,6)
    findOccouranceNum(num)
}

fun findOccouranceNum(num: List<Int>) {
    val setList = setOf<Int>()

   for (i in 0..num.size-1){
       println(num[i])
   }
}

package Asked_Program.asked_String

fun main(args:Array<String>){
    val text:String = "madam"
    val data = findPalindrome(text)
    println(data)
}

fun findPalindrome(text: String): Boolean {
   var reverse = text.reversed()
    return  reverse==text
}


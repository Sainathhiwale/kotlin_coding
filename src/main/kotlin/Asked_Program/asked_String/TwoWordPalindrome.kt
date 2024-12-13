package Asked_Program.asked_String

fun  main(args:Array<String>){
    val text= "data madam"
    val splitData = text.split(" ")

    val isPalindromeFirst = isPalindrome(splitData[0])
    val isPalindromeSecond = isPalindrome(splitData[1])
    println("isPalindrome is " +isPalindromeFirst )
    println("isPalindrome is " +isPalindromeSecond )
}
fun isPalindrome(text:String):Boolean{
    var reverseData = text.reversed()
    return  text == reverseData
}
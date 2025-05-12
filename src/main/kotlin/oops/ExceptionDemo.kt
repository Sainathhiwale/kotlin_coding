package oops

import java.io.File
import java.io.IOException

class ExceptionDemo {

    fun readFileContent(fileName: String): String {
        return try {
            File(fileName).readText()
        } catch (e: IOException) {
            println("An error occurred: ${e.message}")
            "" // Return empty string or default value
        }
    }

}

fun main(args:Array<String>){
    val obj = ExceptionDemo()
    val fileName = "sample.txt"  // Make sure this file exists
    val content = obj.readFileContent(fileName)
    println("File content:\n$content")

}
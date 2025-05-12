package oops

import java.lang.Exception

sealed class SealedDemo() {

    data class Success(val success:String):SealedDemo()
    data class Failure(val failure: String):SealedDemo()
    data class Error(val exception: Exception):SealedDemo()
}
fun getResponse(sealedDemo: SealedDemo){
    when(sealedDemo){
        is SealedDemo.Success -> println("Success: ${sealedDemo.success}")
        is SealedDemo.Failure -> println("Failure: ${sealedDemo.failure}")
        is SealedDemo.Error -> println("execption: ${sealedDemo.exception}")
    }
}

fun main(args:Array<String>){
    val obj = SealedDemo.Success("Data fetched successfully")
    getResponse(obj)

}
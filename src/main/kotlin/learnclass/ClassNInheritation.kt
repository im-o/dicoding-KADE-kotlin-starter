package learnclass

/**
 * created by Rivaldy on 10/30/2019
 */

class ClassNInheritation {
}

open class Users {
    open fun userAddress() : String {
        return "Antang - Makassar"
    }

    override fun toString(): String {
        return "Antang - Makassar - Masamba"
    }
}

open class Student : Users(){
    override fun userAddress(): String {
        return super.userAddress()
    }
}

class InformaticsStudent : Student(){
    override fun userAddress(): String {
        return super.userAddress()
    }
}

fun main(args: Array<String>){
    val users = Users()
    println(users)
}
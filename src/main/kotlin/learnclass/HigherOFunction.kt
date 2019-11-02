package learnclass

/**
 * created by Rivaldy on 11/1/2019
 */

fun main(){
    val name : (String, String) -> String = { realName, heroName -> "Myname is $realName, you can callme $heroName" }
    getNickName("Rivaldy", "IMO", name)
    getNickName("Rivaldy", "IMO", { realName, heroName -> "Myname is $realName, you can callme $heroName" })
    getNickName("Rivaldy", "IMO") { realName, heroName -> "Myname is $realName, you can callme $heroName" }

}

fun getNickName(fullname: String, nickName: String, yourName: (String, String) -> String){
    val result = yourName(fullname, nickName)
    println(result)
}

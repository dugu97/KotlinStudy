package com.example.kotlinstudy.introduction.function

fun main() {

    infix fun Int.times(str: String) = str.repeat(this)        // 1
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia                                       // 5
    sophia.getLikedPeople()
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6

    fun getLikedPeople(){
        for (i in likedPeople){
            println(i.name)
        }
    }
}
/*
1.定义Int上的中缀扩展函数。
2.调用中缀函数。
3.通过从标准库中调用中缀函数 to 来创建 Pair。
4.自定义 onto 中缀函数来实现 to 函数的功能
5.中缀表示法也适用于对象里面函数(方法)。
6.所处的对象或者类 即是 中缀 第一个参数（即调用方）。
 */
package com.example.kotlinstudy.introduction.function

fun main(){
    fun printAll(vararg messages: String) {                            // 1
        for (m in messages) println(m)
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")      // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
}
/*
    1.可变参数修饰符（vararg）将参数转换为 可变参数
    2.这允许使用 任意数量 的字符串参数调用printAll
    3.由于可以命名参数，您甚至可以在vararg之后添加另一个相同类型的参数。这在Java中是不允许的，因为没有传递值的方法。
    4.使用命名参数，可以给 prefix 独立设值，区别开vararg修饰的参数
    5.在运行时，entries只是一个数组。如果要将它传递给vararg参数，可以使用特殊的拓展操作符 * ，
      它允许您传递 *entries(字符串的vararg)，而不是entries(数组<String>)。
      通俗来说，就是以字符串的形式传递，而不是以数组的形式
 */
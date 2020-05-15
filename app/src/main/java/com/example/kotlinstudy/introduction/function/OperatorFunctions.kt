package com.example.kotlinstudy.introduction.function

fun main(){
    operator fun Int.times(str: String) = str.repeat(this)       // 1
    println(2 * "Bye ")                                          // 2

    operator fun String.get(range: IntRange) = substring(range)  // 3
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])                                          // 4
}

/*
    某些中缀扩展函数可以“升级”到运算符层面，允许他们使用相应的 运算符号 进行调用。
    1. 使用 operator 进一步修饰上述中缀函数，以升级到运算符层面
    2. times()的操作符符号是 * ，因此可以使用2 * "Bye"调用该函数。
    3. 运算符函数允许对字符串进行简单的范围访问。
    4. get()操作符启用了 括号 访问语法。
 */
package com.example.kotlinstudy.introduction.Variables

fun main(){
    var a: String = "initial"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // 3
}
/*
    Kotlin有强大的类型推断。虽然可以显式地声明变量的类型，但通常会让编译器通过推断来完成这项工作。
    Kotlin并没有强制执行不变性，尽管它是推荐的。本质上还是用val而不是var。
    1.声明一个可变变量并初始化它。
    2.声明一个不可变变量并初始化它。
    3.声明一个不可变变量，并在不指定类型的情况下初始化它。编译器推断类型Int。
 */
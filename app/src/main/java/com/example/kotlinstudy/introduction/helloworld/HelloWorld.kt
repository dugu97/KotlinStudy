package com.example.kotlinstudy.introduction.helloworld  //1

fun main(){                                              //2
    println("hello world")                               //3
}

//fun main(args: Array<String>){                           //4
//
//}
/*
    1. kotlin代码通常在包中定义。包规范是可选的：如果没有在源文件中指定包，其内容将转到默认包。
    2. Kotlin应用程序的入口点是main()函数。在Kotlin 1.3中，可以声明main而不需要任何参数。没有指定返回类型，这意味着函数什么也不返回。
    3. println向标准输出写入一行。它是隐式导入的。还要注意分号是可选的。
    4.在早于1.3的Kotlin版本中，主函数必须有一个类型为Array<String>的参数。
*/
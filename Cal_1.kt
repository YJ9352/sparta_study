package com.example.myapplication.sparta_study

fun main(args: Array<String>) {
    println("계산하고 싶은 숫자와 식을 넣어주세요.")

    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    println("연산자를 넣어주세요(+, -, /, *, %)")
    val operator = readLine()!!.toString()

    var calculator = Calculator(num1, num2)
    var result = calculator.cal(operator)
    print(result)

}

class Calculator(
    var num1: Int,
    var num2: Int
) {
    fun cal(operator: String): Int {
        return if( operator == "+") {
            num1 + num2
        } else if( operator == "-") {
            num1 - num2
        } else if( operator == "/") {
            num1 / num2
        } else if( operator == "*") {
            num1 * num2
        } else if( operator == "%") {
            num1 % num2
        } else {
            println("선택이 취소되었습니다.")
            0
        }
    }
}



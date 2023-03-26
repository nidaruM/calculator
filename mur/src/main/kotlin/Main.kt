var x = 0
var op = ""
var y = 0
fun main(args: Array<String>) {
    num1()

}

fun num1(){
    print("Введите число:  ")
    try {
        x = readln()!!.toInt()
    }catch (e: Exception){
        println("Вы ввели некорректный символ. Попробуйте еще раз!")
        num1()
    }
    op()
}
fun op(){
    print("Введите операцию:  ")
    op = readln()

    if (op=="="){
        end()
    }else if (op=="/"|| op=="*"||op=="-"||op=="+"){
        num2()
    }else {
        println("Вы ввели некоррекную операцию. Попробуйте еще раз!")
        op()
    }
}

fun num2(){
    print("Введите число:  ")
    try {
        y = readln()!!.toInt()
    }catch (e: Exception){
        println("Вы ввели некорректный символ. Попробуйте еще раз!")
        num2()
    }
    if (op == "+") x+=y else if (op == "-") x-=y else if (op == "*") x *= y
    else if (op == "/") x  /= y

    println("Ответ:   "+x)

    op()
}

fun end(){
    println("Ответ:   "+x)
}
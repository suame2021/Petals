fun main(){
 var A=  Petal(22,17)
println(A)
}

fun Petal(Num1: Int, Num2: Int):Boolean {
    if (Num1 % 2 == 0 && Num2 % 2 == 0)
        return false
    else
        if (Num1 % 2 != 0 && Num2 % 2 != 0)
            return false
        else
            if (Num1 % 2 == 0 || Num2 % 2 == 0)
                return true
    return false
}

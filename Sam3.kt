fun main() {
    println("Введите кол-во денег")
    var x= readln()!!.toInt()
    println("Введите кол-во дней")
    var y= readln()!!.toInt()
    println("Введите кол-во деней в путевке 1")
    var n1= readln()!!.toInt()
    println("Введите цену путевки 1")
    var d1= readln()!!.toInt()
    println("Введите кол-во деней в путевке 2")
    var n2= readln()!!.toInt()
    println("Введите цену путевки 2")
    var d2= readln()!!.toInt()
    println("Введите кол-во деней в путевке 3")
    var n3= readln()!!.toInt()
    println("Введите цену путевки 3")
    var d3= readln()!!.toInt()
    when
    {
        x>=d1 && y>=n1 ->println("Можете позволить путевку 1")
        x>=d2 && y>=n2 -> println("Можете позволить путевку 2")
        x>=d3 && y>=n3-> println("Можете позволить путевку 3")
        else-> println("")
    }

}
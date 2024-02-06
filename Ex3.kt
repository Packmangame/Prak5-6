fun main() {
    var a= readLine()!!.toInt()
    when(a)
    {
        in 0..2-> println("младенец")
        in 3..5->println("дошкольник")
        in 6..12->println("школьник")
        in 12..18->println("подросток")
        in 19..29->println("взрослый")
        in 31..46->println("состоявшийся человек")
        in 47..70->println("пенсионер")
        in 71..100->println("прах")
    }
}
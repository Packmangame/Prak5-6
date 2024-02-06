import kotlin.math.pow
import kotlin.math.roundToInt

fun main() {
    try {
        var x= readLine()!!.toDouble()
        if (x>3.6)
        {
            x=45*x.pow(2)+5
            println("$x")
        }else
        {
            x=5*x/(10*x.pow(2)+1)
            println("${String.format("%.3f",x)}")
        }
    }catch (e:Exception)
    {
        println("Error")
    }

}
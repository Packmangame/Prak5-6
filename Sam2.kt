fun main() {
 try {
     println("Введите 3 знач. число")
     var digit= readln()!!.toString()
     when
     {
         digit[0]==digit[2]-> println("Первая и последняя цифры одинаковы")
         else-> println("Error")
     }

 }   catch (  e:Exception  )
 {
     println("Error")
 }
}
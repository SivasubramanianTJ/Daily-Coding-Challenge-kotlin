import org.jetbrains.annotations.Nullable

fun main() {
    val list= mutableListOf<Int>()
    println("Enter 5 Numbers:")
    for(i in 1..5) {
        val x= readln()?.toInt()
        if(x!=null) {
            list.add(x)
        }
    }
    println(list)
    var sum=0
    for(i in 1..5) {
        sum+=list[i-1]
    }
    println("Sum of 5 entered numbers is $sum")
    println("And its average is ${sum/5}")
}
fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()


    var numberOfSwaps = 0

    //4 , 3 , 2 ,1
    a.forEach { _ ->

        a.forEachIndexed{index,value->
            if (index!=a.lastIndex && value > a[index+1]){
                a[index] = a[index+1]
                a[index+1] = value
                numberOfSwaps++
            }
        }
    }

    println("Array is sorted in $numberOfSwaps swaps.")
    println("First Element: ${a.first()}")
    println("Last Element: ${a.last()}")


}

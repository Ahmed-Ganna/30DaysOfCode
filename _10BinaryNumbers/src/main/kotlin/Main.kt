fun main(args: Array<String>) {
    var n = readLine()!!.trim().toInt()

    var lastMod: Int
    var countConsOnes = 0
    var maxConsOnes = 0

    while (n!=0){
        lastMod = n.mod(2)
        n = n.div(2)
        if (lastMod==1){
            countConsOnes++
            if (countConsOnes>maxConsOnes){
                maxConsOnes = countConsOnes
            }
        } else countConsOnes = 0
    }

    print(maxConsOnes)
}

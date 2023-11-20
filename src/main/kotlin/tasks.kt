fun main() {
    val sumArray = IntArray(20)
    var sumNum = 0

    for (i in sumArray.indices) {
        sumNum += i + 1
        sumArray[i] = sumNum
    }
    for (i in sumArray.indices) {
        println("suma(" + (i + 1) + ") = " + sumArray[i])
    }
}
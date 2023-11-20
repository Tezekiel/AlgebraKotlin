fun main() {

    val range = 1..5
    for (i in 1..5) {
        println(i)
    }

    println("------")
    for (num in 1..20 step 4) {
        println(num)
    }

    println("------")
    for (i in 1 until 10) {
        println(i)
    }

    println("------")
    val s = "goodbye"
    val sRange = 0..s.length
    println(sRange)

    println("------")
    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    val charRange = 'a'..'z'

    println("------")
    val str = "Hello"
    for (c in str) {
        println(c)
    }

    println("------")
    val backwardRange = 5.downTo(1)
    println(backwardRange)
    for (i in backwardRange) {
        println(i)
    }

    val stepRange = 3..15
    println("----stepThree----")
    val stepThree = stepRange.step(3)
    for (n in stepThree) {
        println(n)
    }

    println("----reversedRange----")
    val reversedRange = range.reversed() // 1..5.reversed()
    for (i in reversedRange) {
        println(i)
    }

    println("--------")
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    println("----foreach----")
    seasons.forEach {
        println(it)
    }

    println("----indexed----")
    seasons.forEachIndexed { index, value ->
        println("$value is season number $index")
    }

    println("-------")
    val notASeason = "whatever" !in seasons
    println(notASeason)

    println("-------")
    val notInRange = 32 !in 1..10
    println(notInRange)

    println("-------")
    val str1 = "Hello"
    println('e' in str1)
    println('e' !in str1)


    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    continue@jloop
                }
            }
        }
    }

    count()

}

fun count() {
    for (i in 1..10) {
        if(i == 5) {
            //continue
            //break
            return
        }
        println(i)
    }
    println("in function")
}

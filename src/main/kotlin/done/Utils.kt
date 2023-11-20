package done

fun appendStrings(vararg strings: String): String {

    val sb = StringBuilder()

    for (s in strings) {
        sb.append(s)
    }

    return sb.toString()
}

fun niz(lowerBound: Int, upperBound: Int) {
    for (i in lowerBound..upperBound) println(i)
}

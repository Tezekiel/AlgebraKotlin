import done.Car

fun main() {
    val word = "aaa"
    println(word.removeFirstLetter())

    val int = 5
    println(int.plusOne())

    val car = Car("Blue", "BMW", 2016)
    car.printDetails()
}


fun String.removeFirstLetter(): String {
    return this.substring(1)
}

fun Int.plusOne(): Int {
    return this + 1
}

fun Car.printDetails(): Unit = println("Details of car -> color: $color, model: $model, year: $year")

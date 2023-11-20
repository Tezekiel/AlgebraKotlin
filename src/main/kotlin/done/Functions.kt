package done

import java.util.*

fun main() {

    printNumbersFrom0To100()

    val fullName = getFullName("Pero", "Peric")
    println("Full name is: $fullName")

    addTwoNumbers(5, 6)
    addTwoNumbers(5.0, 6.0)

    val result = whatever()
    println(result)

    println(multiply(5, 5)) // The answer is: 25
    println(multiply(5, 5, "Result: ")) // Result: 25
    println(multiply(operand2 = 5, operand1 = 9)) // The answer is: 45
    println(multiply(label = "Result: ", operand2 = 3, operand1 = 4)) // Result: 12


    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)

    printColors(car1, car2, car3)

    val appendedStrings = appendStrings("a", "b", "c", "d")
    println(appendedStrings)


}


fun printNumbersFrom0To100() {
    for (i in 0..100) println(i)
}

fun getFullName(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}

fun addTwoNumbers(firstNumber: Int, secondNumber: Int) {
    println("addTwoNumbers(firstNumber: Int, secondNumber: Int)")
    println(firstNumber + secondNumber)
}

fun addTwoNumbers(firstNumber: Double, secondNumber: Double) {
    println("addTwoNumbers(firstNumber: Double, secondNumber: Double)")
    println(firstNumber + secondNumber)
}

fun whatever() = 3 * 4
fun whatever2(): Int {
    return 3 * 4
}

fun multiply(
    operand1: Int,
    operand2: Int,
    label: String = "The answer is: "
) = "$label ${operand1 * operand2}"


class Employee(val firstName: String) {

    fun upperCaseFirstName(): String {
        return firstName.uppercase(Locale.getDefault())
    }
}

data class Car(
    val color: String,
    val model: String,
    val year: Int
)


fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}




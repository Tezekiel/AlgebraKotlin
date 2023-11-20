package done

fun zadacaKarlo() {
    val broj: Any = 1
    when (broj) {
        is String -> println("varijabla je string")
        is Int -> println("varijabla je int")
        else -> println("daj mi string")
    }
}

fun zadacaValerija() {
    val broj = 7

    val dan = when (broj) {
        1 -> "Ponedjeljak"
        2 -> "Utorak"
        3 -> "Srijeda"
        4 -> "Četvrtak"
        5 -> "Petak"
        6 -> "Subota"
        7 -> "Nedjelja"
        else -> "nevaljan"
    }
    println("Dan je $dan")
}

enum class DayOfWeek(val dayNumber: Int) {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7)
}

fun zadacaLuka() {
    var userInput: Int?
    var dayName: String?

    do {
        println("Enter a day in the week (1-7): ")
        userInput = readlnOrNull()?.toIntOrNull()

        dayName = when (userInput) {
            DayOfWeek.Monday.ordinal -> DayOfWeek.Monday.name
            DayOfWeek.Tuesday.dayNumber -> DayOfWeek.Tuesday.name
            DayOfWeek.Wednesday.dayNumber -> DayOfWeek.Wednesday.name
            DayOfWeek.Thursday.dayNumber -> DayOfWeek.Thursday.name
            DayOfWeek.Friday.dayNumber -> DayOfWeek.Friday.name
            DayOfWeek.Saturday.dayNumber -> DayOfWeek.Saturday.name
            DayOfWeek.Sunday.dayNumber -> DayOfWeek.Sunday.name
            else -> null
        }

        if (dayName == null) {
            println("Invalid input. Please enter a number between 1 and 7.")
        } else {
            println("Day numbered $userInput is $dayName.")
        }
    } while (dayName == null)

}


fun zadaca1() {

    val dayWeek = "Monday"
    val res = when (dayWeek) {
        "Monday" -> "Start of week"
        "Tuesday" -> "Day 2"
        "Wednsday" -> "Day 3"
        "Thursady" -> "SDay 4"
        "Friday" -> "Start of weekend"
        "Saturday" -> "Party"
        else -> "End of week"
    }

}


enum class Week {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

fun zadaca2() {
    val dayWeek = Week.Thursday


    val res = when (dayWeek) {
        Week.Monday -> TODO()
        Week.Tuesday -> TODO()
        Week.Wednesday -> TODO()
        Week.Thursday -> TODO()
        Week.Friday -> TODO()
        Week.Saturday -> TODO()
        Week.Sunday -> TODO()
    }

}




enum class WeekDayName {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
enum class dayOfWeek (val dayValue : Int){
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7)
}
fun zadaca(){

    fun main() {
        val weekdayNum = 5
        println(dayOfWeek.values().first { it.ordinal == weekdayNum })
    }
}

fun task2() {
    val broj: Int = 1
    val upitnoBroj: Int? = null

    val dayWeek = Week.Thursday

    val res = when (dayWeek) {
        Week.Monday -> "First day of the week..."
        Week.Tuesday -> "Still a lot till the weekend"
        Week.Wednesday -> "Half way through"
        Week.Thursday -> "A bit more"
        Week.Friday -> "Uff, last day of work..."
        Week.Saturday -> "Yaaaay, weekend!"
        Week.Sunday -> "Tomorrow is Monday >:("
        else -> null
    }
    if (res == null) {
        println("Invalid input, insert number 1-7")
    } else {
        println("It's ${dayWeek.name}: $res")
    }

}

// Activity 2: TestClock.kt
// Program to test the Clock class
fun main() {
    val clock = Clock()
    var input = ' '
    do {
        // Display current time
        println("The current time ==>${clock.day}:${clock.hour}:${clock.minute}:${clock.second}")
        println("Enter 's' to set the time.")
        println("Enter 'a' to advance one second.")
        println("Enter 'r' to reset the clock.")
        println("Enter 'q' to quit.")
        input = readlnOrNull()?.firstOrNull() ?: continue
        when (input) {
            's' -> {
                // Set time from user input
                print("Enter hour (0-23): ")
                clock.hour = readlnOrNull()?.toIntOrNull() ?: 0
                print("Enter minute (0-59): ")
                clock.minute = readlnOrNull()?.toIntOrNull() ?: 0
                print("Enter second (0-59): ")
                clock.second = readlnOrNull()?.toIntOrNull() ?: 0
            }
            'a' -> clock.advanceOneSecond() // Advance time by one second
            'r' -> clock.reset() // Reset clock to 00:00:00
        }
    } while (input != 'q') // Exit on 'q'
}

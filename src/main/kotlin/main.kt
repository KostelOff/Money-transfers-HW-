import kotlin.math.roundToInt

fun main() {

    val amount = 11_101.00
    val commission = 0.0075
    var result = if (amount * commission < 35)
        35
    else amount * commission

    result = (result.toDouble() * 100).roundToInt() / 100.0   // метод нашел в интернете
    println("Комиссия за перевод составит: ${result.toDouble()}")
}
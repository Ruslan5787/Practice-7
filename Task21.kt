import java.lang.Math.*
import kotlin.math.roundToInt

fun main() {
    secondFunc();
}

fun firstFunc() {
    println("Введите число x.");

    val x: Double = readLine()!!.toDouble();

    try {
        when {
            x < 0 -> println(4);
            0 <= x && x < 1 -> println(pow(x, 2.0) + 3 * x + 4);
            x > 1 -> println(x + 7);
            else -> println("Ваше число не попало под условие");
        }
    } catch (ex: Exception) {
        println(ex.message);
    }
}

fun secondFunc() {
    println("Введите числа x, a, b.");

    val x: Double = readLine()!!.toDouble();
    val a: Double = readLine()!!.toDouble();
    val b: Double = readLine()!!.toDouble();

    try {
        when {
            x < 0 -> println((pow(sin(x + 3.14 / 2), 2.0) * 100).roundToInt() / 100.0);
            a <= x && x <= b -> println(((pow(2.72, 2.0) * sin(x + 3.14 / 2)) * 100).roundToInt() / 100.0);
            x > b -> println(((sqrt(abs(sin(x + 3.14 / 3)) + 2.1 * pow(10.0, -3.0))) * 100).roundToInt() / 100.0);
            else -> println("Ваше число не попало под условие");
        }
    } catch (ex: Exception) {
        println(ex.message);
    }
}

import kotlin.math.pow

fun main() {
    isPointInEmptyCircle();
}

fun isPointInCircle() {
    println("Введите действительные числа x, y через Enter.");

    val x: Double = readLine()!!.toDouble();
    val y: Double = readLine()!!.toDouble();

    try {
        when {
            x >= 0 && y >= 0 -> {
                val L: Double = (0 - x).pow(2.0) + (0 - y).pow(2.0);

                when {
                    (L <= 1) && (L >= 0) || (L <= -1) && (L >= 5) -> println("Точка принадлежит заштрихованной области");
                    else -> println("Точка не принадлежит заштрихованной области");

                }
            }
            else -> println("Введите действительные числа!")
        }
    } catch (ex: Exception) {
        println(ex.message);
    }
}

fun isPointInEmptyCircle() {
    println("Введите действительные числа x, y через Enter.");

    val x: Double = readLine()!!.toDouble();
    val y: Double = readLine()!!.toDouble();

    try {
        when {
            x >= 0 && y >= 0 -> {
                val L: Double = (0 - x).pow(2.0) + (0 - y).pow(2.0);

                when {
                    (L <= 1) && (L >= 0.5) || (L <= -1) && (L >= -0.5) -> println("Точка принадлежит заштрихованной области");
                    else -> println("Точка не принадлежит заштрихованной области");
                }
            }
            else -> println("Введите действительные числа!")
        }
    } catch (ex: Exception) {
        println(ex.message);
    }
}

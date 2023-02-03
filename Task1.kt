fun main() {
    try {
        println("Введите любое число");
        val N: Int = readLine()!!.toInt();

        when {
            N % 3 == 0 -> println("Ваше число кратно трём.")
            else -> println("Ваше число не кратно трём.")
        }
    } catch (ex: Exception) {
        println(ex.message);
    }
}

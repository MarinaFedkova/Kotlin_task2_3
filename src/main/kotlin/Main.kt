fun main() {
    val amount = 100000.00
    val discountStandart = 100.00
    val discountFive = 0.05
    val discountOfOften = 0.01
    val isOften = true
    var totalPrice = 0.00

    if (amount > 1_000 && amount <= 10_000)
        totalPrice = amount - discountStandart
    else if (amount > 10000)
        totalPrice = amount - amount * discountFive
    else totalPrice = amount

    if (isOften == true)
        totalPrice = totalPrice - totalPrice * discountOfOften
    println("Ваша сумма к оплате: $totalPrice руб.")

}
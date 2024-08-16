package ru.Netology

fun main() {
    var purchaseSum = 20000
    var loyalClient = true
    var discount = 0.0

    if (purchaseSum <= 1000) {
        print("У Вас еще нет скидки в нашем магазине")
    } else if (purchaseSum > 1000 && purchaseSum <= 10000 && loyalClient == false) {
        purchaseSum -= 100
        print("Ваша скидка составила 100 рублей. Сумма покупки: " + purchaseSum)
    } else if (purchaseSum > 1000 && purchaseSum <= 10000 && loyalClient == true) {
        purchaseSum -= 100
        discount = purchaseSum * 0.01
        purchaseSum -= discount.toInt()
        print("Ваша скидка составила " + (discount.toInt() + 100) + " рублей. Сумма покупки: " + purchaseSum)
    } else if (purchaseSum > 10000 && loyalClient == false) {
        discount = purchaseSum * 0.05
        purchaseSum -= discount.toInt()
        print("Ваша скидка составила " + discount.toInt() + " рублей. Сумма покупки: " + purchaseSum)
    } else if (purchaseSum > 10000 && loyalClient == true) {
        discount = purchaseSum * 0.05
        purchaseSum -= discount.toInt()
        var newDiscount = purchaseSum * 0.01
        purchaseSum -= newDiscount.toInt()
        discount += newDiscount
        print("Ваша скидка составила " + discount.toInt() + " рублей. Сумма покупки: " + purchaseSum)
    }
}
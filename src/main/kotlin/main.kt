fun main() {
    val orderPrice = 5_000 // сумма заказа
    val regularCustomerDiscont = 1 // размер скидки постоянного покупателя в %
    val largeOrderDiscont = 5 // размер скидки за заказ от 10_000 в %
    var regularCustomer = true // статус постоянного покупателя
    var orderDiscont = orderPrice * largeOrderDiscont / 100 //расчет скидки за сумму заказа
    var discont = if (orderPrice <= 1000) 0 else if (orderPrice > 1000 && orderPrice <= 10000) 100 else orderDiscont
    var preChek = orderPrice - discont
    var totalCheck =  if (regularCustomer == true) preChek - preChek * regularCustomerDiscont / 100 else preChek

    println("Сумма заказа " + totalCheck + " рублей.")

}

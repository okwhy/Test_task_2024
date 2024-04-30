package t4

fun main() {
    val newsPoster = NewsPoster()
    val subscriber1 = Subscriber("Артем")
    val subscriber2 = Subscriber("Саша")

    newsPoster.register(subscriber1)
    newsPoster.register(subscriber2)

    newsPoster.postNews("Важное объявление: завтра выходной!")

    newsPoster.unregister(subscriber2)

    newsPoster.postNews("Важное объявление: завтра не выходной!")
}
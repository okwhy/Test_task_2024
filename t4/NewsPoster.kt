package t4

class NewsPoster : Observable {
    private val observers = mutableListOf<Observer>()
    override fun register(observer: Observer) {
        observers.add(observer)
    }

    override fun unregister(observer: Observer) {
       observers.remove(observer)
    }

    override fun postNews(news: String) {
        observers.forEach {it.update(news)}
    }
}
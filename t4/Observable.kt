package t4

interface Observable {
    fun register(observer: Observer);
    fun unregister(observer: Observer);
    fun postNews(news:String);
}
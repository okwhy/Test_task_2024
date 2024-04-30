package t4

class Subscriber(private val name:String) : Observer {
    override fun update(news: String) {
        println("$name - $news")
    }
}
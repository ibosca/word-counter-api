package word

class Sentence {

    lateinit var body: String

    companion object{
        const val WORDS = "words"
        const val LETTERS = "letters"
    }

    fun words():Int {
        return body.split(" ").count()
    }

    fun letters():Int {
        return body.length
    }


}
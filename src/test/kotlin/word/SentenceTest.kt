package word

import org.junit.Assert.*
import org.junit.Test

class SentenceTest {

    @Test
    fun whenSentencehas4words_thenReturn4() {

        val sentence = Sentence()
        sentence.body = "I have four words"

        val expected = 4
        val actual = sentence.words()

        assertEquals(actual, expected)
    }
}
package word

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
class WordsController {

    @PostMapping("/words")
    fun words(@RequestBody sentence: Sentence): Map<String, Int> {
         return Collections.singletonMap(Sentence.WORDS, sentence.words())
    }

    @PostMapping("/letters")
    fun letters(@RequestBody sentence: Sentence): Map<String, Int> {
        return Collections.singletonMap(Sentence.LETTERS, sentence.letters())
    }

}

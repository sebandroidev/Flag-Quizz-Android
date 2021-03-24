package tg.nscode.flagquiz

data class Question(
    val id: Int,
    val questionText: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)
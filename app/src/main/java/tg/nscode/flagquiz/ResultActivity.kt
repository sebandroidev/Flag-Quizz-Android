package tg.nscode.flagquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName= intent.getStringExtra(Constants.USER_NAME)
        tvName.text = userName.toString()

        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTION, 0)
        tvScore.text = "Your score is $correctAnswers out of $totalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}
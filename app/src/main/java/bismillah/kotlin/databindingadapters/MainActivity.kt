package bismillah.kotlin.databindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import bismillah.kotlin.databindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val post = Post("Book",
            "This contains the description of the Book and tell you about it",
            "https://covers.openlibrary.org/b/id/240727-S.jpg"
        )

        binding.post= post
    }
}
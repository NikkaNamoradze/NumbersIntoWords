package com.example.numbersintowords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.numbersintowords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()


        binding.confirmButton.setOnClickListener {

            val number = binding.numberEditText.text.toString().toInt()

            val listOfWords = listOf(
                "", "ერთი", "ორი", "სამი", "ოთხი", "ხუთი", "ექვსი",
                "შვიდი", "რვა", "ცხრა", "ათი", "თერთმეტი",
                "თორმეტი", "ცამეტი", "თოთხმეტი", "თხუთმეტი", "თექვსმეტი",
                "ჩვიდმეტი", "თვრამეტი", "ცხრამეტი", "ოცდა", "ოცდა", "ორმოცდა", "ორმოცდა",
                "სამოცდა", "სამოცდა", "ოთხმოცდა", "ოთხმოცდა", "ას", "ორას", "სამას", "ოთხას",
                "ხუთას", "ექვსას", "შვიდას", "რვაას", "ცხრაას"
            )

            when (number) {
                0 -> binding.wordsTextView.text = "ნული"
                20 -> binding.wordsTextView.text = "ოცი"
                30 -> binding.wordsTextView.text = "ოცდაათი"
                40 -> binding.wordsTextView.text = "ორმოცი"
                50 -> binding.wordsTextView.text = "ორმოცდაათი"
                60 -> binding.wordsTextView.text = "სამოცი"
                70 -> binding.wordsTextView.text = "სამოცდაათი"
                80 -> binding.wordsTextView.text = "ოთხმოცი"
                90 -> binding.wordsTextView.text = "ოთხმოცდაათი"
                100 -> binding.wordsTextView.text = "ასი"
                200 -> binding.wordsTextView.text = "ორასი"
                300 -> binding.wordsTextView.text = "სამასი"
                400 -> binding.wordsTextView.text = "ოთხასი"
                500 -> binding.wordsTextView.text = "ხუთასი"
                600 -> binding.wordsTextView.text = "ექვსასი"
                700 -> binding.wordsTextView.text = "შვიდასი"
                800 -> binding.wordsTextView.text = "რვაასი"
                900 -> binding.wordsTextView.text = "ცხრაასი"
                1000 -> binding.wordsTextView.text = "ათასი"
            }

            if (number > 1000){
                Toast.makeText(this, "შემოყვანილი რიცხვი უნდა იყოს [0;1000]", Toast.LENGTH_SHORT).show()
            }

            if (number in 1..19) {
                binding.wordsTextView.text = (listOfWords[number])
            }

            if (number in 21..29 || number in 41..49 || number in 61..69 || number in 81..89) {
                val firstNum = (number / 10)
                val words = listOfWords[18 + firstNum] + listOfWords[number % 10]
                binding.wordsTextView.text = words
            }

            if (number in 31..39 || number in 51..59 || number in 71..79 || number in 91..99) {
                val firstNum = (number / 10)
                val words = listOfWords[18 + firstNum] + listOfWords[10 + number % 10]
                binding.wordsTextView.text = words
            }

            if (number in 101..119 || number in 201..219 || number in 301..319 || number in 401..419 || number in 501..519
                || number in 601..619 || number in 701..719 || number in 801..819 || number in 901..919
            ) {
                val firstNum = (number / 100)
                val secondNum = (number % 100)
                val words = listOfWords[27 + firstNum] + " " + listOfWords[secondNum]
                binding.wordsTextView.text = words
            }

            if (number in 121..129 || number in 141..149 || number in 161..169 || number in 181..189
                || number in 221..229 || number in 241..249 || number in 261..269 || number in 281..289
                || number in 321..329 || number in 341..349 || number in 361..369 || number in 381..389
                || number in 421..429 || number in 441..449 || number in 461..469 || number in 481..489
                || number in 521..529 || number in 541..549 || number in 561..569 || number in 581..589
                || number in 621..629 || number in 641..649 || number in 661..669 || number in 681..689
                || number in 721..729 || number in 741..749 || number in 761..769 || number in 781..789
                || number in 821..829 || number in 841..849 || number in 861..869 || number in 881..889
                || number in 921..929 || number in 941..949 || number in 961..969 || number in 981..989
            ) {
                val firstNum = (number / 100)
                val secondNum = (number % 100) / 10
                val thirdNum = (number % 10)
                val words =
                    listOfWords[27 + firstNum] + " " + listOfWords[18 + secondNum] + listOfWords[thirdNum]
                binding.wordsTextView.text = words

            }

            if (number in 131..139 || number in 151..159 || number in 171..179 || number in 191..199
                || number in 231..239 || number in 251..259 || number in 271..279 || number in 291..299
                || number in 331..339 || number in 351..359 || number in 371..379 || number in 391..399
                || number in 431..439 || number in 451..459 || number in 471..479 || number in 491..499
                || number in 531..539 || number in 551..559 || number in 571..579 || number in 591..599
                || number in 631..639 || number in 651..659 || number in 671..679 || number in 691..699
                || number in 731..739 || number in 751..759 || number in 771..779 || number in 791..799
                || number in 831..839 || number in 851..859 || number in 871..879 || number in 891..899
                || number in 931..939 || number in 951..959 || number in 971..979 || number in 991..999
            ) {
                val firstNum = (number / 100)
                val secondNum = (number % 100) / 10
                val thirdNum = (number % 10)
                val words =
                    listOfWords[27 + firstNum] + " " + listOfWords[18 + secondNum] + listOfWords[10 + thirdNum]
                binding.wordsTextView.text = words

            }

        }



    }
}
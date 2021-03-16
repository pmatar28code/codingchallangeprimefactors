package com.example.codingchallangeprimefactors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var listOfPrimerNumbers = mutableListOf<Int>(
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37,
        41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
        89, 97, 101, 103, 107, 109, 113, 127, 131,
        137, 139, 149, 151, 157, 163, 167, 173, 179,
        181, 191, 193, 197, 199,211, 223, 227, 229,
        233, 239, 241, 251, 257, 263, 269, 271, 277,
        281, 283, 293,307, 311, 313, 317, 331, 337,
        347, 349, 353, 359, 367, 373, 379, 383, 389,
        397,401, 409, 419, 421, 431, 433, 439, 443,
        449, 457, 461, 463, 467, 479, 487, 491, 499,
        503, 509, 521, 523, 541, 547, 557, 563, 569,
        571, 577, 587, 593, 599,601, 607, 613, 617,
        619, 631, 641, 643, 647, 653, 659, 661, 673,
        677, 683, 691
    )

    var primeNumbers = mutableListOf<Int>()

    fun find() {
        for (number in listOfPrimerNumbers) {
            if (currentNumber % number == 0) {
                println("current prime number $number")
                primeNumbers.add(number)
                var div = currentNumber / number
                println("div result $div")
                currentNumber = div
                find()
            }

        }
    }
    fun verifyPrimeNumbers() {
        var multi: Int? = null
        for (number in primeNumbers) {
            if (multi == null) {
                multi = number
                println(number)
                continue
            }
            println(number)
            multi = multi.times(number)
        }

        println("result: $multi")
    }

    var currentNumber = 13195

    find()
    verifyPrimeNumbers()
}
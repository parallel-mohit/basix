package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import com.example.tictactoe.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var anime:Animation
    var flag=0
    var count=0
    lateinit var b1:String
    lateinit var b2:String
    lateinit var b3:String
    lateinit var b4:String
    lateinit var b5:String
    lateinit var b6:String
    lateinit var b7:String
    lateinit var b8:String
    lateinit var b9:String
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setSupportActionBar(binding.toolbar)
        supportActionBar?.title="PA"
    //    getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)

        val txt:TextView=findViewById(R.id.textView3)
        anime =AnimationUtils.loadAnimation(this,R.anim.anime)
//
        val s="PLAYER: X"

        txt.setText(s)
        txt.startAnimation(anime)

        binding.restart.setOnClickListener {
            newgame()
        }



    }
    fun check(view: View) {


        val btnCurrent: Button = view as Button
        if (btnCurrent.text =="" ) {

            count++
            if (flag == 0) {

                val y="PLAYER: 0"
                binding.textView3.text=y
                btnCurrent.setText("X")
                flag = 1
            } else {
                val x="PLAYER: X"
                binding.textView3.text=x
                btnCurrent.setText("o")
                flag = 0
            }




            if (count > 4) {
                var b1=binding.bt1.text
                var b2=binding.bt2.text
                var b3=binding.bt3.text
                var b4=binding.bt4.text
                var b5=binding.bt5.text
                var b6=binding.bt6.text
                var b7=binding.bt7.text
                var b8=binding.bt8.text
                var b9=binding.bt9.text

                if ((b1 == b2) && (b2.equals(b3)) && b1 != "") {
                    Toast.makeText(this, "Hurray! $b1 is Winner", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b5 == b6 && b4 == b5 && b4 != "") {
                    Toast.makeText(this, "Hurray! $b4 is WInner", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b7 == b8 && b8 == b9 && b7 != "") {
                    Toast.makeText(this, "Hurray! $b7 is WInner", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b1 == b5 && b9 == b5 && b1 != "") {
                    Toast.makeText(this, "Hurray! $b1 is WInner", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b3 == b5 && b5 == b7 && b5 != "") {
                    Toast.makeText(this, "Hurray! $b5 is WInner", Toast.LENGTH_LONG).show()
                    newgame()
                }else if (b1 == b4 && b7 == b4 && b4 != "") {
                    Toast.makeText(this, "Hurray! $b4 is WInner", Toast.LENGTH_LONG).show()
                    newgame()
                }else if (b2 == b5 && b5 == b8 && b2 != "") {
                    Toast.makeText(this, "Hurray! $b4 is WInner", Toast.LENGTH_LONG).show()
                    newgame()
                }else if (b3 == b6 && b6 == b9 && b3 != "") {
                    Toast.makeText(this, "Hurray! $b4 is WInner", Toast.LENGTH_LONG).show()
                    newgame()
                }
                else if (count == 9) {
                    Toast.makeText(this, "Oops! No One Is Winner , It's Draw", Toast.LENGTH_LONG)
                        .show()
                    newgame()
                }
            }

        }



    }
    fun newgame() {
        binding.bt1.setText("")
        binding.bt2.setText("")
        binding.bt3.setText("")
        binding.bt4.setText("")
        binding.bt5.setText("")
        binding.bt6.setText("")
        binding.bt7.setText("")
        binding.bt8.setText("")
        binding.bt9.setText("")
        flag=0
        count=0
        val s="PLAYER: X"
        binding.textView3.setText(s)
        binding.textView3.startAnimation(anime)

    }



}
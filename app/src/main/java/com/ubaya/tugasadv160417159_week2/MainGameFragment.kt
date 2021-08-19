package com.ubaya.tugasadv160417159_week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main_game.*
import java.util.*
import kotlin.random.Random


class MainGameFragment : Fragment() {

    var ang1: Int = Random.nextInt(0, 100)
    var ang2: Int = Random.nextInt(0, 100)
    var hasil: Int = ang1 + ang2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_game, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Soal;


        txtAngka1.text = ang1.toString()
        txtAngka2.text = ang2.toString()



        var score = 0;

        btnJawab.setOnClickListener {
            val skor = txtScore.text.toString()

             if (txtInput.text.toString() == hasil.toString())
             {
                 score+=2
                 txtScore.text = score.toString()
                 txtInput.setText("")
                 ang1= Random.nextInt(0, 100)
                 ang2 = Random.nextInt(0, 100)
                 hasil = ang1 + ang2
                 txtAngka1.text = ang1.toString()
                 txtAngka2.text = ang2.toString()

             }
             else
             {
                 val skor= txtScore.text.toString()
                 val action = MainGameFragmentDirections.actionGameOver(skor)
                 Navigation.findNavController(it).navigate(action)
             }



        }

    }
}
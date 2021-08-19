package com.ubaya.tugasadv160417159_week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_game_over.*

class GameOverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game_over, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            val skor = GameOverFragmentArgs.fromBundle(requireArguments()).skor
            txtHasilScore.text="Your score is $skor"


        btnBack.setOnClickListener{
            val  action = GameOverFragmentDirections.actionMainGame()
            Navigation.findNavController(it).navigate(action)
        }
    }



}
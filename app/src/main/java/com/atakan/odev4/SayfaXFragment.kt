package com.atakan.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.atakan.odev4.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var tasarim:FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.buttonGoXtoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.xToY)
        }

        return tasarim.root
    }

}
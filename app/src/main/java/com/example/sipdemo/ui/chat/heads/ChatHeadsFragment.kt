package com.example.sipdemo.ui.chat.heads

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.sipdemo.databinding.FragmentChatHeadsBinding

class ChatHeadsFragment : Fragment() {

    private lateinit var chatHeadsViewModel: ChatHeadsViewModel
    private var _binding: FragmentChatHeadsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        chatHeadsViewModel =
            ViewModelProvider(this).get(ChatHeadsViewModel::class.java)

        _binding = FragmentChatHeadsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        chatHeadsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
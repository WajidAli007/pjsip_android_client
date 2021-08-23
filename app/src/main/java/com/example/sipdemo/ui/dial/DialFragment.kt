package com.example.sipdemo.ui.dial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.sipdemo.data.eventbus.ConnectionStatusChangedEvent
import com.example.sipdemo.databinding.FragmentDialBinding
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class DialFragment : Fragment() {

    private lateinit var dialViewModel: DialViewModel
    private var _binding: FragmentDialBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dialViewModel =
            ViewModelProvider(this).get(DialViewModel::class.java)

        _binding = FragmentDialBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
    }

    override fun onStop() {
        super.onStop()
        if(EventBus.getDefault().isRegistered(this)){
            EventBus.getDefault().unregister(this)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @Subscribe(threadMode = ThreadMode.MAIN, sticky = true)
    fun statusChanged(status : ConnectionStatusChangedEvent){
        binding.tvStatus.text = "Status: ${status.statusMsg}"
    }
}
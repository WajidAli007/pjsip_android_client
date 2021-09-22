package com.example.sipdemo.ui.home

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.sipdemo.base.BaseActivity
import com.example.sipdemo.databinding.FragmentDialBinding
import com.example.sipdemo.ui.call.CallActivity
import timber.log.Timber

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentDialBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentDialBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCall.setOnClickListener {
            val sipAddress = binding.etSipAddress.text.toString()
            if(sipAddress.isEmpty()){
                Toast.makeText(requireContext(), "Enter a valid SIP Address to Call to...", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            Timber.e("sip address got: $sipAddress")
            if(homeViewModel.proceedToCall(sipAddress)){
                Timber.e("proceeding to call")
                val address = if(sipAddress.startsWith("sip:")) sipAddress else "sip:$sipAddress"
                Timber.e("proceeding to start activity")
                requireActivity().startActivity(CallActivity.createIntent(requireActivity() as BaseActivity, address, true))
            }
        }

    }

    override fun onStart() {
        super.onStart()

        Timber.e("architeuture: " + if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            Build.CPU_ABI
        } else {
            Build.SUPPORTED_ABIS[0]
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
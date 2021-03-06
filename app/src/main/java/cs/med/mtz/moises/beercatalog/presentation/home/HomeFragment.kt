package cs.med.mtz.moises.beercatalog.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cs.med.mtz.moises.beercatalog.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    /* */
    private val binding by lazy { FragmentHomeBinding.inflate(layoutInflater) }

    /** */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    /** */
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}

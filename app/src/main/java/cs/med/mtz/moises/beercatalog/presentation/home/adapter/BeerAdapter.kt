package cs.med.mtz.moises.beercatalog.presentation.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cs.med.mtz.moises.beercatalog.databinding.ViewHolderBeerBinding
import cs.med.mtz.moises.beercatalog.domain.entity.Beer

class BeerAdapter(private val beers: List<Beer>) :
    RecyclerView.Adapter<BeerAdapter.BeerViewHolder>() {

    /** */
    class BeerViewHolder(val binding: ViewHolderBeerBinding) : RecyclerView.ViewHolder(binding.root)

    /** */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeerViewHolder {
        val binding = ViewHolderBeerBinding.inflate(LayoutInflater.from(parent.context))
        return BeerViewHolder(binding)
    }

    /** */
    override fun getItemCount(): Int {
        return beers.size
    }

    /** */
    override fun onBindViewHolder(holder: BeerViewHolder, position: Int) {
        val beer: Beer = beers[position]
        holder.binding.tvName.text = beer.name
        holder.binding.tvTagline.text = beer.tagLine
    }


}
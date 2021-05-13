package cs.med.mtz.moises.beercatalog.data.dto

import com.google.gson.annotations.SerializedName
import cs.med.mtz.moises.beercatalog.domain.entity.Beer

data class BeerDTO(
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("tagline") val tagline: String,
    @SerializedName("description") val description: String,
    @SerializedName("first_brewed") val firstBrewed: String,
    @SerializedName("food_pairing") val foodPairing: List<String>
) {


    /** */
    fun toBeer(): Beer = Beer(
        id = id,
        name = name,
        imageUrl = imageUrl,
        tagLine = tagline,
        description = description,
        firstBrewedDate = firstBrewed,
        foodPairing = foodPairing
    )
}
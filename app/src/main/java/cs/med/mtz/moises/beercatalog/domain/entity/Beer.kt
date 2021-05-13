package cs.med.mtz.moises.beercatalog.domain.entity

data class Beer(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val tagLine: String,
    val description: String,
    val firstBrewedDate: String,
    val foodPairing: List<String>
)

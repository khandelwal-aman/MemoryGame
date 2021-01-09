package pro.oaks.apps.memoryretentiontest.models

data class MemoryCard(
    val identifier: Int,
    val imageUrl:String? = null,
    var isFaceUp: Boolean = false,
    var isMatched: Boolean = false
)
package Class

class Market(val name : String) {

    var listProducts : MutableList<Products> = mutableListOf()

    init {
        println("Votre magasin $name vient d'être créé")
    }


    fun totalPanier (buyer : Buyer) : Int{

        return buyer.panier.map {
            it.price
        }.reduce { acc, prix -> acc + prix}

    }

    fun vendreProduits (produit : Products, buyer : Buyer) {

            if (produit.quantity == 0) {
                return println("Nous avons plus de ${produit.name} en stock")
            }

            buyer.panier.add(produit)
            produit.quantity--
            println("Votre ${produit.name} a été ajouté à votre panier")
    }

}
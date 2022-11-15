import Class.*

fun main(args: Array<String>) {

    val chaise1 = Chaise("chaise brune", 10, 3)
    val bureau = Bureau("bureau brun", 50, 4)
    val TV = TV("samsung 4k", 250, 10)


    val client = Buyer("Valentin")

    val market = Market("Magasin du coin")

    do {

      println("Que souhaitez vous acheter ? chaise, tv ou bureau ?")
      var choice = readln()
      println("Combien souhaitez vous en acheter ? ")
      var choiceQuantity = readln()!!.toInt()

        for (i in 0 until  choiceQuantity){
            when (choice) {
                "chaise" -> market.vendreProduits(chaise1, client)
                "tv" -> market.vendreProduits(TV, client)
                "bureau" -> market.vendreProduits(bureau, client)
                else -> "Ce choix n'existe pas"
            }
        }

        println("Souhaitez vous continuer vos achats ? ")
        var continuer = when(readln()) {
            "oui" -> true
            "non" -> false
            else -> true
        }

    } while (continuer)

    println("Merci pour votre achat, vous payer ${market.totalPanier(client)} €")

}
package fr.isen.aymanch.androiderestaurant.network

import java.io.Serializable

data class Category(
    @SerializedName("name_fr") val name: String,
    @SerializedName("items") val items: List<Dish>
): Serializable {
    annotation class SerializedName(val value: String)
}
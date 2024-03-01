package fr.isen.aymanch.androiderestaurant.network

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("name_fr") val name: String,
    @SerializedName("items") val items: List<Dish>
)

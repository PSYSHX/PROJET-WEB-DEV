package fr.isen.aymanch.androiderestaurant.network

import java.io.Serializable

data class Dish(
    @Category.SerializedName("name_fr")val name: String,
    @SerializedName("images") val images: List<String>,
    @SerializedName("ingredients") val ingredients: List<Ingredient>,
    @SerializedName("prices") val prices: List<Price>
): Serializable

annotation class SerializedName(val value: String)

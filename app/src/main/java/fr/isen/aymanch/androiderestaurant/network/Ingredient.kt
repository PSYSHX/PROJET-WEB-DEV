package fr.isen.aymanch.androiderestaurant.network

import java.io.Serializable

data class Ingredient(@SerializedName("name_fr") val name: String): Serializable
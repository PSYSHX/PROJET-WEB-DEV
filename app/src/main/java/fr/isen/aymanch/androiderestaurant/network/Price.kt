package fr.isen.aymanch.androiderestaurant.network

import java.io.Serializable

data class Price(@Category.SerializedName("price") val price: String): Serializable
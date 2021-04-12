package com.example.moovi.POJO.Movie

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class ResponseMovie(

	@field:SerializedName("page")
	val page: Int? = null,

	@field:SerializedName("total_pages")
	val totalPages: Int? = null,

	@field:SerializedName("results")
	val results: @RawValue List<ResultsItem?>? = null,

	@field:SerializedName("total_results")
	val totalResults: Int? = null
):Parcelable
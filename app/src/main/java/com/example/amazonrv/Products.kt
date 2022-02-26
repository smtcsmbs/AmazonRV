package com.example.amazonrv

import java.io.Serializable

data class Products (val productId:Int,
                     var productImageViewName:String,
                     var productImageViewRating:String,
                     var productExp:String,
                     var productRatedCount:String,
                     var productPrice:Int,
                     var productSecondPrice:Int,
                     var productAgeLimits:String,
                     var productPickUpTime:String):Serializable{
}
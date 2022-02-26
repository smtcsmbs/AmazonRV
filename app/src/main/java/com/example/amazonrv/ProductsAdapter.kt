package com.example.amazonrv

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.amazonrv.databinding.CardDesignBinding

class ProductsAdapter (var mContext:Context, var productsList:List<Products>) : RecyclerView.Adapter<ProductsAdapter.CardDesignHolder>() {

    inner class CardDesignHolder(tasarim:CardDesignBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardDesignBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardDesignBinding.inflate(layoutInflater,parent,false)
        return CardDesignHolder(tasarim)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {

        val product = productsList.get(position)
        val t = holder.tasarim

        t.imageViewProduct.setImageResource(mContext.resources.getIdentifier(product.productImageViewName,"drawable",mContext.packageName))
        t.imageViewRating.setImageResource(mContext.resources.getIdentifier(product.productImageViewRating,"drawable",mContext.packageName))
        t.textViewExp.text = product.productExp
        t.textViewRatedCount.text = product.productRatedCount
        t.textViewPrice.text ="${product.productPrice}"
        t.textViewSecondPrice.text = "${product.productSecondPrice} TL"
        t.textViewAgeExp.text= "${product.productAgeLimits} yaş ve üzeri."
        t.textViewPickUpTime.text = "${product.productPickUpTime} tarihinde teslim alın."


    }

    override fun getItemCount(): Int {
        return productsList.size
    }
}
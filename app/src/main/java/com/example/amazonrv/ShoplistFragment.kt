package com.example.amazonrv

import android.os.Build
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.amazonrv.databinding.FragmentShoplistBinding


class ShoplistFragment : Fragment() {
    private lateinit var tasarim : FragmentShoplistBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {




        tasarim = FragmentShoplistBinding.inflate(inflater, container, false)

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val productList = ArrayList<Products>()

        var p1 = Products(1,"antik_kutuphane","three_star","Educa-500 Antik Kütüphane","170",179,45,"12","1 Mart")
        var p2 = Products(2,"amsterdam","five_star","Educa-1000 Amsterdam Evleri","42",200,99,"12","9 Mart")
        var p3 = Products(3,"hot_air","two_star","Educa-1500 Sıcak Hava Balonları","132",190,40,"9","1 Mart")
        var p4 = Products(4,"kucuk_ev","four_star","Educa-5000 Göldeki Küçük Ev","201",399,45,"15","3 Mart")
        var p5 = Products(5,"kuzey_amerika","five_star","Educa-1500 Kuzey Amerikadan Semboller","99",199,90,"12","7 Mart")
        var p6 = Products(6,"new_york","three_star","Educa-500 New York Şehri","122",150,99,"8","3 Mart")
        var p7 = Products(7,"palais_des_fleurs","five_star","Educa-1500 Palais Des Fleurs","199",210,45,"8","12 Mart")
        var p8 = Products(8,"st_petersburg","one_star","Educa-1500 Saint Petersburg","12",199,50,"15","2 Mart")



        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)
        productList.add(p5)
        productList.add(p6)
        productList.add(p7)
        productList.add(p8)



        val adapter = ProductsAdapter(requireContext(),productList)
        tasarim.rv.adapter = adapter




        return tasarim.root


    }



}
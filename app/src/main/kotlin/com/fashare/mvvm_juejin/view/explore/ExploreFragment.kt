package com.fashare.mvvm_juejin.view.explore

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fashare.base_ui.BaseFragment
import com.fashare.mvvm_juejin.R

/**
 * <pre>
 * author : jinliangshan
 * e-mail : jinliangshan@chexiang.com
 * desc   :
</pre> *
 */
class ExploreFragment : BaseFragment(){
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return DataBindingUtil.inflate<ViewDataBinding>(inflater, R.layout.fragment_explore, container, false).root
    }
}
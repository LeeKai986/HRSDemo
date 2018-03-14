package com.lcworld.shopdemo.tsq.ui.gomallorshopping.goshopping.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.tsq.ui.gomallorshopping.goshopping.activity.T_ShopMainActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;


/**
 * 拓商圈-商店-分类
 */
public class TShopClassificationFragment extends BaseFragment {

    @BindView(R.id.iva)
    ImageView iva;
    Unbinder unbinder;
    private T_ShopMainActivity activity;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activity = (T_ShopMainActivity) context;
    }

    @Override
    protected int setContentView() {
        return R.layout.t_frag_shopmain_fl;
    }

    @Override
    protected boolean setActionBarView() {
        return false;
    }

    @Override
    protected void initView(View view) {
        unbinder = ButterKnife.bind(this, view);
    }


    @Override
    protected void initData() {
    }


    @Override
    protected void setListener() {

    }


    @OnClick({R.id.ll_back, R.id.iv_search})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_back:
                getActivity().finish();
                break;
            case R.id.iv_search:
                break;
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }


}

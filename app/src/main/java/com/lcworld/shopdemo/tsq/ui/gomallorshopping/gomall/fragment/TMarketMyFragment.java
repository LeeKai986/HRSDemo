package com.lcworld.shopdemo.tsq.ui.gomallorshopping.gomall.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseFragment;
import com.lcworld.shopdemo.base.BaseFrameLayout;
import com.lcworld.shopdemo.base.CircleImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 日期： 2017/4/14
 * 注释：拓商圈 商铺或者商店我的
 */
public class TMarketMyFragment extends BaseFragment {

    @BindView(R.id.logo)
    CircleImageView logo;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.unread_1)
    TextView unread1;
    @BindView(R.id.unread_2)
    TextView unread2;
    @BindView(R.id.unread_3)
    TextView unread3;
    @BindView(R.id.unread_4)
    TextView unread4;
    @BindView(R.id.unread_5)
    TextView unread5;
    Unbinder unbinder;


    @Override
    protected int setContentView() {
        return R.layout.t_fragment_shopmy;
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

    @OnClick({R.id.ll_zj, R.id.ll_sc, R.id.ll_kf, R.id.ll_zs, R.id.ll_zp, R.id.ll_dz, R.id.ll_xxzx, R.id.ll_gywm, R.id.iv_my_bg, R.id.ll_back, R.id.iv_share, R.id.guanzhu, R.id.dingdan, R.id.ll_1, R.id.ll_2, R.id.ll_31, R.id.ll_4, R.id.ll_5})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_my_bg:
                break;
            case R.id.ll_back:
                getActivity().finish();
                break;
            case R.id.iv_share:
                break;
            case R.id.guanzhu:
                break;
            case R.id.dingdan:
                break;
            case R.id.ll_1:
                break;
            case R.id.ll_2:
                break;
            case R.id.ll_31:
                break;
            case R.id.ll_4:
                break;
            case R.id.ll_5:
                break;
            case R.id.ll_zj:
                break;
            case R.id.ll_sc:
                break;
            case R.id.ll_kf:
                break;
            case R.id.ll_zs:
                break;
            case R.id.ll_zp:
                break;
            case R.id.ll_dz:
                break;
            case R.id.ll_xxzx:
                break;
            case R.id.ll_gywm:
                break;
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}

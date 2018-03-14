package com.lcworld.shopdemo.tsq.ui.gomallorshopping.goshopping.activity;


import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.lcworld.shopdemo.R;
import com.lcworld.shopdemo.base.BaseActivity;
import com.lcworld.shopdemo.base.BaseFrameLayout;
import com.lcworld.shopdemo.tsq.ui.gomallorshopping.goshopping.bean.SwipeCardBean;
import com.lcworld.shopdemo.tsq.ui.gomallorshopping.goshopping.bean.TanTanCallback;
import com.mcxtzhang.commonadapter.rv.CommonAdapter;
import com.mcxtzhang.commonadapter.rv.ViewHolder;
import com.mcxtzhang.layoutmanager.swipecard.CardConfig;
import com.mcxtzhang.layoutmanager.swipecard.OverLayCardLayoutManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 商品 卡片式分类 列表
 */
public class TGoodsCardCategoryActivity extends BaseActivity {

    @BindView(R.id.rv)
    RecyclerView mRv;
    Unbinder unbinder1;
    CommonAdapter<SwipeCardBean> mAdapter;
    List<SwipeCardBean> mDatas;

    @Override
    protected int setContentView() {
        return R.layout.t_fragment_goods_card;
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
        baseFrameLayout.setState(BaseFrameLayout.STATE_SUCCESS);
        initFragmentPager();
    }

    @Override
    protected void initData() {
        mDatas = SwipeCardBean.initDatas();
        Collections.reverse(mDatas);
        mRv.setLayoutManager(new OverLayCardLayoutManager());
        mRv.setAdapter(mAdapter = new CommonAdapter<SwipeCardBean>(this, mDatas, R.layout.t_item_swipe_goodscard) {
            public static final String TAG = "zxt/Adapter";

            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                Log.d(TAG, "onCreateViewHolder() called with: parent = [" + parent + "], viewType = [" + viewType + "]");
                return super.onCreateViewHolder(parent, viewType);
            }


            @Override
            public void onBindViewHolder(ViewHolder holder, int position) {
                Log.d(TAG, "onBindViewHolder() called with: holder = [" + holder + "], position = [" + position + "]");
                super.onBindViewHolder(holder, position);
            }

            @Override
            public void convert(ViewHolder viewHolder, SwipeCardBean swipeCardBean) {
                Log.d(TAG, "convert() called with: viewHolder = [" + viewHolder + "], swipeCardBean = [" + swipeCardBean + "]");
            }
        });

        CardConfig.initConfig(this);

        final TanTanCallback callback = new TanTanCallback(mRv, mAdapter, mDatas);

        //测试竖直滑动是否已经不会被移除屏幕
        //callback.setHorizontalDeviation(Integer.MAX_VALUE);

        final ItemTouchHelper itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(mRv);

    }

    private void initFragmentPager() {
    }


    /**
     * 标题集合
     */
    private ArrayList<String> getTitles() {
        ArrayList<String> titles = new ArrayList<>();
        titles.add("分类1");
        titles.add("分类2");
        titles.add("分类3");
        titles.add("分类4");
        titles.add("分类5");
        titles.add("分类6");
        return titles;
    }

    @Override
    protected void setListener() {
    }

    @Override
    protected boolean setWindowDye() {
        return false;
    }

    @Override
    protected boolean setActionBarView() {
        return false;
    }


    @OnClick({R.id.ll_back, R.id.iv_search})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_back:
                finish();
                break;
            case R.id.iv_search:
                break;
        }
    }
}

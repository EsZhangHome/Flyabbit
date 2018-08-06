package com.dhc.flyabbit.home.modle;

import com.dhc.businesscomponent.data.net.GankApiResponse;
import com.dhc.flyabbit.home.modle.bean.GankItemBean;
import com.dhc.flyabbit.home.presenter.contract.IGankTechContract;
import com.dhc.library.data.HttpHelper;
import com.dhc.library.utils.rx.RxUtil;
import com.hk.protocolbuffer.Result;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

/**
 * 创建者     邓浩宸
 * 创建时间   2016/12/9 14:17
 * 描述	  TODO
 */

public class GankTechRemoteDataService implements IGankTechContract.IModel {

    private HttpHelper mHttpHelper;
    public static final int NUM_OF_PAGE = 20;
    @Inject
    public GankTechRemoteDataService(HttpHelper httpHelper) {
        this.mHttpHelper = httpHelper;
    }


    @Override
    public Flowable<GankApiResponse<List<GankItemBean>>> getTechList(String techTag, int page) {
        return mHttpHelper.createApi(IGankApi.class).getTechList(techTag,NUM_OF_PAGE,page)
                .compose(RxUtil.<GankApiResponse<List<GankItemBean>>>rxSchedulerHelper());
    }

    @Override
    public Flowable<GankApiResponse<List<GankItemBean>>> psotTest(String url, Result.AppResult appResult) {
        return  mHttpHelper.createApi(IGankApi.class).psotTest("http://192.168.0.79:8082/x_springboot/app/register2",appResult)
                .compose(RxUtil.<GankApiResponse<List<GankItemBean>>>rxSchedulerHelper());
    }

}

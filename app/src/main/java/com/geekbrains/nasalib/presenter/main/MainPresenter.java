package com.geekbrains.nasalib.presenter.main;

import android.util.Log;

import com.geekbrains.nasalib.model.entity.Link;
import com.geekbrains.nasalib.model.entity.NasaResponse;
import com.geekbrains.nasalib.model.retrofit.RetrofitApi;
import com.geekbrains.nasalib.view.main.MainView;

import java.util.List;

import javax.inject.Inject;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    @Inject
    RetrofitApi retrofitApi;

    @Inject
    NasaResponse nasaResponse;

    public List<Link> getMedia(){
        return nasaResponse.getLinks();
    }
}

package org.example.repository;

import org.example.model.Home;
import org.example.model.House;
import org.example.model.SummerHouse;
import org.example.model.Villa;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<Home> homeList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public HouseRepository() {
        homeList = new ArrayList<>();
        villaList = new ArrayList<>();
        summerHouseList = new ArrayList<>();
    }

    public List<Home> getHomeList() {
        return homeList;
    }

    public void setHomeList(List<Home> homeList) {
        this.homeList = homeList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public void setVillaList(List<Villa> villaList) {
        this.villaList = villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    public void setSummerHouseList(List<SummerHouse> summerHouseList) {
        this.summerHouseList = summerHouseList;
    }

    public List<House> getAllHouses() {
        List<House> allHouses = new ArrayList<>();
        allHouses.addAll(homeList);
        allHouses.addAll(villaList);
        allHouses.addAll(summerHouseList);
        return allHouses;
    }
}

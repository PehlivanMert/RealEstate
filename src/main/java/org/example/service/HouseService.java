package org.example.service;

import org.example.model.House;
import org.example.repository.HouseRepository;

import java.util.List;

public class HouseService {
    private HouseRepository hr = new HouseRepository();

    public HouseService(HouseRepository houseRepository) {
        this.hr = houseRepository;
    }

    public double getTotalPriceOfHomes() {
        return hr.getHomeList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return hr.getVillaList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return hr.getSummerHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfAllHouses() {
        return hr.getAllHouses().stream().mapToDouble(House::getPrice).sum();
    }

    public double getAverageSquareMetersOfHomes() {
        return calculateAverageSquareMeters(hr.getHomeList());
    }

    public double getAverageSquareMetersOfVillas() {
        return calculateAverageSquareMeters(hr.getVillaList());
    }

    public double getAverageSquareMetersOfSummerHouses() {
        return calculateAverageSquareMeters(hr.getSummerHouseList());
    }

    public double getAverageSquareMetersOfAllHouses() {
        return calculateAverageSquareMeters(hr.getAllHouses());
    }

    public List<House> filterHousesByRoomsAndLivingRooms(int roomCount, int livingRoomCount) {
        return hr.getAllHouses().stream().filter(house -> house.getRoomCount() == roomCount
                && house.getLivingRoomCount() == livingRoomCount).toList();
    }

    private double calculateAverageSquareMeters(List<? extends House> houses) {
        return houses.stream().mapToDouble(House::getSquareMeter).average().orElse(0);
    }

}

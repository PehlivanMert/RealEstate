package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        HouseRepository houseRepository = new HouseRepository();

        // Ev, Villa ve Yazlık örnekleri
        houseRepository.setHomeList(Arrays.asList(
                new Home(1200000, 110, 3, 1),
                new Home(1500000, 130, 4, 1),
                new Home(1000000, 95, 2, 1)
        ));

        houseRepository.setVillaList(Arrays.asList(
                new Villa(5000000, 300, 5, 2),
                new Villa(6000000, 350, 6, 2),
                new Villa(4500000, 280, 4, 1)
        ));

        houseRepository.setSummerHouseList(Arrays.asList(
                new SummerHouse(2500000, 180, 3, 1),
                new SummerHouse(3000000, 200, 4, 1),
                new SummerHouse(2750000, 190, 3, 2)
        ));

        HouseService houseService = new HouseService(houseRepository);

        // Toplam fiyatlar
        System.out.println("Evlerin toplam fiyatı: " + houseService.getTotalPriceOfHomes());
        System.out.println("Villaların toplam fiyatı: " + houseService.getTotalPriceOfVillas());
        System.out.println("Yazlıkların toplam fiyatı: " + houseService.getTotalPriceOfSummerHouses());
        System.out.println("Tüm evlerin toplam fiyatı: " + houseService.getTotalPriceOfAllHouses());

        // Ortalama metrekareler
        System.out.println("Evlerin ortalama m²'si: " + houseService.getAverageSquareMetersOfHomes());
        System.out.println("Villaların ortalama m²'si: " + houseService.getAverageSquareMetersOfVillas());
        System.out.println("Yazlıkların ortalama m²'si: " + houseService.getAverageSquareMetersOfSummerHouses());
        System.out.println("Tüm evlerin ortalama m²'si: " + houseService.getAverageSquareMetersOfAllHouses());

        // Filtreleme örneği
        int oda = 3;
        int salon = 1;
        System.out.println(oda + " oda ve " + salon + " salon olan ev sayısı: " +
                houseService.filterHousesByRoomsAndLivingRooms(oda, salon).size());
    }
}

package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OfferToFly implements Comparable<OfferToFly> {
    private int id;
    private int price;
    private String departure;
    private String arrival;
    private int traveltime;

    @Override
    public int compareTo(OfferToFly o) {
        return price - o.price;
    }
}

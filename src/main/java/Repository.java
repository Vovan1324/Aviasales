package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.OfferToFly;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Repository {
    OfferToFly[] offers = new OfferToFly[0];

    public void save(OfferToFly offer) {
        int length = offers.length + 1;
        OfferToFly[] tmp = new OfferToFly[length];
        System.arraycopy(offers, 0, tmp, 0, offers.length);
        tmp[tmp.length - 1] = offer;
        offers = tmp;
    }

    public OfferToFly[] getAll() {
        return offers;
    }
}

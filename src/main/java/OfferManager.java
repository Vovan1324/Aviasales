package ru.netology.manager;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.netology.domain.OfferToFly;
import ru.netology.repository.Repository;

import java.util.Arrays;

@AllArgsConstructor
@Data
public class OfferManager {
    private Repository repository;

    public void add(OfferToFly offer) {
        repository.save(offer);
    }

    public OfferToFly[] findAllFromTo(String from, String to) {
        OfferToFly[] result = new OfferToFly[0];

        for (OfferToFly offer : repository.getAll()) {
            int length = result.length;
            if (offer.getDeparture().equals(from) && offer.getArrival().equals(to)) {
                OfferToFly[] tmp = new OfferToFly[length + 1];
                System.arraycopy(result, 0, tmp, 0, length);
                int lastIndex = tmp.length - 1;
                tmp[lastIndex] = offer;
                result = tmp;
            }
        }
        if (result.length != 1) {
            Arrays.sort(result);
        }
        return result;
    }
}

package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by Quantarita on 4/2/17.
 */
public class PopulationComparator implements Comparator<City> {

    @Override
    public int compare (City o1, City o2) { return o2.getPopulation() - (o1.getPopulation()); }

}

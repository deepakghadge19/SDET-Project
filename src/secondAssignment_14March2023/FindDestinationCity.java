package secondAssignment_14March2023;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDestinationCity {
    public void destinationCity(String[][] input) {
        ArrayList<String> city = new ArrayList<>();
        for (int row = 0; row < input.length; row++) {
            for (int column = 0; column < 2; column++) {
                city.add(input[row][column]);
            }
        }
        //To find unique and ordered city
        Set<String> uniqueCity = new LinkedHashSet<>(city);
        ArrayList<String> destinationCity = new ArrayList<>(uniqueCity);
        System.out.println("Destination city is :" + destinationCity.get(destinationCity.size() - 1));
    }

    public static void main(String[] args) {
        FindDestinationCity findDestinationCity = new FindDestinationCity();
        String firstInput[][] = {{"London", "Newyork"}, {"Newyork", "Lima"}, {"Lima", "Sao Paulo"}};
        String secondInput[][] = {{"B", "C"}, {"D", "B"}, {"C", "A"}};
        String thirdInput[][] = {{"A", "Z"}};
        System.out.println("\n-------1st array of city------------");
        findDestinationCity.destinationCity(firstInput);
        System.out.println("\n-------2nd array of city------------");
        findDestinationCity.destinationCity(secondInput);
        System.out.println("\n-------3rd array of city------------");
        findDestinationCity.destinationCity(thirdInput);
    }
}

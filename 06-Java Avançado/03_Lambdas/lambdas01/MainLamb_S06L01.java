import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MainLamb_S06L01 {
    private static List<CarLamb_S06L01> cars = Arrays.asList(
        new CarLamb_S06L01("green", 2011), 
        new CarLamb_S06L01("black", 1998), 
        new CarLamb_S06L01("red", 2019)
    );

    public static void main(String[] args) {
        List<CarLamb_S06L01> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<CarLamb_S06L01> redCars = filter(cars, car -> car.getColor().equals("red"));
        List<CarLamb_S06L01> yearBeforeCars = filter(cars, car -> car.getYear() < 2015);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, num -> num % 2 != 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate <T> predicate){
        List <T> filteredList = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }


}

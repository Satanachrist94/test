import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main( String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Lancer");
        cars.add("BMW");
        cars.add("Vag");
        for (String car:cars) {
           // System.out.println(car);

        }
        //System.out.println(cars.contains("Priora"));
        String[] carsarray = cars.toArray(new String[5]);
       // System.out.println(Arrays.toString(carsarray));
        ArrayList<String> somecars = new ArrayList<>(cars.subList(0,3));
        //System.out.println(somecars);
        Iterator<String> iter = cars.iterator();
        while (iter.hasNext()){
            String x = iter.next();
            System.out.println(x);
            if(x.equals("Vag")) {
                iter.remove();
            }
            System.out.println(cars);

        }

    }
}

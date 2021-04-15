package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    List<Car> carList = new ArrayList<>();



    @Override
    public List<Car> getCarByNum(Integer count) {

        carList.add(new Car("uaz",3151,"geep"));
        carList.add(new Car("zaz",2123,"sedan"));
        carList.add(new Car("vaz",21099,"sedan"));
        carList.add(new Car("kamaz",5320,"dump truck"));
        carList.add(new Car("moskvich",2141,"sedan"));

        if(count == null ) {
            return carList;
        }
        if( count > 5 ) {
            return carList.stream().limit(5).collect(Collectors.toList());
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}

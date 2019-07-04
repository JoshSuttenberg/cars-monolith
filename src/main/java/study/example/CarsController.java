package study.example;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cars")
public class CarsController {
    private CarsRepository repository;

    public CarsController(CarsRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        repository.addCar(car);
    }

    @GetMapping
    public CarsRepository getCars() {
        return repository;
    }

    @GetMapping("/{carId}")
    public Car find(@PathVariable Long carId) {
        return repository.find(carId);
    }

}

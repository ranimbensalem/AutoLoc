package tn.esprit.autoloc;

import tn.esprit.autoloc.Entities.CategorieVehicule;
import tn.esprit.autoloc.Entities.StatutVehicule;
import tn.esprit.autoloc.Entities.Vehicule;
import tn.esprit.autoloc.Repositories.VehiculeRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class AutolocApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutolocApplication.class, args);
    }

    @Bean
    CommandLineRunner initDemoData(VehiculeRepository vehiculeRepository) {
        return args -> {
            if (vehiculeRepository.count() == 0) {
                vehiculeRepository.save(new Vehicule(
                        null, "TN-1234-AB", "Renault", "Clio",
                        CategorieVehicule.CITADINE, new BigDecimal("45.00"),
                        StatutVehicule.DISPONIBLE
                ));
                vehiculeRepository.save(new Vehicule(
                        null, "TN-5678-CD", "Peugeot", "308",
                        CategorieVehicule.BERLINE, new BigDecimal("65.00"),
                        StatutVehicule.DISPONIBLE
                ));
                vehiculeRepository.save(new Vehicule(
                        null, "TN-9012-EF", "Toyota", "RAV4",
                        CategorieVehicule.SUV, new BigDecimal("95.00"),
                        StatutVehicule.MAINTENANCE
                ));
                System.out.println(">>> Véhicules de démonstration insérés.");
            }
        };
    }
}
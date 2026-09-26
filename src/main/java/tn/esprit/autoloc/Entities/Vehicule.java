package tn.esprit.autoloc.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vehicule {

    @Id//cle primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY)//id incremente gerer mysql automatique
    private Long idVehicule;
    @Column(nullable = false, unique = true, length = 20)
    private String immatriculation;
    @Column(nullable = false, length = 50)
    private String marque;
    @Column(nullable = false, length = 50)
    private String modele;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private CategorieVehicule categorie;
    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal tarifJournaliser;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private StatutVehicule statut;



}

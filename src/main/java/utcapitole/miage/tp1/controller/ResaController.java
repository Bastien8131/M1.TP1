package utcapitole.miage.tp1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import utcapitole.miage.tp1.model.Reservation;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/resa")
public class ResaController {
    static List<Reservation> reservations = new ArrayList<>();

    @GetMapping("")
    public String accueil(Model model) {
        model.addAttribute("titre", "Bienvenue sur notre site de réservation");
        // Vous pouvez ajouter d'autres attributs selon votre besoin
        return "resa/index"; // Chemin vers le template
    }

    @PostMapping("/form/add")
    public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
        System.out.println(reservation.toString());
        reservations.add(reservation);
        return ResponseEntity.ok(reservation);
    }

    @GetMapping("/confirmation")
    public String confirm(Model model) {
        return "resa/confirmation/confirm"; // Chemin vers le template
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("reservation", reservations);
        return "resa/list/list"; // renvoie vers le template resa.html dans le dossier templates
    }
}

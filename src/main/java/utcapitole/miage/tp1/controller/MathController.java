package utcapitole.miage.tp1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping(path = "/entier", params = { "inf", "sup" })
    public String form(@RequestParam("inf") Integer inf, @RequestParam("sup") Integer sup) {
        StringBuilder rs = new StringBuilder();
        rs.append("<table><tr><th>Number</th></tr>");
        for (int i = inf; i < sup; i++) {
            rs.append("<tr><td>").append(i).append("</td></tr>");
        }
        rs.append("</table>");
        return rs.toString();
    }

}

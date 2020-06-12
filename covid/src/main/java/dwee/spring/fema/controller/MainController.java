package dwee.spring.fema.controller;

/**
 * Created by dean on 6/7/20.
 */

import dwee.spring.fema.entity.COVIDNetwork;
import dwee.spring.fema.repository.COVIDNetworkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/test")
public class MainController {
    @Autowired
    private COVIDNetworkRepository covidNetworkRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<COVIDNetwork> getAllCovidNetwork() {
        return covidNetworkRepository.findAll();
    }

    @GetMapping(path="/covid")
    public @ResponseBody Iterable<COVIDNetwork> getCatchment(@RequestParam(defaultValue = "%") String catchment) {
        return covidNetworkRepository.findByCatchment(catchment);
    }
}

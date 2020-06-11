package com.travelsky.cqrd.projectprctice.web;

import com.travelsky.cqrd.projectprctice.entity.Airline;
import com.travelsky.cqrd.projectprctice.services.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jytian
 * @version 1.0
 * @description
 * @date 2020/6/9 13:47
 */
@RestController
@RequestMapping("/airline")
@CrossOrigin
public class AirlineController {
    @Autowired
    private AirlineService airlineService;

    @RequestMapping("/findAll")
    public List<Airline> findAllAirline(){
        return airlineService.findAllAirline();
    }

    /**
     * 删除平台
     * @param code
     * @return
     */
    @RequestMapping("/delete")
    public boolean deleteAirline(String code){
        return airlineService.deleteAirline(code);
    }
}

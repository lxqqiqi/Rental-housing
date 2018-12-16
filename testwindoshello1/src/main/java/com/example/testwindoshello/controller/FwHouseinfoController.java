package com.example.testwindoshello.controller;

import com.example.testwindoshello.entity.FwHouseinfo;
import com.example.testwindoshello.model.JsonResult;
import com.example.testwindoshello.model.Status;
import com.example.testwindoshello.repository.FwHouseinfoRepository;
import com.example.testwindoshello.service.FwHouseinfoService;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/fwHouseinfo")
//@Slf4j
public class FwHouseinfoController {
    @Autowired
    private FwHouseinfoService fwHouseinfoService;
    @Autowired
    private FwHouseinfoRepository fwHouseinfoRepository;

    @RequestMapping("/edit")
    public JsonResult edit(FwHouseinfo fwHouseinfo) {
        fwHouseinfoRepository.save(fwHouseinfo);

        JsonResult jsonResult = new JsonResult();
        jsonResult.setCode("1");
        jsonResult.setMsg("OK");
        return jsonResult;
    }

}

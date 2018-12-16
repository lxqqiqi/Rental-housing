package com.example.testwindoshello.service.impl;

import com.example.testwindoshello.entity.FwHouseinfo;
import com.example.testwindoshello.repository.FwHouseinfoRepository;
import com.example.testwindoshello.service.FwHouseinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FwHouseinfoServiceImpl implements FwHouseinfoService{

    @Autowired
    private FwHouseinfoRepository fwHouseinfoRepository;
    @Override
    public void save(FwHouseinfo fwHouseinfo) {
        fwHouseinfoRepository.save(fwHouseinfo);
    }
}

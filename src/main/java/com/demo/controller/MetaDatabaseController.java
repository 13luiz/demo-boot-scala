package com.demo.controller;

import com.demo.domain.MetaDatabase;
import com.demo.service.MetaDatabaseService;
import com.demo.utils.ResultVO;
import com.demo.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meta/database")
public class MetaDatabaseController {

    @Autowired
    private MetaDatabaseService metaDatabaseService;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public ResultVO save(@ModelAttribute MetaDatabase metaDatabase) {
        metaDatabaseService.save(metaDatabase);
        return ResultVOUtil.success();
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResultVO query() {
        return ResultVOUtil.success(metaDatabaseService.query());
    }

}

package com.demo.controller

import com.demo.domain.MetaTable
import com.demo.service.MetaTableService
import com.demo.utils.ResultVOUtil
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService: MetaTableService){

  @RequestMapping(value = Array("/"),method = Array(RequestMethod.POST))
  @ResponseBody
  def save(@ModelAttribute metaTable:MetaTable) = {
    metaTableService.save(metaTable)
    ResultVOUtil.success() // 此处就是Scala调用已有的Java代码
  }

  @RequestMapping(value = Array("/"),method = Array(RequestMethod.GET))
  @RequestBody
  def query() = {
    ResultVOUtil.success(metaTableService.query())
  }

}

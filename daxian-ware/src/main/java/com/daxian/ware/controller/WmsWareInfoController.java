package com.daxian.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daxian.ware.entity.WmsWareInfoEntity;
import com.daxian.ware.service.WmsWareInfoService;
import com.daxian.common.utils.PageUtils;
import com.daxian.common.utils.R;



/**
 * 仓库信息
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 23:08:31
 */
@RestController
@RequestMapping("ware/wmswareinfo")
public class WmsWareInfoController {
    @Autowired
    private WmsWareInfoService wmsWareInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
   // @RequiresPermissions("ware:wmswareinfo:info")
    public R info(@PathVariable("id") Long id){
		WmsWareInfoEntity wmsWareInfo = wmsWareInfoService.getById(id);

        return R.ok().put("wmsWareInfo", wmsWareInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
  //  @RequiresPermissions("ware:wmswareinfo:save")
    public R save(@RequestBody WmsWareInfoEntity wmsWareInfo){
		wmsWareInfoService.save(wmsWareInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
   // @RequiresPermissions("ware:wmswareinfo:update")
    public R update(@RequestBody WmsWareInfoEntity wmsWareInfo){
		wmsWareInfoService.updateById(wmsWareInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
   // @RequiresPermissions("ware:wmswareinfo:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}

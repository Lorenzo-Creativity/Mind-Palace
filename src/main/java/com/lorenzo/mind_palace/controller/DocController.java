package com.lorenzo.mind_palace.controller;


import com.lorenzo.mind_palace.request.DocQueryReq;
import com.lorenzo.mind_palace.request.DocSaveReq;
import com.lorenzo.mind_palace.response.DocQueryResp;
import com.lorenzo.mind_palace.response.CommonResp;
import com.lorenzo.mind_palace.response.PageResp;
import com.lorenzo.mind_palace.service.DocService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author lorenzo
 * @date 2022/03/18 18:06
 **/
@RestController
@RequestMapping("/doc")
public class DocController {

    @Resource
    private DocService docService;

    @GetMapping("/all")
    public CommonResp all() {
        CommonResp<List<DocQueryResp>> resp = new CommonResp<>();
        List<DocQueryResp> list = docService.all();
        resp.setContent(list);
        return resp;
    }

    @GetMapping("/list")
    public CommonResp list(@Valid DocQueryReq req) {
        CommonResp<PageResp<DocQueryResp>> response = new CommonResp<>();
        PageResp<DocQueryResp> list = docService.list(req);
        response.setContent(list);
        return response;
    }

    @PostMapping("/save")
    public CommonResp save(@Valid @RequestBody DocSaveReq req) {
        CommonResp response = new CommonResp<>();
        docService.save(req);
        return response;
    }

    @DeleteMapping("/delete/{id}")
    public CommonResp delete(@PathVariable Long id) {
        CommonResp response = new CommonResp<>();
        docService.delete(id);
        return response;
    }
}

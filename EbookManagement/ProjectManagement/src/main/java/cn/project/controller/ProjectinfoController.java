package cn.project.controller;

import cn.project.entity.Projectinfo;
import cn.project.service.ProjectinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Package: cn.project.controller
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月05日 13时54分02秒
 */
@Controller
public class ProjectinfoController {

    @Autowired
    ProjectinfoService projectinfoService;

    @RequestMapping("list")
    public String list(@RequestParam(value="status",required=false)Integer status,
                       @RequestParam(value="pageIndex",required=false)Integer pageIndex,
                       @RequestParam(value="limit",required=false)Integer limit,
                       Model model){
        status = status ==null?-1:status;
        pageIndex = pageIndex==null ? 1 : pageIndex;
        limit = limit == null ? 3 : limit;
        List<Projectinfo> projectList = projectinfoService.getProjectInfoByPage(status, (pageIndex-1)*limit, limit);
        Integer count = projectinfoService.getProjectInfoCount(status);
        int totalPage = (count+limit-1)/limit;
        model.addAttribute("projectList",projectList);
        model.addAttribute("page",pageIndex);
        model.addAttribute("totalPage",totalPage);
        return "index";
    }

    @RequestMapping("toModify")
    public String toModify(@RequestParam("id")Integer id,Model model){
        Projectinfo projectinfo = projectinfoService.getProjectInfoById(id);
        model.addAttribute("pro",projectinfo);
        return "modify";
    }

    @RequestMapping("save")
    public String save(@RequestParam("id")Integer id,@RequestParam("status")Integer status){
        projectinfoService.modifyProject(id, status);
        return "redirect:/list";
    }
}

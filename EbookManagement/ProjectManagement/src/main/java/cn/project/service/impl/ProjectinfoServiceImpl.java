package cn.project.service.impl;

import cn.project.entity.Projectinfo;
import cn.project.mapper.ProjectinfoMapper;
import cn.project.service.ProjectinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package: cn.project.service.impl
 * @Description:
 * @Author 吕晨寒
 * @Create 2021年04月05日 13时52分35秒
 */
@Service
public class ProjectinfoServiceImpl implements ProjectinfoService {

    @Autowired
    ProjectinfoMapper projectinfoMapper;

    @Override
    public List<Projectinfo> getProjectInfoByPage(Integer status, Integer page, Integer limit) {
        return projectinfoMapper.getProjectInfoByPage(status, page, limit);
    }

    @Override
    public Integer getProjectInfoCount(Integer status) {
        return projectinfoMapper.getProjectInfoCount(status);
    }

    @Override
    public Projectinfo getProjectInfoById(Integer id) {
        return projectinfoMapper.getProjectInfoById(id);
    }

    @Override
    public Integer modifyProject(Integer id, Integer status) {
        return projectinfoMapper.modifyProject(id,status);
    }
}

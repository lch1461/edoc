package cn.project.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (Projectinfo)实体类
 *
 * @author makejava
 * @since 2021-04-05 13:34:28
 */
public class Projectinfo implements Serializable {
    private static final long serialVersionUID = -31415824884606063L;

    private Integer id;

    private String projectName;

    private Date startDate;

    private Date endDate;

    private Integer status;

    private String statusName;

    public String getStatusName() {
        if (status==0) {
            return 	"已申报";
        }else if (status==1) {
            return 	"审核中";
        }else {
            return 	"已审核";
        }
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
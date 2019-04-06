/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;


public class Report {

    private static final long serialVersionUID = 1L;
   
    private Integer id;
    
    private Date createdAt;
    
    private String text;
   
    private FosUser employerReporterId;
    
    private FosUser freelancerReportedId;

    public Report() {
    }

    public Report(Integer id) {
        this.id = id;
    }

    public Report(Integer id, Date createdAt, String text) {
        this.id = id;
        this.createdAt = createdAt;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public FosUser getEmployerReporterId() {
        return employerReporterId;
    }

    public void setEmployerReporterId(FosUser employerReporterId) {
        this.employerReporterId = employerReporterId;
    }

    public FosUser getFreelancerReportedId() {
        return freelancerReportedId;
    }

    public void setFreelancerReportedId(FosUser freelancerReportedId) {
        this.freelancerReportedId = freelancerReportedId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Report)) {
            return false;
        }
        Report other = (Report) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Report[ id=" + id + " ]";
    }
    
}

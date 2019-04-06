/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;



public class FreelancersBookmark {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private Project projectId;
    
    private FosUser employerId;
    
    private FosUser freelancerId;
    
    private Job jobId;

    public FreelancersBookmark() {
    }

    public FreelancersBookmark(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public FosUser getEmployerId() {
        return employerId;
    }

    public void setEmployerId(FosUser employerId) {
        this.employerId = employerId;
    }

    public FosUser getFreelancerId() {
        return freelancerId;
    }

    public void setFreelancerId(FosUser freelancerId) {
        this.freelancerId = freelancerId;
    }

    public Job getJobId() {
        return jobId;
    }

    public void setJobId(Job jobId) {
        this.jobId = jobId;
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
        if (!(object instanceof FreelancersBookmark)) {
            return false;
        }
        FreelancersBookmark other = (FreelancersBookmark) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.FreelancersBookmark[ id=" + id + " ]";
    }
    
}

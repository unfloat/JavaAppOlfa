/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;



public class EmployersBookmark  {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private FosUser employerId;
    
    private FosUser freelancerId;

    public EmployersBookmark() {
    }

    public EmployersBookmark(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployersBookmark)) {
            return false;
        }
        EmployersBookmark other = (EmployersBookmark) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.EmployersBookmark[ id=" + id + " ]";
    }
    
}

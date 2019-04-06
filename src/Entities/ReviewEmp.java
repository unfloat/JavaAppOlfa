/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;


public class ReviewEmp  {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
   
    private int rating;
   
    private String comment;
   
    private FosUser freelancerReviewerId;
    
    private Project projectId;
    
    private FosUser employerReviewedId;

    public ReviewEmp() {
    }

    public ReviewEmp(Integer id) {
        this.id = id;
    }

    public ReviewEmp(Integer id, int rating, String comment) {
        this.id = id;
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public FosUser getFreelancerReviewerId() {
        return freelancerReviewerId;
    }

    public void setFreelancerReviewerId(FosUser freelancerReviewerId) {
        this.freelancerReviewerId = freelancerReviewerId;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public FosUser getEmployerReviewedId() {
        return employerReviewedId;
    }

    public void setEmployerReviewedId(FosUser employerReviewedId) {
        this.employerReviewedId = employerReviewedId;
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
        if (!(object instanceof ReviewEmp)) {
            return false;
        }
        ReviewEmp other = (ReviewEmp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ReviewEmp[ id=" + id + " ]";
    }
    
}

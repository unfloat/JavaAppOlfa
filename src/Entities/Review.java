/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;


public class Review  {

    private static final long serialVersionUID = 1L;
   
    private Integer id;
    
    private boolean onBudget;
   
    private boolean onTime;
    
    private int rating;
    
    private String comment;
    
    private FosUser freelancerReviewedId;
   
    private Project projectId;
    
    private FosUser employerReviewerId;

    public Review() {
    }

    public Review(Integer id) {
        this.id = id;
    }

    public Review(Integer id, boolean onBudget, boolean onTime, int rating, String comment) {
        this.id = id;
        this.onBudget = onBudget;
        this.onTime = onTime;
        this.rating = rating;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getOnBudget() {
        return onBudget;
    }

    public void setOnBudget(boolean onBudget) {
        this.onBudget = onBudget;
    }

    public boolean getOnTime() {
        return onTime;
    }

    public void setOnTime(boolean onTime) {
        this.onTime = onTime;
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

    public FosUser getFreelancerReviewedId() {
        return freelancerReviewedId;
    }

    public void setFreelancerReviewedId(FosUser freelancerReviewedId) {
        this.freelancerReviewedId = freelancerReviewedId;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
    }

    public FosUser getEmployerReviewerId() {
        return employerReviewerId;
    }

    public void setEmployerReviewerId(FosUser employerReviewerId) {
        this.employerReviewerId = employerReviewerId;
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
        if (!(object instanceof Review)) {
            return false;
        }
        Review other = (Review) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Review[ id=" + id + " ]";
    }
    
}

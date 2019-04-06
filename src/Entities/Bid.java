/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;



public class Bid {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private int minimalRate;
    
    private int deliveryTime;
    
    private Project projectId;
    
    private FosUser freelancerId;

    public Bid() {
    }

    public Bid(Integer id) {
        this.id = id;
    }

    public Bid(Integer id, int minimalRate, int deliveryTime) {
        this.id = id;
        this.minimalRate = minimalRate;
        this.deliveryTime = deliveryTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMinimalRate() {
        return minimalRate;
    }

    public void setMinimalRate(int minimalRate) {
        this.minimalRate = minimalRate;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Project getProjectId() {
        return projectId;
    }

    public void setProjectId(Project projectId) {
        this.projectId = projectId;
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
        if (!(object instanceof Bid)) {
            return false;
        }
        Bid other = (Bid) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Bid_1[ id=" + id + " ]";
    }
    
}

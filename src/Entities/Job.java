/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;




public class Job  {

    private static final long serialVersionUID = 1L;
   
    private Integer id;
    
    private String title;
    
    private String type;
    
    private String location;
    
    private double minSalary;
    
    private double maxSalary;
    
    private String description;
    
    private String tags;
    
    private FreelancersBookmark freelancersBookmark;
    
    private Category categoryId;
    
    private FosUser employerId;

    public Job() {
    }

    public Job(Integer id) {
        this.id = id;
    }

    public Job(Integer id, String title, String type, String location, double minSalary, double maxSalary, String description, String tags) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.location = location;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
        this.description = description;
        this.tags = tags;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public FreelancersBookmark getFreelancersBookmark() {
        return freelancersBookmark;
    }

    public void setFreelancersBookmark(FreelancersBookmark freelancersBookmark) {
        this.freelancersBookmark = freelancersBookmark;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public FosUser getEmployerId() {
        return employerId;
    }

    public void setEmployerId(FosUser employerId) {
        this.employerId = employerId;
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
        if (!(object instanceof Job)) {
            return false;
        }
        Job other = (Job) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Job[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Collection;
import java.util.Date;


public class FosUser  {

    
    private Integer id;
    
    private String username;
    
    private String usernameCanonical;
    
    private String email;
    
    private String emailCanonical;
    
    private boolean enabled;
    
    private String salt;
    
    private String password;
    
    private Date lastLogin;
    private String confirmationToken;
    
    private Date passwordRequestedAt;
   
    private String roles;
    
    private String type;
    private String companyName;
    private String about;
    private String firstName;
    private String lastName;
    
    private Integer hourlyRate;
    
    private String tagline;
    
    private String intro;
    
    private Collection<ReviewEmp> reviewEmpCollection;
    
    private Collection<ReviewEmp> reviewEmpCollection1;
    
    private Collection<EmployersBookmark> employersBookmarkCollection;
    
    private EmployersBookmark employersBookmark;
    
    private Collection<Project> projectCollection;
    
    private FreelancersBookmark freelancersBookmark;
    
    private Collection<FreelancersBookmark> freelancersBookmarkCollection;
    
    private Collection<Offer> offerCollection;
    
    private Collection<Offer> offerCollection1;
    
    private Collection<Bookmark> bookmarkCollection;
    
    private Portfolio portfolio;
    
    private Collection<Review> reviewCollection;
    
    private Collection<Review> reviewCollection1;
    
    private Collection<Report> reportCollection;
    
    private Collection<Report> reportCollection1;
    
    private Collection<Bid> bidCollection;
    
    private Collection<Job> jobCollection;

    public FosUser() {
    }

    public FosUser(Integer id) {
        this.id = id;
    }

    public FosUser(Integer id, String username, String usernameCanonical, String email, String emailCanonical, boolean enabled, String password, String roles, String type) {
        this.id = id;
        this.username = username;
        this.usernameCanonical = usernameCanonical;
        this.email = email;
        this.emailCanonical = emailCanonical;
        this.enabled = enabled;
        this.password = password;
        this.roles = roles;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernameCanonical() {
        return usernameCanonical;
    }

    public void setUsernameCanonical(String usernameCanonical) {
        this.usernameCanonical = usernameCanonical;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCanonical() {
        return emailCanonical;
    }

    public void setEmailCanonical(String emailCanonical) {
        this.emailCanonical = emailCanonical;
    }

    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    public Date getPasswordRequestedAt() {
        return passwordRequestedAt;
    }

    public void setPasswordRequestedAt(Date passwordRequestedAt) {
        this.passwordRequestedAt = passwordRequestedAt;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Integer hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Collection<ReviewEmp> getReviewEmpCollection() {
        return reviewEmpCollection;
    }

    public void setReviewEmpCollection(Collection<ReviewEmp> reviewEmpCollection) {
        this.reviewEmpCollection = reviewEmpCollection;
    }

    
    public Collection<ReviewEmp> getReviewEmpCollection1() {
        return reviewEmpCollection1;
    }

    public void setReviewEmpCollection1(Collection<ReviewEmp> reviewEmpCollection1) {
        this.reviewEmpCollection1 = reviewEmpCollection1;
    }

    public Collection<EmployersBookmark> getEmployersBookmarkCollection() {
        return employersBookmarkCollection;
    }

    public void setEmployersBookmarkCollection(Collection<EmployersBookmark> employersBookmarkCollection) {
        this.employersBookmarkCollection = employersBookmarkCollection;
    }

    public EmployersBookmark getEmployersBookmark() {
        return employersBookmark;
    }

    public void setEmployersBookmark(EmployersBookmark employersBookmark) {
        this.employersBookmark = employersBookmark;
    }

    public Collection<Project> getProjectCollection() {
        return projectCollection;
    }

    public void setProjectCollection(Collection<Project> projectCollection) {
        this.projectCollection = projectCollection;
    }

    public FreelancersBookmark getFreelancersBookmark() {
        return freelancersBookmark;
    }

    public void setFreelancersBookmark(FreelancersBookmark freelancersBookmark) {
        this.freelancersBookmark = freelancersBookmark;
    }

    
    public Collection<FreelancersBookmark> getFreelancersBookmarkCollection() {
        return freelancersBookmarkCollection;
    }

    public void setFreelancersBookmarkCollection(Collection<FreelancersBookmark> freelancersBookmarkCollection) {
        this.freelancersBookmarkCollection = freelancersBookmarkCollection;
    }

    public Collection<Offer> getOfferCollection() {
        return offerCollection;
    }

    public void setOfferCollection(Collection<Offer> offerCollection) {
        this.offerCollection = offerCollection;
    }

    public Collection<Offer> getOfferCollection1() {
        return offerCollection1;
    }

    public void setOfferCollection1(Collection<Offer> offerCollection1) {
        this.offerCollection1 = offerCollection1;
    }

    public Collection<Bookmark> getBookmarkCollection() {
        return bookmarkCollection;
    }

    public void setBookmarkCollection(Collection<Bookmark> bookmarkCollection) {
        this.bookmarkCollection = bookmarkCollection;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    
    public Collection<Review> getReviewCollection() {
        return reviewCollection;
    }

    public void setReviewCollection(Collection<Review> reviewCollection) {
        this.reviewCollection = reviewCollection;
    }

    public Collection<Review> getReviewCollection1() {
        return reviewCollection1;
    }

    public void setReviewCollection1(Collection<Review> reviewCollection1) {
        this.reviewCollection1 = reviewCollection1;
    }

    public Collection<Report> getReportCollection() {
        return reportCollection;
    }

    public void setReportCollection(Collection<Report> reportCollection) {
        this.reportCollection = reportCollection;
    }

    public Collection<Report> getReportCollection1() {
        return reportCollection1;
    }

    public void setReportCollection1(Collection<Report> reportCollection1) {
        this.reportCollection1 = reportCollection1;
    }

    public Collection<Bid> getBidCollection() {
        return bidCollection;
    }

    public void setBidCollection(Collection<Bid> bidCollection) {
        this.bidCollection = bidCollection;
    }

    public Collection<Job> getJobCollection() {
        return jobCollection;
    }

    public void setJobCollection(Collection<Job> jobCollection) {
        this.jobCollection = jobCollection;
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
        if (!(object instanceof FosUser)) {
            return false;
        }
        FosUser other = (FosUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.FosUser[ id=" + id + " ]";
    }
    
}

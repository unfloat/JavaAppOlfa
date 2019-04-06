/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Collection;



public class NotifiableEntity {

    private static final long serialVersionUID = 1L;
    
    private Integer id;
    
    private String identifier;
    
    private String class1;
    private Collection<NotifiableNotification> notifiableNotificationCollection;

    public NotifiableEntity() {
    }

    public NotifiableEntity(Integer id) {
        this.id = id;
    }

    public NotifiableEntity(Integer id, String identifier, String class1) {
        this.id = id;
        this.identifier = identifier;
        this.class1 = class1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

   
    public Collection<NotifiableNotification> getNotifiableNotificationCollection() {
        return notifiableNotificationCollection;
    }

    public void setNotifiableNotificationCollection(Collection<NotifiableNotification> notifiableNotificationCollection) {
        this.notifiableNotificationCollection = notifiableNotificationCollection;
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
        if (!(object instanceof NotifiableEntity)) {
            return false;
        }
        NotifiableEntity other = (NotifiableEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.NotifiableEntity[ id=" + id + " ]";
    }
    
}

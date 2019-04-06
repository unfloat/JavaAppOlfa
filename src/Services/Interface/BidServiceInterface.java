/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Interface;
import Entities.Bid;

/**
 *
 * @author asus
 */
public interface BidServiceInterface {
    public String displayBids();
    public void addBid(Bid bid);
    public void deleteBid(int idBid);
    public void updateBid(int idBid);
    
}

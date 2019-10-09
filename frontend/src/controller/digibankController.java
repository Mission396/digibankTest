package controller;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import model.digibank;
import service.digibankEJB;

@ManagedBean(name = "digibankcontroller")
@SessionScoped
public class digibankController{
 
    @EJB
    private digibankEJB digibankEJB;
    
  //from form
  	@ManagedProperty(value="#{digibank}")
    private digibank digibank;
  	
    private List<digibank> digibankList = new ArrayList<>();
 
   public List<digibank> getdigibankList() {
       // digibankList = digibankEJB.finddigibanks();
        return digibankList;
    }
 
   public String viewdigibank(){
        return "digibankList.xhtml";
    }
   
    public String addNewdigibank() {
         digibankEJB.addNew(digibank.getEntity());
      //  digibankList = digibankEJB.finddigibanks();
        return "digibankList.xhtml";
    }

	public digibank getdigibank() {
		return digibank;
	}

	public void setdigibank(digibank digibank) {
		this.digibank = digibank;
	}
    
    
}